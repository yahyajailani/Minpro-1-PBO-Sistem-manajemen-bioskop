/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemenbioskop;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ADVAN
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Film> daftarFilm = new ArrayList<>();
        ArrayList<Studio> daftarStudio = new ArrayList<>();
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM MANAJEMEN BIOSKOP ===");
            System.out.println("1. Data Film");
            System.out.println("2. Data Studio");
            System.out.println("3. Data Tiket");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                // =========================================================
                // DATA FILM
                // =========================================================
                case 1:
                    int pilihanFilm;

                    do {
                        System.out.println("\n=== DATA FILM ===");
                        System.out.println("1. Tambah Film");
                        System.out.println("2. Lihat Film");
                        System.out.println("3. Ubah Film");
                        System.out.println("4. Hapus Film");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanFilm = input.nextInt();
                        input.nextLine();

                        switch (pilihanFilm) {

                            // CREATE
                            case 1:
                                System.out.print("Judul Film: ");
                                String judul = input.nextLine();

                                System.out.print("Genre: ");
                                String genre = input.nextLine();

                                System.out.print("Durasi: ");
                                int durasi = input.nextInt();

                                daftarFilm.add(
                                    new Film(judul, genre, durasi)
                                );

                                System.out.println("Film berhasil ditambahkan!");
                                break;

                            // READ
                            case 2:
                                if (daftarFilm.isEmpty()) {
                                    System.out.println("Belum ada film.");
                                } else {
                                    System.out.println("\n=== DAFTAR FILM ===");

                                    for (int i = 0; i < daftarFilm.size(); i++) {
                                        Film f = daftarFilm.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            f.judul + " | " +
                                            f.genre + " | " +
                                            f.durasi + " menit"
                                        );
                                    }
                                }
                                break;

                            // UPDATE
                            case 3:
                                if (daftarFilm.isEmpty()) {
                                    System.out.println("Belum ada film.");
                                } else {
                                    System.out.print("Nomor film: ");
                                    int no = input.nextInt();
                                    input.nextLine();

                                    if (no >= 1 && no <= daftarFilm.size()) {
                                        Film f = daftarFilm.get(no - 1);

                                        System.out.print("Judul baru: ");
                                        f.judul = input.nextLine();

                                        System.out.print("Genre baru: ");
                                        f.genre = input.nextLine();

                                        System.out.print("Durasi baru: ");
                                        f.durasi = input.nextInt();

                                        System.out.println("Film berhasil diubah!");
                                    } else {
                                        System.out.println("Nomor film tidak tersedia.");
                                    }
                                }
                                break;

                            // DELETE
                            case 4:
                                if (daftarFilm.isEmpty()) {
                                    System.out.println("Belum ada film.");
                                } else {
                                    System.out.print("Nomor film: ");
                                    int no = input.nextInt();

                                    if (no >= 1 && no <= daftarFilm.size()) {
                                        daftarFilm.remove(no - 1);
                                        System.out.println("Film berhasil dihapus!");
                                    } else {
                                        System.out.println("Nomor film tidak tersedia.");
                                    }
                                }
                                break;
                        }

                    } while (pilihanFilm != 0);
                    break;


                // =========================================================
                // DATA STUDIO
                // =========================================================
                case 2:
                    int pilihanStudio;

                    do {
                        System.out.println("\n=== DATA STUDIO ===");
                        System.out.println("1. Tambah Studio");
                        System.out.println("2. Lihat Studio");
                        System.out.println("3. Ubah Studio");
                        System.out.println("4. Hapus Studio");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanStudio = input.nextInt();
                        input.nextLine();

                        switch (pilihanStudio) {

                            // CREATE
                            case 1:
                                System.out.print("Nama Studio: ");
                                String nama = input.nextLine();

                                System.out.print("Kapasitas: ");
                                int kapasitas = input.nextInt();
                                input.nextLine();

                                System.out.print("Tipe Studio: ");
                                String tipe = input.nextLine();

                                daftarStudio.add(
                                    new Studio(nama, kapasitas, tipe)
                                );

                                System.out.println("Studio berhasil ditambahkan!");
                                break;

                            // READ
                            case 2:
                                if (daftarStudio.isEmpty()) {
                                    System.out.println("Belum ada studio.");
                                } else {
                                    System.out.println("\n=== DAFTAR STUDIO ===");

                                    for (int i = 0; i < daftarStudio.size(); i++) {
                                        Studio s = daftarStudio.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            s.nama + " | " +
                                            s.kapasitas + " kursi | " +
                                            s.tipe
                                        );
                                    }
                                }
                                break;

                            // UPDATE
                            case 3:
                                if (daftarStudio.isEmpty()) {
                                    System.out.println("Belum ada studio.");
                                } else {
                                    System.out.print("Nomor studio: ");
                                    int no = input.nextInt();
                                    input.nextLine();

                                    if (no >= 1 && no <= daftarStudio.size()) {
                                        Studio s = daftarStudio.get(no - 1);

                                        System.out.print("Nama baru: ");
                                        s.nama = input.nextLine();

                                        System.out.print("Kapasitas baru: ");
                                        s.kapasitas = input.nextInt();
                                        input.nextLine();

                                        System.out.print("Tipe baru: ");
                                        s.tipe = input.nextLine();

                                        System.out.println("Studio berhasil diubah!");
                                    } else {
                                        System.out.println("Nomor studio tidak tersedia.");
                                    }
                                }
                                break;

                            // DELETE
                            case 4:
                                if (daftarStudio.isEmpty()) {
                                    System.out.println("Belum ada studio.");
                                } else {
                                    System.out.print("Nomor studio: ");
                                    int no = input.nextInt();

                                    if (no >= 1 && no <= daftarStudio.size()) {
                                        daftarStudio.remove(no - 1);
                                        System.out.println("Studio berhasil dihapus!");
                                    } else {
                                        System.out.println("Nomor studio tidak tersedia.");
                                    }
                                }
                                break;
                        }

                    } while (pilihanStudio != 0);
                    break;


                // =========================================================
                // DATA TIKET
                // =========================================================
                case 3:
                    int pilihanTiket;

                    do {
                        System.out.println("\n=== DATA TIKET ===");
                        System.out.println("1. Tambah Tiket");
                        System.out.println("2. Lihat Tiket");
                        System.out.println("3. Ubah Tiket");
                        System.out.println("4. Hapus Tiket");
                        System.out.println("0. Kembali");
                        System.out.print("Pilih menu: ");

                        pilihanTiket = input.nextInt();
                        input.nextLine();

                        switch (pilihanTiket) {

                            // CREATE
                            case 1:
                                System.out.print("Nama Pembeli: ");
                                String pembeli = input.nextLine();

                                System.out.print("Film: ");
                                String film = input.nextLine();

                                System.out.print("Jumlah Tiket: ");
                                int jumlah = input.nextInt();

                                daftarTiket.add(
                                    new Tiket(pembeli, film, jumlah)
                                );

                                System.out.println("Tiket berhasil ditambahkan!");
                                break;

                            // READ
                            case 2:
                                if (daftarTiket.isEmpty()) {
                                    System.out.println("Belum ada tiket.");
                                } else {
                                    System.out.println("\n=== DAFTAR TIKET ===");

                                    for (int i = 0; i < daftarTiket.size(); i++) {
                                        Tiket t = daftarTiket.get(i);

                                        System.out.println(
                                            (i + 1) + ". " +
                                            t.pembeli + " | " +
                                            t.film + " | " +
                                            t.jumlah + " tiket"
                                        );
                                    }
                                }
                                break;

                            // UPDATE
                            case 3:
                                if (daftarTiket.isEmpty()) {
                                    System.out.println("Belum ada tiket.");
                                } else {
                                    System.out.print("Nomor tiket: ");
                                    int no = input.nextInt();
                                    input.nextLine();

                                    if (no >= 1 && no <= daftarTiket.size()) {
                                        Tiket t = daftarTiket.get(no - 1);

                                        System.out.print("Pembeli baru: ");
                                        t.pembeli = input.nextLine();

                                        System.out.print("Film baru: ");
                                        t.film = input.nextLine();

                                        System.out.print("Jumlah baru: ");
                                        t.jumlah = input.nextInt();

                                        System.out.println("Tiket berhasil diubah!");
                                    } else {
                                        System.out.println("Nomor tiket tidak tersedia.");
                                    }
                                }
                                break;

                            // DELETE
                            case 4:
                                if (daftarTiket.isEmpty()) {
                                    System.out.println("Belum ada tiket.");
                                } else {
                                    System.out.print("Nomor tiket: ");
                                    int no = input.nextInt();

                                    if (no >= 1 && no <= daftarTiket.size()) {
                                        daftarTiket.remove(no - 1);
                                        System.out.println("Tiket berhasil dihapus!");
                                    } else {
                                        System.out.println("Nomor tiket tidak tersedia.");
                                    }
                                }
                                break;
                        }

                    } while (pilihanTiket != 0);
                    break;


                // EXIT
                case 0:
                    System.out.println("Terimakasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 0);

        input.close();
    }
}