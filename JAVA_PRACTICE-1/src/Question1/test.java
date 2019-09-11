package Question1;
class A{
	public int ABC (int a, int b) {
		int c=0;
		c=a+b;
		System.out.println("class A");
		return c;
		
	}
}
public class test extends A {
	int val;
	public int ABC (int a,int b) {
		super.ABC (a,b);
		//System.out.println("class test");
		return a+b;
		
	}
	public static void main(String[] args) {
		test t=new test();
	   // int v=t.val=10;
		System.out.println(t.ABC(5, 6));
}
}
