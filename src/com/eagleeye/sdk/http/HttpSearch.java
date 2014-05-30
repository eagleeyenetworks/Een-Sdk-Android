package com.eagleeye.sdk.http;

import com.eagleeye.sdk.constants.ConstantsHttp;
import com.eagleeye.sdk.util.UtilAsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpSearch implements ConstantsHttp {
	
	public static void recordingsGet(String value, String start_timestamp, RequestParams optionalParams, AsyncHttpResponseHandler responseHandler) {
		optionalParams.put("value", value);
		optionalParams.put("start_timestamp", start_timestamp);
		
		UtilAsyncHttpClient.get(url_search_recordings, optionalParams, responseHandler);
	}
}
