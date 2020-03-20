package com.hibernatePartTwoExercise.hibernatePartTwoExercise;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee ,Integer> {

    @Query("select  empFirstName,empLastName from Employee  where empSalary>(select AVG(empSalary) from Employee)  order by empAge ASC")
    public List<Object[]> findByEmployeeBySalaryGreaterThanAverageSalary();


    //finding the average of employee for question 2  (JPQL)
    @Query("select AVG(empSalary) from Employee")
    public int findingAverageSalary();



    //question 2 operation (JPQL)
    @Modifying
    @Query("update Employee SET empSalary=:newSal where empSalary <:sal")
    public void UpdatingSalaryWhoseLessThanAvg(@Param("sal") int sal,@Param("newSal") int newSal );


    //finding the min sal of employee for question 3 (JPQL)
    @Query("select MIN(empSalary) from Employee")
    public int findingMinSalary();

    //question 3 operation (JPQL)
    @Modifying
    @Query("delete from Employee where empSalary <:min_sal")
    public void deletingMinSalaryEmployeeRecord(@Param("min_sal") int sal );



    //question 1  (Native SQL query)
    @Query(value = "select empid, emp_first_name,emp_age from employee_table",nativeQuery = true)
    public List<Object[]> gettingIdFIrstNameAndAgeByNativeQuery();


    //question 2  (Native SQL query)
    @Modifying
    @Query(value = "delete from employee_table where emp_age >:age",nativeQuery = true)
    public void deletingEmployeeAgeGreeaterThan45(@Param("age") int age );



}
