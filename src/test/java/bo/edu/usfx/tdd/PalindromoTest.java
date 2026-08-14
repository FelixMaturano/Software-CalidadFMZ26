package bo.edu.usfx.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertFalse;

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
}