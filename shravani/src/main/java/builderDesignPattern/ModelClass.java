package builderDesignPattern;

public class ModelClass {
private String name;
private String code;
private String address;
private String email;
private String phoneNumber;
private String education;
private String companyName;

public ModelClass(String name, String code, String address, String email, String phoneNumber, String education,
		String companyName) {
	super();
	this.name = name;
	this.code = code;
	this.address = address;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.education = education;
	this.companyName = companyName;
}



@Override
public String toString() {
	return "ModelClass [name=" + name + ", code=" + code + ", address=" + address + ", email=" + email
			+ ", phoneNumber=" + phoneNumber + ", education=" + education + ", companyName=" + companyName
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
