
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class CSVreadANDwrite {
	public static void main(String[] args) throws IOException{
		try {
			InputStreamReader fil=new InputStreamReader(new FileInputStream("G:/testPlace/SPECTF.train"));
		    BufferedReader Bfil=new BufferedReader(fil);
		    File crefil=new File("G:/testPlace");
		    BufferedWriter BWfil=new BufferedWriter(new FileWriter (crefil));
		    String line=null;
		    line=Bfil.readLine();
		    BWfil.write(line);
		    System.out.println(line);
			BWfil.close(); 
			Bfil.close();
		}
	catch (IOException e) {
		e.printStackTrace();   
	}
	
	}
}