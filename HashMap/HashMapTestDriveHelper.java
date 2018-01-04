import java.util.*;
import java.io.*;

public class HashMapTestDriveHelper {
    HashMap<Integer,SongsData> songsList= new HashMap<Integer,SongsData>();
    Integer count =0;
    public void inputData() {
        try {
            File file = new File("SongsList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ( ( line = reader.readLine()) != null ) {
                addSong(line);
            }  
            System.out.println(songsList);
            reader.close();
            /* Sorting the set */
            //Collections.sort(songsList);
            
        } catch(Exception exception) {
            exception.printStackTrace();
        }   

    }

    private void addSong(String line) {
        String[] token = line.split("/");
        songsList.put(++count,new SongsData(token[0], token[1],token[2],token[3]));
    }
}