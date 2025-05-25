package Polymorphism;

public class MethodOverriding extends MethodOverloading {

		public void overLoading(String a) {
			System.out.println(a);
		}
		public void overLoading (String b, int f) {
			System.out.println(b);
		}
		public void overLoading (int a, int b,int c) {
			int sub= a-b-c;
			System.out.println(sub);
		}
	    
		public static void main(String[] args) {
			
			MethodOverriding obj=new MethodOverriding ();
			
			obj.overLoading(30);
			obj.overLoading("Hello");
			obj.overLoading(110,30,20);
			obj.overLoading("Test", 10);
			obj.overLoading(110,30);
		}

}
