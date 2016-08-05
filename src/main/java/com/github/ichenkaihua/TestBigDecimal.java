package com.github.ichenkaihua;

import java.math.BigDecimal;

public class TestBigDecimal {
 public static void main (String[] args){
	 BigDecimal test= BigDecimal.valueOf(2).divide(BigDecimal.valueOf(150),4,BigDecimal.ROUND_UP);
	 
	 
	 BigDecimal test2= BigDecimal.valueOf(13).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(15),2,BigDecimal.ROUND_UP);
	 System.out.println(test2);
 }
}
