package bo.edu.usfx.tdd;

import java.text.Normalizer;

/**
 * Verificador de palindromos construido con TDD. Cada linea de esta clase
 * existe porque una prueba la exigio.
 */
public final class Palindromo {

    private Palindromo() {
// clase de utilidad: no se instancia
    }

    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        String limpio = normalizar(texto);
        return limpio.contentEquals(new StringBuilder(limpio).reverse());
    }

    /**
     * Quita tildes, mayusculas, espacios y puntuacion.
     */
    private static String normalizar(String texto) {
        String sinTildes = Normalizer
                .normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
        return sinTildes.toLowerCase().replaceAll("[^a-z0-9]", "");
    }
}
