/**
 * 版权所有@: 杭州铭师堂教育科技发展有限公司
 * 创建时间: 2016年8月13日上午10:08:52
 * 注意：本内容仅限于杭州铭师堂教育科技发展有限公司内部使用，禁止外泄以及用于其他的商业目的
 * CopyRight@: 2016 Hangzhou Mistong Educational Technology Co.,Ltd.
 * All Rights Reserved.
 * Note:Just limited to use by Hangzhou Mistong Educational Technology Co.,Ltd. Others are forbidden. 
 * Created on: 2016年8月13日上午10:08:52
 */
package com.github.ichenkaihua;

import java.math.BigDecimal;

import com.alibaba.fastjson.JSON;
import com.github.ichenkaihua.json.OnlineResponseVO;

/**
 * @author liuqiang
 * @version ：1.0 Version
 * @description ： 
 * @date ： 2016年8月13日 
 */
public class TestJson {
	private static final int ROBOT_NUM=10;
	
	private static final double times=1.5;
	public static void main(String[] args) {
		String content="{\"TotalUserNumber\":3,\"OnlineUserInfo\":{\"LiveStreamOnlineUserNumInfo\":[{\"StreamUrl\":\"rtmp://liveali.kaike.la/live/IKUKO6437\",\"UserNumber\":0}]},\"RequestId\":\"8F21186F-B5F0-47D9-BD66-3C5FC24A1658\"}";
		
		OnlineResponseVO vo=(OnlineResponseVO)JSON.parseObject(content,OnlineResponseVO.class);
		
		BigDecimal num=BigDecimal.valueOf(ROBOT_NUM).add(BigDecimal.valueOf(vo.getTotalUserNumber()*times));
		
		
		System.out.println(num.toBigInteger().toString());
	}
}
