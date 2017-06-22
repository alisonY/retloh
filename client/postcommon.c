#include <curl/curl.h>  
#include <string>  
#include <exception>
#include <string.h>
  
int main(int argc, char *argv[])   
{  
    char szJsonData[1024];  
    memset(szJsonData, 0, sizeof(szJsonData));  
    std::string strJson = "{";  
    strJson += "\"num\" : \"001\",";  
    strJson += "\"patName\" :\"杰伦\",";
    strJson += "\"sex\" :\"男\",";
    strJson += "\"age\" :38,";
    strJson += "\"tell\" :\"12091780150\",";
    strJson += "\"idCard\" :\"320381198910092389\",";
    strJson += "\"socialId\" :\"230239109810091923\",";
    strJson += "\"hsName\" :\"武警三院\",";
    strJson += "\"patNo\" :\"3338\",";
    strJson += "\"areaId\" :\"1-923\",";
    strJson += "\"pgType\" :\"心电\",";
    strJson += "\"upId\" :\"root\",";
    strJson += "\"upName\" :\"无名氏\",";
    strJson += "\"anaId\" :\"000001\",";
    strJson += "\"anaName\" :\"心电一组\",";
    strJson += "\"upTime\" :\"2017-06-22 13:27\",";
    strJson += "\"downTime\" :\"2017-06-22 18:00\",";
    strJson += "\"netFlag\" :\"已下载\",";
    strJson += "\"special\" :\"吃不死人的没啥注意的\",";
    strJson += "\"conclusion\" :\"小伙你印堂发黑啊\",";
    strJson += "\"reportId\" :\"save000\",";
    strJson += "\"analysedFile\" :\"\",";
    strJson += "\"info\" :\"Name:搞笑#param:起搏器#Time:每天一次\",";
    strJson += "\"param0\" :88888888,";
    strJson += "\"param1\" :88888888,";
    strJson += "\"param2\" :2017,";
    strJson += "\"param3\" :5,";
    strJson += "\"param4\" :25,";
    strJson += "\"param5\" :\"早睡早起\",";
    strJson += "\"param6\" :\"强撸飞灰烟灭\",";
    strJson += "\"param7\" :\"时间不多了\",";
    strJson += "\"param8\" :33333,";
    strJson += "\"param9\" :\"怎么跟你形容呢\"";
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
