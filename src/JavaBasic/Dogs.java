package JavaBasic;

public class Dogs extends Animals {

	
	
	
	
	public void display() {
        System.out.println("Display method called");
    }

	public void process() {
        this.display();  // calls current class method
    }
	
	
	public String name;
	public int age;
	
	
	public void thisUseCase(String name, int age) {
		System.out.println(name+"'s age is " +age + " years");
	} 
	

	public void thisUseCase2() {
		System.out.println(name+"'s age is " + age + " years");
	} 
	
	
	
	@Override
	public void sound() {
		System.out.println("Dogs bark");
	}
}
