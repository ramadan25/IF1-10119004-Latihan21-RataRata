/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan21.ratarata;
import java.util.Scanner;

import java.util.Scanner;

/**
 *
 * @author ENDOG
 */
public class IF110119004Latihan21RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan Banyaknya Mahasiswa: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Rata-rata: "+rata);
        System.out.println ("Develoved by : Muhamad Ramadan");
        
    }
    
}
