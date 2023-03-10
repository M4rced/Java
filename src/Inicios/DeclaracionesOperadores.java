package Inicios;

public class DeclaracionesOperadores {
    public static void main(String[] args){
        int a = 5;
        int b;
        b = 7;
        int c= b+a;
        c++; // valor incremental metodo 1
        c+=2; // valor incremenal determinado metodo 2
        //En este caso como c se esta incrementando en 2 veces primero+1 y luego +2, c sera igual a 15
        System.out.println(c);
    }
}
