
package srednjavrednost;

import java.util.Scanner;

public class SrednjaVrednost {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Koliko elemanata cete uneti? ");
        int n = s.nextInt();
        
        int[] niz = new int[n];
        
        for (int i = 0; i <niz.length ; i++){
            System.out.println("Unesite sledeci broj: ");
            niz[i] = s.nextInt();
        }
        
        int suma = 0;
        
        for (int i = 0 ; i<niz.length; i++){
            suma += niz[i];
        }
        
        double srednjaVrednost = 1.0 * suma / niz.length;
        
        System.out.println("Srednja vrednost je: " + srednjaVrednost);
    }
    
}
