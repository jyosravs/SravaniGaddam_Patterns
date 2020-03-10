package epam.com.Compositepattern;
import java.util.ArrayList;
import java.util.List;

public class Art implements Shape{

	private List<Shape> shapes = new ArrayList<Shape>();
	
	
	public void draw(String fillColor) {
		for(Shape sh : shapes)
		{
			sh.draw(fillColor);
		}
	}
	
	public void add(Shape s){
		this.shapes.add(s);
	}
	
	public void remove(Shape s){
		shapes.remove(s);
	}
	
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}

}
