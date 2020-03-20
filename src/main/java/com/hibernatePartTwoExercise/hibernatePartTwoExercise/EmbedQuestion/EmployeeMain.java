package com.hibernatePartTwoExercise.hibernatePartTwoExercise.EmbedQuestion;

import org.hibernate.annotations.GeneratorType;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "employee_table")

public class EmployeeMain {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int empid;
  String emp_first_name;
  String emp_last_name;

  @Embedded
  EmployeeRestData employeeRestData;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmp_first_name() {
        return emp_first_name;
    }

    public void setEmp_first_name(String emp_first_name) {
        this.emp_first_name = emp_first_name;
    }

    public String getEmp_last_name() {
        return emp_last_name;
    }

    public void setEmp_last_name(String emp_last_name) {
        this.emp_last_name = emp_last_name;
    }

    public EmployeeRestData getEmployeeRestData() {
        return employeeRestData;
    }

    public void setEmployeeRestData(EmployeeRestData employeeRestData) {
        this.employeeRestData = employeeRestData;
    }
}
