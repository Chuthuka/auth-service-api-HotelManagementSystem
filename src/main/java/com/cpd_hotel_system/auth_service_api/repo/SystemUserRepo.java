package com.cpd_hotel_system.auth_service_api.repo;

import com.cpd_hotel_system.auth_service_api.entity.SystemUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemUserRepo extends JpaRepository<SystemUser, String> {
}
