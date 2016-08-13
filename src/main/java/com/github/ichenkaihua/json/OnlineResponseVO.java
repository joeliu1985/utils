package com.github.ichenkaihua.json;

public class OnlineResponseVO {
	private int TotalUserNumber;
	private OnlineUserInfo OnlineUserInfo;
	private String RequestId;

	public void setTotalUserNumber(int TotalUserNumber) {
		this.TotalUserNumber = TotalUserNumber;
	}

	public int getTotalUserNumber() {
		return this.TotalUserNumber;
	}

	public void setOnlineUserInfo(OnlineUserInfo OnlineUserInfo) {
		this.OnlineUserInfo = OnlineUserInfo;
	}

	public OnlineUserInfo getOnlineUserInfo() {
		return this.OnlineUserInfo;
	}

	public void setRequestId(String RequestId) {
		this.RequestId = RequestId;
	}

	public String getRequestId() {
		return this.RequestId;
	}
}