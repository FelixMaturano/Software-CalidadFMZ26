package bo.edu.usfx.tdd;

public class Palindromo {
    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        // Quita espacios en blanco y convierte todo a minúsculas
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(limpio).reverse().toString();
        
        return limpio.equals(invertido);
    }
}