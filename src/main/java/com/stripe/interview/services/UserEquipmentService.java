package com.stripe.interview.services;

import com.stripe.interview.dto.UserEquipment;
import java.util.List;

public interface UserEquipmentService {
    List<UserEquipment> getAllUserEquipmentsByUserId(String userId);
    UserEquipment getUserEquipmentById(String id);
    UserEquipment createUserEquipment(UserEquipment userEquipment);
    void deleteUserEquipmentById(String id);
}
