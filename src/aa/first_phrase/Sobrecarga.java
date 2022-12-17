package aa.first_phrase;


/**
 * sobrecarga permite duplicar un metodo siempre y cuando
 * le cambiemos el numero o el tipo de parametro.
 */
public class Sobrecarga {
    public static void main(String[] args) {


    }

    static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }
    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2;
    }
}

