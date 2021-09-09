package common;

public class sknd {
	
	public void ma1() {
		System.out.println("ma1");
	}
	
	public void ma2() {
		ma1();
		System.out.println("ma2");
	}
	
	public static void main(String[] args) {
		//new sknd().ma2();
		
		int a =26;
		int b = 5;
		System.out.println("a"+ a/b);
		System.out.println("b"+ a%b);
	}

}
