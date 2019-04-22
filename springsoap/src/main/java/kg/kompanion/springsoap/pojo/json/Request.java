package kg.kompanion.springsoap.pojo.json;

import java.util.Map;

public class Request {
	private Map<String, Object> params;
	
	public Request() {
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
