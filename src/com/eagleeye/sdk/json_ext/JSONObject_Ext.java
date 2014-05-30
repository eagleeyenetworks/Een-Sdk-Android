package com.eagleeye.sdk.json_ext;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONObject_Ext {

	public static JSONObject createJSONObject(String jsonString) {
		try {
			JSONObject result = new JSONObject(jsonString);
			return result;
		} 
		catch (JSONException e) {
			e.printStackTrace();}
		
		return new JSONObject();
	}
	
	public static JSONObject getJSONObject(JSONObject jsonObj, String key) {
		try {
			JSONObject result = jsonObj.getJSONObject(key);
			return result;
		} 
		catch (JSONException e) {
			e.printStackTrace();}
		
		return new JSONObject();
	}
	
	// ======================
	// String
	// ======================
	public static String getString(JSONObject jsonObj, String key) {
		String result = "";
		try {
			result = jsonObj.getString(key);} 
		catch (JSONException e) {
			e.printStackTrace();}

		return result;
	}

	public static boolean isString(JSONObject jsonObj, String key) {
		boolean result = false;
		
		String string = jsonObj.optString(key, null);
		if(string != null)
			result = true;
		
		return result;
	}
	
	// ======================
	// String List
	// ======================
	public static List<String> getStringArrayList(JSONObject jsonObj, String key) {
		List<String> result = new ArrayList<String>();

		JSONArray jsonArray = getJSONArray(jsonObj, key);
		for(int i=0; i<jsonArray.length(); i++) {
			String currentBridge = JSONArray_Ext.getString(jsonArray, i);
			result.add(currentBridge);
		}

		return result;
	}

	public static boolean isStringArray(JSONObject jsonObj, String key) {
		boolean result = false;
		
		JSONArray jsonArray = jsonObj.optJSONArray(key);
		if(jsonArray != null)
			result = true;
		
		return result;
	}
	
	// ======================
	// Bool
	// ======================
	public static boolean getBool(JSONObject jsonObj, String key) {
		boolean result = false;

		try {
			result = jsonObj.getBoolean(key);} 
		catch (JSONException e) {
			e.printStackTrace();}

		return result;
	}
	
	public static boolean isBool(JSONObject jsonObj, String key) {
		if(jsonObj.isNull(key)) {
			return false;}
		
		return true;
	}

	// ======================
	// Float
	// ======================
	public static float getFloat(JSONObject jsonObj, String key) {
		float result = 0;

		try {
			result = (float) jsonObj.getDouble(key);} 
		catch (JSONException e) {
			e.printStackTrace();}

		return result;
	}
	
	public static boolean isFloat(JSONObject jsonObj, String key) {
		boolean result = false;
		
		try {
			jsonObj.getDouble(key);
			result = true;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	// ======================
	// Int
	// ======================
	public static int getInt(JSONObject jsonObj, String key) {
		int result = 0;

		try {
			result = jsonObj.getInt(key);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public static boolean isInt(JSONObject jsonObj, String key) {
		boolean result = false;
		
		try {
			jsonObj.getInt(key);
			result = true;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	// ======================
	// JSONArray
	// ======================
	public static JSONArray getJSONArray(JSONObject jsonObj, String key) {
		JSONArray result = new JSONArray();

		try {
			result = jsonObj.getJSONArray(key);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return result;
	}
}
