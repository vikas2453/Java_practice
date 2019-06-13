package com.fun.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingMap {

	public static void main(String[] args) {
		String text= "Akshay Kumar is a Canadian Bollywood actor and producer, residing in Mumbai. He made his debut with a minor role in the 1987 Mahesh Bhatt directed Indian film Aaj.[1][2] He appeared as the lead actor in Saugandh (1991) before making his breakthrough with the suspense thriller Khiladi (1992), the first film of the Khiladi series.[3][4] In the same year, he appeared in the Pramod Chakravorty-produced film Deedar. In 1994, Kumar earned his first nomination for Best Actor at the Filmfare Awards for his performance in the Yash Chopra-produced romance Yeh Dillagi and starred in Mohra.[5] The following year he appeared in Sabse Bada Khiladi. Kumar played a supporting role in the Chopra-directed romance Dil To Pagal Hai (1997), for which he received a nomination for the Filmfare Award for Best Supporting Actor.[5] However, several other of his releases in the 1990s, including Lahu Ke Do Rang, Insaaf, Daava, Tarazu, Angaaray, Barood and Zulmi performed poorly at the box office leading to a setback in his film career.";
		 int k =3;
		 List<String> trivial = new ArrayList<>();
		 trivial.add("the");
		 findMostFrequentWords(text, k, trivial);
	}
	
	public static List<String> findMostFrequentWords(String text, int k, List<String> trivialWords){
		Map<String, Integer> trivialWordsMap = new HashMap<>();
		trivialWords.forEach(s->trivialWordsMap.put(s, 1));
		Map<String, Integer> freqWords = new HashMap<>();
		String[] words = text.split(" ");
		for(String s: words) {
			if(trivialWordsMap.get(s)==null)
			freqWords.compute(s, (key, value)->value==null?1:++value);			
		}
		System.out.println(freqWords);		
		List<String> sortedList= new ArrayList<String>();
		sortedList.addAll(SortMap(freqWords, 3).keySet());
		System.out.println(sortedList);
		return sortedList;
	
		//return null;
		
	}
	
	public static Map<String, Integer> SortMap( Map<String, Integer> unsortedMap, int k){
		List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortedMap.entrySet());
		Map<String, Integer> sortedMap= new LinkedHashMap<>();
		
		Collections.sort(list, (o1, o2)->o2.getValue().compareTo(o1.getValue()));
		for( int i=0; i<k; i++) {
			sortedMap.put(list.get(i).getKey(), list.get(i).getValue());
		}
		/*list.forEach(e->sortedMap.put(e.getKey(), e.getValue()));*/
		System.out.println(sortedMap);	
		return sortedMap;
		
		
	}

}
