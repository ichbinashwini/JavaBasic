package CollectionsConcept;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		

		String name = " ashwini Nanaware ";

		char[] charArray = name.replaceAll("\\s","").toLowerCase().toCharArray();
		
		
		System.out.println(charArray);

		Map<Character, Integer> mappedLetters = new HashMap();

		for (char each : charArray) {

			mappedLetters.put(each, mappedLetters.getOrDefault(each, 0) + 1);

		}
		
		for(Map.Entry<Character, Integer> eachEntry:mappedLetters.entrySet()) {
			
		System.out.println(eachEntry.getKey() + " has occurances = "+ eachEntry.getValue());
		}
		

	}

}
