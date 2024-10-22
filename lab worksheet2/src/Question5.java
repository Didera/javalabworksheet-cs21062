import java.util.StringTokenizer;

public class Question5 {

    public static void main(String[] args) {
        // Input sentence
        String sentence = "A man, a plan, a canal, Panama!";

        // Check if the sentence is a palindrome
        if (isPalindrome(sentence)) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }

    // *** Method *** to check if a sentence is a palindrome
    public static boolean isPalindrome(String sentence) {
        // Used to remove  all punctuations and then convert every letter to lowercase
        String cleanedSentence = cleanSentence(sentence);

        // Create a StringTokenizer to split the cleaned sentence into words
        StringTokenizer tokenizer = new StringTokenizer(cleanedSentence, " ");

        // Concatenate all words into one string
        StringBuilder forward = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            forward.append(tokenizer.nextToken());
        }

        // Reverse the concatenated string
        String reversed = forward.reverse().toString();

        // Compare the cleaned concatenated sentence with its reverse
        return cleanedSentence.equals(reversed);
    }

    // Method to clean the sentence by removing non-alphabetical characters and converting to lowercase
    public static String cleanSentence(String sentence) {
        // Replace all non-alphabetic characters with an empty string and convert to lowercase
        return sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }
}