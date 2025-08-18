package com.cpd_hotel_system.auth_service_api.service;

import com.cpd_hotel_system.auth_service_api.dto.request.SystemUserRequestDto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface SystemUserService {
    public void createUser(SystemUserRequestDto dto) throws IOException;
    public void initializeHosts(List<SystemUserRequestDto> users) throws IOException;
    public void resend(String email, String type) throws IOException;
    public void forgotPasswordSendVerificationCode(String email) throws IOException;
}
