package cl.egonzalez.earthquake.earthquakeapi.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.egonzalez.earthquake.earthquakeapi.service.EarthquakeService;

@RestController
public class EarthquakeController {

	@Autowired
	private EarthquakeService earthquakeService;

	@GetMapping(value = "/sismos/fechas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSismoByFecha(
			@RequestParam(value = "startDate", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
			@RequestParam(value = "endtDate", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {

		return new ResponseEntity<>(earthquakeService.getDetailByDate(startDate, endDate), HttpStatus.OK);
	}

	@GetMapping(value = "/sismos/magnitudes", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSismoByMagnitud(
			@RequestParam(value = "minmagnitude", required = true) Float minmagnitude,
			@RequestParam(value = "maxmagnitude", required = true) Float maxmagnitude) {

		return new ResponseEntity<>(earthquakeService.getDetailByMagnitude(minmagnitude, maxmagnitude), HttpStatus.OK);
	}

	@GetMapping(value = "/sismos/rangofecha", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getSismoByRangoFecha(
			@RequestParam(value = "startDate1", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate1,
			@RequestParam(value = "endtDate1", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate1,
			@RequestParam(value = "startDate2", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate2,
			@RequestParam(value = "endtDate2", required = true) @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate2) {

		return new ResponseEntity<>(earthquakeService.getDetailByRangeDate(startDate1, endDate1, startDate2, endDate2),
				HttpStatus.OK);
	}
}
