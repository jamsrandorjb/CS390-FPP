package lab2;

public class Address {


public Address(String _Street, String _City, String _State, String _Zip)
{  
	  street = _Street;
	  city = _City;
	  state = _State;
	  zip = _Zip;
}   

public String format()
{  
	  return street + "\n"
			+ city + ", " + state + " " + zip;
}

private String street;
public String getStreet() {
	return street;
}

public void setStreet(String street) {
	this.street = street;
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

public String getZip() {
	return zip;
}

public void setZip(String zip) {
	this.zip = zip;
}

private String city;
private String state;
private String zip;

}
