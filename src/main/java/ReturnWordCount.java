
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int availableWordCount = in.replaceAll("[^ ]", "").length(); //returns the count of available whitespaces
        return availableWordCount += 1; // adding 1 because last word does not have a space at the end.
    }
}
