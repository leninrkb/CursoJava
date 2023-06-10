import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Integer entero = 123;
        Long largo = 1233123L;
        Double doble = 123.2;
        Float flotante = 123.22F;
        Byte byte1 = (byte) 234;
        Byte byte12 = 127;
        Short sh = 23;
        String cadena = "asd";

        int asd;
        float aswd ;
        double asdasd;
        char qwdas;
        byte sfsdf;
        var sadasd = 312312;

        //soutv
        System.out.println("cadena = " + cadena);

        String nombre = JOptionPane.showInputDialog(null, "ingresa tu nombre");
        JOptionPane.showMessageDialog(null, "tu nombre es " + nombre);
        System.out.println("tu nombre es = " + nombre);
        char[] caars=nombre.toCharArray();
        System.out.println("caars = " + caars);

    }
}