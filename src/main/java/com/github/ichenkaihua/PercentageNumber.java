package com.github.ichenkaihua;

import java.text.NumberFormat;

public class PercentageNumber {
  public static void main(String []args){
	  int num1 = 7;

	  int num2 = 9;
	  
	  int num3 = 21123123;

	  // 创建一个数值格式化对象

	  NumberFormat numberFormat = NumberFormat.getInstance();


	  numberFormat.setMaximumFractionDigits(0);

	  String result1 = numberFormat.format((float) num1 / (float) (num1+num2+num3) * 100);
	  String result2 = numberFormat.format((float) num2 / (float) (num1+num2+num3) * 100);
	  String result3 = numberFormat.format((float) num3 / (float) (num1+num2+num3) * 100);

	  System.out.println("num1和num2的百分比为:" + result1 + "%");
	  System.out.println("num1和num2的百分比为:" + result2 + "%");
	  System.out.println("num1和num2的百分比为:" + result3 + "%");
	  
	  System.out.println(Integer.parseInt(result1)+Integer.parseInt(result2)+Integer.parseInt(result3));
  }
}
