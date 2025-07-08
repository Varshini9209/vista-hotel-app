package com.vistadev.VistaHotel.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

import org.springframework.http.HttpStatusCode;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;

    private String token;
    private String role;
    private String expirationTime;
    private String bookingConfirmationCode;

    private UserDTO user;
    private RoomDTO room;
    private BookingDTO booking;
    private List<UserDTO> userList;
    private List<RoomDTO> roomList;
    private List<BookingDTO> bookingList;
	public void setStatusCode(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setMessage(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		
	}
	public void setUserList(List<UserDTO> userDTOList) {
		// TODO Auto-generated method stub
		
	}
	public void setToken(Object token2) {
		// TODO Auto-generated method stub
		
	}
	public void setExpirationTime(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setRole(String role2) {
		// TODO Auto-generated method stub
		
	}
	public HttpStatusCode getStatusCode() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setBookingConfirmationCode(String bookingConfirmationCode2) {
		// TODO Auto-generated method stub
		
	}
	public void setBookingList(List<BookingDTO> bookingDTOList) {
		// TODO Auto-generated method stub
		
	}
	public void setBooking(BookingDTO bookingDTO) {
		// TODO Auto-generated method stub
		
	}
	public void setRoom(RoomDTO roomDTO) {
		// TODO Auto-generated method stub
		
	}
	public void setRoomList(List<RoomDTO> roomDTOList) {
		// TODO Auto-generated method stub
		
	}


}
