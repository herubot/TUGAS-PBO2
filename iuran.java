package com.example;
import java.util.Scanner;

/**
     * Rivanda Putra Pratama Surahman
     * 202043500136
     * X5F
     */
    
public class iuran {
    
    Integer sampah,keamanan,sumbangan;
    String opsi;
    String nama;
    String alamat;
    String notelp;
    String pekerjaan;
    String alamatKantor;
    String status;
    String namaPasangan;
    Integer nik;
    Integer jmlAnak;

    public void iuran_menu() {

        Scanner sc = new Scanner(System.in);


        System.out.println("");
        System.out.println("");
        System.out.println("=====================================================");
        System.out.println("*** Data Iuran Pokok ***");
        System.out.println("NIK     => "+nik);
        System.out.println("Masukan Iuran Sampah");
        sampah = sc.nextInt();
        System.out.println("Masukan Iuran Keamanan");
        keamanan = sc.nextInt();
        System.out.println("");
        System.out.println("*** Data Iuran Sekunder ***");
        System.out.println("Masukan Sumbangan");
        sumbangan = sc.nextInt();
        System.out.println("Lanjut Bayar Iuran ? ");
        opsi = sc.next();
        
        if (!opsi.equalsIgnoreCase("tidak") ) {
            return;
        }
        else {

            System.out.println("");
            System.out.println("");
            System.out.println("||NIK                            || "+nik);
            System.out.println("||Total Pembayaran Iuran Warga   || "+(sampah+keamanan+sumbangan));
            System.out.println("Terimakasih "+nama+" Iuran Anda sudah di Bayarkan");

        }


    }
}
