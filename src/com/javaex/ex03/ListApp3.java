package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {
		//범용 ObjList사용하는데
		//메모리에 올릴때( new) 사각형 용으로 만들어버린다.
		MyList<Rectangle> rList = new MyList<Rectangle>();
		
		Rectangle r01 = new Rectangle(5,5);
		Rectangle r02 = new Rectangle(10,10);
		
		rList.add(r01);
		rList.add(r02);
		
		for(int i=0; i<rList.size(); i++) {
			rList.get(i).draw();
		}
		
		
		//범용 ObjList사용하는데
		//메모리에 올릴때( new) 원 용으로 만들어버린다.
		//ObjList rList = new ObjList<Circle>();		
		MyList<Circle> cList = new MyList<Circle>();
		
		Circle c01 = new Circle(7);
		Circle c02 = new Circle(10);
		
		cList.add(c01);
		//cList.add(r02); 사각형은 추가될수 없다
		
		for(int i=0; i<cList.size(); i++) {
			cList.get(i).draw();
		}
		
		
		

		//범용 ObjList사용하는데
		//메모리에 올릴때( new) 삼각형 용으로 만들어버린다.
		//ObjList rList = new ObjList<Triangle>();
		MyList<Triangle>tList = new MyList<Triangle>();
		
		Triangle t01 = new Triangle(50,60);
		Triangle t02 = new Triangle(50,60);
		
		tList.add(t01);
		tList.add(t02);
		
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
	}

}
