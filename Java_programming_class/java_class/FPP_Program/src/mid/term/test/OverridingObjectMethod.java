package mid.term.test;

import java.util.Objects;

public class OverridingObjectMethod {

	private String name;
	private String address;
	private String mobileNumber;
	private String gender;
	
	
	
	public OverridingObjectMethod(String name, String address, String mobileNumber, String gender) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "OverridingObjectMethod [name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", gender=" + gender + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, gender, mobileNumber, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		
		OverridingObjectMethod other = (OverridingObjectMethod) obj;
		
//		return Objects.equals(address, other.address) && Objects.equals(gender, other.gender)
//				&& Objects.equals(mobileNumber, other.mobileNumber) && Objects.equals(name, other.name);
		
		return  this.name.equals(other.name) 
				&& this.address.equals(other.address) 
				&& this.gender.equals(other.gender)
				&& this.mobileNumber.equals(other.mobileNumber);
	}
	
	public static void main(String[] args) {
		OverridingObjectMethod ob1 = new OverridingObjectMethod("Sanjaya", "Nepal", "988", "male");
		OverridingObjectMethod ob2 = new OverridingObjectMethod("Sanjaya", "Nepal", "988", "male");
		System.out.println(ob1.toString());
		System.out.println(ob1.equals(ob2));
		
	}
	
	
}
