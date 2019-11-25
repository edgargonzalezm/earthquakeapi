package cl.egonzalez.earthquake.earthquakeapi.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.egonzalez.earthquake.earthquakeapi.response.EarthquakeResponse;
import cl.egonzalez.earthquake.earthquakeapi.response.Feature;

@Service
public class EarthquakeServiceImp implements EarthquakeService {

	private final String urlServicio = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson";

	@Override
	public EarthquakeResponse getDetailByDate(Date startDate, Date endDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String url = urlServicio + "&starttime=" + sdf.format(startDate) + "&endtime=" + sdf.format(endDate);

		RestTemplate restTemplate = new RestTemplate();
		EarthquakeResponse result = restTemplate.getForObject(url, EarthquakeResponse.class);
		return result;
	}

	@Override
	public EarthquakeResponse getDetailByMagnitude(Float minmagnitude, Float maxmagnitude) {
		String url = urlServicio + "&minmagnitude=" + minmagnitude + "&maxmagnitude=" + maxmagnitude;

		RestTemplate restTemplate = new RestTemplate();
		EarthquakeResponse result = restTemplate.getForObject(url, EarthquakeResponse.class);
		return result;
	}

	@Override
	public EarthquakeResponse getDetailByRangeDate(Date startDate1, Date endDate1, Date startDate2, Date endDate2) {

		EarthquakeResponse earthquakeResponse1 = getDetailByDate(startDate1, endDate1);

		EarthquakeResponse earthquakeResponse2 = getDetailByDate(startDate1, endDate1);

		earthquakeResponse1.getFeatures().addAll(earthquakeResponse2.getFeatures());
		return earthquakeResponse1;
	}

	@Override
	public EarthquakeResponse getDetailByPais(String pais) {
		String url = urlServicio;

		RestTemplate restTemplate = new RestTemplate();
		EarthquakeResponse result = restTemplate.getForObject(url, EarthquakeResponse.class);
		List<Feature> features = result.getFeatures();
		List<Feature> featuresTem = new ArrayList<>();
		features.forEach(a -> {
			if (a.getProperties().getPlace().contains(pais))
				featuresTem.add(a);
		});
		result.setFeatures(featuresTem);
		return result;
	}

	@Override
	public EarthquakeResponse getDetailByPaisRangoFecha(Date startDate1, Date endDate1, String pais1, String pais2) {
		EarthquakeResponse result = getDetailByDate(startDate1, endDate1);
		List<Feature> features = result.getFeatures();
		List<Feature> featuresTem = new ArrayList<>();
		features.forEach(a -> {
			if (a.getProperties().getPlace().contains(pais1) || a.getProperties().getPlace().contains(pais2))
				featuresTem.add(a);
		});
		result.setFeatures(featuresTem);
		return result;
	}

}
