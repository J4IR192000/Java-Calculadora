/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
/**
 *
 * @author J4IR192000
 */
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Calculadora {

    private static void prinln(String hola) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner reader = new Scanner(System.in);
//        int n1=10,n2,r;
//        System.out.println("Escribe el valor de n1");
//        n1 = reader.nextInt();
//        System.out.println("n1 vale: "+n1);
//        System.out.println("Escribelo de nuevo");
//        n1 = reader.nextInt();
//        System.out.println("n1 vale: "+n1);
//        System.out.println("Escribe otro numero");
//        n2 = reader.nextInt();
//        r=n1+n2;
//        System.out.println("La suma da como resultado: "+r);
        try {
            UIManager.setLookAndFeel( new FlatIntelliJLaf() );
            UIManager.put( "Button.arc", 100 );
        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Failed to initialize LaF");
        }
        Interfaz obj = new Interfaz();
        obj.setVisible(true);
    }
    
}
