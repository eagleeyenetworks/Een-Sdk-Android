package com.eagleeye.sdk.util;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ByteArrayEntity;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.RequestParams;

public class UtilAsyncHttpClient {

	public static AsyncHttpClient asyncHttpClient = new AsyncHttpClient();

	static {
	}

	// ===============
	// Post
	// ===============
	public static void post(String url, RequestParams requestParams, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.post(url, requestParams, responseHandler);
	}

	public static void post(String url, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.post(url, responseHandler);
	}

	// ===============
	// Get
	// ===============
	public static void get(String url, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.get(url, responseHandler);
	}

	public static void get(Context context, String url, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.get(context, url, responseHandler);
	}

	public static void get(String url, RequestParams rp, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.get(url, rp, responseHandler);
	}

	public static void post(Context context, String url, Header[] headers, ByteArrayEntity entity, String contentType, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.post(context, url, headers, entity, contentType, responseHandler);
	}

	// ===============
	// Put
	// ===============
	public static void put(String url, RequestParams requestParams, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.put(url, requestParams, responseHandler);
	}
	
	public static void put(Context context, String url, HttpEntity entity, String contentType, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.put(context, url, entity, contentType, responseHandler);
	}
	
	// ===============
	// Delete
	// ===============
	public static void delete(Context context, String url, Header[] headers, RequestParams rp, AsyncHttpResponseHandler responseHandler) {
		asyncHttpClient.delete(context, url, headers, rp, responseHandler);
	}
	
	// ===============
	// Cookie Store
	// ===============
	public static void setCookieStore(PersistentCookieStore persistentCookieStore) {
		asyncHttpClient.setCookieStore(persistentCookieStore);
	}
	
}
