package com.github.ichenkaihua;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuqiang
 * @version ：1.0 Version
 * @description ： 
 * @date ： 2016年8月2日 
 */
public class TestRegex {
	
	private final static String RESOURCE_ID_PATTERN = "(data-auth)\\s{0,}=\\s{0,}[\'\"]\\S+[\'\"]";

	private final static String RESOURCE_CODE_PATTERN = "[\'\"]\\S+[\'\"]";

	private final static String IDTOKEN = "[\'\"]";
	
	private String getAuthResourceCode(String content) {
		Pattern pId = Pattern.compile(RESOURCE_ID_PATTERN,Pattern.CASE_INSENSITIVE);
		Matcher mId = pId.matcher(content);
		if (mId.find()) {
			String resourceId = mId.group();
			Pattern pCode = Pattern.compile(RESOURCE_CODE_PATTERN);
			Matcher mCode = pCode.matcher(resourceId);
			if (mCode.find()) {
				String resourceTemp = mCode.group();
				String resourceCode = resourceTemp.replaceAll(IDTOKEN, "");
				return resourceCode;
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		String test_id="<a Data-AUTH='02020101' href='#' class='easyui-linkbutton' iconCls='icon-add' plain='true' onclick='javascript:baseCommodity()'>基础商品添加</a>";
		
		TestRegex test=new TestRegex();
		System.out.println(test.getAuthResourceCode(test_id));
	}

}
