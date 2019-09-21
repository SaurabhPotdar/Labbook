package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Author;
import com.cg.demojpa.exception.DemoJpaException;
import com.cg.demojpa.service.AuthorService;
import com.cg.demojpa.service.IAuthorService;

public class AuthorMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		IAuthorService authorService = new AuthorService();
		
		int choice=0,authorId=0;
		String firstName,middleName,lastName,phoneNumber,city,state,pincode;
		Author author;
		String date;
		SimpleDateFormat st = new SimpleDateFormat("yyyy/MM/dd");
		Date dateOfJoining = null;
		Address address;
		
		do{
			printChoices();
			choice = sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter author id");
				authorId=sc.nextInt();
				System.out.println("Enter author first name");
				firstName=sc.next();
				System.out.println("Enter author middle name");
				middleName=sc.next();
				System.out.println("Enter author last name");
				lastName=sc.next();
				System.out.println("Enter author phone number");
				phoneNumber=sc.next();
				System.out.println("Enter date of joining");
				date = sc.next();
				dateOfJoining = null;
				System.out.println("Enter city");
				city=sc.next();
				System.out.println("Enter state");
				state=sc.next();
				System.out.println("Enter pincode");
				pincode=sc.next();
				address = new Address(city,state,pincode);
				try {
					dateOfJoining = st.parse(date);
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				author = new Author(authorId,firstName,middleName,lastName,phoneNumber,dateOfJoining);
				author.setAddress(address);
				authorService.save(author);
				break;
			case 2:
				System.out.println("Enter author id");
				authorId=sc.nextInt();
				try {
					authorService.remove(authorId);
				} catch (DemoJpaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Enter author id");
				authorId=sc.nextInt();
				System.out.println("Enter author first name");
				firstName=sc.next();
				System.out.println("Enter author middle name");
				middleName=sc.next();
				System.out.println("Enter author last name");
				lastName=sc.next();
				System.out.println("Enter author phone number");
				phoneNumber=sc.next();
				System.out.println("Enter date of joining");
				date = sc.next();
				try {
					dateOfJoining = st.parse(date);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				author = new Author(authorId,firstName,middleName,lastName,phoneNumber,dateOfJoining);
				try {
					authorService.remove(authorId);
					authorService.save(author);
				} catch (DemoJpaException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				List<Author> authorList = authorService.findAll();
				if(authorList!=null)
					System.out.println(authorList.toString());
				break;
			case 5:
				System.out.println("Enter id");
				authorId = sc.nextInt();
				author = authorService.findById(authorId);
				if(author!=null)
					System.out.println(author.toString());
				else
					System.out.println("Does not exist");
				break;
			default:
				break;
			}
		}while(choice!=6);
		System.out.println("Thanks for using our application");
		
		sc.close();
	}
	
	public static void printChoices(){
		System.out.println("1:Add author");
		System.out.println("2:Remove author");
		System.out.println("3:Update author");
		System.out.println("4:Show all authors");
		System.out.println("5:Find author");
		System.out.println("6:Exit");
	}

}
