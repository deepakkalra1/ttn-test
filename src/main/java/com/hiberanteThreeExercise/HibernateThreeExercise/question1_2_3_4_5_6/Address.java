package com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    int street_no;
    String location;
    String state;

    public int getStreet_no() {
        return street_no;
    }

    public void setStreet_no(int street_no) {
        this.street_no = street_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
