package com.example.a34_utsppb;

import java.util.ArrayList;

public class KomponenData {
    private static String[] komponenNames = {
            "Activity",
            "Intent",
            "Service",
            "Broadcast Receivers",
            "Content Providers"
    };

    private static String[] komponenDetails = {
            "Sebuah Activity akan menampilkan antarmuka aplikasi di layar, sebagai contoh ketika kita membuka sebuah aplikasi maka akan muncul tampilan dari aplikasi tersebut.",
            "Intent adalah sebuah kelas dalam programming Android yang berfungsi untuk perpindahan halaman.\n" +
                    "Intent juga merupakan suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi dengan activity yang lain, baik activity pada fungsi internal android misal seperti memanggil activity dalam satu package atau beda package yang masih berada dalam satu project.\n" +
                    "Intent merupakan objek tipe android.content.Intent. Melalui metode startActivity() yang digunakan untuk memulai sebuah activity lain.",
            "Service adalah komponen yang berjalan di latar belakang. Sebagai contoh, Service bisa memainkan musik di latar belakang saat pengguna berada dalam aplikasi yang berbeda, atau mungkin mengambil data melalui jaringan tanpa menghalangi interaksi pengguna dengan aktivitas.",
            "Lorem ipsum dolor sit amet, sapien etiam, nunc amet dolor ac odio mauris justo. Luctus arcu, urna praesent at id quisque ac. Arcu es massa vestibulum malesuada, integer vivamus elit eu mauris eus, cum eros quis aliquam wisi. Nulla wisi laoreet suspendisse integer vivamus elit eu mauris hendrerit facilisi, mi mattis pariatur aliquam pharetra eget.",
            "ContentProvider adalah penyedia konten dari satu aplikasi ke aplikasi lain atas perintah tertentu. Perintah tersebut ditangani oleh sebuah method dari class ContentResolver. Data dapat disimpan dalam sistem file, database atau di tempat lainnya.ContentProvider diimplementasikan sebagai subclass dari class ContentProvider dan harus menerapkan satu set standar API yang memungkinkan aplikasi lain untuk melakukan transaksi."
    };

    static ArrayList<Komponen> getListData() {
        ArrayList<Komponen> list = new ArrayList<>();
        for (int position = 0; position < komponenNames.length; position++) {
            Komponen hero = new Komponen();
            hero.setNama(komponenNames[position]);
            hero.setDetail(komponenDetails[position]);
            list.add(hero);
        }
        return list;
    }
}
