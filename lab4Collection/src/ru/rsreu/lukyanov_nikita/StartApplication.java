package ru.rsreu.lukyanov_nikita;

import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import ru.rsreu.lukyanov_nikita.CreateCollection.Collection;

public class StartApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	

	
		// TODO Auto-generated method stub
		ArrayList<String> stringList = Collection.load();
		System.out.println("Map list:");
		Map<Integer, String> map = Collection.map(stringList);
		System.out.println(map);
		System.out.println("Map list without duplicates:");
		map =  Collection.removeDuplicates(map);
		System.out.println(map);
		
		ru.rsreu.lukyanov_nikita.Points.Point point = new ru.rsreu.lukyanov_nikita.Points.Point();
		System.out.println(point.loadPoints());
	}

}
