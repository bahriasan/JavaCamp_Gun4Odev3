package odev_Gun4Odev3;

public interface CustomerService {
	void signUp(Customer customer, int id, String firstName, String lastName, String nationalityId,int yearOfBirth);
	
	void update(Customer customer, int id, String firstName, String lastName, String nationalityId,int yearOfBirth);
	
	void delete(Customer customer);

}
