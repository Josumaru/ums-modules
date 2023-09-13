package modules;

import java.util.Map;
import java.util.HashMap;

public class MapModules {
    public static void main(String args[]) {
        if (args.length == 0) {
            String helpCommand = """
                    usage : java -jar --enable-preview com.datacomunication.jar -m <modules> -l <languange>
                    -h              Show this help
                    -m, --modules   Show modules    :
                                    1      Show module 1 (Introduction to Data Communication)
                    -l, --language  Change language :
                                    id (default)
                                    en (comming soon)
                    """;
            System.out.println(helpCommand);
        }

        Map<String, Modules> modules = new HashMap<>();

        modules.put("1", new Modules(
                1,
                """
                        Komunikasi adalah mengirimkan suatu data dari satu sumber ke sumber yang lain.

                        seberapa besar data yang dikirimkan, apa saja atau informasi apa saja yang
                        disematkan di data.

                        Jaringan dan internet = berkaitan dengan infrastruktur atau semua perangkat
                        yang dapat digunakan untuk mengirimkan suatu data ke tempat lain

                        Bagaimana memindahkan suatu data ke titik lain menggunakan suatu perangkat
                        untuk memindahkan data tersebut

                        Trend :
                        1.  Trafic yang tinggi, saat trafic tinggi maka jaringan yang stabil harus diperhatikan.
                        2.  Pengembangan layanan baru
                        3.  Kemajuan teknologi

                        Awal internet militer >> umum kalangan tertentu >> perkotaan > perdesaan.

                        Perubahan ............
                        1.  Muncul LAN berkecapan tinggi
                        2.  Kebutuhan WAN company untuk berkomunikasi data dengan perangkat diluar LAN. LAN melibatkan perorangan namun WAN harus membutuhkan seorang pengelola
                        WAN untuk mendapatkan ijin di tempat umum atau melibatkan persuhahaan lain.
                        3. Elektronik digital. Semua data analog diubah menjadi digital. Contoh suara
                        telp analog diubah menjadi digital

                        Model Komunikasi:
                        ada 3 bagian untuk berkomunikasi data
                        1. Source system
                        -- Source = membangkitkan data yn akan depertukarkan
                        -- Transmiter (Modem) = merubah data menjadi sinyal dari source (data digital
                        menjadi signal) untuk di trans
                        2. Transmition system
                        -- Transmition System = mentransmisikan sinyal (didital ditransmisikan ke
                        didital dan kebalikannya) yang di transmisikan tetpa analog karena umumnya
                        hanya supot analog >> diberikan ke Receiver
                        3. Destination System
                        -- Receiver (Modem) = sinyal yang diterima diubah menjadi data
                        -- Destination (Server) = data yang diterima receiver di olah dan di baca

                        Tugas Komunikasi:
                        1. Transmition system Utilization
                        --berfungsi terkait dengan efisiensi bagaimana mengefisiensi perangkat yang
                        terlibat
                        -- Kerja sama antar unit atau perangkat yang tergabung dalam sebuah system
                        (inter anu bilitas) bagaiman agar efisien
                        2. Interfacing
                        -- Antarmuka / penguhung antar perangkat (Workstation modem dihubungkan oleh
                        kabel >> connector di modem dan computer adalah Interface)
                        -- System digital akan bangkit ketika sinyal diberikan / dibangkitkan
                        3. Signal Generation
                        -- Media pembagkit sinyal
                        -- 2 jenis Komunikasi udara dan kabel
                        -- Sinyal yang diberikan harus sesuai (electromagnetik harus dengan
                        electromagnetik)
                        --Sinyal FO
                        -- Kable tembaga (sinyal yang dibagkitkan harussama (5v))
                        3. Syncronization
                        -- disisi pengirim dapat mengirim 4 kb namun penerima hanya 2kb maka 2kb kana
                        hilang >> membutuhkan syncronizstion maka dapat mengirim 2x kirim
                        -- Ada kesepakatan jika data sudah diterima maka data harus dibertahukan
                        (200OK, 404) jika rusak maka pengirim bisa kirim ulang
                        4.Exchange Mangement
                        -- Mengelola fitur fitru yang digunakan jka ada field2 yang tidak digunakan
                        maka (pengelolaan terkait fitr2 yang digunkan baik server/client)
                        5. Error detection
                        -- bagian yang mendetksi error, jika error maka tidak membetulkan data error
                        melainkan kirim ulang
                        6. Flow connector
                        -- Mengatur process pengirimana terutama saat error flow error akan mengatur
                        jika ada 3 error maka FC akan mengatur data mana yang akan dikirm ulang (dari
                        awl atau dari error)
                        7. Adressing routing
                        -- jaringan harus memiliki alamat agar dapat berkomunikasi
                        -- ROuting mencari jalur terbaik(jika jalur terbaik terturtp mak)
                        8. Recovery
                        -- Semula router menrecovery menetukan jalur lain
                        9.
                        -- Paket pesan diformat sesuai format tertentu sesuai protocol yang digunakan
                        (TCP/ >> paket diberi header TCP)
                        8. security
                        -- security keamanan perangakat dan data yang ditransmisikan
                        9. Network Management
                        -- pengelolaan jaringan oleh admin

                        Model Komunikasi:
                        data ditransimikan berupa bit stream g(t) berbasis waktu karena tidak memadai
                        maka sinyal berupa analog (source >> s(t) -- receiver r(t))

                        Tranmition Medium
                        ada 2 kable dan udara
                        1. Ada Hybrid FO dan Wireless
                        -- Local Wireless dan keluar pakai FO
                        -- Tembaga yang dibagkitakn adalah 5 volt
                        -- Wireless tidak tahan noise

                        Networking

                        Circuit Swithing
                        -- rangkaian yang sedang berkomunikasi/ rangkaian secara fisik yang terhubung
                        secara langsung dihunbungkan secara logic (input logic) tidak manual (STO
                        jadi berisik)

                        Packet Swithing
                        -- berkembang karena banyak rangkain yang terlibag maka ganti ke Paket sw
                        data dipecah kecil menjadi paket kemuadian paket diberi tanda atau dibungkus
                        denagn header sesuai protokol (alamat tuajauan sumber ukuran error checking
                        dll >> pengiriman tidak berurutan dan sebaliknaya namun akan disusun kembali
                        sesuai urutan) (jika UDP hanya alamat sumber dan tujuan serta ukuran)

                        Frame Relay
                        -- FR adalahinformasi yang disematkan
                        -- Menghilangkan overhead / informasi yang dipandang tidak perlu ()
                        -- Jika satu paket terdiri 10 space jika terlalu banyak informasi yang
                        disematkan akan memakan space (contoh (10 Overhead) : 5 space indormasi 5
                        space data)
                        -- Imbasnya data ditransfer menjadi lebih cepat

                        ATM
                        -- pengiriman tidak paket2 lagi namun kumpulan paket(cels) overhead juga
                        sedikit
                        -- terbentuk rangkaian virtual terjadi ketika di ATM mengirim banyak cels
                        terdiri banyak poaket, cels yang pertama di sedn jarlur tersebut digunakan
                        atau diikuti oleh cels kedua(Circuit Virtual) jika terganggu maka cells akan
                        mencari jalur baru maka cels selanjutnya akan ikut berganti

                        LAN
                        -- 2 jenis ethernet dan nirkabel

                        The internet
                        --
                                        """));

        for (int i = 1; i <= modules.size(); i++) {
            if (args.length > 0 && ((args[0].equals("-m") || args[0].equals("--modules"))
                    && args[1].equals(String.format("%d", i)))) {
                System.out.println(modules.get(String.format("%d", i)));
            } else {
                System.out.print("Something Wrong");
            }
        }
    }
}
