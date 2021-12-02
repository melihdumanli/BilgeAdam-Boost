package com.bilgeadam.boost.java.course01.lesson11;

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		System.out.println(p);
		
		p.setX(12.4f);
		p.setY(25f);
		p.setName("P");
		System.out.println(p);
		
		Point q = new Point(34f, 27.43f);
		q.setName("Q");
		System.out.println(q);
		
		Point r = p;  // ==>  özdeþ
		System.out.println(r);
		r.setName("R");
		System.out.println(r);
		System.out.println(p);
		r.setX(0f);
		System.out.println(p);
		System.out.println(p == q);
		System.out.println(p == r);
		System.out.println(p.equals(r));
		System.out.println(p.equals(q));
		
		q.setX(0f);
		q.setY(25f);
		System.out.println(p == q);
		System.out.println(p.equals(q));
		
	}

}
