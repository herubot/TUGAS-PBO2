package TugasPBO;

public class barangkeluar extends barang {

    Integer total_pengeluaran, total_sisaKas;
    String nama1, nama2, nama3, nama4, nama5, jenis1, jenis2, jenis3, jenis4;
    Integer jumlah, harga1, harga2, harga3, harga4, harga5;

    public void listBarang() {

        barangmasuk brg_msk = new barangmasuk();

        total_pengeluaran = 0;
        total_sisaKas = 0;

        nama1 = "Buku Tulis";
        jenis1 = "Buku";
        nama2 = "Buku Gambar";
        jenis2 = "Kertas";
        nama3 = "Kertas A4";
        jenis3 = "Pulpen";
        nama4 = "Pulpen Biru";
        jenis4 = "Pensil";
        nama5 = "Pensil Raut";

        jumlah = 1;

        harga1 = 45000;
        harga2 = 30000;
        harga3 = 40000;
        harga4 = 38000;
        harga5 = 22000;

        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("   *** Pendataan Barang Keluar PT. Garuda Abadi Group ***  ");
        System.out.println("============================================================");
        System.out.println("| Jenis Barang |   Nama Barang   |  Jumlah |     Harga     |");
        System.out.println("============================================================");
        System.out.printf("| %-10s | %-10s  | | %-13s  | | %-10s  |",
                jenis1,
                nama1,
                jumlah,
                harga1);
        System.out.println("");
        System.out.printf("| %-10s | %-10s  | | %-13s  | | %-10s  |",
                jenis1,
                nama2,
                jumlah,
                harga2);
        System.out.println("");
        System.out.printf("| %-10s | %-10s  | | %-13s  | | %-10s  |",
                jenis2,
                nama3,
                jumlah,
                harga3);
        System.out.println("");
        System.out.printf("| %-10s | %-10s  | | %-13s  | | %-10s  |",
                jenis3,
                nama4,
                jumlah,
                harga4);
        System.out.println("");
        System.out.printf("| %-10s | %-10s  | | %-13s  | | %-10s  |",
                jenis4,
                nama5,
                jumlah,
                harga5);
        System.out.println("");
        System.out.println("============================================================");
    }
}