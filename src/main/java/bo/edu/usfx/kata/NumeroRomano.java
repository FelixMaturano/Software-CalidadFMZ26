/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo.edu.usfx.kata;

/**
 *
 * @author Ruta Binar
 */
public class NumeroRomano {

    public static String convertir(int numero) {
        // Ciclo 10: Validación de rango (Atrapamos los errores antes de empezar)
        if (numero < 1 || numero > 3999) {
            throw new IllegalArgumentException("El numero debe estar entre 1 y 3999");
        }

        // Definimos todos nuestros bloques de construcción, incluyendo las reglas sustractivas (4, 9, 40, etc.)
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romano = new StringBuilder();

        // Recorremos cada valor de mayor a menor
        for (int i = 0; i < valores.length; i++) {
            // Mientras el número siga siendo mayor o igual al valor que estamos revisando...
            while (numero >= valores[i]) {
                romano.append(simbolos[i]); // Anotamos su símbolo romano
                numero = numero - valores[i]; // Le restamos el valor (Igual que hicimos con el 5)
            }
        }

        return romano.toString();
    }
}