package juegotorreshanoi;

/**
 *
 * @author César Navarrete
 */
import java.util.*;
public class JuegoTorresHanoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Inserte el numero de discos que tendra la Torre: ");

        n = sc.nextInt();

        Hanoi(n,1,2,3);  //1:Origen  2:Auxiliar 3:Destino*/

    }

    //Método Torres de Hanoi Recursivo

    public static void Hanoi(int n, int Origen,  int Auxiliar, int Destino){

      if(n==1){

      System.out.println(n+") Mover disco de origen " + Origen + " a destino "+Destino);

    }else{

         Hanoi(n-1, Origen, Destino, Auxiliar);

         System.out.println(n+")mover disco de "+ Origen + " a " + Destino);
         
         System.out.println("Imprimir el siguiente valor que obtendra n: "+n);
         System.out.println("========================================================");

         Hanoi(n-1, Auxiliar, Origen, Destino);

       }

    } 
}

    

