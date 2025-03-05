package com.stripe.interview.dto;

public class UserEquipment {

    String id;
    User user;
    Equipment recognizedEquipment;
    byte[] image;

    public UserEquipment(String id, User user, Equipment recognizedEquipment) {
        this.id = id;
        this.user = user;
        this.recognizedEquipment = recognizedEquipment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Equipment getRecognizedEquipment() {
        return recognizedEquipment;
    }

    public void setRecognizedEquipment(Equipment recognizedEquipment) {
        this.recognizedEquipment = recognizedEquipment;
    }

}
