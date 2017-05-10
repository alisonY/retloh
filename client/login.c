#include <stdlib.h>
#include <stdio.h>
#include <curl/curl.h>
#include <sys/stat.h>

int login(){
  CURL *curl;
  CURLcode res;
 
  /* In windows, this will init the winsock stuff */ 
  curl_global_init(CURL_GLOBAL_ALL);
 
  /* get a curl handle */ 
  curl = curl_easy_init();
  if(curl) { 
    curl_easy_setopt(curl, CURLOPT_URL, "http://192.168.51.30:8080/retloh/login.do");
    /* Now specify the POST data */ 
    curl_easy_setopt(curl, CURLOPT_POSTFIELDS, "username=admin&password=admin");
    res = curl_easy_perform(curl);
    
    /* Check for errors */ 
    if(res != CURLE_OK){
      fprintf(stderr, "curl_easy_perform() failed: %s\n",curl_easy_strerror(res));
    }else{
    
      printf("%s\n",res);
      printf("%s\n","*****************");

      printf("%s","校验成功\n");
    }
 
    /* always cleanup */ 
    curl_easy_cleanup(curl);
  }
  curl_global_cleanup();
  return 0; 

}


int main(int c,char **argv){
  login();
}
