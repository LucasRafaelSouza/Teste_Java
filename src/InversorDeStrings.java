import javax.swing.*;
import java.util.Scanner;

public class InversorDeStrings {
    public static void main(String[] args) {


        String palavra = JOptionPane.showInputDialog("Escolha uma palavra:");
        System.out.println("A palavra invertida e:");
        System.out.println(inverteStrings(palavra));

    }

    public static String inverteStrings(String palavra){
        String palavraReversa = "";
        for (var i = palavra.length() - 1; i >= 0; i--) {
            palavraReversa =  palavraReversa.concat(String.valueOf(palavra.charAt(i)));

        }
        return  palavraReversa;


    }
}
