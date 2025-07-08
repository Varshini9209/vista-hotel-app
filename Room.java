package com.vistadev.VistaHotel.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rooms")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String roomType;
	private String roomPRice;
	private String roomPhotoUrl;
	private String roomDescription;

	@OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
	private List<Booking> bookings = new ArrayList<>();

	
	@Override
	public String toString() {
		return "Room [id=" + id +
				", roomType=" + roomType +
				", roomPRice=" + roomPRice +
				", roomPhotoUrl=" + roomPhotoUrl +
				", roomDescription=" + roomDescription +
				"]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomPRice() {
		return roomPRice;
	}

	public void setRoomPRice(String roomPRice) {
		this.roomPRice = roomPRice;
	}

	public String getRoomPhotoUrl() {
		return roomPhotoUrl;
	}

	public void setRoomPhotoUrl(String roomPhotoUrl) {
		this.roomPhotoUrl = roomPhotoUrl;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public List<Booking> getBooking() {
		return getBooking();
	}

	public void setBooking(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public BigDecimal getRoomPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Booking> getBookings() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setRoomPrice(BigDecimal roomPrice2) {
		// TODO Auto-generated method stub
		
	}
	
	
}

