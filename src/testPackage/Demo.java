package testPackage;

public class Demo {

	public static void main(String[] args) {
		
		//Square obj_square = new Square();
		
		
		//System.out.println("Test")
		
		Rectangle obj_rect = new Rectangle();
		
		obj_rect.setValues(12, 13);
		System.out.println("Length is : "+obj_rect.getLength());
		System.out.println("Breadth is : "+obj_rect.getBreadth());
		
		
		System.out.println("Area is : "+obj_rect.Area());
		System.out.println("Perimeter is : "+obj_rect.Perimeter());
		
		
		
		
		
	}

}
