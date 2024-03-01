package assignment2;

public class Main1 {
	
	public static void main(String[] args) {
		Address address1 = new Address();
		Address address2 = new Address();
		Address address3 = new Address();
		
		address1.setCity("Chicago");
		address1.setState("Illinois");
		address1.setZip("60007");
		address1.setStreet("100 N 3rd street");
		
		address2.setCity("Los Angeles");
		address2.setState("California");
		address2.setZip("90001");
		address2.setStreet("9000 S 9th street");
		
		address3.setCity("Fairfield");
		address3.setState("Iowa");
		address3.setZip("52557");
		address3.setStreet("1000 N 4th street");
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		
		customer1.setBillingAddress(address1);
		customer1.setFirstName("Sanjaya");
		customer1.setLastName("Koju");
		customer1.setSocSecurityNum("123456");
		customer1.setShippingAddress(address1);
		
		customer2.setBillingAddress(address2);
		customer2.setFirstName("Rahul");
		customer2.setLastName("Niraula");
		customer2.setSocSecurityNum("432567");
		customer2.setShippingAddress(address2);
		
		customer3.setBillingAddress(address1);
		customer3.setFirstName("Supriya");
		customer3.setLastName("Ghising");
		customer3.setSocSecurityNum("908765");
		customer3.setShippingAddress(address3);
		
		
		Customer customerList[] = new Customer[3];
		customerList[0] = customer1;
		customerList[1] = customer2;
		customerList[2] = customer3;
		
		displayCustomer(customerList);
	}
	
	public static void displayCustomer(Customer cList[]) {
		
		for(int i=0;i<cList.length;i++) {
			if(cList[i].getBillingAddress().getCity().equalsIgnoreCase("Chicago")) {
				System.out.println(cList[i]);
			}
		}
		
	}

}
