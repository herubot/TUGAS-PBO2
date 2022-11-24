package TugasPBO;

import java.util.Scanner;

public class main {
    /**
     * @param args
     */
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        String id = "";
        String namaAdmin;

        Integer nikAdmin;
        Integer pilih = 0, total_jumlah = 0;
        Integer total_harga1 = 0, total_harga2 = 0, total_harga3 = 0, total_harga4 = 0, total_harga5 = 0;
        Integer subTotal = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("--- Distributor PT. Garuda Abadi Group ---");
        System.out.println("============================================");
        System.out.println("");
        System.out.println("Silahkan Masukan ID Anda");
        System.out.println("==========================");
        System.out.print("ID : ");
        id = sc.nextLine();

        if (!id.equalsIgnoreCase("admin123")) {

            System.out.println("");
            System.out.println("ID Anda salah -> " + id);
            System.out.println("");
            System.out.println("");
            System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
            System.out.println("Check, Data dan Antar, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");
            sc.close();
        } else {
            System.out.println("");
            System.out.println("Pilih Check Data Barang : ");
            System.out.println(" 1. Barang Masuk");
            System.out.println(" 2. Barang Keluar");
            System.out.println("");
            System.out.print(" Masukkan Pilihan Data : ");
            pilih = sc.nextInt();

            if (pilih == 1) {

                System.out.println("");
                System.out.println("Silahkan Masukkan Data Anda");
                System.out.println("===========================");
                System.out.print("Nama Admin : ");
                namaAdmin = sc.next();
                System.out.print("Nik Admin : ");
                nikAdmin = sc.nextInt();

                barangmasuk brg_msk = new barangmasuk();
                barangkeluar brg_klr = new barangkeluar();
                brg_msk.listBarang();

                System.out.println("");
                System.out.println("============================================================");
                System.out.print("Pilihan Anda : ");
                pilih = sc.nextInt();

                if (pilih == 0) {
                    System.out.println("Selesai");
                    System.out.println("  Total Pemasukan   =>  Rp. " + brg_msk.total_pemasukan);
                    System.out.println("  Total Pemasukan   =>  Rp. " + brg_msk.total_kas);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");

                    brg_klr.listBarang();

                    System.out.println("");
                    System.out.println("============================================================");
                    System.out.print("Pilihan Anda : ");
                    pilih = sc.nextInt();

                    if (pilih == 1) {
                        System.out.print("Banyaknya Barang yang Keluar = ");
                        total_jumlah = sc.nextInt();
                        System.out.println("Data Tersimpan");
                        total_harga1 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga1;
                        System.out.println("Harga Sebesar = Rp. " + total_harga1);
                        System.out.println("============================================================");
                        return;

                    }

                    else if (pilih == 2) {
                        System.out.print("Banyaknya Barang yang Keluar = ");
                        total_jumlah = sc.nextInt();
                        System.out.println("Data Tersimpan");
                        total_harga2 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga2;
                        System.out.println("Harga Sebesar = Rp. " + total_harga2);
                        System.out.println("============================================================");
                        return;

                    }

                    else if (pilih == 3) {
                        System.out.print("Banyaknya Barang yang Keluar = ");
                        total_jumlah = sc.nextInt();
                        System.out.println("Data Tersimpan");
                        total_harga3 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga3;
                        System.out.println("Harga Sebesar = Rp. " + total_harga3);
                        System.out.println("============================================================");
                        return;

                    }

                    else if (pilih == 4) {
                        System.out.print("Banyaknya Barang yang Keluar = ");
                        total_jumlah = sc.nextInt();
                        System.out.println("Data Tersimpan");
                        total_harga4 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga4;
                        System.out.println("Harga Sebesar = Rp. " + total_harga4);
                        System.out.println("============================================================");
                        return;

                    }

                    else if (pilih == 5) {
                        System.out.print("Banyaknya Barang yang Keluar = ");
                        total_jumlah = sc.nextInt();
                        System.out.println("Data Tersimpan");
                        total_harga5 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga5;
                        System.out.println("Harga Sebesar = Rp. " + total_harga5);
                        System.out.println("============================================================");
                        return;

                    }

                    else if (pilih == 0) {
                        System.out.println("Selesai");
                        subTotal = total_harga1 + total_harga2 + total_harga3 + total_harga4 + total_harga5;
                        System.out.println("Total Pengeluaran   =>  Rp. " + subTotal);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Sisa Kas dari Total Pengeluaran = Rp. "
                                + (brg_msk.total_kas + brg_msk.total_pemasukan - subTotal));
                        System.out.println("");
                        System.out.println("");
                        System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
                        System.out
                                .println("Check, Data dan Antar, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");

                    }

                }

                else if (pilih == 1) {
                    System.out.print("Banyaknya Barang yang masuk = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga1 = (total_jumlah + brg_msk.jumlah) * brg_msk.harga1;
                    System.out.println("Harga Sebesar = Rp. " + total_harga1);
                    System.out.println("============================================================");
                    return;
                } else if (pilih == 2) {
                    System.out.print("Banyaknya Barang yang masuk = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga2 = (total_jumlah + brg_msk.jumlah) * brg_msk.harga2;
                    System.out.println("Harga Sebesar = Rp. " + total_harga2);
                    System.out.println("============================================================");
                    return;
                } else if (pilih == 3) {
                    System.out.print("Banyaknya Barang yang masuk = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga3 = (total_jumlah + brg_msk.jumlah) * brg_msk.harga3;
                    System.out.println("Harga Sebesar = Rp. " + total_harga3);
                    System.out.println("============================================================");
                    return;
                } else if (pilih == 4) {
                    System.out.print("Banyaknya Barang yang masuk = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga4 = (total_jumlah + brg_msk.jumlah) * brg_msk.harga4;
                    System.out.println("Harga Sebesar = Rp. " + total_harga4);
                    System.out.println("============================================================");
                    return;
                } else if (pilih == 5) {
                    System.out.print("Banyaknya Barang yang masuk = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga5 = (total_jumlah + brgmsk.jumlah) * brgmsk.harga5;
                    System.out.println("Harga Sebesar = Rp. " + total_harga5);
                    System.out.println("============================================================");
                    return;
                } else {

                }

            } else if (pilih == 2) {
                barangmasuk brg_msk = new barangmasuk();
                barangkeluar brg_klr = new barangkeluar();

                System.out.println("");
                System.out.println("");
                System.out.println("");

                brg_klr.listBarang();

                System.out.println("");
                System.out.println("============================================================");
                System.out.print("Pilihan Anda : ");
                pilih = sc.nextInt();

                if (pilih == 1) {
                    System.out.print("Banyaknya Barang yang Keluar = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga1 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga1;
                    System.out.println("Harga Sebesar = Rp. " + total_harga1);
                    System.out.println("============================================================");
                    return;

                }

                else if (pilih == 2) {
                    System.out.print("Banyaknya Barang yang Keluar = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga2 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga2;
                    System.out.println("Harga Sebesar = Rp. " + total_harga2);
                    System.out.println("============================================================");
                    return;

                }

                else if (pilih == 3) {
                    System.out.print("Banyaknya Barang yang Keluar = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga3 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga3;
                    System.out.println("Harga Sebesar = Rp. " + total_harga3);
                    System.out.println("============================================================");
                    return;

                }

                else if (pilih == 4) {
                    System.out.print("Banyaknya Barang yang Keluar = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga4 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga4;
                    System.out.println("Harga Sebesar = Rp. " + total_harga4);
                    System.out.println("============================================================");
                    return;

                }

                else if (pilih == 5) {
                    System.out.print("Banyaknya Barang yang Keluar = ");
                    total_jumlah = sc.nextInt();
                    System.out.println("Data Tersimpan");
                    total_harga5 = (total_jumlah - brg_msk.jumlah) * brg_msk.harga5;
                    System.out.println("Harga Sebesar = Rp. " + total_harga5);
                    System.out.println("============================================================");
                    return;

                }

                else if (pilih == 0) {
                    System.out.println("Selesai");
                    subTotal = total_harga1 + total_harga2 + total_harga3 + total_harga4 + total_harga5;
                    System.out.println("  Total Pengeluaran   =>  Rp. " + subTotal);
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("  Sisa Kas dari Total Pengeluaran = Rp. "
                            + (brg_klr.total_sisaKas + brg_msk.total_pemasukan - subTotal));
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
                    System.out.println("Check, Data dan Antar, Ketelitian Anda dalam Administrasi di Utamakan (*_*)");

                }

            } else {
            }
        }

    }

}