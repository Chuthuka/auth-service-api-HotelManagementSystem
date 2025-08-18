package com.cpd_hotel_system.auth_service_api.service;

import java.io.IOException;

public interface EmailService {
    public boolean sendUserSignupVerificationCode(String toEmail, String subject, String otp, String firstName) throws IOException;
    public boolean sendHostPassword(String toEmail, String subject, String password, String firstName) throws IOException;
}
