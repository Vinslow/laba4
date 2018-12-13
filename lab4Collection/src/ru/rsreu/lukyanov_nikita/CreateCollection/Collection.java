package ru.rsreu.lukyanov_nikita.CreateCollection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Collection {
	public static ArrayList<String> load() throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ru/rsreu/lukyanov_nikita/resources/items.txt"));
		String string;
		ArrayList<String> stringList = new ArrayList<>();
		try {
			while ((string = bufferedReader.readLine()) !=null) {
				stringList.add(string);				
			}
		} finally {
			// TODO: handle finally clause
			bufferedReader.close();
		}
		return stringList;
	}

	public static Map<Integer, String> map(ArrayList<String> stringList) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new TreeMap<Integer, String>();
		for (int i = 0; i < stringList.size(); i++) {
			map.put(stringList.get(i).hashCode()+i, stringList.get(i));			
		}
		return map;
	}

	public static Map<Integer, String> removeDuplicates(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		java.util.Collection<String> stringList = map.values();
		for(Iterator<String> iterator = stringList.iterator();iterator.hasNext();) {
			if(java.util.Collections.frequency(stringList, iterator.next())>1) {
				iterator.remove();
			}
		}
		
		return map;
	}

}
