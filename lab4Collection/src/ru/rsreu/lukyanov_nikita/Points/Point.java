package ru.rsreu.lukyanov_nikita.Points;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Point {
	public HashMap<String,Integer> points = new HashMap<>();
	int checkX = 0;
	int checkY =0;
	
	public HashMap<String, Integer> loadPoints() throws IOException{
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ru/rsreu/lukyanov_nikita/resources/points.txt"));
		String line;
		while ((line = bufferedReader.readLine())!= null) {
			String[] parts = line.split(":",2);
			if(parts.length >= 2) {
				String key = parts[0];
				int value = Integer.parseInt(parts[1]);
				points.put(parts[0], value);
			}
		}
		checkEntering();
		return points;
	}
	private int getLength() {
		return points.size();
	}
	
	public void checkEntering() {
		int i = 0,j=0,k=0;
		/*int x0 = 0;
		int y0 = 0;
		int x1 = 0;
		int y1 = 0;
		x0 = points.get("x");
		y0 = points.get("y");
		x1 = points.get("x1");
		y1 = points.get("y1");
		
		if(((points.get("x2") - x0)*(y1-y0)-(x1-x0)*(points.get("y2")-y0)) == 0)
			outInfo(x0,y0,x1,y1, points.get("x2"),points.get("y2"));
		*/
		int length = getLength()/2;
		System.out.print(getLength());
		for (i = 0;i<length-2;i++) {
			/*x0 = points.get("x" + i);
			y0 = points.get("y" + i);*/
			for(j=i+1;j<length-1;j++) {
				/*x1 = points.get("x" + j);
				y1 = points.get("y" + j);*/
			
			for(k=j+1;k<length;k++) {
				if(((points.get("x" + k) - points.get("x" + i))*(points.get("y" + j)-points.get("y" + i))-(points.get("x" + j)-points.get("x" + i))*(points.get("y" + k)- points.get("y" + i))) == 0)
					outInfo(points.get("x" + i),points.get("y" + i),points.get("x" + j),points.get("y" + j), points.get("x2"),points.get("y2"));
				
			}
			}
		}
		
		
		
	}

	private void outInfo(int x0, int y0, int x1, int y1, Integer throwX, Integer throwY) {
		// TODO Auto-generated method stub
		if (checkX != x0 && checkY != y0) {
		System.out.println("Lines:");
		System.out.println("Lines: " + "going throw points: X=" + x0 + " Y=" + y0 + " X=" + x1 + " Y=" + y1);
		checkX = x0;
		checkY  =y0;
		}
		
	}
	
}
