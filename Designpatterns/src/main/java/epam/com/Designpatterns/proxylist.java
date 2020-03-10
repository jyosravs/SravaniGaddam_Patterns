package epam.com.Designpatterns;
	public class proxylist implements PublicFile{
		private file1 mediaFileImpl;
		   private String Filename;

		   public proxylist(String Filename){
		      this.Filename = Filename;
		   }

		   public void printname() {
		      if(mediaFileImpl == null){
		         mediaFileImpl = new file1(Filename);
		      }
		      mediaFileImpl.printname();
		   }
}
