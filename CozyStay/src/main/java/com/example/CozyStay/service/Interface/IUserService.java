package com.example.CozyStay.service.Interface;

import com.example.CozyStay.dto.LoginRequest;
import com.example.CozyStay.dto.Response;
import com.example.CozyStay.entity.User;

public interface IUserService {
    Response register(User loginRequest);
    Response login(LoginRequest loginRequest);
    Response getAllUsers();
    Response getUsersBookingHistory(String UserId);
    Response delete(String UserId);

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String UserId);
    Response getMyInfo(String UserId);
}
