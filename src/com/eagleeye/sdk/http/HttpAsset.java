package com.eagleeye.sdk.http;

import com.eagleeye.sdk.constants.ConstantsHttp;
import com.eagleeye.sdk.enumerated.E_AssetClass;
import com.eagleeye.sdk.util.UtilAsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class HttpAsset implements ConstantsHttp {
	
	
	public static void AssetGet(String cameraId, String timestamp, E_AssetClass assetClass, AsyncHttpResponseHandler responseHandler) {
		RequestParams optionalParams = new RequestParams();
		AssetGet(cameraId, timestamp, assetClass, optionalParams, responseHandler);
	}
	
	public static void AssetGet(String cameraId, String timestamp, E_AssetClass assetClass, RequestParams optionalParams, AsyncHttpResponseHandler responseHandler) {	
		optionalParams.put("id", cameraId);
		optionalParams.put("timestamp", timestamp);
		optionalParams.put("asset_class", assetClass.toString());
		
		UtilAsyncHttpClient.get(url_asset_asset, optionalParams, responseHandler);
	}
	
	public static void PrevGet(String cameraId, String timestamp, E_AssetClass assetClass, AsyncHttpResponseHandler responseHandler) {
		RequestParams optionalParams = new RequestParams();
		PrevGet(cameraId, timestamp, assetClass, optionalParams, responseHandler);
	}
	
	public static void PrevGet(String cameraId, String timestamp, E_AssetClass assetClass, RequestParams optionalParams, AsyncHttpResponseHandler responseHandler) {	
		optionalParams.put("id", cameraId);
		optionalParams.put("timestamp", timestamp);
		optionalParams.put("asset_class", assetClass.toString());
		
		UtilAsyncHttpClient.get(url_asset_prev, optionalParams, responseHandler);
	}
	
	public static void AfterGet(String cameraId, String timestamp, E_AssetClass assetClass, AsyncHttpResponseHandler responseHandler) {
		RequestParams optionalParams = new RequestParams();
		AfterGet(cameraId, timestamp, assetClass, optionalParams, responseHandler);
	}
	
	public static void AfterGet(String cameraId, String timestamp, E_AssetClass assetClass, RequestParams optionalParams, AsyncHttpResponseHandler responseHandler) {	
		optionalParams.put("id", cameraId);
		optionalParams.put("timestamp", timestamp);
		optionalParams.put("asset_class", assetClass.toString());
		
		UtilAsyncHttpClient.get(url_asset_after, optionalParams, responseHandler);
	}
}
