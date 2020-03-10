package epam.com.Compositepattern;

public class Testcom {
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		Triangle tri1 = new Triangle();
		Circle cir = new Circle();
		
		Art artist = new Art();
		artist.add(tri1);
		artist.add(tri1);
		artist.add(cir);
		
		artist.draw("Red");
		artist.clear();
		
		artist.add(tri);
		artist.add(cir);
		artist.draw("Green");
	}
}
