import javax.swing.*;
import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero:"));

        boolean resultado = calculaFibo(n);
        if (resultado)
            System.out.println("O numero digitado pertence a sequência de fibonacci");
        else
            System.out.println("O numero digitado nao pertence a sequência de fibonacci");

    }

    public static boolean calculaFibo(int num){

    int NumeroRadicado1 =  (int) Math.sqrt(5*num*num+4);
    //System.out.println(Math.sqrt(5*num*num+4));
    int NumeroRadicado2= (int) Math.sqrt(5*num*num-4);
    //System.out.println(Math.sqrt(5*num*num-4));


     return (NumeroRadicado1 * NumeroRadicado1 == (5*num*num+4))||(NumeroRadicado2*NumeroRadicado2==(5*num*num-4));

    }
}