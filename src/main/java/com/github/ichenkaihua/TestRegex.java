/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 创建时间: 2016年8月2日下午4:31:17
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2016 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Hangzhou Mistong Educational Technology Co.,Ltd. Others are forbidden. 
 * Created on: 2016年8月2日下午4:31:17
 */
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
	
	private final static String RESOURCEIDPATTERN = "(data-auth)\\s{0,}=\\s{0,}[\'\"]\\S+[\'\"]";

	private final static String RESOURCECODEPATTERN = "[\'\"]\\S+[\'\"]";

	private final static String IDTOKEN = "[\'\"]";
	
	private String getAuthResourceCode(String content) {
		Pattern pId = Pattern.compile(RESOURCEIDPATTERN,Pattern.CASE_INSENSITIVE);
		Matcher mId = pId.matcher(content);
		if (mId.find()) {
			String resourceId = mId.group();
			Pattern pCode = Pattern.compile(RESOURCECODEPATTERN);
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
