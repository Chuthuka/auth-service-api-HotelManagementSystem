package com.cpd_hotel_system.auth_service_api.system.impl;

import com.cpd_hotel_system.auth_service_api.BadRequestException;
import com.cpd_hotel_system.auth_service_api.dto.request.SystemUserRequestDto;
import com.cpd_hotel_system.auth_service_api.system.SystemUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SystemUserServiceImpl implements SystemUserService {
    @Override
    public void createUser(SystemUserRequestDto dto) {
        if(dto.getFirstName() == null || dto.getFirstName().trim().isEmpty()) {
            throw new BadRequestException("First name is required");
        }
    }
}
