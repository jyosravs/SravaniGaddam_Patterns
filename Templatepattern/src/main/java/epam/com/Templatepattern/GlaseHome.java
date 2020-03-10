package epam.com.Templatepattern;

public class GlaseHome extends HouseTemp {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}

	public void buildHouse() {
	}
}