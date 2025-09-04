package CollectionsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListConcept {

	static String name;

	public int studentScore(String sName) {
		int pScore = 0;
		int nScore = 0;
		int fScore = 0;

		System.out.println("Inside the student score");

		if (sName.equals("Jay")) {
			pScore = 10;
			nScore = -1;
			fScore = pScore + nScore;

		} else {
			System.out.println("not found");
		}
		return fScore;
	}

	public static void main(String[] args) {

		System.out.println("--------------- static arrray -------------");
		Object[] intar = { 1, 3, "sdfg", 6 };
		System.out.println(intar[3]);
		System.out.println("Length "+intar.length);
		
		System.out.println(Arrays.toString(intar));
		
		System.out.println("--------------- ArrayList (Dynamic array) -------------");
		
		List<String> myArList = new LinkedList<>();
		
		
		myArList.add("aj");
		myArList.add("Rk");
		myArList.add("Sb");
		myArList.add("Wr");
		
		System.out.println("Size "+myArList.size());
		
		for(int i=0; i<myArList.size(); i++) {
		System.out.println(	myArList.get(i));
		}
		System.out.println("Using advanced for loop");
		for(String each: myArList) {
			System.out.println(each);
		}
		
		
		

		ArrayListConcept a12 = new ArrayListConcept();
		int m = a12.studentScore("me");
		if (m > 0) {
			System.out.println("Marklist generated");
		} else {
			System.out.println("Marklist NOT generated");
		}

		System.out.println("----------------------------");

		ArrayListConcept a1 = new ArrayListConcept();
		ArrayListConcept a2 = new ArrayListConcept();
		ArrayListConcept a3 = new ArrayListConcept();
		ArrayListConcept a4 = new ArrayListConcept();

		a1.name = "Anaya";
		a2.name = "Nia";
		a3.name = "katie";
		a4.name = "Ed";

		System.out.println(a1.name);// A
		System.out.println(a2.name);// N
		System.out.println(a3.name);// K
		System.out.println(a4.name);// E

		System.out.println("-----------------------------------");

		a1 = a2 = a3;

		System.out.println(a1.name);// K
		System.out.println(a2.name);// K
		System.out.println(a3.name);// K

		System.out.println("-----------------------------------");
		a1 = a2;
		System.out.println(a1.name);// N
		System.out.println(a2.name);// N
		System.out.println(a3.name);// K

		System.out.println("-----------------------------------");
		a2 = a3;
		System.out.println(a1.name);// N
		System.out.println(a2.name);// K
		System.out.println(a3.name);// K

		System.out.println("-----------------------------------");
		a3 = a4;
		System.out.println(a1.name);// N
		System.out.println(a2.name);// K
		System.out.println(a3.name);// E
		System.out.println(a4.name);// E

		System.out.println("-----------------------------------");
		a4 = a1;
		System.out.println(a1.name);// N
		System.out.println(a2.name);// K
		System.out.println(a3.name);// E
		System.out.println(a4.name);// N
		System.out.println("-----------------------------------");

		ArrayList<Integer> ari = new ArrayList<Integer>(2);
		ari.add(5);
		ari.add(6);
		ari.add(7);
		System.out.println(ari);

		int[] a = new int[4];
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;

		System.out.println(a.length);

		ArrayList ae = new ArrayList();
		ae.add("new");
		ae.add("old");
		ae.add("10");
		System.out.println(ae);

//		Employee e1 = new Employee("Shifa",20,"Delivery");
//		Employee e2 = new Employee("Joya",21,"BA");
//		Employee e3 = new Employee("Emma",22,"Admin");

		ArrayList<Employee> empList = new ArrayList<>();
//		empList.add (e1);
//		empList.add (e2);
//		empList.add (e3);
//		
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {

			Employee emp = it.next();
			System.out.print(emp.name);
			System.out.print(emp.age);
			System.out.print(emp.dept);
			System.out.println();

		}

		int j[] = new int[5];
		System.out.println(j.length);

		Object ob[] = new Object[2];
		ob[0] = 1;
		ob[1] = "Sign";
		System.out.println(Arrays.toString(ob));

	}

}
