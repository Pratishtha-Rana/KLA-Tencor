import org.yaml.snakeyaml.Yaml;
import java.io.*;
import java.util.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;
import java.text.*; 
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

        for i in activities
    }

    
    public class Inputs {
        private String functionInput;
        private String executionTime;
    }

    public class Task {
        private String type; //type: sequential or concurrent
        private String function;
        Inputs inputs=new Inputs();
    }
    
    
    public static void dateTime(int t){
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        try{
            //Before
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("logfile.txt", true));
			fileWriter.append(formatter.format(date));

			fileWriter.newLine();
			fileWriter.close();
            
            //Make computer sleep for sometime
            Thread.sleep(t*1000);

            //After
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
