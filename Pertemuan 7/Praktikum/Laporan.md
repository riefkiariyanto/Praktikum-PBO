# JOBSHEET 7
INHERITANCE (PEWARISAN) 

<h2>Praktikum 1</h2>

<img src="img/p1.png">

B. PERTANYAAN

    1. Sebutkan class mana yang termasuk super class dan sub class dari percobaan 1 diatas!   
     Super class adalah class karyawan untuk sub class ada class staff dan class manager

    2. Kata kunci apakah yang digunakan untuk menurunkan suatu class ke class yang lain?
     Kata kuncinya adalah extends disebelah class yang dibuat yang merujuk ke super class

    3. Perhatikan kode program pada class Manager, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Karyawan!
     . Atribut yang dimiliki class manager hanya variabel tunjangan bertipe data int dan atribut yang diwarisi dari class karyawan adalah variabel gaji dengan pendeklarasian super.gaji pada method tampilDataManager

    4. Jelaskan kata kunci super pada potongan program dibawah ini yang terdapat pada class Manager!
      Potongan kode tersebut adalah untuk menghitung total gaji dari manager dengan memanggil variabel gaji yang berapa pada super class ditambah dengan variabel tunjangan

    5. Program pada percobaan 1 diatas termasuk dalam jenis inheritance apa? Jelaskan alasannya! 
     Hierarchical Inheritance 

<h2>Praktikum 1</h2>

<img src="img/p2.png">

 B. PERTANYAAN


      1.	Berdasarkan class diatas manakah yang termasuk single inheritance dan mana yang termasuk multilevel inheritance?
      -	Yang termasuk single inheritance adalah manager Dan yang termasuk multilevel inheritance adalah staff
      2.  Perhatikan kode program class StaffTetap dan StaffHarian, atribut apa saja yang dimiliki oleh class tersebut? Sebutkan atribut mana saja yang diwarisi dari class Staff!
      - StaffHaran = jmlJamKerja StaffTetap = Golongan dan Asuransi yg diwarisi = nama, alamat, jk, umur, gaji, lembur, dan potongan 
      3. Apakah fungsi potongan program berikut pada class StaffHarian 
      - Mewarisi atribut dari superclass/class parent 
      4. Apakah fungsi potongan program berikut pada class StaffTetap
      - .Karena mewarisi dari class parent

      5. Perhatikan kode program dibawah ini yang terdapat pada class StaffTetap 
      -Terlihat dipotongan program diatas atribut gaji, lembur dan potongan dapat diakses langsung. Kenapa hal ini bisa terjadi dan bagaimana class StaffTetap memiliki atribut gaji, lembur, dan potongan padahal dalam class tersebut tidak dideklarasikan atribut gaji, lembur, dan potongan? 


 # TUGAS 
  
  1. Buatlah sebuah program dengan konsep pewarisan seperti pada class diagram berikut ini. Kemudian buatlah instansiasi objek untuk menampilkan data pada class Mac, Windows dan Pc!. 
  
  
<img src="img/t1.png">
