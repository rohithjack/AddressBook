

public class AddressBookDay9{
	public static void main(String[] args){

		PersonDetails object =new PersonDetails ();
		object.setFirst_name ( "Jhon " );
		object.setLast_name ( "Smith" );
		object.setAddress ( "LONDON" );
		object.setMobile_number ( 78789898 );

		System.out.println("First Name    "+object.getFirst_name ());
		System.out.println("Last Name     "+object.getLast_name ());
		System.out.println("Full Name     "+object.getFirst_name () +object.getLast_name ());
		System.out.println("Mobile Number "+object.getMobile_number ());
		System.out.println("Location      "+object.getAddress());




		object.first_name = new String ( "Peter" );
		object.last_name = new String ( "Lenz" );
		object.mobile_number =new Integer ( 237894 );
		object.address = new String ( "France" );
		System.out.println("First Name    "+object.first_name);
		System.out.println("Last  Name    "+object.last_name);
		System.out.println("Mobile Number "+object.mobile_number);
		System.out.println("Location      "+object.address);

	}

}

class PersonDetails{

	String first_name,last_name ,address,state;
	int mobile_number,zipcode;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
