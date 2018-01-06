import java.util.*;
import java.io.*;

class AnagramsTestDriver {
    private HashMap<String, ArrayList<String>> lettersToWord;
    private HashSet<String> wordSet;
    //private ArrayList<String> tempList = new ArrayList<>();
    public void inputData() {
        try {
            File file = new File("words.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line =null;
            wordSet = new HashSet<>();
            lettersToWord= new HashMap<>();
            while ( (line = reader.readLine()) != null ) {
                wordSet.add(line);
            }
            reader.close();

            //Adding keys and arrayList to hashMap
            extracted();
            System.out.println(lettersToWord);
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

	private void extracted() {
	
        for (String word : wordSet){
            String temp = sortLetters(word);
            if( lettersToWord.containsKey(temp)) {
                
                        if(lettersToWord.get(temp) == null) {
                            //lettersToWord.put(temp, tempList);
                        }
                        ArrayList<String> tempList = lettersToWord.get(temp); 
                       
                        //System.out.println(tempList);
                        if(!tempList.contains(word)) {
                            tempList.add(word);
                            //System.out.println(tempList);
                            lettersToWord.put(temp, tempList);
                        }
                
                 
                

            } else {
                ArrayList<String> templist = new ArrayList<>();
                templist.add(word);
                //System.out.println(lettersToWord.put(temp, templist));
                lettersToWord.put(temp, templist);
                //templist.clear();
            }

            
            //System.out.println(lettersToWord.keySet());
            //tempList.clear();



        }
	}

    private String sortLetters(String word) {
        char[] array = word.toCharArray();
        Arrays.sort(array);
        return new String( array );
    }
}