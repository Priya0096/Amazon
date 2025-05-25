package Polymorphism;

public class Method {

	public void overLoading(int c) {
		System.out.println(c);
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
		
		obj.overLoading(20);
		obj.overLoading("priya");
		obj.overLoading(50,60);
		obj.overLoading("Test", 10);
}
}