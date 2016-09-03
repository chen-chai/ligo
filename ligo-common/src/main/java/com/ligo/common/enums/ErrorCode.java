package com.ligo.common.enums;

/**
 * 错误编码
 * @author zhiya.chai
 * 2016年9月3日 下午9:39:55
 */
public enum ErrorCode {

	SUCCESS(0,"成功");
	
	private int code;
	private String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private ErrorCode(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
