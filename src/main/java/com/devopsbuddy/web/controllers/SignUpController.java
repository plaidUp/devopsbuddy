package com.devopsbuddy.web.controllers;

import com.devopsbuddy.backend.persistence.domain.backend.Plan;
import com.devopsbuddy.enums.PlansEnum;
import com.devopsbuddy.web.domain.frontend.ProAccountPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Taylor Thurman on 2/1/18
 */
@Controller
public class SignUpController {

    /** The application logger */
    private static final Logger LOG = LoggerFactory.getLogger(SignUpController.class);

    public static final String SIGNUP_URL_MAPPING = "/signup";
    public static final String PAYLOAD_MODEL_KEY_NAME = "payload";
    public static final String SUBSCRIPTION_VIEW_NAME = "registration/signup";

    @GetMapping(value = SIGNUP_URL_MAPPING)
    public String signUpGet(@RequestParam("planId") int planId, ModelMap model){

        if (planId != PlansEnum.BASIC.getId() && planId != PlansEnum.PRO.getId()) {
            throw new IllegalArgumentException("Plan id is not valid");
        }
        model.addAttribute(PAYLOAD_MODEL_KEY_NAME, new ProAccountPayload());

        return SUBSCRIPTION_VIEW_NAME;
    }
}
