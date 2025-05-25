package Polymorphism;

public class MethodOverloading {

	public void overLoading(int a) {
		System.out.println(a);
	}
	public void overLoading(String a) {
		System.out.println(a);
	}
	public void overLoading (String b, int f) {
		System.out.println(f);
	}
	public void overLoading (int a, int b) {
		int sum= a+b;
		System.out.println(sum);
	}
    
	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading ();
		
		obj.overLoading(30);
		obj.overLoading("priya");
		obj.overLoading(50,60);
		obj.overLoading("Test", 10);
	}
		
}
