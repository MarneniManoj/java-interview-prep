package com.stripe.interview.repository;

import com.stripe.interview.dto.Equipment;
import com.stripe.interview.dto.User;
import com.stripe.interview.dto.UserEquipment;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class UserEquipmentRepoInMemory implements UserEquipmentRepository{

    Map<String, UserEquipment> userEquipmentMap;
    public UserEquipmentRepoInMemory() {
        this.userEquipmentMap = new HashMap<>();
        this.userEquipmentMap.put("abc", new UserEquipment("abc", new User("abc_user", "manoj","ab", ""), new Equipment("dumbell")));
    }

    @Override
    public UserEquipment save(UserEquipment userEquipment) {
        this.userEquipmentMap.put(userEquipment.getId(), userEquipment);
        return null;
    }

    @Override
    public List<UserEquipment> getAllByUserId(String userId) {
        List<String> eid = this.userEquipmentMap.keySet()
                .stream().filter( a -> this.userEquipmentMap.get(a).getUser().getId().equals(userId)).collect(Collectors.toList());
        List<UserEquipment>  res = eid.stream().map(a -> this.userEquipmentMap.get(a)).collect(Collectors.toList());
        return res;
    }

    @Override
    public UserEquipment getById(String Id) {
        return this.userEquipmentMap.get(Id);
    }

    @Override
    public void remove(String id) {
        this.userEquipmentMap.remove(id);
        return;
    }
}
