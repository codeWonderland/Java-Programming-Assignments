
public class TextUtility {

    static String pigLatinify(String s) {
        // Split the string along word boundaries
        String[] words = s.split("\\b");
        
        // For each word,
        for (int i = 0; i < words.length; i++) {

            // Take the first letter,
            char c = words[i].toLowerCase().charAt(0);
            
            // Only if it's a letter,
            if (Character.isAlphabetic(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
                    // If it's a vowel, add 'way'
                    words[i] += "way";
                } else {
                    // It's a consonant, so move it to the end and add 'ay'
                    words[i] = words[i].substring(1, words[i].length()) + c + "ay";
                }
            }
        }
        
        // Reassemble the string
        return String.join("", words);
    }
    
}
