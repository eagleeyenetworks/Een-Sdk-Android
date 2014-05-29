package com.eagleeye.sdk.constants;

public interface ConstantsHttp {

	static final String url_base							= "https://login.eagleeyenetworks.com/g/";
	
	// aaa: Authentication, Authorization, and Registration
	public static final String url_aaa_authenticate 				= url_base + "aaa/authenticate";
	public static final String url_aaa_authorize					= url_base + "aaa/authorize";
	public static final String url_aaa_createaccount				= url_base + "aaa/create_account";
	public static final String url_aaa_validateaccount				= url_base + "aaa/validate_account";
	public static final String url_aaa_forgotpassword				= url_base + "aaa/forgot_password";
	public static final String url_aaa_checkpwresettoken			= url_base + "aaa/check_pw_reset_token";
	public static final String url_aaa_resetpassword				= url_base + "aaa/reset_password";
	public static final String url_aaa_resendregistrationemail		= url_base + "aaa/resend_registration_email";
	public static final String url_aaa_resenduserverificationemail	= url_base + "aaa/resend_user_verification_email";
	public static final String url_aaa_changepassword 				= url_base + "aaa/change_password";
	public static final String url_aaa_logout						= url_base + "aaa/logout";
	public static final String url_aaa_switch_account				= url_base + "aaa/switch_account";
	
	// account: Account operations
	public static final String url_account 						= url_base + "account";
	
	// action: Actions
	public static final String url_action_recordnow				= url_base + "action/recordnow";
	public static final String url_action_allon					= url_base + "action/allon";
	public static final String url_action_alloff				= url_base + "action/alloff";
	
	// asset: Asset operations TODO Define asset API urls  
	public static final String url_asset_asset					= "https://eagleeyenetworks.com/asset/asset/image.jpeg";
	public static final String url_asset_prev					= "https://eagleeyenetworks.com/asset/prev/image.jpeg";
	public static final String url_asset_after					= "https://eagleeyenetworks.com/asset/after/image.jpeg";
	
	// device: Camera and bridge operations
	public static final String url_device						= url_base + "device";
	
	// feedback: Feedback operations
	public static final String url_feedback						= url_base + "feedback";
	
	// layout: Layout operations
	public static final String url_layout						= url_base + "layout";
	
	// list: List devices, layouts, users, etc...
	public static final String url_list_devices					= url_base + "list/devices";
	public static final String url_list_accounts				= url_base + "list/accounts";
	public static final String url_list_users					= url_base + "list/users";
	public static final String url_list_layouts					= url_base + "list/layouts";
	
	// metric: Metric queries
	public static final String url_metric_bridgebandwith		= url_base + "metric/bridgebandwidth";
	public static final String url_metric_camerabandwith		= url_base + "metric/camerabandwith";
	
	// poll: Polling operations
	public static final String url_poll							= "https://eagleeyenetworks.com/poll";
	
	// user: User operations
	public static final String url_user							= url_base + "user";
	
	// pngspan: Png Span
	public static final String url_pngspan						= "https://eagleeyenetworks.com/pngspan/span.png";
	
	public static final String REALM	= "eagleeyenetworks";
}
