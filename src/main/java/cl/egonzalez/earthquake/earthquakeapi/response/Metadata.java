package cl.egonzalez.earthquake.earthquakeapi.response;

import java.util.HashMap;
import java.util.Map;

public class Metadata {

	private Long generated;
	private String url;
	private String title;
	private Long status;
	private String api;
	private Long count;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Long getGenerated() {
		return generated;
	}

	public void setGenerated(Long generated) {
		this.generated = generated;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public String getApi() {
		return api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}