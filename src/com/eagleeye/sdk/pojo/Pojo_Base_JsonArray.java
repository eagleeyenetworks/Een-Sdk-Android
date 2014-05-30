package com.eagleeye.sdk.pojo;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.eagleeye.sdk.json_ext.JSONArray_Ext;

public abstract class Pojo_Base_JsonArray {

	protected final JSONArray jsonArray;
	
	public Pojo_Base_JsonArray(JSONArray jsonArray) {
		this.jsonArray = jsonArray;
	}
	
	// ==================
	// Get Value 
	// ==================
	protected String 	getString(int index) {	return JSONArray_Ext.getString(jsonArray, index);}
	protected int 		getInt(int index) {		return JSONArray_Ext.getInt(jsonArray, index);}
	protected boolean 	getBool(int index) {	return JSONArray_Ext.getBool(jsonArray, index);}
	protected float 	getFloat(int index) {	return JSONArray_Ext.getFloat(jsonArray, index);}
	
	protected List<String> getStringList(int index) {	return JSONArray_Ext.getStringArray(jsonArray, index);}

	protected JSONObject getJsonObject(int index) {	return JSONArray_Ext.getJSONObject(jsonArray, index);}
	protected JSONArray getJsonArray(int index) {		return JSONArray_Ext.getJSONArray(jsonArray, index);}

	public JSONArray getBackingJsonArray() {
		return jsonArray;
	}
}
