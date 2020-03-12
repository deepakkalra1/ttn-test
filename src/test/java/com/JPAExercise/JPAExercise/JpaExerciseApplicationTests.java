package com.JPAExercise.JPAExercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaExerciseApplicationTests {

	@Autowired
	EmployeeRespository employeeRespository;

	@Autowired
	EmployeeRepositoryTwo employeeRepositoryTwo;
	@Test
	void contextLoads(){

	}

	//question no 3

	@Test
	void quesThreeCreateOperationTest() {
		Employees employee = new Employees();
		employee.setAge(20);
		employee.setId(1);
		employee.setLocation("Delhi");
		employee.setName("deepak kalra");

		employeeRespository.save(employee);


	}

	//question no 4
	@Test
	void quesFourUpdateOperationTest() {
		Employees employee = new Employees();
		employee.setAge(20);
		employee.setId(1);
		employee.setLocation("Delhi");
		employee.setName("ankur");

		employeeRespository.save(employee);


	}


	//question no 5 (2nd)
	@Test
	void quesFiveRepeatPartReadOperationTest() {

		Optional<Employees> emp =employeeRespository.findById(1);
		Employees emp2 = emp.get();
		System.out.println(emp2.getName());


	}


	//question no 5 (1st)
	@Test
	void quesFiveDeleteOperationTest() {

		employeeRespository.deleteById(1);


	}



	//question no 6
	@Test
	void quesSixCountOperationTest() {
		Employees employee = new Employees();
		employee.setAge(20);
		employee.setId(1);
		employee.setLocation("Delhi");
		employee.setName("ankur");

		Employees employee2 = new Employees();
		employee2.setAge(20);
		employee2.setId(2);
		employee2.setLocation("Delhi");
		employee2.setName("yash");

		Employees employee3 = new Employees();
		employee3.setAge(20);

		employee3.setLocation("Delhi");
		employee3.setName("anish");


		employeeRespository.save(employee);

		employeeRespository.save(employee2);
		employeeRespository.save(employee3);

		System.out.println(employeeRespository.count());


	}


	//question no 7
	@Test
	public void testPagingAndSortingEmployee(){
		Pageable pageable = PageRequest.of(0,5, Sort.Direction.ASC,"age");

		employeeRepositoryTwo.findAll(pageable).forEach(p-> System.out.println(p.getName()));
	}


	//question no 8
	@Test
	void quesEightfinderOperationTest() {
		List<Employees> emp=employeeRespository.findByName("anish");
		//System.out.println(emp.getAge());

		System.out.println(emp.get(1).getName());

	}

	//question no 9
	@Test
	void quesNinefinderOperationTest() {
		List<Employees> emp = employeeRespository.findByNameLike("a%");
		System.out.println(emp.size());


	}

	//question no 10
	@Test
	void quesTenfinderOperationTest() {
		List<Employees> emp = employeeRespository.findByAgeBetween(18,28);
				System.out.println(emp.size());


	}


}
