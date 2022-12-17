package aa.first_phrase;

public class OperadoresAritmeticos {


    public static void main(String[] args) {
        OperadoresAritmeticos();

    }
    public static void OperadoresAritmeticos(){


        //Operadores Aritmeticos

        int numero1 = 10;
        int numero2 = 20;


        int resultadoSuma = numero1 + numero2;

        System.out.println("ResultadoSuma:" + resultadoSuma);
        System.out.println("ResultadoSuma: " + resultadoSuma    + 5.77);

        //Comparacion

        boolean resultado1 =  numero1 > numero2;
        System.out.println("Resultado booleano:" + resultado1);

        boolean resultado2 =  numero1 < numero2;
        System.out.println("Resultado booleano:" + resultado2);


        //Operadores Logicos
        //and &&
        //or ||

        boolean resultado3 = numero1 > 5 && numero1 <30;

        int edad =17;

        boolean carnetJoven =edad >= 15 && edad <= 26;

    }
}
