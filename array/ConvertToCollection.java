package array;

import java.util.ArrayList;

public class ConvertToCollection {
public static void main(String[] args) {
	int a[]= {12,43,1,23,34};
	Student students[]=new Student[3];
	students[0]=new Student(1, 123);
	students[1]=new Student(2, 132);
	students[2]=new Student(3, 100);

	
	ArrayList<Student> studs=new ArrayList<Student>();
	for (Student student : students) {
		studs.add(student);
	}
	System.out.print(studs);
	
	System.out.println();
	ArrayList<Integer> al=new ArrayList<Integer>();
	for (Integer number : a) {
		al.add(number);
	}
	System.out.println(al);
}
}
