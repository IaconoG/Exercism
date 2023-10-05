import java.lang.reflect.Array;

class ReverseString {

    String reverse(String inputString) {
        // Si la palabra esta vacia devolvemos una cadena vacia
        if (inputString.length() == 0)
            return "";

        // Creamos una nueva variable que almacene el input dado vuelta
        String reverseInputString = "";
        // Recoremos en reversa el input
        for (int i = inputString.length() - 1; i >= 0; i--) {
            // Concatenamos las letras del `inputString` a la nueva variable
            reverseInputString += inputString.charAt(i);
            // `.charAt(idx)` -> retorna un char en el indice especificado
        }

        return reverseInputString;
    }

}
