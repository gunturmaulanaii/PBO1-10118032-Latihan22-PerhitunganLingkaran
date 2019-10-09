/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Menghitung Jari",Luas dan Keliling Lingkaran
 */
public class PBO110118032Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("***********Perhitungan Lingkaran***********");
	System.out.print("Masukkan Nilai Diameter Lingkaran : ");
	Scanner scanner = new Scanner(System.in);
	double diameter = 0;
	while (!scanner.hasNextDouble()){
		System.out.println("Nilai Diameter Tidak Sesuai");
		System.out.print("Masukkan Nilai Diameter Lingkaran : ");
		scanner.next();
	}
	diameter = scanner.nextDouble();
	System.out.println("***********Hasil Perhitungan Lingkaran***********");
	System.out.println("Jari-jari Lingkaran = " + (diameter/2) + " cm");
	System.out.println("Luas Lingkaran = " + (3.14*(diameter/2)*(diameter/2)) + " cm");
	System.out.println("Keliling Lingkaran = " + (3.14*diameter) + " cm");
    }
    
}
