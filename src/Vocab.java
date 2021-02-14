// Programmer: Mr. Tarazi, ASK HS Technology Teacher
// Date: 02/13/2021
// RFQ Problem

import java.util.ArrayList;

public class Vocab {

    private String[] theVocab = {"time", "food", "dogs", "cats", "health", "plants", "sports"};

    public boolean findWord(String str) {

        for (int i=0; i<theVocab.length; i++) {
            if (theVocab[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    // (Part - A) Counts how many strings in wordArray are not found in theVocab, as described in part (a)
    public int countNotInVocab(String[] wordArray) {

        int count = 0;      // Count the number of word found

        for (int i=0; i<wordArray.length; i++) { // Loop using wordArray to go over theVocab
            if(!findWord(wordArray[i])) {
                count++;
            }
        }
        return count;
    }

    // (Part - B) Returns an array containing strings from wordArray not found in theVocab
    public String[] notInVocab(String[] wordArray) {

        // Create new Array with a length equals to the counter of words not in the vocabulary
        String[] newArray = new String[countNotInVocab(wordArray)];

        // Index variable for the new Array
        int index = 0;

        // Loop through the array and add the words not found in theVocab to newArray
        for (int i=0; i< wordArray.length; i++){
            if(!findWord(wordArray[i])) {
                newArray[index] = wordArray[i];
                index++;
            }
        }
        return newArray;
    }
}
