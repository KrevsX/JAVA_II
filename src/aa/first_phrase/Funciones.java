package aa.first_phrase;

public class Funciones {
    public static void main(String[] args) {
//        Opcion 1: funcion sin parametros
        ShowMenu();

//        Opcion 2: funcion sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrices();
        System.out.println(price);

//        Opcion 3: funcion con parametros de tipo retorno

        imprimirSaludoBuenosDias("OpenBootcamp");


//        Opcion 4: funcion con parametros y con tipo de retorno

        String nombre = "Kevin";
        String apellido = "McIntyre";
        String saludo = ObtenerSaludo(nombre, apellido);
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);

    }

    static int suma(int numero1 , int numero2){
        return numero1 + numero2;
    }

    static String ObtenerSaludo(String nombre, String apellido) {
        return "Buenas Tardes" + nombre + "" + apellido;
    }


    static void imprimirSaludoBuenosDias(String name) {
        System.out.println("Buenas Tardes" + name);
    }

    static double getPrices() {
        return 100.99;
    }

    public static void ShowMenu() {
        System.out.println("Bienvenidos al E=comerce");
        System.out.println("1- Ver Zapatillas");
        System.out.println("2- Comprar Zapatillas");
        System.out.println("Salir");
    }

    static String getMenu(){
        System.out.println("Imprimiendo texto prueba");
        return "Bienvenidos al E-Comerces de Zapatillas: \n1-Ver Zapatillas....";
    }
}
