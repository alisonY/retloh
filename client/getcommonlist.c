#include <stdlib.h>
#include <stdio.h>
#include <curl/curl.h>
#include <sys/stat.h>
#include <string>
#include <iostream>
#include <json/json.hpp>

using namespace std;
using json = nlohmann::json;

size_t CurlWrite_CallbackFunc_StdString(void *contents, size_t size, size_t nmemb, std::string *s)
{
    size_t newLength = size*nmemb;
    size_t oldLength = s->size();
    try{
        s->resize(oldLength + newLength);
    }catch(std::bad_alloc &e){
        //handle memory problem
        return 0;
    }
    std::copy((char*)contents,(char*)contents+newLength,s->begin()+oldLength);
    return size*nmemb;
}



string login(){
  CURL *curl;
  CURLcode res;
  
  string s;
 
  /* In windows, this will init the winsock stuff */ 
  curl_global_init(CURL_GLOBAL_ALL);
 
  /* get a curl handle */ 
  curl = curl_easy_init();
  if(curl) { 
    curl_easy_setopt(curl, CURLOPT_URL, "http://172.104.78.181/client/login.do");
    /* Now specify the POST data */ 
    curl_easy_setopt(curl, CURLOPT_POSTFIELDS, "loginName=root&password=admin");
    curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, CurlWrite_CallbackFunc_StdString);
    curl_easy_setopt(curl, CURLOPT_WRITEDATA, &s);

    res = curl_easy_perform(curl);
    
    /* Check for errors */ 
    if(res != CURLE_OK){
      fprintf(stderr, "curl_easy_perform() failed: %s\n",curl_easy_strerror(res));
    }else{
    
      cout << s <<endl;
      printf("%s\n","*****************");

      printf("%s","校验成功\n");
    }
 
    /* always cleanup */ 
    curl_easy_cleanup(curl);
  }
  curl_global_cleanup();
  return s; 

}

int getCommonList(){
  string token_str=login();
  auto token_json = json::parse(token_str);
  cout << token_json["token"] <<endl;

  CURL *curl;
  CURLcode res;
  
  string s;
  curl_global_init(CURL_GLOBAL_ALL);
  curl = curl_easy_init();
  struct curl_slist *headers = NULL;
  string token=token_json.at("token").get<string>();
  string header_str="token:"+token;
  headers = curl_slist_append(headers, header_str.c_str());
  if(curl) { 
    curl_easy_setopt(curl, CURLOPT_URL, "http://172.104.78.181/client/getCommonList.do");
    curl_easy_setopt(curl, CURLOPT_POSTFIELDS, "status=1&pgType=心电");
    curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, CurlWrite_CallbackFunc_StdString);
    curl_easy_setopt(curl, CURLOPT_WRITEDATA, &s);
    curl_easy_setopt(curl, CURLOPT_HTTPHEADER, headers);// 改协议头

    res = curl_easy_perform(curl);
    
    if(res != CURLE_OK){
      fprintf(stderr, "curl_easy_perform() failed: %s\n",curl_easy_strerror(res));
    }else{
      cout << s <<endl;
      printf("%s\n","*****************");
    }
    curl_easy_cleanup(curl);
  }
  curl_global_cleanup();
  return 0; 
}


int main(int c,char **argv){
  getCommonList();
}
