/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo.edu.usfx.kata;

/**
 *
 * @author Ruta Binar
 */
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * ESPECIFICACION DEL KATA - PROHIBIDO MODIFICAR ESTE ARCHIVO. Quita UN
 * @Disabled a la vez, en orden, y haz pasar esa prueba.
 */
@DisplayName("Kata: numeros romanos")
public class NumeroRomanoTest {

    @Test
    @DisplayName("Ciclo 1: 1 -> I")
    void unoEsI() {
        assertEquals("I", NumeroRomano.convertir(1));
    }

    
    @Test
    @DisplayName("Ciclo 2: 2 -> II")
    void dosEsII() {
        assertEquals("II", NumeroRomano.convertir(2));
    }

    
    @Test
    @DisplayName("Ciclo 3: 3 -> III")
    void tresEsIII() {
        assertEquals("III", NumeroRomano.convertir(3));
    }

    @Test
    @DisplayName("Ciclo 4: 4 -> IV (regla sustractiva)")
    void cuatroEsIV() {
        assertEquals("IV", NumeroRomano.convertir(4));
    }

    
    @Test
    @DisplayName("Ciclo 5: 5 -> V")
    void cincoEsV() {
        assertEquals("V", NumeroRomano.convertir(5));
    }

    
    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({"6, VI", "8, VIII", "9, IX"})
    void unidadesRestantes(int numero, String esperado) {
        assertEquals(esperado, NumeroRomano.convertir(numero));
    }

    
    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({"10, X", "14, XIV", "40, XL", "58, LVIII", "90, XC"})
    void decenas(int numero, String esperado) {
        assertEquals(esperado, NumeroRomano.convertir(numero));
    }

    
    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({"100, C", "400, CD", "500, D", "900, CM"})
    void centenas(int numero, String esperado) {
        assertEquals(esperado, NumeroRomano.convertir(numero));
    }

    
    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({"1000, M", "1666, MDCLXVI", "1994, MCMXCIV",
        "2026, MMXXVI", "3999, MMMCMXCIX"})
    void numerosCompletos(int numero, String esperado) {
        assertEquals(esperado, NumeroRomano.convertir(numero));
    }

    
    @ParameterizedTest(name = "{0} esta fuera de rango")
    @CsvSource({"0", "-5", "4000"})
    void fueraDeRangoLanzaExcepcion(int numero) {
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> NumeroRomano.convertir(numero));
        assertEquals("El numero debe estar entre 1 y 3999", ex.getMessage());
    }
}
