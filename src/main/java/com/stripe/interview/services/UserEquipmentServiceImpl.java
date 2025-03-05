package com.stripe.interview.services;

import com.stripe.interview.dto.UserEquipment;
import com.stripe.interview.repository.UserEquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserEquipmentServiceImpl implements UserEquipmentService{
    UserEquipmentRepository userEquipmentRepository;

    public UserEquipmentServiceImpl(UserEquipmentRepository userEquipmentRepository) {
        this.userEquipmentRepository = userEquipmentRepository;
    }

    @Override
    public List<UserEquipment> getAllUserEquipmentsByUserId(String userId) {
        return userEquipmentRepository.getAllByUserId(userId);
    }

    @Override
    public UserEquipment getUserEquipmentById(String id) {
        return userEquipmentRepository.getById(id);
    }

    @Override
    public UserEquipment createUserEquipment(UserEquipment userEquipment) {
        return userEquipmentRepository.save(userEquipment);
    }

    @Override
    public void deleteUserEquipmentById(String id) {
        userEquipmentRepository.remove(id);
    }
}
