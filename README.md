## Nama : Yahya Jailani
## NIM  : 2509116085

# SISTEM MANAJEMEN BIOSKOP

Sistem Manajemen Bioskop merupakan program yang berguna untuk mengelola data film, data studio, dan data tiket pemesanan bioskop.

Program ini memiliki tiga menu utama:
- Data Film: Mengelola informasi film yang tersedia di bioskop.
- Data Studio: Mengelola kapasitas dan tipe ruang studio.
- Data Tiket: Mengelola transaksi pemesanan tiket oleh pelanggan.

Setiap menu dilengkapi dengan fitur CRUD (Create, Read, Update, Delete) untuk menambah, melihat, mengubah, dan menghapus data.

---

## 1. Penjelasan Alur Program

Saat program dijalankan, sistem akan menampilkan Menu Utama yang terdiri dari: 1. Data Film, 2. Data Studio, 3. Data Tiket, dan 0. Keluar.

### A. Menu Data Film
Kegunaan menu ini untuk mengelola daftar film yang tayang.
1. Tambah Film  
   Pengguna memasukkan Judul Film, Genre, dan Durasi (dalam menit). Data kemudian disimpan sebagai objek Film baru.
2. Lihat Film  
   Sistem menampilkan daftar film beserta detailnya (Judul | Genre | Durasi menit). Jika belum ada data, sistem menampilkan pesan "Belum ada film."
3. Ubah Film  
   Pengguna memilih nomor urut film yang ingin diubah misalnya 1, lalu memasukkan Judul baru, Genre baru, dan Durasi baru
4. Hapus Film  
   Pengguna memilih nomor urut film yang ingin dihapus dari daftar Film
5. Kembali (0)  
   Kembali ke Menu Utama

### B. Menu Data Studio
Menu ini berguna untuk mengelola data ruangan/studio bioskop
1. Tambah Studio  
   Pengguna memasukkan Nomor studio, Kapasitas (kursi), dan Tipe Studio (misal: Regular, VIP, IMAX). Data disimpan sebagai objek Studio.
2. Lihat Studio  
   Sistem menampilkan daftar studio beserta detailnya (Nomor | Kapasitas kursi | Tipe). Jika kosong, muncul pesan "Belum ada studio."
3. Ubah Studio  
   Pengguna memilih nomor urut studio, lalu memasukkan Nomor Baru, Kapasitas baru, dan Tipe baru.
4. Hapus Studio  
   Pengguna memilih nomor urut studio yang ingin dihapus.
5. Kembali (0)  
   Kembali ke Menu Utama.

### C. Menu Data Tiket
Menu ini digunakan untuk mengelola data transaksi pembelian tiket.
1. Tambah Tiket  
   Pengguna memasukkan Nama Pembeli, Film, Jumlah Tiket, dan Nomor Studio. Data disimpan sebagai objek Tiket.
2. Lihat Tiket  
   Sistem menampilkan daftar tiket yang tersimpan (Nama Pembeli | Film | Jumlah Tiket | Nomor Studio). Jika kosong, muncul pesan "Belum ada tiket."
3. Ubah Tiket  
   Pengguna memilih nomor tiket, lalu memasukkan Pembeli baru, Film baru, Jumlah baru, dan Studio baru.
4. Hapus Tiket  
   Pengguna memilih nomor tiket yang ingin dihapus.
5. Kembali (0)  
   Kembali ke Menu Utama.

### D. Keluar Program (0)
Memilih angka 0 pada Menu Utama akan menampilkan pesan "Terimakasih." dan menghentikan eksekusi program.

---

## 2. Dokumentasi Program

Berikut adalah dokumentasi tangkapan layar (screenshot) antarmuka dan struktur kelas pada program:

### A. Structure / Class Model
* Class Studio Model, Class Film Model, Class Tiket Model  
 (<img width="713" height="216" alt="Screenshot 2026-09-07 174237" src="https://github.com/user-attachments/assets/c5eba38d-f1c2-4c5f-87e4-6d5eaab18a6d" />
)

---

### B. Menu Tampilan Console

* Menu Data Film  
  Tampilan menu pengelolaan data film (Tambah, Lihat, Ubah, Hapus).  
  <img width="713" height="96" alt="Screenshot 2026-09-07 182008" src="https://github.com/user-attachments/assets/afb2a4d2-7fc0-49f2-bd2b-369e0bbe3b24" />


* Menu Data Studio  
  Tampilan menu pengelolaan data studio bioskop.  
  <img width="472" height="91" alt="Screenshot 2026-09-07 182024" src="https://github.com/user-attachments/assets/61a7e4d9-ac9d-498b-8fcb-c31cef0a3826" />


* Menu Data Tiket  
  Tampilan menu pengelolaan transaksi tiket.  
  <img width="642" height="94" alt="Screenshot 2026-09-07 182035" src="https://github.com/user-attachments/assets/1ecacf8f-b8d3-43aa-97df-cb344fe5cc52" />


---

## 3. Implementasi Program

Berikut adalah hasil eksekusi (running program) untuk setiap fitur operasi CRUD pada masing-masing menu:

### 3.1 Implementasi Menu Film

* Tambah Film, dan Lihat Film
  <img width="713" height="299" alt="Tambah Film, lihat film" src="https://github.com/user-attachments/assets/41e9d27b-8554-4983-ac08-40647757301e" />

* Ubah Film, Hapus Film  
 <img width="713" height="299" alt="ubah film, hpus film" src="https://github.com/user-attachments/assets/757eb0f7-a017-4525-b1e4-d5e61041893d" />

---

### 3.2 Implementasi Menu Studio

* Tambah Studio, dan Lihat Studio  
 <img width="715" height="289" alt="tambah,lihat studio" src="https://github.com/user-attachments/assets/fcbf9529-cd5c-4149-8ceb-678ee38a8af5" />

* Ubah Studio  
  <img width="715" height="289" alt="ubah film, hpus film" src="https://github.com/user-attachments/assets/90e20bb7-4ad6-4beb-90ec-8452e3c7d46c" />

* Hapus Studio  
 <img width="715" height="289" alt="ubah studio" src="https://github.com/user-attachments/assets/4fe4e0a7-8040-49a6-908c-233618cebdd7" />

---

### 3.3 Implementasi Menu Tiket

* Tambah Tiket, dan lihat Tiket
 <img width="704" height="302" alt="tambah,lihat tiket" src="https://github.com/user-attachments/assets/b2b50ae2-85f1-42c8-96c0-951d0933a4cb" />

* Ubah Tiket, dan Hapus Tiket 
<img width="713" height="313" alt="ubah tiket" src="https://github.com/user-attachments/assets/f06ed690-4bbc-421f-bd52-517e61a3111e" />>
