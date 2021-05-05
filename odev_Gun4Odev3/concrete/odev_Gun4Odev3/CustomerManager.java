package odev_Gun4Odev3;

public class CustomerManager implements CustomerService{
	
	CustomerCheckService customerCheckManager;
	
	CustomerManager(CustomerCheckService customerCheckManager){
		this.customerCheckManager=customerCheckManager;
	}

	@Override
	public void signUp(Customer customer, int id, String firstName, String lastName, String nationalityId, int yearOfBirth) {
		if(customerCheckManager.isReal(customer)) {
			customer.setId(id);
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setNationalityId(nationalityId);
			customer.setYearOfBirth(yearOfBirth);
			System.out.println("M��teri Eklendi: "+customer.getId());
		}else 
		{
			System.out.println("Hatal� Bilgi");
		}

		
		
		
	}

	@Override
	public void update(Customer customer, int id, String firstName, String lastName, String nationalityId,int yearOfBirth) {
		if(customerCheckManager.isReal(customer)) {
			customer.setId(id);
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setNationalityId(nationalityId);
			customer.setYearOfBirth(yearOfBirth);
			
			System.out.println("M��teri Bilgileri G�ncellendi: "+customer.getId());
		}
		else {
			System.out.println("Hatal� Bilgi");
		}

		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("M��teri Silindi: "+customer.getId());
		
	}

}
