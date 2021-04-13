package nbk.api.headers;

import java.util.HashMap;

import nbk.api.request.activation.certificateActivationPOST;
import nbk.api.utilobjects.Constant;

public class Headers {
		
		public HashMap<String, ?> JsonHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_TYPE, Constant.APPLICATION_JSON);
	        return headers;
	    }
		public HashMap<String, ?> LanguageHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.LANGUAGE_CODE, Constant.ENGLISH);
	        return headers;
	    }
		public HashMap<String, ?> DeviceHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.DEVICE_ID, Constant.DEVICENUMBER);
	        return headers;
	    }
		public HashMap<String, ?> PlatformHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.PLATFORM, Constant.MOBILE_PLATFORM);
	        return headers;
	    }
		public HashMap<String, ?> firmwareHeaders() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.FIRMWARE, Constant.MODEL_FIRMWARE);
	        return headers;        
	            
	        
	    }
		public HashMap<String, ?> contentLength() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_LENGTH, Constant.CNT_LENGTH);
	        return headers;
		}
		
		public HashMap<String, ?> contentLengthGetTerms() {
	        HashMap<String, String> headers = new HashMap<String, String>();
	        headers.put(Constant.CONTENT_LENGTH, Constant.CNT_LENGTH_GETTERMS);
	        return headers;
	        
		}
		
	
		

		
	


}
