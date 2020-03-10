package epam.com.Designpatterns;
import java.util.ArrayList;
import java.util.List;
public class emp {
		private String name;
		private String position;
		private int wage;
		private List<emp> coworker;
		public emp(String name,String position,int wage){
			this.name = name;
			this.position = position;
			this.wage = wage;
			coworker = new ArrayList<emp>();
		}
		public void addcoworker(emp emp){
			coworker.add(emp);
		}
		public void removeworker(emp emp){
			coworker.remove(emp);
		}
		public List<emp> getworkers(){
			return coworker;
		}
		public String toString(){
			return "Employee : | Name: " + name + ", Position: " + position + ", Wage: "
		             + wage + " |";
		}

	}

