package com.mycompany.calculadora;
import javax.swing.*;
public class Calculadora {
    public static void main(String[] args) {
        Main operaciones = new Main(); 

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        int opcion = JOptionPane.showOptionDialog(null, 
                "Selecciona una operación:", 
                "Calculadora Básica", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, 
                null, 
                opciones, 
                opciones[0]);

        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el primer número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el segundo número:"));

        double resultado;

        try {
            switch (opcion) {
                case 0:
                    resultado = operaciones.sumar(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case 1:
                    resultado = operaciones.restar(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case 2:
                    resultado = operaciones.multiplicar(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                case 3:
                    resultado = operaciones.dividir(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
