package com.bishe.lr.http;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpClient {
    public HttpClient() throws IOException {
    }

    public static void main(String[] args) {
//        HttpClient httpClient = new HttpClient();
    }
    CloseableHttpClient httpClient = HttpClients.createDefault();//打开浏览器
    HttpGet httpGet = new HttpGet("baidu.com");
    CloseableHttpResponse response = httpClient.execute(httpGet);

//    //4.判断状态码
//        if(response.getStatusLine().getStatusCode()==200){
//        HttpEntity entity = response.getEntity();
//        //使用工具类EntityUtils，从响应中取出实体表示的内容并转换成字符串
//        String string = EntityUtils.toString(entity, "utf-8");
//        System.out.println(string);
//    }
//    //5.关闭资源
//        response.close();
//        httpClient.close();

}
