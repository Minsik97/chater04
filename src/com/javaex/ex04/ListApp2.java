package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListApp2 {

	public static void main(String[] args) {
		
		ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		
		Rectangle r01 = new Rectangle(3,3);
		Rectangle r02 = new Rectangle(4,4);
		
		rList.add(r01);
		rList.add(r02);
		
		rList.remove(r02);
		
		for(int i = 0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		LinkedList<Circle> cList = new LinkedList<Circle>();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(6);
		
		cList.add(c01);
		cList.add(1, c02);
		
		System.out.println(cList.size());
		
		for(int i = 0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		
		Triangle t01 = new Triangle(23, 54);
		Triangle t02 = new Triangle(32, 23);
		Triangle t03 = new Triangle(12, 53);
		Triangle t04 = new Triangle(52, 12);
		
		tList.add(t01);
		tList.add(t02);
		tList.add(t03);
		tList.add(t04);
		
		
		tList.remove(t03);
		
		System.out.println(tList.size());
		
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
		
	}

}
