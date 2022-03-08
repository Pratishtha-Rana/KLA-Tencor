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
        Map<String,Map<String,Map<String,String>>> data = yaml.load(inputStream);
        System.out.println(data);

        //Appending a file
        try{
    		File myFile = new File("logfile.txt");
			myFile.createNewFile();
		}
		catch(IOException e){
			e.printStackTrace();
    	}

        Map<String,Map<String,String>>> hm1=new HashMap<>();
        hm1=data.get("activities");
        char ch='A';
        for(int i=0;i<hm1.size();i++){
            Map<String,String> hm2=new HashMap<>();
            hm2=hm1.get(("Task"+ch));
            TaskFunction(hm1,hm2);
            ch++;
            if(data.get("Type")=="Flow"){
                flow(hm1);
            }
            else{
                task(hm2);
            }
        }
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
    
    public static void flow((HashMap<String,Object> hm1){
        private String type;
    }
    
    public static void TaskFunction(HashMap<String,String> hm1,HashMap<String,String> hm2){
        
        Date date=new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        try{
            //Before
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter("logfile.txt", true));
			fileWriter.append(formatter.format(date));
            fileWriter.append(";"+data.getKey(hm1)+" "+"Entry");
            fileWriter.newLine();
            fileWriter.append(formatter.format(date));
            fileWriter.append(";"+data.getKey(hm1)+"."+data.getKey(hm2)+" "+"Entry");
            fileWriter.newLine();
            fileWriter.append(formatter.format(date));
            fileWriter.append(";"+data.getKey(hm1)+"."+data.getKey(hm2)+" "+"Executing TimeFunction "+"("+hm2.get("Inputs").get("FunctionInput")+", "+hm2.get("Inputs").get("ExecutionTime"));
            fileWriter.newLine();
			fileWriter.close();
            
            //Make computer sleep for sometime
            Thread.sleep(hm2.get("Inputs").get("ExecutionTime")*1000);

            //After
            BufferedWriter fileWriter2 = new BufferedWriter(new FileWriter("logfile.txt", true));
            fileWriter2.append(formatter.format(date));
            fileWriter2.append(";"+data.getKey(hm1)+"."+data.getKey(hm2)+" "+"Exit");
            fileWriter2.newLine();
            fileWriter2.close();
        }
		catch(IOException e){
            e.printStackTrace();
        }
    
    }
