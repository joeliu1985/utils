/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 创建时间: 2016年8月8日上午11:11:55
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2016 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Hangzhou Mistong Educational Technology Co.,Ltd. Others are forbidden. 
 * Created on: 2016年8月8日上午11:11:55
 */
package com.github.ichenkaihua;

/**
 * @author liuqiang
 * @version ：1.0 Version
 * @description ： 
 * @date ： 2016年8月8日 
 */
public class Test {
	作者：美团点评技术团队
	链接：https://zhuanlan.zhihu.com/p/21673805
	来源：知乎
	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

	static void test(int mapSize) {

	        HashMap<Key, Integer> map = new HashMap<Key,Integer>(mapSize);
	        for (int i = 0; i < mapSize; ++i) {
	            map.put(Keys.of(i), i);
	        }

	        long beginTime = System.nanoTime(); //获取纳秒
	        for (int i = 0; i < mapSize; i++) {
	            map.get(Keys.of(i));
	        }
	        long endTime = System.nanoTime();
	        System.out.println(endTime - beginTime);
	    }

	    public static void main(String[] args) {
	        for(int i=10;i<= 1000 0000;i*= 10){
	            test(i);
	        }
	    }
}
