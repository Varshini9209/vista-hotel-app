package com.vistadev.VistaHotel.service.interfac;


import com.vistadev.VistaHotel.dto.LoginRequest;
import com.vistadev.VistaHotel.dto.Response;
import com.vistadev.VistaHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

	Response getUSerBookingHistory(String userId);

}
