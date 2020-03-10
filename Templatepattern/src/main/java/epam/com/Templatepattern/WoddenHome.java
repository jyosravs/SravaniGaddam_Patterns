package epam.com.Templatepattern;

public class WoddenHome extends HouseTemp {

	@Override
	public void buildWalls() {
		System.out.println("Building Wooden Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with Wood coating");
	}

	public void buildHouse() {
	}
}