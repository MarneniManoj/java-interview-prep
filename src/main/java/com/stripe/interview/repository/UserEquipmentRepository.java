package com.stripe.interview.repository;

import com.stripe.interview.dto.UserEquipment;

import java.util.List;

public interface UserEquipmentRepository {
    UserEquipment save(UserEquipment userEquipment);
    List<UserEquipment> getAllByUserId(String userId);
    UserEquipment getById(String Id);
    void remove(String id);
}
