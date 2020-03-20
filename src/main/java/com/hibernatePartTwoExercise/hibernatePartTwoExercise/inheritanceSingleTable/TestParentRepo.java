package com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceSingleTable;

import org.springframework.data.repository.CrudRepository;

public interface TestParentRepo extends CrudRepository<TestParent,Integer> {
}
