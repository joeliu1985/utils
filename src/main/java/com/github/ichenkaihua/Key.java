/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 创建时间: 2016年8月8日上午11:10:39
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2016 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Hangzhou Mistong Educational Technology Co.,Ltd. Others are forbidden. 
 * Created on: 2016年8月8日上午11:10:39
 */
package com.github.ichenkaihua;

/**
 * @author liuqiang
 * @version ：1.0 Version
 * @description ： 
 * @date ： 2016年8月8日 
 */


public class Key implements Comparable<Key> {

    private final int value;

    Key(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Key o) {
        return Integer.compare(this.value, o.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Key key = (Key) o;
        return value == key.value;
    }

    @Override
    public int hashCode() {
        return value;
    }
}
