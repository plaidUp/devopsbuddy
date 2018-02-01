package com.devopsbuddy.utils;

import com.devopsbuddy.backend.persistence.domain.backend.User;
import com.devopsbuddy.web.controllers.ForgotMyPasswordController;

import javax.servlet.http.HttpServletRequest;

public class UserUtils {

    /**
     * Non instantiable
     */
    private UserUtils() {throw new AssertionError("Non instantiable");}

    /**
     * Creates a user with basic access
     * @param username The username
     * @param email The email
     * @return A user entity
     */
    public static User createBasicUser(String username, String email) {
        User user = new User();
        user.setUsername(username);
        user.setPassword("secret");
        user.setEmail(email);
        user.setFirstName("firstName");
        user.setLastName("lastName");
        user.setPhoneNumber("1234567890");
        user.setCountry("USA");
        user.setEnabled(true);
        user.setDescription("A basic user");
        user.setProfileImageUrl("https://blabla.images.com/basicuser");

        return user;
    }

    /**
     * Builds and returns the URL to reset the user password
     * @param httpServletRequest The Http Servlet Request
     * @param userId The user id
     * @param token The token
     * @return the URL to reset the user password
     */
    public static String createPasswordResetUrl(HttpServletRequest httpServletRequest, long userId, String token) {
        String passwordResetUrl =
                httpServletRequest.getScheme() +
                        "://" +
                        httpServletRequest.getServerName() +
                        ":" +
                        httpServletRequest.getServerPort() +
                        httpServletRequest.getContextPath() +
                        ForgotMyPasswordController.CHANGE_PASSWORD_PATH +
                        "?id=" +
                        userId +
                        "&token=" +
                        token;

        return passwordResetUrl;
    }
}
