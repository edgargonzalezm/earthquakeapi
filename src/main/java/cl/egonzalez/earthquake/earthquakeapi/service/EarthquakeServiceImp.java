package cl.egonzalez.earthquake.earthquakeapi.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cl.egonzalez.earthquake.earthquakeapi.response.EarthquakeResponse;

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

}
