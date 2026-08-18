package bo.edu.usfx.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Palindromo (construida con TDD)")
class PalindromoTest {

    @Test
    @DisplayName("Ciclo 1: 'reconocer' es palindromo")
    void palabraSimpleEsPalindromo() {
        assertTrue(Palindromo.esPalindromo("reconocer"));
    }

    @Test
    @DisplayName("Ciclo 2: 'hola' no es palindromo")
    void palabraCualquieraNoEsPalindromo() {
        assertFalse(Palindromo.esPalindromo("hola"));
    }

    @Test
    @DisplayName("Ciclo 3: Frase con mayúsculas y espacios es palindromo")
    void fraseConEspaciosYMayusculasEsPalindromo() {
        assertTrue(Palindromo.esPalindromo("Anita lava la tina"));
    }

    @Test
    @DisplayName("Ciclo 4: se ignoran mayusculas y puntuacion")
    void fraseConMayusculasYPuntuacion() {
        assertTrue(Palindromo.esPalindromo("A man, a plan, a canal: Panama"));
    }

    @Test
    @DisplayName("Ciclo 5: la cadena vacia es palindromo")
    void cadenaVaciaEsPalindromo() {
        assertTrue(Palindromo.esPalindromo(""));
    }

    @Test
    @DisplayName("Ciclo 6: null lanza IllegalArgumentException")
    void textoNuloLanzaExcepcion() {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class, () -> Palindromo.esPalindromo(null));
        assertEquals("El texto no puede ser null", ex.getMessage());
    }

    @Test
    @DisplayName("Ciclo 7: se ignoran las tildes")
    void fraseConTildesEsPalindromo() {
        assertTrue(Palindromo.esPalindromo("Amo la paloma"));
    }

    @ParameterizedTest(name = "\"{0}\" SI es palindromo")
    @ValueSource(strings = {"a", "aa", "oso", "Ana", "1221", "Anita lava la tina"})
    void variosPalindromos(String texto) {
        assertTrue(Palindromo.esPalindromo(texto));
    }

    @ParameterizedTest(name = "\"{0}\" NO es palindromo")
    @ValueSource(strings = {"ab", "hola", "Java", "1231", "casa de campo"})
    void variosNoPalindromos(String texto) {
        assertFalse(Palindromo.esPalindromo(texto));
    }

}
