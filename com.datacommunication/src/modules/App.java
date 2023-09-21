package modules;

import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String args[]) {
        String redColor = "\u001B[31m";
        String whiteColor = "\u001B[0m";

        if (args.length == 0) {
            String helpCommand = """
                    usage : java -jar --enable-preview com.datacomunication.jar -m <modules> -l <languange>

                    -h              Show this help
                    -m, --modules   Show modules    :
                                    1      Show module 1 (Introduction to Data Communication)
                    -l, --language  Change langua>ge :
                                    id (default)
                                    en (comming soon)
                    """;
            System.out.println(helpCommand);
        }

        Map<String, Modules> modules = new HashMap<>();

        modules.put("1", new Modules(
                1,
                """
                        \u001B[31mKomunikasi adalah mengirimkan suatu data dari satu sumber ke sumber yang lain.

                        Seberapa besar data yang dikirimkan, apa saja atau informasi apa saja yang
                        disematkan di data.

                        Jaringan dan internet = berkaitan dengan infrastruktur atau semua perangkat
                        yang dapat digunakan untuk mengirimkan suatu data ke tempat lain

                        Bagaimana memindahkan suatu data ke titik lain menggunakan suatu perangkat
                        untuk memindahkan data tersebut\u001B[0m

                        Trend :
                            1.  Trafic yang tinggi, saat trafic tinggi maka jaringan yang stabil harus diperhatikan.
                            2.  Pengembangan layanan baru
                            3.  Kemajuan teknologi

                        Awal internet militer >> umum kalangan tertentu >> perkotaan > perdesaan.

                        Perubahan ............
                            1.  Muncul LAN berkecapan tinggi
                            2.  Kebutuhan WAN company untuk berkomunikasi data dengan perangkat diluar LAN. LAN melibatkan perorangan namun WAN harus membutuhkan seorang pengelola
                                WAN untuk mendapatkan ijin di tempat umum atau melibatkan persuhahaan lain.
                            3.  Elektronik digital. Semua data analog diubah menjadi digital. Contoh suara
                                telp analog diubah menjadi digital

                        Model Komunikasi:
                        Ada 3 bagian untuk berkomunikasi data
                            1.  Source system
                                --  Source = membangkitkan data yn akan depertukarkan
                                --  Transmiter (Modem) = merubah data menjadi sinyal dari source (data digital
                                    menjadi signal) untuk di trans
                            2.  Transmition system
                                --  Transmition System = mentransmisikan sinyal (didital ditransmisikan ke
                                    didital dan kebalikannya) yang di transmisikan tetap analog karena umumnya
                                    hanya supot analog >> diberikan ke Receiver
                            3.  Destination System
                                --  Receiver (Modem) = sinyal yang diterima diubah menjadi data
                                --  Destination (Server) = data yang diterima receiver di olah dan di baca

                        Tugas Komunikasi:
                            1.  Transmition system Utilization
                                --  Berfungsi terkait dengan efisiensi bagaimana mengefisiensi perangkat yang
                                    terlibat
                                --  Kerja sama antar unit atau perangkat yang tergabung dalam sebuah system
                                    (inter anu bilitas) bagaiman agar efisien
                            2.  Interfacing
                                --  Antarmuka / penguhung antar perangkat (Workstation modem dihubungkan oleh
                                    kabel >> connector di modem dan computer adalah Interface)
                                --  System digital akan bangkit ketika sinyal diberikan / dibangkitkan
                            3.  Signal Generation
                                --  Media pembagkit sinyal
                                --  2 jenis Komunikasi udara dan kabel
                                    nirkable adalah--  Sinyal yang diberikan harus sesuai (electromagnetik harus dengan
                                        Electromagnetic)
                                --  Sinyal FO
                                --  Kable tembaga (sinyal yang dibagkitkan harussama (5v))
                            3.  Syncronization
                                --  Disisi pengirim dapat mengirim 4 kb namun penerima hanya 2kb maka 2kb kana
                                    hilang >> membutuhkan syncronizstion maka dapat mengirim 2x kirim
                                --  Ada kesepakatan jika data sudah diterima maka data harus dibertahukan
                                    (200OK, 404) jika rusak maka pengirim bisa kirim ulang
                            4.  Exchange Mangement
                                --  Mengelola fitur fitru yang digunakan jka ada field2 yang tidak digunakan
                                    maka (pengelolaan terkait fitr2 yang digunkan baik server/client)
                            5.  Error detection
                                --  bagian yang mendetksi error, jika error maka tidak membetulkan data error
                                    melainkan kirim ulang
                            6.  Flow connector
                                --  Mengatur process pengirimana terutama saat error flow error akan mengatur
                                    jika ada 3 error maka FC akan mengatur data mana yang akan dikirm ulang (dari
                                    awal atau dari error)
                            7.  Adressing routing
                                --  jaringan harus memiliki alamat agar dapat berkomunikasi
                                --  Routing mencari jalur terbaik(jika jalur terbaik terturtp mak)
                            8.  Recovery
                                --  Semula router menrecovery menetukan jalur lain
                            9.
                                --  Paket pesan diformat sesuai format tertentu sesuai protocol yang digunakan
                                    (TCP/ >> paket diberi header TCP)
                            8.  Security
                                --  Security keamanan perangakat dan data yang ditransmisikan
                            9.  Network Management
                                --  pengelolaan jaringan oleh admin

                        Model Komunikasi:
                            Data ditransimikan berupa bit stream g(t) berbasis waktu karena tidak memadai
                            maka sinyal berupa analog
                            Source >> s(t)
                            Receiver >> r(t))

                        Transmition Medium
                        Ada 2 jenis kable dan udara
                            1. Ada Hybrid FO dan Wireless
                                --  Local Wireless dan keluar pakai FO
                                --  Tembaga yang dibagkitakn adalah 5 volt
                                --  Wireless tidak tahan noise

                        Networking
                        Pertumbuhan jumlah & kekuatan komputer mendorong kebutuhan akan interkoneksi juga melihat
                        integrasi pesat teknologi suara, data, gambar & video dua kategori besar jaringan komunikasi:
                            1.  Jaringan Area Lokal (LAN)
                            2.  Jaringan Area Luas (WAN)

                        Circuit Swithing
                            --  Rangkaian yang sedang berkomunikasi/ rangkaian secara fisik yang terhubung
                                secara langsung dihunbungkan secara logic (input logic) tidak manual (STO
                                jadi berisik)

                        Packet Swithing
                            --  berkembang karena banyak rangkain yang terlibag maka ganti ke Paket sw
                                data dipecah kecil menjadi paket kemuadian paket diberi tanda atau dibungkus
                                denagn header sesuai protokol (alamat tuajauan sumber ukuran error checking
                                dan lain lain >> pengiriman tidak berurutan dan sebaliknaya namun akan disusun kembali
                                sesuai urutan) (jika UDP hanya alamat sumber dan tujuan serta ukuran)

                        Frame Relay
                            --  FR adalahinformasi yang disematkan
                            --  Menghilangkan overhead / informasi yang dipandang tidak perlu ()
                            --  Jika satu paket terdiri 10 space jika terlalu banyak informasi yang
                                disematkan akan memakan space (contoh (10 Overhead) : 5 space indormasi 5
                                space data)
                            --  Imbasnya data ditransfer menjadi lebih cepat

                        ATM
                            --  Pengiriman tidak berupa paket-paket lagi melainkan kumpulan paket (cels). Overhead juga
                                sedikit
                            --  Terbentuk rangkaian virtual terjadi ketika di ATM mengirim banyak cels
                                terdiri banyak poaket, cels yang pertama di sedn jarlur tersebut digunakan
                                atau diikuti oleh cels kedua(Circuit Virtual) jika terganggu maka cells akan
                                mencari jalur baru maka cels selanjutnya akan ikut berganti

                        LAN (Local Area Network)
                            --  2 jenis ethernet dan nirkabel


                        The Internet
                            --
                                        """));
        modules.put("2", new Modules(
                2,
                """
                        \u001B[31mData and Computer Communications\u001B[0m
                        1.  Terminologi Transmisi
                            Transmisi data menjadi pemancar dan penerima media
                            2 Jenis media (Guided Medium):
                                            --  Kabel
                                                twisted pair (kabel berpasangan),
                                                coaxial cable (kabel koaxial),
                                                optical fiber (fiber optik)

                                            --  Wiereless 
                                                Udara, air, ruang

                        2.  Terminologi Transmisi - Konfigurasi yang mungkin :
                            --  Direct link
                                Tidak ada perangkat perantara (Penerima dan pengirim berkomunikasi secara langsung)
                            --  Point-to-Point (Khusus 2 Perangkat)
                                Berkomunikas secara langsung, tidak ada perangkat lain yang berbagi channel
                                a.  Direct link
                                b.  Hanya ada 2 perangkat yang berbagi link
                            --  Multi-point (Lebih dari 2 Perangkat dengan link yang sama dan frekuensi/sinyal yang sama)
                                a. Lebih dari dua perangkat yang berbagi link

                        3.  Transmission Terminology - Arah komunikasi dapat :
                            -- Suplex
                                a.  Suplex
                                    Satu arah dan tidak bisa sebaliknya
                                    Contoh :
                                            --  Broadcasting televisi
                                            --  broadcasting radio
                                b.  Half Duplex
                                    Dua arah, tetapi hanya satu arah pada satu waktu (penggunaan kanal bergantian)
                                    Contoh :
                                            --  Handy Talky (HT)
                                c.  Full Duplex
                                    dua arah secara bersamaan
                                    Contoh :
                                            --  Telepon, Conferences(Zoom, Google Meet)
                        4. KOmponen KOmunikasi
                            Frequency : Munculnya dari domain waktu, sinyal yang dibangkitkan sesuai waktu
                                -- Konsep domain waktu 
                                    a.  Sinyal analog
                                        Nilainya bervariasi secara halus dari waktu ke waktu                                    
                                    b.  Sinyal Digital
                                        Ada 2 level yang dipertahankan yaitu level tinggi dan level rendah, perubahan dari level secara tiba-tiba
                                        Mempertahankan level konstan kemudian berubah ke level konstan lainnya
                                    c.  Sinyal Periodik
                                        Terdapat pola yang berulang dari waktu ke waktu(ada siklus yang berulang) sekali mencapai lembah sekai mencapai pusat >> 1 periode
                                    d.  Sinyal Aperiodik
                                        Pola tidak berulang dari waktu ke waktu, bisa jadi nilainya berubah
                                    Komponen gelombang SInus:
                                        Amplitudo puncak (A)
                                        --  Kekuatan sinyal maksimum ()
                                        --  Satuan : Volt
                                        Frequency (f)
                                        --  Laju perubahan sinyal = perubahan dari sinyal dari low ke hight dan sebaliknya
                                        --  Satuan = Hertz (Hz) atau cycles per second
                                        --  Period = Waktu pengulangan sinyal (T)
                                            T = 1/f
                                        Phase (lambang Phase)
                                        --  Posisi relatif dalam waktu terutama saat t = 0
                                            Sinyal dimulai dari t = 0
                                            Pergeseran Phase = sinyal tidak dimulai dari 0
                                            Variasi gelombang sinus
                                            s(t) = A sin(2 phi ft + Phase)
                                            Keterangan :
                                                        -- 2 phi f = omega
                                            1 Periode = 360 derajat
                                    Panjang Gelombang ()
                                        a.  Jarak yang ditempul dalam 1 cycle
                                        b.  Antara dua titik dari fase yang sesuai
                                            dalam dua cycle berturut-turut
                                        c.  dengan asumsi kecepatan sinyal v
                                            memiliki  = vT
                                            Atau ekuivalen f = v
                                        d   Terutama ketika v=c
                                        e.  = 3*108 ms-1 (speed of light in free space)
                                        --  Panajng Gelombang Transversal = Jarak dari bukit ke bukit / lembah ke lembah
                                        --  Longitudinal = Jarak antar ini dengan ini
                                    Konsep domain frekuensi
                                        --  Sinyal terdiri dari banyak frekuensi
                                        --  Komponennya adalah gelombang sinus
                                        --  Analisis Fourier dapat menunjukkan (Sinyal ketika dijumlahkan akan mengasilkan sinyal seperti apa, jika ada noise apa yang terjadi)
                                            Bahwa sinyal apa pun terdiri dari
                                            komponen gelombang sinus
                                            const Fourir (){   Penambahan
                                                Komponen
                                                Frekuensi
                                                (T=1/f)
                                                c adalah jumlah
                                                dari f & 3f
                                            }
                                        --  Dapat mem-plot fungsi domain frekuens


                            Spectrum
                                    Rentang frekuesni yang terkandung pada sinyal
                                    fungsi domain
                                    frekuensi dari
                                    Gambar 3.4c
                                     fungsi domain
                                    frekuensi dari pulsa
                                    persegi tunggal    
                            Bandwidth
                                    --  Absoulute Banwith
                                        Lebar spektru(Specktrum tinggi dikurangi rendah terdekat)
                                    --  effective bandwidth (Bandwith saja)
                                        a.  seringkali hanya bandwidth
                                        b.  pita frekuensi sempit yang mengandung sebagian
                                            besar energi
                                            Ketika banwith kecil maka energi besar
                            DC Component
                                Komponen frekuensi nol


                            Kecepatan Data dan Bandwidth
                                --  Sistem transmisi apa pun memiliki pita frekuensi terbatas (Idealnya bandwith tidak terbatas, keterbatasan bandwith memepengaruhi kecepatan data)
                                --  Ini membatasi kecepatan data yang dapat dibawa
                                --  Persegi memiliki komponen tak terbatas dan karenanya bandwidth menjadi tak terbatas
                                --  Tetapi sebagian besar energi ada dalam beberapa komponen pertama
                                --  bandwidth terbatas meningkatkan distorsi
                                --  Memiliki hubungan langsung antara kecepatan data & bandwidth
                                    Cacat sinyal analog = melemah
                                    Cacat sinyal digital = kekacauan data >> logic 1 menajadi 0

                            Transmisi Data Analog dan Digital
                                --  Data
                                    Sesuatu yang tidak bermakna, namun data merupakan entitas yang menyampaikan makna atau informasi.
                                    Data diolah dan diproses agar menjadi informasi
                            Sinyal dan pensinyalan
                                --  Sinyal = Elektrik dan elektromagnetik merepresentasikan data
                                    Kable = electrik
                                    Elektromagnetik = air, udara
                                --  Persinyalan = Propagasi sepanjang media secara fisik.
                            Transmisi
                                Sinyal berasal dari apa proses perambatan seperti apa dan diolah menjadi data
                                --  Komunikasi data dengan propagasi dan pemrosesan sinyal
                            
                            Sinyal Audio
                            --  Range frekuensi 20Hz-20 kHz (percakapan 100Hz7kHz)
                            --  Mudah dikonversi ke dalam sinyal elektromagnetik
                            --  Variasi volume dikonversi ke variasi tegangan
                            --  Range frekuensi dapat dibatasi untuk kanal voice 300-3400 Hz.
                            --  Gelombang getar >> Electromagnetik
                            Sinyal Video
                                 USA - 483 baris per frame, pada frame per detik
                                 memiliki 525 garis tetapi 42 hilang selama
                                penelusuran vertikal
                                 525 lines x 30 scans = 15750 baris per detik
                                 63.5s per baris
                                 11s for retrace, so 52.5 s per video baris
                                 frekuensi maksimum jika garis bergantian hitam
                                dan putih
                                 resolusi horizontal sekitar 450 garis memberikan
                                225 cycle gelombang dalam 52,5  s
                                 frekuensi maksimum 4.2MHz
                            Data Digital
                                --  Seperti yang dihasilkan oleh komputer dll
                                --  Mempunyai dua komponen DC
                                --  Bandwidth tergantung pada kecepatan data
                                --  Konversi Data ke Sinyal
                                    Data sinyal berkebalikan denga Data digital (Jika data digital 0 maka sinyal 1)

                            Analog Signals
                            Sinyal Digital
                                            Codec = Merubah sinyal analog >> SInyal Digital
                                            Modem = Data Menjadi SInyal
                                            Telepon = data analog >> sinyal analog
                                            Transmiter = data digital >> sinyal digital
                                            Digital Transceiver
                            


                            Keuntungan dan kerugian sinyal digital
                                --  Murah
                                --  Sedikit rentan terhadap Noise
                                --  Tapi redamannya lebih besar
                                --  Digital sekarang menjadi pilihan yang lebih disuka
                            Kerusakan Transmisi
                                --  Sinyal yang diterima mungkin berbeda dari
                                --  Sinyal yang ditransmisikan menyebabkan :
                                    a.  Analog - penurunan kualitas sinyal
                                    b.  Digital - bit errors
                                --  Gangguan yang paling signifikan (Meneybabkan cacat) adalah :
                                    a.  Atenuasi dan distorsi atenuasi (Peredaman)
                                    b.  Distrosi delay (Keterlambatan)
                                    c.  Noise (Imformasi yang tersemat atau disematkan pihak lain)

                            Redaman
                                --  Frekuensi Tinggi == Redaman Kecil
                                --  Di mana kekuatan sinyal jatuh karena jarak
                                --  Tergantung medianya
                                --  Kekuatan sinyal yang diterima harus :
                                    a.  cukup kuat untuk dideteksi
                                    b.  lebih tinggi dari pada nois untuk menerima tanpa kesalahan
                                --  Jadi tingkatkan kekuatan menggunakan amplifier/repeater
                                    a.  Amplifier (Semua sinyal dikuatkan termasuk dengung dan gangguan)
                                    b.  Repeater (Menyangga atau memfilter noise dibuang dan sinyal utama di ulang)
                                --  Juga merupakan fungsi peningkatan frekuensi
                                --  Jadi samakan redaman di seluruh pita frekuensi
                                    yang digunakan
                                --  eg. using loading coils or amplifiers
                                    Pelemahan agar sama rata maka diberi loading coils (Lilitan pada pita frekuensi)
                            Distorsi Delay
                                --  Hanya terjadi pada media terpandu
                                --   Kecepatan propogasi bervariasi dengan frekuensi
                                --  maka berbagai komponen frekuensi tiba pada waktu yang berbeda sangat penting untuk data digital
                                --  karena bagian dari satu bit “tumpah” ke yang lain
                                --  menyebabkan interferensi antarsimbol
                                --  Frekuesni cepat perambatan cepat
                                --  Pulsa lebih kecil dari Sinyal frekuesni kurang >> akan terjadi perpindahan data >> frekuensi antar simbol
                                --  Agar tidak ada distorsi maka pulsa clock harus 2x lebih besar dari sinyal (Agar data tidak salah >> sinyal masuk -- Clock belum datang)

                                Noise
                                    --  Sinyal tambahan yang disisipkan antara pemancar dan penerima
                                    --  Thermal (Transmisi data akan melemah dengan panas yang berlebih)
                                        Disembabkan karena panas pada perangkat yang digunakan dalam transmisi
                                        a.  Karena agitasi termal elektron
                                        b.  Terdistribusi secara merata
                                        c.  Noise putih (white noise)
                                    --  Intermodulation
                                        Sinyal yang merupakan penjumlahan atau perbedaan (penjumlahan dan pengurangan) frekuensi yang berbagi media yang sama
                                        Terjadi 2 frekuensi yang menngunakan kanal yang sama >> Muncul frekuensi baru yang berbeda
                                    --  Sinyal yang merupakan jumlah dan perbedaan frekuensi asli yang berbagi media
                                    
                                    --  crosstalk
                                        Dekatnya jarak perangakat saluran yang berdekatan digunakan >> muncul kapasitor maka menyebabkan mengisian dan pengosongan menyebabkan gelombang yang dianggap sinyal digital
                                     asinyal dari satu baris diambil oleh yang lain
                                    --  impulse
                                        Ada lonjakan sesaat namun nilai amplitudo tinggi tidak banyak berpengaruh besar pada sinyal analog saat ampitudo kecil dan berpengaruh pada sinyal digital
                                        Pulsa atau spike (lonjakan) tidak teratur
                                            interferensi elektromagnetik eksterna
                                     durasi pendek
                                     amplitudo tinggi
                                     gangguan kecil untuk sinyal analog
                                     tetapi merupakan sumber kesalahan utama
                                    dalam data digital
                                    • lonjakan noise dapat merusak banyak bit


                                    Kapasitas Kanal
                                        Kecepatan data maksimum yang mungkin pada saluran komunikasi
                                        Adalah fungsi dari
                                            --  data rate - dalam bits per second
                                            --  bandwidth - dalam cycles per second or Hertz
                                            --  noise - pada link komunikasi
                                        error rate - dari bit yang rusak
                                        keterbatasan karena sifat fisik
                                        menginginkan penggunaan kapasitas yang paling efisien


                                        Nyquist Bandwidth
                                            Kecepatan transfer rate/ besar data yang dapat dikirim dalam satu waktu. ketika wakti sinyal 2 detik maka dia bisa mengirim sinyal tidak lebih dari b
                                            --  mempertimbangkan saluran bebas kebisingan
                                                    Jika laju/kecepatan transmisi sinyal adalah 2B maka dapat membawa sinyal dengan frekuensi tidak lebih besar dari B
                                                    ie. diberikan bandwidth B, tingkat sinyal tertinggi adalah 2B
                                            --  untuk sinyal biner, 2B bps membutuhkan bandwidth B Hz
                                            --  dapat meningkatkan kecepatan dengan menggunakan level sinyal M (Jumlah sinyal diskrete atau 0 dan 1)
                                                Rumus Nyquist adalah: C = 2B log2 M
                                            --  Jadi tingkatkan kecepatan dengan meningkatkan sinyal
                                            --  Dengan biaya kompleksitas penerima dibatasi oleh kebisingan & lainnya (Ketika penerima menyediakan Band besar namu sinyal mengandung noise maka penerima tidak akan sesuai)
                                            --  Dibatasi oleh kebisingan & gangguan lainnya


                                        Rumus Kapasitas Shannon
                                            --  Mempertimbangkan hubungan data rate, noise & error rate
                                            --  Data rate yang lebih cepat mempersingkat setiap bit sehingga “semburan” nois memengaruhi lebih banyak bit
                                                diberikan noise level, kecepatan yang lebih tinggi berarti kesalahan yang lebih tinggi
                                            --  Shannon mengembangkan formula yang
                                                menghubungkannya dengan rasio sinyal terhadap noise
                                            (Signal to Noise Ratio) (dalam desibel)
                                            a.  SNRdb = 10 log10 (signal/noise)
                                                saat SNRdb rendah maka noise tinggi
                                            b.  Capacity C=B log2
                                                (1+SNR)
                                                --  Kapasitas maksimum teoritis
                                                --  Semakin rendah dalam praktek
                                                        """));

        for (int i = 1; i <= modules.size(); i++) {
            if (args.length > 0 && ((args[0].equals("-m")
                    || args[0].equals("--modules"))
                    && args[1].equals(String.format("%d", i)))) {
                System.out.println(modules.get(String.format("%d", i)));
            } else {
                System.out.println("Something Wrong");
            }
        }
    }
}
