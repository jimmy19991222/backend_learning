package com.jieming.web.URL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLtest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/helloworld/index.jsp?username=LouJieming&password=123");
        System.out.println("url.getProtocol(): " + url.getProtocol());
        System.out.println("url.getHost(): " + url.getHost());
        System.out.println("url.getPort(): "+url.getPort());
        System.out.println("url.getPath(): "+url.getPath());
        System.out.println("url.getFile(): "+url.getFile());
        System.out.println("url.getQuery(): "+url.getQuery());

        // download from tomcat url
        URL urlDownload = new URL("http://localhost:8080/Jieming/confidentialFile.txt");
        // connect http
        HttpURLConnection urlConnection = (HttpURLConnection) urlDownload.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos = new FileOutputStream("ConfidentialFile.txt");
        byte[] buffer = new byte[1024];
        int len;
        while((len = inputStream.read(buffer))!=-1){
            fos.write(buffer, 0, len);
        }
        fos.close();
        inputStream.close();
        urlConnection.disconnect();
    }
}
