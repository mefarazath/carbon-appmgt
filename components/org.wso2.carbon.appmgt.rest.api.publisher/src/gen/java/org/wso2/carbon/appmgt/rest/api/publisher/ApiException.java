package org.wso2.carbon.appmgt.rest.api.publisher;
//comment
public class ApiException extends Exception{
	private int code;
	public ApiException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
