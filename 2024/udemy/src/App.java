import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int original = 1;
        String str = "lalala"; // String, Integer, Double, etc, son inmutables
        metodo1(original);
        System.out.println(original);
        metodo2(str);
        System.out.println(str);
        int[] arreglo = {1,2,3};
        metodo3(arreglo);
        System.out.println(arreglo[0]);
    }

    public static void metodo1(int valor){
        valor = valor + 10;
        System.out.println("el nuevo valor es: " + valor);
    }
    public static void metodo2(String valor){
        valor = valor.concat("string adicional");
        System.out.println("el nuevo valor es: " + valor);
    }
    public static void metodo3(int[] valor){
        valor[0] = 98;
        System.out.println("el nuevo valor es: " + valor[0]);
    }
}

