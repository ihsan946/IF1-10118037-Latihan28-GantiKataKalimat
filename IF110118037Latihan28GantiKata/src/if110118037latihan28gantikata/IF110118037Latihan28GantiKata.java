/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan28gantikata;
import java.util.Scanner;
/**
 * @author Muhammad Ihsan
 * NAMA       : Muhammad Ihsan
 * KELAS     : IF-1
 * NIM          : 10118037
 * Deskripsi Program   : Program ini berisi program mengganti kata dari sebuah kalimat
 *                                       
 */
public class IF110118037Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimatAwal;
        String kalimatBaru;
        String gantiKata;
        String kataBaru;
        
        //input
        System.out.println("_____PROGRAM MENGGANTI KATA_____");
        System.out.print("Masukkan Kalimat\t: ");
        Scanner tempKalimat = new Scanner(System.in);
        kalimatAwal = tempKalimat.nextLine();
        
        System.out.print("Ganti Kata\t\t: ");
        Scanner tempGkata = new Scanner(System.in);
        gantiKata =  tempGkata.nextLine();
        
        System.out.print("Menjadi Kata\t\t: ");
        Scanner tempBkata = new Scanner(System.in);
        kataBaru = tempBkata.nextLine();
        System.out.println();
        
        //output
        kalimatBaru = kalimatAwal.replaceAll(gantiKata,kataBaru);
        System.out.println("******HASIL FORMATTING******");
        System.out.println("Kalimat awal  : " + kalimatAwal);
        System.out.println("Kalimat baru  : " + kalimatBaru);
        
      
    }
    
}
