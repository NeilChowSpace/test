package test;

public class Student {
	private int age = 23;
	
	public Student() {
		System.out.println("构造方法");
	}
	
	public Student(int a){
		System.out.println("构造方法："+a);
	}
	
	public void insert(){
		System.out.println("添加");
	}
	
}
