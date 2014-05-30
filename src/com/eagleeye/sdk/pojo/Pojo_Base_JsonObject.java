package com.eagleeye.sdk.pojo;

import java.util.List;

import org.json.JSONObject;

import com.eagleeye.sdk.json_ext.JSONObject_Ext;

public abstract class Pojo_Base_JsonObject {

	protected JSONObject jsonObj;
	
	public Pojo_Base_JsonObject(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	
	// ==================
	// Get Value 
	// ==================
	protected String 	getString(String key) {	return JSONObject_Ext.getString(jsonObj, key);}
	protected int 		getInt(String key) {	return JSONObject_Ext.getInt(jsonObj, key);}
	protected boolean 	getBool(String key) {	return JSONObject_Ext.getBool(jsonObj, key);}
	protected float 	getFloat(String key) {	return JSONObject_Ext.getFloat(jsonObj, key);}
	
	protected JSONObject getJsonObject(String key) {	return JSONObject_Ext.getJSONObject(jsonObj, key);}
	protected List<String> getStringList(String key) {	return JSONObject_Ext.getStringArrayList(jsonObj, key);}
	
	public JSONObject getBackingJsonObject() {
		return jsonObj;
	}
}
