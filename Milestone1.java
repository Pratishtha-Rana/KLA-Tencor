import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.lang.Thread;

public class Milestone1{
    public  static void main(String[] args) {
        
        //Reading YAML file
        InputStream inputStream = new FileInputStream(new File("Milestone1A.yaml"));
        Yaml yaml = new Yaml();
        Map<String, Object> data = yaml.load(inputStream);
        System.out.println(data);

        //Appending a file
        try{
    		File myFile = new File("logfile.txt");
			myFile.createNewFile();
		}
		catch(IOException e){
			e.printStackTrace();
    	}

        //
    }

    
    public static void dateTime(int t){
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        //Before
        try{
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("logfile.txt", true));
			    fileWriter.append(formatter.format(date));
				fileWriter.newLine();
				fileWriter.close();
		} 
		catch(IOException e){
            e.printStackTrace();
        }

        //Make computer sleep for sometime
        try {
            Thread.sleep(t*1000);
            }
        }
        catch (Exception e) {
           
            // catching the exception
            System.out.println(e);
        }

        //After
        try{
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("logfile.txt", true));
			    fileWriter.append(formatter.format(date));
				fileWriter.newLine();
				fileWriter.close();
		} 
		catch(IOException e){
            e.printStackTrace();
        }
    }
}