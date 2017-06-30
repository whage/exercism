public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        String result = "";

        for (int i = 0; i < dnaStrand.length(); i++) {
            char current = dnaStrand.charAt(i);

            switch (current) {
                case 'G':
                    result += 'C';
                    break;
                case 'C':
                    result += 'G';
                    break;
                case 'T':
                    result += 'A';
                    break;
                case 'A':
                    result += 'U';
                    break;
            }
        }

        return result;
    }
}