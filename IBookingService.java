package com.vistadev.VistaHotel.service.interfac;



import com.vistadev.VistaHotel.dto.Response;
import com.vistadev.VistaHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
