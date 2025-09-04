package CollectionsConcept;

public class Employee {
	
	String name;
	int age;
	String dept;

public	Employee(String name, String dept){
		this.name = name;
		this.age = age;
		this.dept = dept;
	}

public static void empMeth ( Employee e1) {
	
	System.out.println("This is static method");
	
	e1.empMeth1();
}


public void empMeth1 ( ) {

	System.out.println("This is instance / class method");
	
}

//public static void main(String[]args) {
//	
//	Employee e1 = new Employee("Ashwini","Tech");
//	System.out.println(e1.name);
//	System.out.println(e1.dept);
//	e1.age =40;
//	System.out.println(e1.age);
//	
//	Employee.empMeth(e1);
//
//	
//	
//		
//}




}