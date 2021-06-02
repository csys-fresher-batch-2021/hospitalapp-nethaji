package in.nethaji.service;

import java.util.List;

import in.nethaji.dao.AppointmentDao;
import in.nethaji.model.Appointment;
import in.nethaji.validation.AppointmentValidation;

public class AppointmentService {

	AppointmentDao appointmentDao = new AppointmentDao();
	
	public boolean addAppointment(Appointment appointment) {
		boolean isAdded = false;
		if (AppointmentValidation.isValidAppointment(appointment)) {
			appointmentDao.save(appointment);
			isAdded = true;
		}
		return isAdded;
	}
	
	/**
	 * This method is used to get the list of appointment in db
	 * 
	 * @return
	 */
	public List<Appointment> getAppointment() {
		return appointmentDao.getAppointmentList();
	}
}
