package test;

public class Test {

	public static void main(String[] args) {
//		int number = 0;
//		while(! (number >= 1000 && number <= 9999))
//			number = (int)(Math.random()*10000);
//		System.out.println(number);
		
		StringBuffer myStr = new StringBuffer();
		
		System.out.println(myStr.length());
		System.out.println(myStr.capacity()); // 16 
		myStr.append("Great - Learning");
		System.out.println(myStr.length());
		System.out.println(myStr.capacity()); // 16 
		myStr.append(" online Java Training"); // 37
		System.out.println(myStr.length());
		System.out.println(myStr.capacity()); // (16+1)*1 = 34 
		
		//ArrayList
		//LinkedList 
	}
}
