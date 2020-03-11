package dto;

	
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
	import java.util.UUID;


	public class Customer {
	    public Customer(String customerId, String customerName, String customerMobileNumber) {
	        this.customerId = customerId;
	        this.customerName = customerName;
	        this.customerMobileNumber = customerMobileNumber;
	    }
	    
	    public Customer() {
			// TODO Auto-generated constructor stub
		}

	    private String customerId;
	    private String customerName;
	    private String customerMobileNumber;
	    
	    Customer c ;

	    

	    public static void main(String[] args) {
	        List<Customer> customerList = new ArrayList<Customer>();
	        
	        
	        // Add 20 Customers 
	        /*Customer c3 = new Customer("1", "mahesh", "8982381222");
	        Customer c4 = new Customer();*/
	        HashMap<Customer, Integer> cMap = new HashMap<>();
	        for(int i =0;i<20;i++)
	        {
	        customerList.add(Customer.createRandomCustomer());
	       //
	        
	        //cMap.put(Customer.createRandomCustomer(), i);
	        }
	        
	        System.out.println(cMap.size());
	        
	        
	        
	        // Iterate Customers and display Name and Id with Lamda Expression
	        
	        customerList.forEach((c1) -> System.out.println("name:"+c1.customerName+" id:"+c1.customerId));
	        
	        
	        // Modify the class in such way to avoid duplicates while adding objects to the HashMap 
	        
	       
	        
	        
	        
	        
	        
	        
	        

	    }

	    public static Customer createRandomCustomer(){
	        return new Customer(UUID.randomUUID().toString(),UUID.randomUUID().toString(),"99999999");
	    }
	    
	    @Override
	    public boolean equals(Object obj) {
	    	// TODO Auto-generated method stub
	    	 return (c.customerName.equals(this.customerName)  && c.customerId.equals(this.customerId) && c.customerMobileNumber.equals(this.customerMobileNumber));
	    }
	    
	    @Override
	    public int hashCode() {
	    	// TODO Auto-generated method stub
	    	return Integer.parseInt(this.customerId);
	    }

	}


