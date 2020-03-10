package epam.com.Designpatterns;
public class com {
		public static void main(String[] args) {
		emp emp1= new emp("Cinderlla","Sales",10000);
			emp emp2 = new emp("David","Programmer",15000);
			emp emp3 = new emp("Bob","Marketing",20000);
			emp emp4 = new emp("Scoot","Programmer",25000);
			emp emp5 = new emp("Henry","Manager",25000);
			
			
			emp3.addcoworker(emp1);
	        emp3.addcoworker(emp5);
             emp1.addcoworker(emp4);
	        emp1.addcoworker(emp2);

	        System.out.println(emp3);
	        for (emp headEmployee : emp3.getworkers()) {
	            System.out.println(headEmployee);
	            
	            for(emp employee : headEmployee.getworkers()) {
	                System.out.println(employee);
	            }
	        }
		}

	}

