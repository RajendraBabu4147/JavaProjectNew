package testPackage;

public class Calculator {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		System.out.println("Addition of two integer numbers : " +a1.add(23,34));
		System.out.println("Addition of two double numbers : " +a1.add(23.5,34.7));
		System.out.println("Concatenation of two String values : " +a1.add("Rajendra"," Babu"));
		
		
		
	}

}
