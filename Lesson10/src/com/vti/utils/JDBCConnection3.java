package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
Mr.Son
 */
public class JDBCConnection3 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/resources/database.properties"));

        String urlConnection = properties.getProperty("urlConnection");
        System.out.println(urlConnection);
        String username  = properties.getProperty("userName");
        System.out.println(username);
    }
}
