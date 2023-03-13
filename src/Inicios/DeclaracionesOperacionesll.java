package Inicios;

public class DeclaracionesOperacionesll {
    public static void main(String[] args) {
        //Conversor de cm a pulgada con la implementación de constantes
        final double pulgada = 2.54; //Declaracion de una constante se hace con el final
        double cm = 6;
        double resultado = cm / pulgada;
        System.out.println("En " + cm + "cm hay " + resultado + "pulgadas");
    }
}
