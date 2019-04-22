package kg.kompanion.springsoap.pojo.json;

import java.util.HashMap;
import java.util.Map;

public class Response {
	private String result;
	private Map<String, Object> params;
	
	public Response() {
	}
	public String getResult() {
		return result;
	}
	public Map<String, Object> getParams() {
		if(this.params==null)
			params=new HashMap<String, Object>();
		return params;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
