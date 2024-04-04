import java.util.HashMap;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String str = "Hello, world!";
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) { // Ignore non-letter characters
                c = Character.toLowerCase(c); // Convert to lowercase to ignore case sensitivity
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
        }
        System.out.println("Duplicate characters:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + ": " + charCountMap.get(c) + " times");
            }
        }
    }
}