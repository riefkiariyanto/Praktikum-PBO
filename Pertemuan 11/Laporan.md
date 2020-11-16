# Laporan Praktikum PBO 

pertanyaan Percobaan 1

 1. Pada langkah ke 9, pada baris program ke 3 terdapat warning pada script tersebut. Jelaskan penyebab terjadinya hal tersebut ? penyebabnya karena class interface ICumlaude yang berada pada satu package


2. Pada langkah ke 9, pada baris program ke 3. Apa yang terjadi jika script tersebut dihilangkan? Jelaskan menurut pemahaman anda.tidak terjadi kesalahan apapun karena tidak perlu lagi untuk mengimport icumlaude yang berada pada satu paket

3. Mengapa pada langkah nomor 9 terjadi error? Jelaskan! Karena dari class mahasiswa belum melakukan implements ke class interface ICumlaude

4. Dapatkah method kuliahDiKampus() dipanggil dari objek sarjanaCumlaude di class Program? Mengapa demikian? terjadi error,karena bukan dalam bagian implementasi karena method kuliahDiKampus merupakan bagian dari class mahasiswa

5. Dapatkah method kuliahDiKampus() dipanggil dari parameter mahasiswa di method beriSertifikatCumlaude() pada class Rektor? Mengapa demikian?
tidak bisa karena metode kuliahDiKampus tidak masuk ke dalam antarmuka icumlaude sehingga tidak terdeteksi untuk methodnya.

6. Modifikasilah method beriSertifikatCumlaude() pada class Rektor agar hasil eksekusi class Program menjadi seperti berikut ini: Tinggal menambhan saja System.out.println pada class Sarjana dan PascaSarjana denngan value yang dinginkan di daerah method lulus


Pertanyaan Percobaan 2


    1.Pada script code interface IBerprestasi, modifikasi script tersebut sesuai dengan gambar dibawah ini :
    
    2. Jelaskan menurut anda, mengapa hasil dari script code tersebut error ?

    3. Apabila Sarjana Berprestasi harus menjuarai kompetisi NASIONAL dan menerbitkan artikel di jurnal NASIONAL, maka modifikasilah class-class yang terkait pada aplikasi Anda agar di class Program objek pakRektor dapat memberikan sertifikat mawapres pada objek sarjanaCumlaude

<img src="img/2.png">

<img src="img/latihan.png">'


# Tugas

<img src="img/maint.png">'
