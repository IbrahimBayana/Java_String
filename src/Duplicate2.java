import java.util.LinkedHashSet;

public class Duplicate2 {

    public static void main(String[] args) {


        String input = "AABACCDDA";
        removeDuplicates(input);
    }

    public static void removeDuplicates(String str) {
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        // Convert set back to a string and print
        for (char c : uniqueChars) {
            System.out.print(c);
        }
        System.out.println("uniqueChars = " + uniqueChars);
    }
}
