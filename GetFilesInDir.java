package listFilesinDir;
import java.io.File;

public class GetFilesInDir {
	
	public void getFilesDirs(String pathName) {
		File dir = new File(pathName);
		String[] files = dir.list();
		for (String file: files) {
			System.out.println(file);
		}
		
	}
	
	public static void main(String[] args) {
		GetFilesInDir names = new GetFilesInDir();
		names.getFilesDirs("C:/Users/Mike/Desktop");
	}
}
