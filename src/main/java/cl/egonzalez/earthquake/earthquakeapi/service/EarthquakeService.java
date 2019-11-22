package cl.egonzalez.earthquake.earthquakeapi.service;

import java.util.Date;

import cl.egonzalez.earthquake.earthquakeapi.response.EarthquakeResponse;

public interface EarthquakeService {

	EarthquakeResponse getDetailByDate(Date startDate, Date endDate);

	EarthquakeResponse getDetailByMagnitude(Float minmagnitude, Float maxmagnitude);

	EarthquakeResponse getDetailByRangeDate(Date startDate1, Date endDate1, Date startDate2, Date endDate2);
}
