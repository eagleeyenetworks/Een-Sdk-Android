package com.eagleeye.sdk.pojo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class PojoDeviceList extends Pojo_Base_JsonArray {

	public List<Device> devices = new ArrayList<Device>();
	
	public PojoDeviceList(JSONArray jsonArray) {
		super(jsonArray);
		
		for(int i=0; i<jsonArray.length(); i++) {
			JSONArray deviceJA = getJsonArray(i);
			Device device = new Device(deviceJA);
			
			devices.add(device);
		}
	}
	
	public class Device extends Pojo_Base_JsonArray {
		
		public String 			account_id;
		public String 			id;
		public String 			name;
		public String 			type;
		public List<String>		bridges;
		public String 			service_status;
		public String			permissions;

		public List<String>		tags;
		public String			guid;
		public String			serial_number;
		public int				device_status;
		public String			timezone;
		public int				timezone_utc_offset;
		public int				is_unsupported;

		public String			ip_address;
		public int				is_shared;
		public String			owner_account_name;
		public boolean			is_upnp;
		public String			video_input;
		public String			video_status;
		
		public Device(JSONArray jsonArray) {
			super(jsonArray);
			
			account_id 			= getString(0);
			id 					= getString(1);
			name 				= getString(2);
			type 				= getString(3);
			bridges 			= getStringList(4);
			service_status 		= getString(5);
			permissions 		= getString(6);

			tags				= getStringList(7);
			guid				= getString(8);
			serial_number		= getString(9);
			device_status		= getInt(10);
			timezone			= getString(11);
			timezone_utc_offset	= getInt(12);
			is_unsupported		= getInt(13);

			ip_address			= getString(14);
			is_shared			= getInt(15);
			owner_account_name	= getString(16);
			is_upnp				= getBool(17);
			video_input			= getString(18);
			video_status		= getString(19);
		}
		
	}

}
