package com.JPAExercise.JPAExercise;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//question no 2
public interface EmployeeRespository extends CrudRepository<Employees,Integer> {
 public List<Employees> findByName(String name);
 List<Employees> findByNameLike(String expr);
 List<Employees> findByAgeBetween(int age1,int age2);

}




