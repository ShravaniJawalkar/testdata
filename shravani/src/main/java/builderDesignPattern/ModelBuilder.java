package builderDesignPattern;

public class ModelBuilder {
	private String name;
	private String code;
	private String address;
	private String email;
	private String phoneNumber;
	private String education;
	private String companyName;
	
	public ModelBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public ModelBuilder setCode(String code) {
		this.code = code;
		return this;
	}
	public ModelBuilder setAddress(String address) {
		this.address = address;
		return this;
	}
	public ModelBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	public ModelBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public ModelBuilder setEducation(String education) {
		this.education = education;
		return this;
	}
	public ModelBuilder setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}
	
	public ModelClass getPhone() {
		return new ModelClass(name, code, address, email, phoneNumber, education, companyName);
	}
	
	
}

