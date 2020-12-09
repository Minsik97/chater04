package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

	public static void main(String[] args) {
		//ArrayList사용법 + Rectangle
			
		//ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		//LinkedList<Rectangle> rList = new LinkedList<Rectangle>();
		
		List<Rectangle> rList = new ArrayList<Rectangle>();
		//List<Rectangle> rList = new LinkedList<Rectangle>();
		
		
		Rectangle r01 = new Rectangle(3,3);
		Rectangle r02 = new Rectangle(5,5);
		
		//add()
		rList.add(r01);
		rList.add(r02);
		
		//get()
		Rectangle r = rList.get(0);
		System.out.println(r.getWidth());
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());
		
		//size() 배열에 데이터가  몇개 있는지 알려줌
		System.out.println(rList.size());
		
	
		Rectangle r03 = new Rectangle(100,100);
		//위치지정 추가
		rList.add(1, r03);
		
		//전체출력
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		System.out.println("toString=========================");
		System.out.println(rList.toString());
		
		
		System.out.println("================");
		
		//삭제법1
		rList.remove(1);
		//전체출력
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		System.out.println("================");
		//삭제법2 주소 지정
		rList.remove(r03);
		//전체출력
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		
		
		System.out.println("원 관리================");		
		///////////////////////////////////////////////////////////
		//원 관리
		//ArrayList<Circle> cList = new ArrayList<Circle>();
		LinkedList<Circle> cList = new LinkedList<Circle>();
		
		Circle c01 = new Circle(5);
		Circle c02 = new Circle(500);
				
		cList.add(c01);
		cList.add(c02);
		//cList.add(r01); 사각형 사용 X
		
		
		for(int i = 0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		
				
		
	}

}
