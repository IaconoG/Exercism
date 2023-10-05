class MicroBlog {

    //** NO PUEDO RESOLVER LOS INPUT CON EMOJIS */
    //* TODO: Investigar como trabajar los emojis en un string */

    public String truncate(String input) {
        int maxChar = 5;
        if (input.length() <= maxChar)
            return input;

        String truncateInput = "";

        // Si el input tiene mas de 5 caracteres truncamos

        for (int i = 0; (i < input.length() && i < maxChar); i++) {
            char currentChar = input.charAt(i);
            truncateInput += currentChar;
        }
        return truncateInput;
    }
}
