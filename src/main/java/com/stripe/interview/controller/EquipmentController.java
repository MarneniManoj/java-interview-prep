package com.stripe.interview.controller;


import com.stripe.interview.dto.UserEquipment;
import com.stripe.interview.services.UserEquipmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EquipmentController {
    UserEquipmentService userEquipmentService;


    public EquipmentController(UserEquipmentService userEquipmentService) {
        this.userEquipmentService = userEquipmentService;
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/user-equipments")
    public List<UserEquipment> getUserEquipment() {
        return userEquipmentService.getAllUserEquipmentsByUserId("abc_user");
    }

}
