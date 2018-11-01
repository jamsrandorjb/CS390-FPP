package lab2;
//2-1
public class Customer {
	
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String _firstName, String _lastName, String _socSecurityNum) {
		this.firstName = _firstName;
		this.lastName = _lastName;
		this.socSecurityNum = _socSecurityNum;
		
	}
	
	public static void main(String[] args)
	{

        
        Customer[] customers = new Customer[2];
        customers[0] = new Customer("TestFirstName1", "TestLastName1", "TestSocSecuirityNum1");
        customers[1] = new Customer("TestFirstName2", "TestLastName2", "TestSocSecuirityNum2");
        customers[0].setBillingAddress(new Address("StreetTest1", "CityTest1", "StateTest1", "ZipTest1"));
        customers[1].setBillingAddress(new Address("StreetTest2", "Chicago", "StateTest2", "ZipTest2"));
        customers[0].setShippingAddress(new Address("StreetTest1", "CityTest1", "StateTest1", "ZipTest1"));
        customers[1].setShippingAddress(new Address("StreetTest2", "Chicago", "StateTest2", "ZipTest2"));
        
        for (int i = 0; i < customers.length; i++) {
            if(customers[i].getShippingAddress().getCity().equals("Chicago"))
            	  System.out.println(toString(customers[i]));
        }
	}
	
	public static String toString(Customer c) {
        return c.firstName + ", " +c.lastName + ", ssn: " + c.socSecurityNum;
    }
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
}
