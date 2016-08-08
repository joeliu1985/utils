/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 创建时间: 2016年8月8日上午11:11:18
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2016 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Hangzhou Mistong Educational Technology Co.,Ltd. Others are forbidden. 
 * Created on: 2016年8月8日上午11:11:18
 */
package com.github.ichenkaihua;

import java.util.HashMap;

/**
 * @author liuqiang
 * @version ：1.0 Version
 * @description ： 
 * @date ： 2016年8月8日 
 */
public class Keys {

    public static final int MAX_KEY = 10_000_000;
    private static final Key[] KEYS_CACHE = new Key[MAX_KEY];

    static {
        for (int i = 0; i < MAX_KEY; ++i) {
            KEYS_CACHE[i] = new Key(i);
        }
    }

    public static Key of(int value) {
        return KEYS_CACHE[value];
    }
    


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
            for(int i=10;i<= 10000000;i*= 10){
                test(i);
            }
        }
}

