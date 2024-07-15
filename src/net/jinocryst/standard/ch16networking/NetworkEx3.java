package net.jinocryst.standard.ch16networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://healthnyou-dev.thejoin.co.kr");
        URLConnection conn = url.openConnection();
        System.out.println("conn : " + conn.toString());
        System.out.println("contentType : " + conn.getContentType());
    }
}
