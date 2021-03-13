package Tugas_PBO;

import java.util.Scanner;

public class Tugas_1 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
	float Gallons;
        
	float count;
        
        System.out.println("Konversi satuan Liter Galon");
		
	System.out.print("\nMasukkan Jumlah Galon : ");
        
	Gallons = scan.nextFloat();
        
	count = Gallons * 3.785f;
        
	System.out.printf("%.1f Galon = %.2f Liter \n\n", Gallons, count);
                
    }

}
