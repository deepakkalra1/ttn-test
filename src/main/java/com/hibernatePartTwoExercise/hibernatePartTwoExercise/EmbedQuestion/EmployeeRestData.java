package com.hibernatePartTwoExercise.hibernatePartTwoExercise.EmbedQuestion;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeRestData {
    int emp_salary;
    int emp_age;

    public int getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(int emp_salary) {
        this.emp_salary = emp_salary;
    }

    public int getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(int emp_age) {
        this.emp_age = emp_age;
    }
}
