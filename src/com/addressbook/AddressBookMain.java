package com.addressbook;

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
	}

}