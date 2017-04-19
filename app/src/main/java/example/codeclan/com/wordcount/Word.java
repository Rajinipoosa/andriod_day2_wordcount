package example.codeclan.com.wordcount;

/**
 * Created by user on 18/04/2017.
 */

public class Word {
    public int getWordCount(String sentence){
        int count = 0;

        if(sentence.charAt(0)!=' '){
            count++;
        }
        for(int i=0;i<sentence.length();i++){
            if((sentence.charAt(i)==' ')){
                count++;
            }
        }
        return count;
    }
}
