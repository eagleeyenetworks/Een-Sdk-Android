package com.eagleeye.sdk.http;

import java.io.UnsupportedEncodingException;

import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

import com.eagleeye.sdk.constants.ConstantsHttp;
import com.eagleeye.sdk.util.UtilAsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

public class HttpAnnotation implements ConstantsHttp {
	
	public static void put(Context context, String device_id, String timestamp, JSONObject data, AsyncHttpResponseHandler responseHandler) {

		JSONObject requestParamsAsJson = new JSONObject();
		try {
			requestParamsAsJson.put("device_id", device_id);
			requestParamsAsJson.put("timestamp", timestamp);
			requestParamsAsJson.put("data", data);
			
		} catch (JSONException e1) {
			e1.printStackTrace();
		}
		
		StringEntity stringEntity = null;
		try {
			stringEntity = new StringEntity(requestParamsAsJson.toString());
			stringEntity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return;
		}
		
		UtilAsyncHttpClient.put(context, url_annotation, stringEntity, "application/json", responseHandler);
	}

}
