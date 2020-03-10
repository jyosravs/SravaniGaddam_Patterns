package epam.com.Designpatterns;

public class file1 implements PublicFile {
private String Filename;

public file1(String Filename){
    this.Filename = Filename;
    loadFromDisk(Filename);
 }

public void printname() {
	System.out.println("Showing:"+ Filename);
}
private void loadFromDisk(String Filename){
    System.out.println("Linking "+Filename);
 }


}
