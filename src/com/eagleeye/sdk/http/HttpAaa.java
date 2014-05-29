package com.eagleeye.sdk.http;

import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

import com.eagleeye.sdk.constants.ConstantsHttp;
import com.eagleeye.sdk.util.UtilAsyncHttpClient;
import com.eagleeye.sdk.util.UtilRunnable;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpAaa {

	public static void login(String email, String password) {
		login(email, password, null, null);
	}
	
	public static void login(String email, String password, final Runnable runnableLoginOnSuccess) {
		login(email, password, runnableLoginOnSuccess, null);
	}
	
	public static void login(String email, String password, final Runnable runnableLoginOnSuccess, final Runnable runnableLoginOnFailure) {
		authenticatePost(email, password, new JsonHttpResponseHandler() {
			@Override
			public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
				String token = "";
				try {
					token = response.getString("token");
				} catch (JSONException e) {
					e.printStackTrace();
				}
				
				authorizePost(token, new JsonHttpResponseHandler() {
					@Override
					public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
						UtilRunnable.runIfNotNull(runnableLoginOnSuccess);
					}
					
					@Override 
					public void onFailure(int statusCode, Header[] headers, String response, Throwable error) {
						onLoginFailed(runnableLoginOnFailure);
					}
				});
			}
			
			@Override 
			public void onFailure(int statusCode, Header[] headers, String response, Throwable error) {
				onLoginFailed(runnableLoginOnFailure);
			}
			
		});
	}
	
	protected static void onLoginFailed(Runnable runnableLoginOnFailure) {
		UtilRunnable.runIfNotNull(runnableLoginOnFailure);
		
	}

	public static void authenticatePost(String email, String password, AsyncHttpResponseHandler responseHandler) {
		RequestParams rp = new RequestParams();
		rp.put("username", email);
		rp.put("password", password);
		UtilAsyncHttpClient.post(ConstantsHttp.url_aaa_authenticate, rp, responseHandler);
	}

	public static void authorizePost(String authenticateToken, AsyncHttpResponseHandler responseHandler) {
		RequestParams rp = new RequestParams();
		rp.put("token", authenticateToken);
		UtilAsyncHttpClient.post(ConstantsHttp.url_aaa_authorize, rp, responseHandler);
	}
	
	public static void logoutPost(AsyncHttpResponseHandler responseHandler) {
		UtilAsyncHttpClient.post(ConstantsHttp.url_aaa_logout, responseHandler);
	}
}
