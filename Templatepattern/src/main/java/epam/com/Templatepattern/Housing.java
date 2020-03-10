package epam.com.Templatepattern;

public class Housing {
public static void main(String[] args) {
		
		WoddenHome houseType =  new WoddenHome();
		houseType.buildHouse();
		System.out.println("************");
		
		GlaseHome houseType1 = new GlaseHome();
		
		houseType1.buildHouse();
	}
}
