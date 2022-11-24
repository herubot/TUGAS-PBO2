package tugasPBO2;

import java.util.Scanner;

public class datawarga {

    public static void main(String[] args) {
        iuran iuran = new iuran();

        Integer pilih = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.println("          Pendataan dan Pembayaran Iuran Waga       ");
        System.out.println("=====================================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println("");
        System.out.print("PILIHAN MENU : ");
        pilih = sc.nextInt();

        if (pilih == 1) {
            System.out.println("=====================================================");
            System.out.println("*** Data Warga ***");
            System.out.println("Masukan Nama");
            iuran.nama = sc.next();
            System.out.println("Masukan NIK");
            iuran.nik = sc.nextInt();
            System.out.println("Masukan Alamat");
            iuran.alamat = sc.next();
            System.out.println("Masukan No. Tlp");
            iuran.notelp = sc.next();

            System.out.println("=====================================================");
            System.out.println("*** Data Pekerjaan ***");
            System.out.println("Masukan Pekerjaan");
            iuran.pekerjaan = sc.next();
            System.out.println("Masukan Alamat Kantor");
            iuran.alamatKantor = sc.next();

            System.out.println("=====================================================");
            System.out.println("*** Data Status ***");
            System.out.println("Masukan Status");
            iuran.status = sc.next();
            System.out.println("Masukan Nama Suami/Istri");
            iuran.namaPasangan = sc.next();
            System.out.println("Masukan Jumlah Anak");
            iuran.jmlAnak = sc.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("Lanjut Bayar Iuran ? ");
            iuran.opsi = sc.next();

            if (!iuran.opsi.equalsIgnoreCase("ya")) {

                return;
            } else {

                iuran.iuran_menu();
            }

        } else if (pilih == 2) {
            iuran.iuran_menu();
        }
    }
}
