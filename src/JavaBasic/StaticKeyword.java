package JavaBasic;

public class StaticKeyword {

	static String staticName = "xyz";
	
	 String nonStaticname = "abc";

	public static void v1 (){
		//sname = "Abc";
		System.out.println(staticName);
		//System.out.println(nonStaticname);
		
		StaticKeyword ob1 = new StaticKeyword();
		System.out.println(ob1.nonStaticname);
	}
	
	public static void v2() {
		//sname = "Def";
		
		System.out.println(staticName);
		StaticKeyword ob1 = new StaticKeyword();
		System.out.println(ob1.nonStaticname);
	}

}
