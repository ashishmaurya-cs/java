package com.ashish;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class InternetEx {
	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.google.com");
			try {
				URLConnection connection=url.openConnection();
				connection.connect();
				System.out.println("Internet connected..");
			} catch (IOException e) {
				System.out.println("Internet not connected.");
			}
		} catch (MalformedURLException e) {
			System.out.println("Internet not connected");
		}
	}

}
