
package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceJoined;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cheque_joined_strategy")
public class TestChequeJoinedJoined extends TestParentJoined {
String cheque_number;

    public String getCheque_number() {
        return cheque_number;
    }

    public void setCheque_number(String cheque_number) {
        this.cheque_number = cheque_number;
    }
}
