Struktur Kode:

Program ini terdiri dari 4 file kelas Java:

-Account.java: Mengelola data saldo nasabah serta fungsi setor (deposit) dan tarik tunai (withdraw).
-Customer.java: Mengelola data profil nasabah (nama) beserta array dari objek Account yang dimilikinya (maksimal 5 akun).
-Bank.java: Mengelola daftar nasabah menggunakan array dari objek Customer (maksimal 5 nasabah).
-Main.java: Kelas utama (main method) untuk mengeksekusi program, memanggil objek, dan mensimulasikan transaksi.

Program ini menerapkan konsep Array of Objects:
- Di kelas Bank: Menggunakan Customer[] dengan kapasitas 5 elemen untuk menyimpan daftar nasabah Bank.
- Di kelas Customer: Menggunakan Account[] dengan kapasitas 5 elemen untuk menyimpan daftar rekening yang dimiliki oleh satu nasabah.
  Pengisian array diatur menggunakan indeks yang bertambah secara otomatis memanfaatkan variabel bantuan (numberOfCustomers dan
  numberOfAccounts).

Fitur dan Eksplorasi:
-Pada bagian eksekusi di Main.java, eksplorasi dilakukan dengan membuat objek, mengelola data nasabah ke dalam array multidimensi antar kelas, 
serta mensimulasikan transaksi perbankan (setor dan tarik tunai) secara langsung melalui pemanggilan metode.

Informasi Library Tambahan:
-Tidak ada library tambahan yang digunakan dalam kode ini. Program sepenuhnya menggunakan fitur bawaan Java dasar.
