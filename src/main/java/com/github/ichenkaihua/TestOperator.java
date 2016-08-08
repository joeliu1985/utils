/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 创建时间: 2016年8月8日上午10:46:35
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2016 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Hangzhou Mistong Educational Technology Co.,Ltd. Others are forbidden. 
 * Created on: 2016年8月8日上午10:46:35
 */
package com.github.ichenkaihua;

/**
 * @author liuqiang
 * @version ：1.0 Version
 * @description ： 
 * @date ： 2016年8月8日 
 */
public class TestOperator {

	/**
	 * @author ：Administrator
	 * @param args
	 * @description ：
	 * @date ： 2016年8月8日
	 */
	public static void main(String[] args) {
		int i = (2) & 3;//与
		System.out.println(Integer.toBinaryString(i));
        System.out.println(i);
        
        int j = (2) ^ 3;//或
		System.out.println(Integer.toBinaryString(10));
        System.out.println(j);
	}

}
