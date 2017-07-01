class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String[] parts = this.phrase.split("-| ");
        String result = "";

        for (String part : parts) {
            result += Character.toUpperCase(part.charAt(0));
        }

        return result;
    }

}
