package com.eagleeye.sdk.json_ext;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONArray_Ext {

	public static JSONArray createJSONArray(String jsonString) {
		try {
			JSONArray result = new JSONArray(jsonString);
			return result;
		} 
		catch (JSONException e) {
			e.printStackTrace();}
		
		return new JSONArray();
	}

	// ======================
	// Json Object
	// ======================
	public static JSONObject getJSONObject(JSONArray jsonArray, int index) {
		JSONObject result = new JSONObject();
		
		try {
			result = jsonArray.getJSONObject(index);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	// ======================
	// Json Array
	// ======================
	public static JSONArray getJSONArray(JSONArray jsonArray, int index) {

		JSONArray result = new JSONArray();

		try {
			result = jsonArray.getJSONArray(index);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return result;
	}

	// ======================
	// String
	// ======================
	public static String getString(JSONArray jsonArray, int index) {
		String result = "";

		try {
			result = jsonArray.getString(index);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public static boolean isString(JSONArray jsonArray, int index) {
		boolean result = false;
		
		String string = jsonArray.optString(index, null);
		
		if(string != null)
			result = true;
		
		return result;
	}

	// ======================
	// String List
	// ======================
	public static List<String> getStringArray(JSONArray outerJsonArray, int key) {
		List<String> result = new ArrayList<String>();

		JSONArray innerJsonArray = getJSONArray(outerJsonArray, key);
		for(int i=0; i<innerJsonArray.length(); i++) {
			String currentBridge = getString(innerJsonArray, i);
			result.add(currentBridge);
		}

		return result;
	}
	
	public static boolean isStringList(JSONArray jsonArrayOuter, int index) {
		boolean result = false;
		
		JSONArray jsonArrayInner = jsonArrayOuter.optJSONArray(index);
		if(jsonArrayInner != null)
			result = true;
		
		return result;
	}

	// ======================
	// Float
	// ======================
	public static float getFloat(JSONArray jsonArray, int index) {
		float result = 0;

		try {
			result = (float) jsonArray.getDouble(index);} 
		catch (JSONException e) {
			e.printStackTrace();}

		return result;
	}
	
	// ======================
	// Int
	// ======================
	public static int getInt(JSONArray jsonArray, int index) {
		int result = 0;

		try {
			result = jsonArray.getInt(index);
		} catch (JSONException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public static boolean isInt(JSONArray jsonArray, int index) {
		boolean result = false;
		
		try {
			jsonArray.getInt(index);
			result = true;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	// ======================
	// Bool
	// ======================
	public static boolean getBool(JSONArray jsonArray, int index) {
		try {
			boolean result = jsonArray.getBoolean(index);
			return result;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean isBool(JSONArray jsonArray, int index) {
		if(jsonArray.isNull(index)) {
			return false;}
		
		return true;
	}
}
