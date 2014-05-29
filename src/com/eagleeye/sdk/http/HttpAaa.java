package com.eagleeye.sdk.http;

import org.apache.http.Header;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

import com.eagleeye.sdk.constants.ConstantsHttp;
import com.eagleeye.sdk.util.UtilAsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpAaa {

	public static void login(String email, String password, Runnable runnableOnSuccess) {
		authenticatePost(email, password, runnableOnSuccess, new JsonHttpResponseHandler() {
			@Override
			public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
				String token = "";
				try {
					token = response.getString("token");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Log.d("HttpAaa", "token: " + token);
			}
		});
	}
	
	private static void authenticatePost(String email, String password, Runnable runnableOnSuccess, AsyncHttpResponseHandler responseHandler) {
		RequestParams rp = new RequestParams();
		rp.put("username", email);
		rp.put("password", password);
		
		UtilAsyncHttpClient.post(ConstantsHttp.url_aaa_authenticate, rp, responseHandler);
	}
	
}
