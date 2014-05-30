package com.eagleeye.sdk.util;

import org.apache.http.Header;

public class UtilHeader {

	// ==================
	// Timestamp Current
	// ==================
	public static String getValueFor_X_EE_Timestamp_asPreview(Header[] headers) {
		String result = "";
		
		for(Header header : headers) {
			if(header.getName().equals("x-ee-timestamp")) {
				result = header.getValue();
				break;
			}
		}
				
		if(result.length() > 8) {
			result = result.substring(8);}
		
		return result;
	}

	public static String getValueFor_X_EE_Timestamp_asThumbnail(Header[] headers) {
		String result = "";
		
		for(Header header : headers) {
			if(header.getName().equals("x-ee-timestamp")) {
				result = header.getValue();
				break;
			}
		}
				
		if(result.length() > 6) {
			result = result.substring(6);}
		
		return result;
	}
	
	// ==================
	// Timestamp Previous
	// ==================
	public static String getValueFor_X_EE_Prev_asPreview(Header[] headers) {
		String result = "";
		
		for(Header header : headers) {
			if(header.getName().equals("x-ee-prev")) {
				result = header.getValue();
				break;
			}
		}
		
		if(result.length() > 8) {
			result = result.substring(8);}
		
		return result;
	}
	
	public static String getValueFor_X_EE_Prev_asThumbnail(Header[] headers) {
		String result = "";
		
		for(Header header : headers) {
			if(header.getName().equals("x-ee-prev")) {
				result = header.getValue();
				break;
			}
		}
		
		if(result.length() > 6) {
			result = result.substring(6);}
		
		return result;
	}
	
	// ==================
	// Timestamp Next
	// ==================
	public static String getValueFor_X_EE_Next_asPreview(Header[] headers) {
		String result = "";
		
		for(Header header : headers) {
			if(header.getName().equals("x-ee-next")) {
				result = header.getValue();
				break;
			}
		}

		if(result.length() > 8) {
			result = result.substring(8);}
		
		return result;
	}
	
	public static String getValueFor_X_EE_Next_asThumbnail(Header[] headers) {
		String result = "";
		
		for(Header header : headers) {
			if(header.getName().equals("x-ee-next")) {
				result = header.getValue();
				break;
			}
		}

		if(result.length() > 6) {
			result = result.substring(6);}
		
		return result;
	}
}
