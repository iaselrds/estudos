package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long daysBetween = ChronoUnit.DAYS.between(checkIn, checkOut);
		return daysBetween;
	}
	
	public String updateDates(LocalDate checkIn, LocalDate checkout) {
		LocalDate date = LocalDate.now();
		if (checkIn.isBefore(date) || checkOut.isBefore(date)) {
			return "Error in reservation: Reservation dates for update must be future dates.";
		} if (checkIn.isAfter(checkOut)) {
			return "Error in reservation: Check-out date must be after check-in date.";
		}	
		this.checkIn = checkIn;
		this.checkOut = checkout; 
		return null;
	}

	@Override
	public String toString() {
		return "Room "+ roomNumber +", check-in: "+ fmt.format(checkIn) +", check-out: "+ fmt.format(checkOut) +", "+ duration() +" nights";
	}
	
	
}
