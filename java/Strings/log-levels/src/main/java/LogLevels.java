public class LogLevels {
    /*
        `substring` -> Devulve una subcadena, entre los valores (int beginIndex, int endIndex). 
            En el caso de no especificar el `endIndex` se asume q es al final de la cadena
        `indexOf` -> Devuelve la posicion de la primera ocurrencia de un caracter o cadena
        `toLowerCase` -> Convierte todos los caracteres de la cadena a minusculas
        `replaceAll("", "")` -> Reemplaza todas las ocurrencias de un caracter o cadena por otro caracter o cadena
            [\\t\\r\\n] -> Reemplaza los caracteres de tabulacion, retorno de carro y nueva linea por una cadena vacia        
        `trim` -> Elimina los espacios en blanco al inicio y al final de la cadena
    */
    public static String message(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        return logLine.replaceAll("[\\t\\r\\n]", "").substring(logLine.indexOf(":")+2).trim();
    }

    public static String logLevel(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
        return logLine.substring(logLine.indexOf("[")+1, logLine.indexOf("]")).toLowerCase();
        // "[ERROR]: Invalid operation" -> "error"
    }

    public static String reformat(String logLine) {
        // throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        return message(logLine)+" ("+logLevel(logLine)+")";
        // "[INFO]: Operation completed" -> "Operation completed (info)"
    }
}
