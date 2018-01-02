import java.util.*;
import java.io.*;

public class ArrayListTestDriveHelper2 {
    ArrayList<SongsData> arrayList = new ArrayList<SongsData>();
    
    public void inputData(){
        try{
            File file = new File("SongsList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line=reader.readLine())!=null){
                addSong(line);
            }
            reader.close();
            Collections.sort(arrayList);
            System.out.println(arrayList);

            TitleComparator titleComparator = new TitleComparator();
            Collections.sort(arrayList, titleComparator);
            System.out.println(arrayList);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addSong(String line) {
        String[] tokens = line.split("/");
        arrayList.add(new SongsData(tokens[0],tokens[1],tokens[2],tokens[3]));
    }

    /* Comparator Implementation for comparing Title */
    class TitleComparator implements Comparator<SongsData> {
        public int compare(SongsData one, SongsData two) {
            return one.getTitle().compareTo(two.getTitle());
        }
    }
}