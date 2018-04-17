import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutput implements java.io.Serializable {
	private String name = "Uma";
	public String name1 = "Lalitha";

	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("C:\\Users\\Sai\\Desktop\\Name.xls");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		FileOutput fo = new FileOutput();
		oos.writeObject(fo);

	}

}
