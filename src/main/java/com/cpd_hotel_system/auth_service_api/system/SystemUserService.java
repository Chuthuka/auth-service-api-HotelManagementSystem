package com.cpd_hotel_system.auth_service_api.system;

import com.cpd_hotel_system.auth_service_api.dto.request.SystemUserRequestDto;

public interface SystemUserService {
    public void createUser(SystemUserRequestDto dto);
}
