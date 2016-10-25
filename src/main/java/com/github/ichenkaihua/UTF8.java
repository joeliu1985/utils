package com.github.ichenkaihua;

import java.io.UnsupportedEncodingException;

public class UTF8 {
	public static void main(String[] args) {
		
			
			String name = "http://127.0.0.1:8080/perbank/ShowMoblieQRCode.servlet?name=%E6%88%91%E6%98%AFcm";
	System.out.println("前台传入参数：" + name);  
	try {
		name  = new String(name.getBytes("ISO-8859-1"),"UTF-8");
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}  
	System.out.println("经过解码后参数：" + name);  
	}
}
