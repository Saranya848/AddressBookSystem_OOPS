package com.addressbook;

import java.util.*;

class PersonContact {
	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private int zip;
	private String phoneno;
	private String email;

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname; // this keyword is used to point the Current Object
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return zip;
	}

	public void setPincode(int zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneno;
	}

	public void setPhoneNumber(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getGmail() {
		return email;
	}

	public void setGmail(String email) {
		this.email = email;
	}

	public String toString() {
		return " FirstName :" + firstname + " LastName :" + lastname + " Address : " + address + " City : " + city
				+ " State : " + state + " Zip :" + zip + '\'' + " PhoneNumber : " + phoneno + " Email : " + email;

	}
}

class NewPerson {
	Scanner sc = new Scanner(System.in);
	public void newcontact() {
		int i;
		System.out.println("Enter Number of Persons want to add: ");
		int N = sc.nextInt();
		//looping for Nth number of person
		for (i = 1; i <= N; i++) {
			PersonContact pc1 = new PersonContact();
			System.out.println("Enter First Name: ");
			String firstname = sc.nextLine();

			System.out.println("Enter last Name: ");
			String lastname = sc.nextLine();

			System.out.println("Enter your address: ");
			String address = sc.nextLine();

			System.out.println("Enter your City: ");
			String city = sc.nextLine();

			System.out.println("Enter your state: ");
			String state = sc.nextLine();

			System.out.println("Enter zip code : ");
			Long zip = sc.nextLong();

			System.out.println("Enter phone number: ");
			String phoneno = sc.nextLine();

			System.out.println("Enter your EMail ID: ");
			String email = sc.nextLine();

			pc1.setFirstName(firstname);

			pc1.setLastName(lastname);

			pc1.setAddress(address);

			pc1.setCity(city);

			pc1.setState(state);

			pc1.setPincode(zip.intValue());

			pc1.setPhoneNumber(phoneno);

			pc1.setGmail(email);

			System.out.println("The Contact Details of " + firstname + "\n" + pc1);
		}
	}
}

public class AddressBookMain {

	public static void main(String[] args) {
		
		PersonContact pc = new PersonContact();

		// calling set methods
		pc.setFirstName("Harsha \n");
		pc.setLastName("Siripurapu \n");
		pc.setAddress("Madhurawada\n");
		pc.setCity("Vizag\n");
		pc.setState("Andhra Pradesh \n");
		pc.setPincode(530048);
		pc.setPhoneNumber("9703170708 \n");
		pc.setGmail("Sriharsha@gmail.com\n");
		System.out.println("The Person Details are \n" + pc);
		
		//calling Newperson data
		NewPerson np = new NewPerson();
		np.newcontact();
	}
}