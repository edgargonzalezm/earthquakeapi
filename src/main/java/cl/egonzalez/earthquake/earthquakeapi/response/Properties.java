package cl.egonzalez.earthquake.earthquakeapi.response;

import java.util.HashMap;
import java.util.Map;

public class Properties {

	private Double mag;
	private String place;
	private Long time;
	private Long updated;
	private Long tz;
	private String url;
	private String detail;
	private Long felt;
	private Double cdi;
	private Double mmi;
	private String alert;
	private String status;
	private Long tsunami;
	private Long sig;
	private String net;
	private String code;
	private String ids;
	private String sources;
	private String types;
	private Object nst;
	private Double dmin;
	private Double rms;
	private Long gap;
	private String magType;
	private String type;
	private String title;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public Double getMag() {
		return mag;
	}

	public void setMag(Double mag) {
		this.mag = mag;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	public Long getTz() {
		return tz;
	}

	public void setTz(Long tz) {
		this.tz = tz;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getFelt() {
		return felt;
	}

	public void setFelt(Long felt) {
		this.felt = felt;
	}

	public Double getCdi() {
		return cdi;
	}

	public void setCdi(Double cdi) {
		this.cdi = cdi;
	}

	public Double getMmi() {
		return mmi;
	}

	public void setMmi(Double mmi) {
		this.mmi = mmi;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTsunami() {
		return tsunami;
	}

	public void setTsunami(Long tsunami) {
		this.tsunami = tsunami;
	}

	public Long getSig() {
		return sig;
	}

	public void setSig(Long sig) {
		this.sig = sig;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIds() {
		return ids;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public String getSources() {
		return sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Object getNst() {
		return nst;
	}

	public void setNst(Object nst) {
		this.nst = nst;
	}

	public Double getDmin() {
		return dmin;
	}

	public void setDmin(Double dmin) {
		this.dmin = dmin;
	}

	public Double getRms() {
		return rms;
	}

	public void setRms(Double rms) {
		this.rms = rms;
	}

	public Long getGap() {
		return gap;
	}

	public void setGap(Long gap) {
		this.gap = gap;
	}

	public String getMagType() {
		return magType;
	}

	public void setMagType(String magType) {
		this.magType = magType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}
}