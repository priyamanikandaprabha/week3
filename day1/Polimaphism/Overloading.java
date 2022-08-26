package week3.day1.Polimaphism;

public class Overloading {
	 //2 methods for add (1 method with 3 args)
	public void add(int a, int b, int c) {
		c=a+b;
		System.out.println(c);
		
	}
	//2 methods for add (1 method with 2 int agrs)
	public void add(int a, int b) {
		a=b;
		System.out.println(a);
		
	}
	//2 methods for add(1 methods with 2 double args)
	public void add(double a1, double b1) {
		System.out.println(a1);
		System.out.println(b1);
	}
	// 2 methods for add (1 methods with 1 double arg and 1 int arg)
	public void add(double a1, int b) {
		System.out.println(a1);
		System.out.println(b);
		
	}
	public static void main(String[] args) {
      //Create Object for Calculator class, and execute all methods
		
		 Overloading values = new Overloading();
		 values.add(5545.2, 0544);
		 values.add(4545.2, 64);
		 values.add(12, 45);
		 values.add(455, 44, 545645);
		
		
		
		
	}

}
