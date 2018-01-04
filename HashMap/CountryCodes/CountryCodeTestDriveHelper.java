import java.util.*;
import java.io.*;

class CountryCodeTestDriveHelper {

    HashMap<String , String> map = new HashMap<String , String>();
    
    public void inputData() {
        try {
            File file = new File("Codes.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null) {
                addCode(line);
            }
            reader.close();
            //System.out.print(map);
            Scanner sc = new Scanner(System.in);
            String key = sc.nextLine();
            sc.close();
            String value = null;
            if(key.length() <= 3) {
                value = map.get(key);
                if(value != null)
                System.out.println(value);
                else {
                    System.out.println("No Country Found");
                }
            }
            else {
                value = key;
                if (map.containsValue(value)) {
                    for (Entry<String, String> entry : map.entrySet()) {
                        if (entry.getValue().equals(value)) {
                            System.out.println(entry.getKey());
                        }
                    }
                }
                else {
                    System.out.println("No Country Found");
                }
            }

        } catch( Exception ex) {
            ex.printStackTrace();
        }
    }

    

    private void addCode(String line) {
        
        String[] tokens = line.split(" ");
        //System.out.println(tokens[0]);
        String value ="";
        for (String tokenPart : tokens) {
            try {
                Integer.parseInt(tokenPart);
                map.put(tokens[tokens.length-1], value);
            } catch (Exception ex) {
                value+=tokenPart;
                //System.out.print(value);
            }
        }
        
    }
}