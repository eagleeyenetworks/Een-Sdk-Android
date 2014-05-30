package com.eagleeye.sdk.http;

import com.eagleeye.sdk.constants.ConstantsHttp;
import com.eagleeye.sdk.util.UtilAsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpDevice implements ConstantsHttp {

	public static void get(String id, AsyncHttpResponseHandler responseHandler) {
		RequestParams rp = new RequestParams();
		rp.put("id", id);
		
		UtilAsyncHttpClient.get(url_device, rp, responseHandler);
	}
	
	public static void put(RequestParams rp, AsyncHttpResponseHandler responseHandler) {
		UtilAsyncHttpClient.put(url_device, rp, responseHandler);
	}
	
	public static void post(RequestParams rp, AsyncHttpResponseHandler responseHandler) {
		UtilAsyncHttpClient.post(url_device, rp, responseHandler);
	}
	
	public static void listGet(AsyncHttpResponseHandler responseHandler) {
		
		RequestParams rp = new RequestParams();
		listGet(rp, responseHandler);
	}
	
	public static void listGet(RequestParams rp, AsyncHttpResponseHandler responseHandler) {
		UtilAsyncHttpClient.get(url_device_list, rp, responseHandler);
	}	
}
