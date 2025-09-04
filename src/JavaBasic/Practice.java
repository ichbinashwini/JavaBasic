package JavaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		
		int inputint = 4;
		for(int i =1; i<inputint;i++) {
			for(int j=1;j<=i;j++) {
				for(int k=1;k<=j;k++) {
					System.out.print(j);
				}
			}
			System.out.println("");
		}
		
		
		
		//************* find duplicates in int array *****************
		
		
		int[] intar2 = {1,2,3,4,2,3,4};
		
		Set<Integer> intSetUnique = new HashSet<Integer>();
		Set<Integer> intSetDuplicae = new HashSet<Integer>();
		
		for(int each: intar2) {
			//intSet.add(each);
			if(!intSetUnique.add(each)) {
				intSetDuplicae.add(each);
			}
		}
		System.out.println("Unique "+intSetUnique);
		System.out.println("Duplicate "+intSetDuplicae);
		
		
		//************ upper to lower case ****************************
		
		String caseStatement = "this is it";
		StringBuilder stb = new StringBuilder();
		
		for( int i = 0; i<caseStatement.length();i++) {
			
			char each = caseStatement.charAt(i);
			if(each>='a' && each<='z')
			{
			each =(char)(each-32);
			System.out.println(each);
			
			}
			stb.append(each);
		}
		
		
		System.out.println("output "+stb);
		
		int [] iar = {4,5,6,0};
		List<int[]> iarList = Arrays.asList(iar);
		int leng = iar.length;
		int last = iar[leng-1];

		for(int i=leng-1; i>0;i--) {//i=3
			iar[i] = iar[i-1];
		}
		iar[0] = last;
		System.out.println("Iar-------->"+Arrays.toString(iar));
		String st = "Ashwini lives in Pune";
		
		
		char[] charArray2 = st.toCharArray();
	
		int[] arr = {1, 2, 3};
		Arrays.asList(arr);
		
		Map<Character, Integer>stChar = new LinkedHashMap<>();
		char lastChar='\u0000';
		
		for(char each : charArray2 ) {
			stChar.put(each, stChar.getOrDefault(each,0)+1);
			if(stChar.containsKey(each)) {
				lastChar = each;
			}
		}
		
		System.out.println("Last repeating char is --> "+lastChar);
		System.out.println("Map-->"+ stChar);
		int temp=0;
		
		for(Map.Entry<Character, Integer> each : stChar.entrySet()) {
		
			System.out.println(each.getKey()+ ": "+ each.getValue());
			int value = each.getValue();
			if(value>temp) {
				
				temp = value;
			}
		}
		//System.out.println("Max occurances of chara are "+ );
		
		
		
		String rev ="";
		char[] charArray = st.toCharArray();
		
		for(int i=charArray.length-1; i>=0;i--) {
			rev= rev+ st.charAt(i);
		}
	System.out.println(rev);
		

		// StringBuilder firstLetters = getFirstLettersInString("Ashwini Lives in
		// Pune");
		// System.out.println(firstLetters);

		// int ar[] = {1,2,3,4};
		// moveLastElementToFirstPosition( new int[]{1,2,3,4,0});

		// pyrmid();

		Dogs a3 = new Dogs();
		a3.thisUseCase("Han", 75);

		a3.thisUseCase2();
		a3.process();

		Animals a1 = new Dogs();
		Animals a2 = new Cats();
		a1.sound();
		a2.sound();

		StaticKeyword.v1();
		StaticKeyword.v2();

		StaticKeyword.staticName = "jo";

		StaticKeyword ob1 = new StaticKeyword();
		System.out.println(ob1.nonStaticname);

		System.out.println("after chnaging to jo");
		System.out.println(StaticKeyword.staticName);
		// StaticKeyword.v1();
		// StaticKeyword.v2();

//*********************** WAP to print 10 to 1 using for, while and do-while loop *****************************

		double i = 10.0;

		do {
			System.out.println(i);
			i--;
			if (i == 0) {
				break;
			}
		} while (i <= 10);

//*********** Print the following series: 0 9 18 27 36 …99 *****************

		System.out.println(" Print the following series: 0 9 18 27 36 …99");
		for (int init = 0; init <= 99; init += 9) {
			System.out.println(init);
		}

// *********** Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.*********

		System.out.println("Print only vowels (aeiou)");

		for (char ch = 'a'; ch <= 'z'; ch++) {
			while (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Letter " + ch + " is a vowel");
				break;
			}
		}

		int[] a = { 1, 2, 3, 4 };

		int b[] = new int[3];
		b[0] = 3;
		b[1] = 4;

		String day = "Tuesday";

		switch (day) {
		case "Monday":
			System.out.println("This is Monday");
			break;
		case "Tuesday":
			System.out.println("This is Tuesday");
			break;
		case "Thursday":
			System.out.println("This is Thursday");
			break;

		default:
			System.out.println("Invalid day selected");
			break;
		}

	}

	public static void pyrmid(int rows) {
		for (int i = 1; i <= rows; i++) {// i=2
			for (int j = 1; j <= i; j++) {// j=1
				for (int k = 1; k <= j; k++) {// k=1
					System.out.print(j);
				}
			}
			System.out.println("");
		}
	}

	public static void moveLastElementToFirstPosition(int[] intArray) {
		int len = intArray.length; // 5
		int last = intArray[len - 1];

		for (int i = len - 1; i > 0; i--) {// i=3
			intArray[i] = intArray[i - 1];

		}
		intArray[0] = last;
		System.out.println(Arrays.toString(intArray));
	}

	public static StringBuilder getFirstLettersInString(String st) {

		String[] words = st.split(" "); // [Ashwini, Lives, in, Pune]
		System.out.println(Arrays.toString(words));
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++) {
			String str = words[i];
			if (i < 2) {
				char ch = str.charAt(0);
				sb.append(ch + " ");
			} else {
				sb.append(words[i] + " ");
			}

		}
		return sb;
	}

}
