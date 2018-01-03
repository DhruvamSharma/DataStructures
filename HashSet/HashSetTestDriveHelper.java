import java.util.*;
import java.io.*;

public class HashSetTestDriveHelper {
    HashSet<SongsData> songsList= new HashSet<SongsData>();

    public void inputData() {
        try {
            File file = new File("SongsList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ( ( line = reader.readLine()) != null ) {
                addSong(line);
            }  
            System.out.println(songsList);
            /* Sorting the set */
            //Collections.sort(songsList);
            
        } catch(Exception exception) {
            exception.printStackTrace();
        }   

    }

    private void addSong(String line) {
        String[] token = line.split("/");
        songsList.add(new SongsData(token[0], token[1],token[2],token[3]));
    }
}