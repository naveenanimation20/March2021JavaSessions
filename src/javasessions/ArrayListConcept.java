package javasessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList -- default class in java
		// dynamic array: size is not fixed
		// order based -- it maintains the index
		//restrict the arraylist: Generics
		//Raw type: Object Generics
		//Collections API in Java
		//List -- Is an Interface
		//ArrayList is the class which is the child of List interface
		//LinkedList, Vector
		
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());// 0

		ar.add(100);// 0
		
		System.out.println(ar.size());
		
		ar.add(200);// 1
		ar.add(300);// 2

		System.out.println(ar.size());// 3
		ar.add(400);// 3
		ar.add(500);// 4

		System.out.println(ar.size());// 5
		ar.add(600);// 5
		ar.add(700);// 6

		System.out.println(ar.size());// 7

		ar.add(12.33);// 7
		ar.add('m');// 8
		ar.add("selenium");// 9
		ar.add(true);

		System.out.println(ar.get(9));
		// System.out.println(ar.get(10));//IndexOutOfBoundsException
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException

		ar.add(1000);
		ar.add(1100);
		
		System.out.println(ar.size());//12

		//to print all the values from arraylist: for loop:
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("----");
		
		//for each:
		for(Object e : ar) {
			System.out.println(e);
		}
		
		//generics in arraylist:
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("peter");
		empList.add("peter");
		empList.add("Lisa");

		
		for(String e : empList) {
			System.out.println(e);
				if(e.equals("peter")) {
					System.out.println("peter is in admin dept....");
					break;
				}
		}
		
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Tom");//0
		studentList.add("peter");//1
		studentList.add("naveen");//2
		studentList.add("Lisa");//3
		
       System.out.println(reverse(studentList));
		
//		System.out.println(studentList.get(2));
//		//studentList.remove(2);
//		System.out.println(studentList.get(2));
//		System.out.println(studentList.size());
//		
//		Collections.reverse(studentList);
//		System.out.println(studentList);
//		ArrayList<String> studentRevList = new ArrayList<String>();
//
//		for(int i=studentList.size()-1; i>=0; i--) {
//			studentRevList.add(studentList.get(i));
//		}
//		
//		System.out.println(studentRevList);
		
       int one = 'A'/'A';
       printNum(one);
       
	}
	
	public static void printNum(int num) {
		if(num <= 'd') {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}
	
	public static ArrayList<String> reverse(ArrayList<String> list) {

		   for (int i = 0; i < list.size() / 2; i++) {
			 String temp = list.get(i);
		     list.set(i, list.get(list.size() - i - 1));
		     list.set(list.size() - i - 1, temp);
		   }

		   return list;
		 }

}
