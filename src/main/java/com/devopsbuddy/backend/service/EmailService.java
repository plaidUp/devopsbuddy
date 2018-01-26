package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPojo;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

public interface EmailService {

    /**
     * Sends an email with the content in the Feedback Pojo
     * @param feedbackPojo The feedback Pojo
     */
    public void sendFeedbackEmail(FeedbackPojo feedbackPojo);

    /**
     * Sends and email with the content of the Simple Mail Message object
     * @param message The feedback Pojo
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
