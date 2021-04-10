package Tugas_PBO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tugas_2_Product {
    
    Scanner a = new Scanner(System.in);
    int data;

    int[] nomor = new int[100];
    String[] nama = new String[100];
    int[] harga = new int[100];
    int[] stok = new int[100];
    int[] nilai = new int[100];

    public Tugas_2_Product() {

    }

    private void inputData() {
        try {
            for (int i = 0; i < data; i++) {
                System.out.println("\nNomor Produk = " + (i + 1));
                System.out.print("\nInput Nama Produk, tekan 0 Jika Ingin Batal : ");

                a.nextLine();
                nomor[i] = i + 1;
                nama[i] = a.nextLine();

                if (nama[i].equals("0")) {
                    break;
                }

                System.out.print("\nHarga Produk\t : ");
                harga[i] = a.nextInt();
                System.out.print("\nStok Produk\t : ");
                stok[i] = a.nextInt();
                nilai[i] = stok[i] * harga[i];
            }
        } catch (InputMismatchException e) {
            System.out.println("\nERROR: Inputan Harus Angka!");
            a.nextLine();
            menu();
        }
    }

    public void menu() {
        do {
            System.out.print("\n=== Inventory Project ===");
            System.out.print("\nInput Nomor Produk\t : ");
            data = a.nextInt();

            if (data <= 0) {
                System.out.println("\nERROR: Input lebih dari 0");
            } else {
                inputData();
            }
        } while (data <= 0);
    }

    public void getDataValue() {
        for (int i = 0; i < data; i++) {
            System.out.println("\n=== Output ====");
            System.out.println("Item Number\t : " + nomor[i]);
            System.out.println("Product Names\t : " + nama[i]);
            System.out.println("Product Price\t : " + harga[i]);
            System.out.println("Product Stock\t : " + stok[i]);
            System.out.println("Count\t : " + nilai[i]);
        }
    }  
}
