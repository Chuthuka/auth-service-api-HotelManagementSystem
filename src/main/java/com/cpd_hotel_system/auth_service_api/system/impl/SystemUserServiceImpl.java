package com.cpd_hotel_system.auth_service_api.system.impl;

import com.cpd_hotel_system.auth_service_api.BadRequestException;
import com.cpd_hotel_system.auth_service_api.dto.request.SystemUserRequestDto;
import com.cpd_hotel_system.auth_service_api.system.SystemUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.keycloak.admin.client.Keycloak;




@Service
@RequiredArgsConstructor
public class SystemUserServiceImpl implements SystemUserService {
    @Override
    public void createUser(SystemUserRequestDto dto) {
        if(dto.getFirstName() == null || dto.getFirstName().trim().isEmpty()) {
            throw new BadRequestException("First name is required");
        }

        if(dto.getLastName() == null || dto.getLastName().trim().isEmpty()) {
            throw new BadRequestException("Last name is required");
        }

        if(dto.getEmail() == null || dto.getEmail().trim().isEmpty()) {
            throw new BadRequestException("Email is required");
        }

        String userId="";
        String otp="";
        Keycloak keycloak=null;

    }
}
