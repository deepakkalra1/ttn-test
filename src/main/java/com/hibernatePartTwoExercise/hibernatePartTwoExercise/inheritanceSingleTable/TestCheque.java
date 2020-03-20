package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceSingleTable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class TestCheque extends TestParent {
    String cheque_number;

    public String getCheque_number() {
        return cheque_number;
    }

    public void setCheque_number(String cheque_number) {
        this.cheque_number = cheque_number;
    }

}
