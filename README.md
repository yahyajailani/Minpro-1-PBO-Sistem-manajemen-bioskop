# SISTEM PENGELOLAAN DATA PRODUKSI KONVEKSI

## 1. Deskripsi Singkat Program

Sistem Pengelolaan Data Produksi Konveksi merupakan program yang berguna untuk mengelola data produk, data bahan baku, data karyawan, data kegiatan produksi, dan data pemilik usaha. Program ini dijalankan melalui console dan menggunakan sistem basis data relasional untuk menyimpan serta memantau seluruh alur pembuatan produk dari bahan baku hingga produk jadi.

Program ini memiliki lima menu/entitas utama, yaitu:
1. **Pemilik Usaha**, digunakan untuk mengelola data akun dan memantau jalannya kegiatan produksi.
2. **Produk**, digunakan untuk mengelola data produk atau pakaian yang siap dibuat.
3. **Bahan Baku**, digunakan untuk mengelola data persediaan material produksi (kain, benang, kancing, dll.).
4. **Karyawan**, digunakan untuk mengelola data tenaga kerja/pekerja yang terlibat dalam produksi.
5. **Kegiatan Produksi**, digunakan untuk mengelola data proses pembuatan produk, alokasi bahan, serta penugasan karyawan.

Setiap menu dari sistem ini memiliki fitur CRUD (*Create, Read, Update, Delete*), yaitu menambah, melihat, mengubah, dan menghapus data.

---

## 2. Penjelasan Alur Program

Ketika program dijalankan, sistem akan menampilkan Menu Utama yang terdiri dari menu Pemilik Usaha, Produk, Bahan Baku, Karyawan, Kegiatan Produksi, dan Keluar. Pengguna dapat memilih menu dengan memasukkan angka sesuai pilihan yang tersedia.

### A. Menu Pemilik Usaha
Menu Pemilik Usaha digunakan untuk mengelola data pemilik/admin dan memantau kegiatan produksi.
Terdapat beberapa pilihan:
* **Tambah Pemilik Usaha**: Pengguna memasukkan ID pemilik, nama, username, password, email, dan nomor telepon.
* **Lihat Pemilik Usaha**: Sistem menampilkan seluruh data pemilik usaha yang telah tersimpan.
* **Ubah Pemilik Usaha**: Pengguna memilih data pemilik yang ingin diubah, kemudian memasukkan nama, email, dan nomor telepon baru.
* **Hapus Pemilik Usaha**: Pengguna memilih data pemilik yang ingin dihapus, kemudian sistem menghapus data tersebut.
* **Kembali**: Pengguna kembali ke Menu Utama.

### B. Menu Produk
Menu Produk digunakan untuk mengelola data barang atau pakaian yang akan diproduksi.
Terdapat beberapa pilihan:
* **Tambah Produk**: Pengguna memasukkan kode produk, nama produk, kategori, ukuran, dan harga jual.
* **Lihat Produk**: Sistem menampilkan seluruh data produk yang telah tersimpan.
* **Ubah Produk**: Pengguna memilih data produk yang ingin diubah, kemudian memasukkan nama, kategori, ukuran, dan harga baru.
* **Hapus Produk**: Pengguna memilih data produk yang ingin dihapus, kemudian sistem menghapus data tersebut.
* **Kembali**: Pengguna kembali ke Menu Utama.

### C. Menu Bahan Baku
Menu Bahan Baku digunakan untuk mengelola stok dan jenis material konveksi.
Terdapat beberapa pilihan:
* **Tambah Bahan Baku**: Pengguna memasukkan kode bahan, nama bahan, jenis, stok, dan satuan (meter, roll, pcs).
* **Lihat Bahan Baku**: Sistem menampilkan seluruh data bahan baku yang telah tersimpan.
* **Ubah Bahan Baku**: Pengguna memilih data bahan yang ingin diubah, kemudian memasukkan nama, jenis, stok, dan satuan baru.
* **Hapus Bahan Baku**: Pengguna memilih data bahan yang ingin dihapus, kemudian sistem menghapus data tersebut.
* **Kembali**: Pengguna kembali ke Menu Utama.

### D. Menu Karyawan
Menu Karyawan digunakan untuk mengelola data penjahit atau tenaga kerja konveksi.
Terdapat beberapa pilihan:
* **Tambah Karyawan**: Pengguna memasukkan ID karyawan, nama, posisi/peran (pemotong, penjahit, finishing), dan nomor HP.
* **Lihat Karyawan**: Sistem menampilkan seluruh data karyawan yang telah tersimpan.
* **Ubah Karyawan**: Pengguna memilih data karyawan yang ingin diubah, kemudian memasukkan nama, posisi, dan nomor HP baru.
* **Hapus Karyawan**: Pengguna memilih data karyawan yang ingin dihapus, kemudian sistem menghapus data tersebut.
* **Kembali**: Pengguna kembali ke Menu Utama.

### E. Menu Kegiatan Produksi
Menu Kegiatan Produksi digunakan untuk mengelola proses transaksi pembuatan produk dari awal hingga selesai.
Terdapat beberapa pilihan:
* **Tambah Kegiatan Produksi**: Pengguna memasukkan ID produksi, memilih kode produk, memilih ID pemilik (pemantau), menentukan tanggal mulai, tanggal selesai, target jumlah, dan status.
* **Lihat Kegiatan Produksi**: Sistem menampilkan seluruh data alur produksi beserta detail bahan dan karyawan yang bertugas.
* **Ubah Kegiatan Produksi**: Pengguna memilih data produksi yang ingin diubah, kemudian memperbarui target jumlah atau status produksi.
* **Hapus Kegiatan Produksi**: Pengguna memilih data produksi yang ingin dihapus, kemudian sistem menghapus data tersebut.
* **Kembali**: Pengguna kembali ke Menu Utama.

### F. Keluar Program
Jika pengguna memilih menu 0. Keluar pada Menu Utama, sistem akan menampilkan pesan "Program selesai." dan program akan berhenti.

---

## 3. Skema Relasi Basis Data (ERDish)

Berikut tabel hubungan antar-entitas menggunakan kata kerja berawalan **me-** dan **di-**:

<table>
  <thead>
    <tr>
      <th align="left">Entitas Asal</th>
      <th align="center">Kata Kerja (Me-)</th>
      <th align="center">Kardinalitas</th>
      <th align="center">Kata Kerja (Di-)</th>
      <th align="left">Entitas Tujuan</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td><b>Pemilik Usaha</b></td>
      <td align="center">Memantau</td>
      <td align="center"><code>1 : N</code></td>
      <td align="center">Dipantau oleh</td>
      <td><b>Kegiatan Produksi</b></td>
    </tr>
    <tr>
      <td><b>Produk</b></td>
      <td align="center">Menghasilkan</td>
      <td align="center"><code>1 : N</code></td>
      <td align="center">Dihasilkan oleh</td>
      <td><b>Kegiatan Produksi</b></td>
    </tr>
    <tr>
      <td><b>Kegiatan Produksi</b></td>
      <td align="center">Membutuhkan</td>
      <td align="center"><code>M : N</code></td>
      <td align="center">Dibutuhkan oleh</td>
      <td><b>Bahan Baku</b></td>
    </tr>
    <tr>
      <td><b>Karyawan</b></td>
      <td align="center">Mengerjakan</td>
      <td align="center"><code>1 : N</code></td>
      <td align="center">Dikerjakan oleh</td>
      <td><b>Kegiatan Produksi</b></td>
    </tr>
    <tr>
      <td><b>Karyawan</b></td>
      <td align="center">Menggunakan</td>
      <td align="center"><code>1 : N</code></td>
      <td align="center">Digunakan oleh</td>
      <td><b>Bahan Baku</b></td>
    </tr>
  </tbody>
</table>

---

## 4. Dokumentasi Program

### A. Menu Data Pemilik Usaha
Berikut screenshot tampilan menu Data Pemilik Usaha yang menyediakan fitur untuk menambah, melihat, mengubah, dan menghapus data pemilik usaha.
![Menu Data Pemilik Usaha]

### B. Menu Data Produk
Berikut screenshot tampilan menu Data Produk yang digunakan untuk mengelola data barang atau pakaian yang akan diproduksi.
![Menu Data Produk]

### C. Menu Data Bahan Baku
Screenshot berikut menunjukkan tampilan menu Data Bahan Baku yang digunakan untuk mencatat dan mengelola stok kain serta material pendukung.
![Menu Data Bahan Baku]

### D. Menu Data Karyawan
Berikut screenshot tampilan menu Data Karyawan yang digunakan untuk mengelola informasi tenaga kerja atau penjahit.
![Menu Data Karyawan]

### E. Menu Data Kegiatan Produksi
Screenshot berikut menunjukkan tampilan menu Data Kegiatan Produksi yang digunakan untuk mencatat alur proses pembuatan produk konveksi.
![Menu Data Kegiatan Produksi]

---

## 5. Implementasi Program

### 5.1 Implementasi Menu Pemilik Usaha
Menu Pemilik Usaha digunakan untuk mengelola data kredensial serta memantau jalannya sistem. Pada menu ini terdapat fitur Tambah Pemilik Usaha, Lihat Pemilik Usaha, Ubah Pemilik Usaha, dan Hapus Pemilik Usaha.
<br>
<div align="center">
  <img src="path/to/gambar1.png" alt="Implementasi Menu Pemilik Usaha" width="650"/>
  <p><b>Gambar 1. Implementasi Menu Pemilik Usaha</b></p>
</div>

### 5.2 Implementasi Menu Produk
Menu Produk digunakan untuk mengelola data pakaian/produk yang siap diproduksi. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data produk yang tersimpan dalam sistem.
<br>
<div align="center">
  <img src="path/to/gambar2.png" alt="Implementasi Menu Produk" width="650"/>
  <p><b>Gambar 2. Implementasi Menu Produk</b></p>
</div>

### 5.3 Implementasi Menu Bahan Baku
Menu Bahan Baku digunakan untuk mengelola stok kain dan material pendukung. Pada menu ini pengguna dapat menambahkan, melihat, mengubah, dan menghapus data bahan baku.
<br>
<div align="center">
  <img src="path/to/gambar3.png" alt="Implementasi Menu Bahan Baku" width="650"/>
  <p><b>Gambar 3. Implementasi Menu Bahan Baku</b></p>
</div>

### 5.4 Implementasi Menu Karyawan
Menu Karyawan digunakan untuk mengelola data tenaga kerja. Pengguna dapat menambahkan, melihat, mengubah, dan menghapus data karyawan yang terlibat dalam pembuatan produk.
<br>
<div align="center">
  <img src="path/to/gambar4.png" alt="Implementasi Menu Karyawan" width="650"/>
  <p><b>Gambar 4. Implementasi Menu Karyawan</b></p>
</div>

### 5.5 Implementasi Menu Kegiatan Produksi
Menu Kegiatan Produksi digunakan untuk mengelola transaksi pembuatan produk konveksi secara langsung. Pengguna dapat menambah jadwal produksi, memantau alokasi bahan baku, serta memperbarui status prosesnya.
<br>
<div align="center">
  <img src="path/to/gambar5.png" alt="Implementasi Menu Kegiatan Produksi" width="650"/>
  <p><b>Gambar 5. Implementasi Menu Kegiatan Produksi</b></p>
</div>
