package org.dem.helpdesk;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

import org.dem.helpdesk.model.Appointment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/appointmentByDate")
	public Appointment appointmentByDate(@RequestParam(value = "name", defaultValue = "World") String name) {
		Appointment appointment = new Appointment();
		appointment.setId(Long.valueOf(44));
		appointment.setName("John hills");
		appointment.setDate(Timestamp.from(Instant.now()));
		appointment.setComment("Quarterly Budget Meeting");
		appointment.setStatus("In Progress");
		return appointment;
	}
	
	@GetMapping("/appointmentByPerson")
	public Appointment appointmentByPerson(@RequestParam(value = "name", defaultValue = "World") String name) {
		Appointment appointment = new Appointment();
		appointment.setId(Long.valueOf(44));
		appointment.setName("Gills hills");
		Timestamp time = Timestamp.from( Instant.parse( "2022-09-08T01:55:28Z" ) );
		appointment.setDate(time);
		appointment.setComment("Doc Sales meeting");
		appointment.setStatus("In Progress");
		return appointment;
	}
}
