package re.java;

public class getWord {

    public static String getShortestWord (String word1, String word2) {
        if (word1.length() < word2.length()) {
            return word1;
        } else {
            return word2;
        }
    }
}
