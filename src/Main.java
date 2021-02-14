import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] wordArray = {"dogs", "toys","sun","plants", "time"};

        Vocab vocab1 = new Vocab();
        System.out.println("Number of words in wordArray not found at theVocab array is/are = " +vocab1.countNotInVocab(wordArray));
        System.out.println("Words found not in theVocab is/are = " + Arrays.toString(vocab1.notInVocab(wordArray)));
    }
}
