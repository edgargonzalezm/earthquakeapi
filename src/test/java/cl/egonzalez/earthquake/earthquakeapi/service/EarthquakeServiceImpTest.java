package cl.egonzalez.earthquake.earthquakeapi.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import cl.egonzalez.earthquake.earthquakeapi.response.EarthquakeResponse;

class EarthquakeServiceImpTest {

	@Test
	void testGetDetailByDate() {
		Calendar inicio = Calendar.getInstance();
		Calendar fin = Calendar.getInstance();
		inicio.set(2019, Calendar.NOVEMBER, 14);
		fin.set(2019, Calendar.NOVEMBER, 15);
		EarthquakeServiceImp instancia = new EarthquakeServiceImp();
		EarthquakeResponse response = instancia.getDetailByDate(inicio.getTime(), fin.getTime());
		assertNotNull(response);
		assertTrue(response.getFeatures().size() > 0);
	}

	@Test
	void testGetDetailByMagnitude() {
		Float inicio = 6.1F;
		Float fin = 6.2F;
		EarthquakeServiceImp instancia = new EarthquakeServiceImp();
		EarthquakeResponse response = instancia.getDetailByMagnitude(inicio, fin);
		assertNotNull(response);
		assertTrue(response.getFeatures().size() > 0);
	}

	@Test
	void testGetDetailByPais() {
		String pais = "Chile";
		EarthquakeServiceImp instancia = new EarthquakeServiceImp();
		EarthquakeResponse response = instancia.getDetailByPais(pais);
		assertNotNull(response);
		assertTrue(response.getFeatures().size() > 0);
	}

	@Test
	void testgetDetailByRangeDate() {
		Calendar startDate1 = Calendar.getInstance();
		Calendar endDate1 = Calendar.getInstance();
		startDate1.set(2019, Calendar.NOVEMBER, 14);
		endDate1.set(2019, Calendar.NOVEMBER, 15);
		Calendar startDate2 = Calendar.getInstance();
		Calendar endDate2 = Calendar.getInstance();
		startDate2.set(2019, Calendar.OCTOBER, 14);
		endDate2.set(2019, Calendar.OCTOBER, 15);
		EarthquakeServiceImp instancia = new EarthquakeServiceImp();
		EarthquakeResponse response = instancia.getDetailByRangeDate(startDate1.getTime(), endDate1.getTime(),
				startDate2.getTime(), endDate2.getTime());
		assertNotNull(response);
		assertTrue(response.getFeatures().size() > 0);
	}

	@Test
	void testgetDetailByPaisRangoFecha() {
		Calendar startDate1 = Calendar.getInstance();
		Calendar endDate1 = Calendar.getInstance();
		startDate1.set(2019, Calendar.NOVEMBER, 14);
		endDate1.set(2019, Calendar.NOVEMBER, 15);
		String pais1 = "Chile";
		String pais2 = "Peru";

		EarthquakeServiceImp instancia = new EarthquakeServiceImp();
		EarthquakeResponse response = instancia.getDetailByPaisRangoFecha(startDate1.getTime(), endDate1.getTime(),
				pais1, pais2);
		assertNotNull(response);
		assertTrue(response.getFeatures().size() > 0);
	}
}
