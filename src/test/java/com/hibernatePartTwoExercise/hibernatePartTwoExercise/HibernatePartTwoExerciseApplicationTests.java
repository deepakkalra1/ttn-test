package com.hibernatePartTwoExercise.hibernatePartTwoExercise;

import com.hibernatePartTwoExercise.hibernatePartTwoExercise.EmbedQuestion.EmployeeMain;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.EmbedQuestion.EmployeeMainRepo;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.EmbedQuestion.EmployeeRestData;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceJoined.TestCreditCardJoinedJoined;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceJoined.TestParentJoinedRespository;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceSingleTable.TestCreditCard;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceSingleTable.TestParentRepo;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceTablePerClass.TestCreditCardTablePerClass;
import com.hibernatePartTwoExercise.hibernatePartTwoExercise.inheritanceTablePerClass.TestParentTablePerClassRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class HibernatePartTwoExerciseApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	//this belong to single table strategy package
	@Autowired
	TestParentRepo testParentRepo;

	//this belong to joined strategy package
	@Autowired
	TestParentJoinedRespository testParentJoinedRespositoryJoined;

	//this belongs to table per class strategy repo
	@Autowired
	TestParentTablePerClassRepository testParentTablePerClassRepository;

	// embeddabble and embedded ques repo
	@Autowired
	EmployeeMainRepo employeeMainRepo;


	//JPQL questions *****************************************************************************************************

	//question 1 JPQL
	@Test
	void findByEmployeeBySalaryGreaterThanAverageSalaryTest() {
		List<Object[]> obj = employeeRepo.findByEmployeeBySalaryGreaterThanAverageSalary();

		obj.forEach(objs->{
			System.out.println(objs[0]);
		});
//

	}

	//question 2 JPQL


	@Transactional // remove this annotation to see effect in database
	@Test
	void UpdatingSalaryWhoseLessThanAvgTest(){
		int sal = (int)employeeRepo.findingAverageSalary();
		System.out.println(sal);
		employeeRepo.UpdatingSalaryWhoseLessThanAvg(sal,70000);
	}



	//Question 3 JPQL
	@Transactional // remove this annotation to see effect in database
	@Test
	void DeletingMinSalaryEmployeeTest(){
		int sal = employeeRepo.findingMinSalary();
		System.out.println(sal);
		employeeRepo.deletingMinSalaryEmployeeRecord(sal);
	}






	//Native sql Query questions below *************************************************************************************



	//Question 1 (Native SQL query)
	@Test
	public void testingQuestion1NativeSql(){
		//to get id , first name and age of an employee using native sql query

		List<Object[]>  objects = employeeRepo.gettingIdFIrstNameAndAgeByNativeQuery();
			objects.forEach(objs->{
				System.out.println(objs[0]);
				System.out.println(objs[1]);
				System.out.println(objs[2]);
			});
	}



	//Question 2 (Native SQL query)
	@Transactional // remove this annotation to see effect in database
	@Test
	void DeletingEmployeeAgeGreaterThan45(){

		employeeRepo.deletingEmployeeAgeGreeaterThan45(45);
	}


	// MApping strategies questions ***********************************************************************************


	//question 1 single table strategy
	@Test
	public void SingleTableStrategyTest(){

		TestCreditCard entry1 = new TestCreditCard();
		entry1.setId(1);
		entry1.setAmount(1000);
		entry1.setCard_number("12345");
		testParentRepo.save(entry1);

	}

   	//question 2 JOINED strategy
	@Test
	public void JoinedTableStrategyTest(){

		TestCreditCardJoinedJoined entry1 =
				new TestCreditCardJoinedJoined();


		entry1.setId(1);
		entry1.setAmount(1000);
		entry1.setCredit_card_number("12345");
		testParentJoinedRespositoryJoined.save(entry1);

	}


	//question 3 Table per class strategy
	@Test
	public void tablePerClassStrategy(){
		TestCreditCardTablePerClass entry1 = new TestCreditCardTablePerClass();
		entry1.setCard_number("12345");
		entry1.setId(1);
		entry1.setAmount(1000);
		testParentTablePerClassRepository.save(entry1);

	}


	// Embeddable and embedded annotation question ******************************************************************

	@Test
	public void testingEmbeddableAndEmbeddedAnnotation(){

		EmployeeRestData employeeRestData = new EmployeeRestData();
		employeeRestData.setEmp_age(56);
		employeeRestData.setEmp_salary(95000);
		EmployeeMain entry = new EmployeeMain();
		entry.setEmployeeRestData(employeeRestData);
		entry.setEmp_first_name("faizal");
		entry.setEmp_last_name("khan");
		employeeMainRepo.save(entry);



	}


}
