//* StringBuilder -> mutable string
//* Character -> clase que contiene metodos estaticos para trabajar con caracteres

class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder cleanIdentifier = new StringBuilder();
            
        boolean capitalize = false;

        for(int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
                // charAt() -> devuelve el caracter en la posicion i

            //* 1. Replace any spaces encountered with underscores
            if (Character.isSpace(c) && c != '\r')
                // isSpace() -> devuelve true si es un espacio
                // \r -> carriage return es tomado como espacio
                cleanIdentifier.append("_");
                    // append() -> agrega al final del stringbuilder

            //* 2. Replace control characters with the upper case string "CTRL"
            else if (Character.isISOControl(c)) 
                cleanIdentifier.append("CTRL"); // Cambimaos el unicode por CTRL

            //* 3. Convert kebab-case to camelCase
            else if (c == '-')
                capitalize = true;

            //* 4. Omit characters that are not letters
            else if (Character.isLetter(c)) {
                    // isLetter() -> devuelve true si es una letra

                //* 5. Omit Greek lower case letters
                    // las letras griegas son tomadas como letras.
                if (!Character.UnicodeBlock.GREEK.equals(Character.UnicodeBlock.of(c)) || !Character.isLowerCase(c)) {
                    // UnicodeBlock.GREEK -> bloque unicode de las letras griegas
                    // UnicodeBlock.of() -> devuelve el bloque unicode al que pertenece el caracter

                        // teniendo en cuenta si hubo un guion del medio previo
                    if (capitalize) {
                        cleanIdentifier.append(Character.toUpperCase(c));
                        capitalize = false;
                    } else {
                        cleanIdentifier.append(c);
                    }
                }
            }
        }
        return cleanIdentifier.toString();
    }
}

