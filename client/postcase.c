#include <curl/curl.h>  
#include <string>  
#include <exception>
#include <string.h>
  
int main(int argc, char *argv[])   
{  
    char szJsonData[1024];  
    memset(szJsonData, 0, sizeof(szJsonData));  
    std::string strJson = "{";  
    strJson += "\"name\" : \"李晨\",";  
    strJson += "\"daolianshu\" :12,";
    strJson += "\"sumHours\" :24,";
    strJson += "\"pacemakerParameter\" :384,";
    strJson += "\"offset\" :-1,";
    strJson += "\"recordMinutes\" :555,";
    strJson += "\"recordMounth\" :4,";
    strJson += "\"recordDay\" :4,";
    strJson += "\"recordYear\" :2017,";
    strJson += "\"hospitalNumber\" :300,";
    strJson += "\"serialNumber\" :6,";
    strJson += "\"sex\" :\"男\",";
    strJson += "\"operationDoctor\" :\"无名氏\",";
    strJson += "\"diagnosticDoctor\" :\"小李\",";
    strJson += "\"age\" :30,";
    strJson += "\"clinicNumber\" :178,";
    strJson += "\"bedNumber\" :198,";
    strJson += "\"department\" :\"内科\",";
    strJson += "\"yongyaoshuoming\" :\"吃不死人的没啥注意的\",";
    strJson += "\"conclusion\" :\"小伙你印堂发黑啊\",";
    strJson += "\"hospitalName\" :\"武警医院\",";
    strJson += "\"defaultHospitalName\" :\"\",";
    strJson += "\"hospitalAddress\" :\"皮包公司无地址\",";
    strJson += "\"hospitalPhonenum\" :88888888,";
    strJson += "\"hospitalFax\" :88888888,";
    strJson += "\"patientYear\" :2017,";
    strJson += "\"patientMonth\" :5,";
    strJson += "\"patientDay\" :25,";
    strJson += "\"suggest\" :\"早睡早起\",";
    strJson += "\"note\" :\"强撸飞灰烟灭\",";
    strJson += "\"caseTag\" :\"时间不多了\",";
    strJson += "\"holterLoadDate\" :33333,";
    strJson += "\"handwrittenConclusion\" :\"怎么跟你形容呢\"";
    strJson += "}";  
    strcpy(szJsonData, strJson.c_str());  
    try   
    {  
        CURL *pCurl = NULL;  
        CURLcode res;  
        // In windows, this will init the winsock stuff  
        curl_global_init(CURL_GLOBAL_ALL);  
  
        // get a curl handle  
        pCurl = curl_easy_init();  
        if (NULL != pCurl)   
        {  
            // 设置超时时间为1秒  
            curl_easy_setopt(pCurl, CURLOPT_TIMEOUT, 1);  
  
            // First set the URL that is about to receive our POST.   
            // This URL can just as well be a   
            // https:// URL if that is what should receive the data.  
            curl_easy_setopt(pCurl, CURLOPT_URL, "http://10.70.31.231:8080/retloh/postcase.do");  
  
            // 设置http发送的内容类型为JSON  
            curl_slist *plist = curl_slist_append(NULL,   
                "Content-Type:application/json;charset=UTF-8");  
            curl_easy_setopt(pCurl, CURLOPT_HTTPHEADER, plist);  
  
            // 设置要POST的JSON数据  
            curl_easy_setopt(pCurl, CURLOPT_POSTFIELDS, szJsonData);  
  
            // Perform the request, res will get the return code   
            res = curl_easy_perform(pCurl);  
            // Check for errors  
            if (res != CURLE_OK)   
            {  
                printf("curl_easy_perform() failed:%s\n", curl_easy_strerror(res));  
            }else{
                printf("%s\n","success!!");

            }  
            // always cleanup  
            curl_easy_cleanup(pCurl);  
        }  
        curl_global_cleanup();  
    }  
    catch (std::exception &ex)  
    {  
        printf("curl exception %s.\n", ex.what());  
    }  
    return 0;  
}  
