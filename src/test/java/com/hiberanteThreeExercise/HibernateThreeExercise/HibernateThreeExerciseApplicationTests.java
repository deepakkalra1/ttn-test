package com.hiberanteThreeExercise.HibernateThreeExercise;

import com.hiberanteThreeExercise.HibernateThreeExercise.question1_2_3_4_5_6.*;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi.AuthorQues7Bi;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi.AuthorQues7BiRepository;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Bi.BookQues7Bi;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Uni.AuthorQues7UniRepository;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Uni.AuthorQues7uni;
import com.hiberanteThreeExercise.HibernateThreeExercise.question7Uni.BookQues7Uni;
import com.hiberanteThreeExercise.HibernateThreeExercise.question8.AuthorQues8;
import com.hiberanteThreeExercise.HibernateThreeExercise.question8.AuthorQues8Repository;
import com.hiberanteThreeExercise.HibernateThreeExercise.question8.BookQues8;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HibernateThreeExerciseApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@Autowired
	AuthorQues7UniRepository authorQues7UniRepository;

	@Autowired
	AuthorQues7BiRepository authorQues7BiRepository;

	@Autowired
	AuthorQues8Repository authorQues8Repository;



	//Question 2
	@Test
	void savingAuthorDetailWithComponentMapping() {
		System.out.println("safasd");
		Address address = new Address();
		address.setLocation("rohini");
		address.setState("delhi");
		address.setStreet_no(21);

		Author author = new Author();
		author.setAddress(address);
		author.setFirst_name("deepak");
		author.setLast_name("kalra");
		authorRepository.save(author);

	}













	//question 3 and 4
	@Test
	void savingAuthorsSubjects(){
		Address address = new Address();
		address.setLocation("vikaspuri");
		address.setState("delhi");
		address.setStreet_no(51);




		Subject subject1= new Subject();
		subject1.setName("English");

		Subject subject2= new Subject();
		subject2.setName("Geography");

		Subject subject3= new Subject();
		subject3.setName("History");


		Author author1 = new Author();

		author1.setFirst_name("chunky");
		author1.setLast_name("sharma");
		author1.setAddress(address);
		author1.settingSubjects(subject1);
		author1.settingSubjects(subject2);
		author1.settingSubjects(subject3);

		authorRepository.save(author1);
	}










	//question 6
	@Test
	void savingAuthorsSubjectsAndBook(){
		Address address = new Address();
		address.setLocation("patiala");
		address.setState("punjab");
		address.setStreet_no(201);



		Subject subject1= new Subject();
		subject1.setName("Punjabi");

		Subject subject2= new Subject();
		subject2.setName("Polity");

		Subject subject3= new Subject();
		subject3.setName("History");



		Book book = new Book();
		book.setBook_name("Learn to speak in punjabi");





		Author author1 = new Author();
		author1.setFirst_name("Munish");
		author1.setLast_name("Abbatt");
		author1.setAddress(address);
		author1.settingSubjects(subject1);
		author1.settingSubjects(subject2);
		author1.settingSubjects(subject3);
		//book.setAuthor(author1);
		author1.setBook(book);



		authorRepository.save(author1);
	}










	//question 7 for unidirectional

	@Test
	void savingAuthorsAndBookUnidireccctional(){
		Address address = new Address();
		address.setLocation("patiala");
		address.setState("punjab");
		address.setStreet_no(201);





		BookQues7Uni book1 = new BookQues7Uni();
		book1.setBook_name("Let us C");


		BookQues7Uni book2 = new BookQues7Uni();
		book2.setBook_name("Let us C++");


		BookQues7Uni book3 = new BookQues7Uni();
		book3.setBook_name("Java programming");




		AuthorQues7uni author1 = new AuthorQues7uni();
		author1.setFirst_name("Jassi");
		author1.setLast_name("gill");
		author1.setAddress(address);
		author1.settingBooks(book1);
		author1.settingBooks(book2);
		author1.settingBooks(book3);




		authorQues7UniRepository.save(author1);
	}



	//question 7 for Bi-directional

	@Test
	void savingAuthorsAndBookBidireccctional(){
		Address address = new Address();
		address.setLocation("janakpuri");
		address.setState("delhi");
		address.setStreet_no(1);





		BookQues7Bi book1 = new BookQues7Bi();
		book1.setBook_name("wings of fire");


		BookQues7Bi book2 = new BookQues7Bi();
		book2.setBook_name("SSB crack");


		BookQues7Bi book3 = new BookQues7Bi();
		book3.setBook_name("power of subconcious mind");




		AuthorQues7Bi author1 = new AuthorQues7Bi();
		author1.setFirst_name("Anurag");
		author1.setLast_name("nain");
		author1.setAddress(address);
		author1.settingBooks(book1);
		author1.settingBooks(book2);
		author1.settingBooks(book3);




		authorQues7BiRepository.save(author1);
	}









	//question 8
	// this is many to many relationship sooo... do not expect book table to have author id as foreign key inside
	//i have author_book_mapping table which contains au_id and book_id
	//therefore au_id in book table will have null
	// since i did not created new table of book for purpose of many to many relationship


	@Test
	void savingAuthorAndBookManyToMany(){
		Address address = new Address();
		address.setLocation("janakpuri");
		address.setState("delhi");
		address.setStreet_no(1);





		BookQues8 book1 = new BookQues8();
		book1.setBook_name("wings of fire");


		BookQues8 book2 = new BookQues8();
		book2.setBook_name("SSB crack");


		BookQues8 book3 = new BookQues8();
		book3.setBook_name("power of subconcious mind");


		List<BookQues8> bookQues8s = new ArrayList<BookQues8>();
		bookQues8s.add(book1);
		bookQues8s.add(book2);
		bookQues8s.add(book3);

		AuthorQues8 author1 = new AuthorQues8();
		author1.setFirst_name("Anurag");
		author1.setLast_name("nain");
		author1.setAddress(address);
		author1.setBookQues8List(bookQues8s);


authorQues8Repository.save(author1);
	}









}
