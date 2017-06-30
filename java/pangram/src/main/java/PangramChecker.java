public class PangramChecker {

    public boolean isPangram(String input) {
        char[] remainingAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int charIndex = 0;

        while (remainingAlphabet.length > 0 && charIndex < input.length()) {
            if (contains(remainingAlphabet, Character.toLowerCase(input.charAt(charIndex)))) {
                remainingAlphabet = removeChar(remainingAlphabet, Character.toLowerCase(input.charAt(charIndex)));
            }

            charIndex++;
        }

        return remainingAlphabet.length == 0;
    }

    private boolean contains(char[] s, char c) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == c) {
                return true;
            }
        }

        return false;
    }

    private char[] removeChar(char[] remaining, char c) {
        String result = "";

        for (int i = 0; i < remaining.length; i++) {
            if (c != remaining[i]) {
                result += remaining[i];
            }
        }

        return result.toCharArray();
    }
}
