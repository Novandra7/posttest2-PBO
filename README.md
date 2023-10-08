<h1>DOKUMENTASI PROJECT POSTTEST 2 PBO</h1>

<P>Nama : Awang Muhammad Novandra Arissaputra <br>NIM : 2209116040 <br>Kelas : Sistem Informasi A 2022</P>

<h2>A. Screenshot Source Code</h2>

<ol>
  <li>Class Main</li>

  ![Main 1 1](https://github.com/Novandra7/posttest2-PBO/assets/122107967/14ba2cf8-6ecc-4963-8222-977a73257d1a)
  ![Main 1 2](https://github.com/Novandra7/posttest2-PBO/assets/122107967/ea9330d5-a479-448b-bbee-2baee63c1237)
  ![Main 1 3](https://github.com/Novandra7/posttest2-PBO/assets/122107967/59d9f1cb-4383-4fb7-9117-6507f5b82b19)

  <li>Class parent_bentuk</li>
  
  ![parent_bentuk](https://github.com/Novandra7/posttest2-PBO/assets/122107967/1b909420-97ca-45a2-8062-896bd70fab3b)

  <li>Class crud</li>
  
  ![crud 1](https://github.com/Novandra7/posttest2-PBO/assets/122107967/ca8e5cae-31b7-4a07-b4c5-72898ba44901)
  ![crud create](https://github.com/Novandra7/posttest2-PBO/assets/122107967/44793255-8344-4c78-b48f-d9eceb5c1cfa)
  ![crud read](https://github.com/Novandra7/posttest2-PBO/assets/122107967/325f80c4-76be-4de9-8983-06cd37c719db)
  ![crud update 1](https://github.com/Novandra7/posttest2-PBO/assets/122107967/b59e0644-3ff3-4454-88ba-db4b5a348c29)
  ![crud update 2](https://github.com/Novandra7/posttest2-PBO/assets/122107967/6bb099d9-0847-4643-a51f-7ffb554d63db)
  ![crud update 3](https://github.com/Novandra7/posttest2-PBO/assets/122107967/29460df7-ac05-49e2-81cf-dde32bcb9806)
  ![crud delete 1](https://github.com/Novandra7/posttest2-PBO/assets/122107967/484341f6-063b-4350-b8f4-65c172663fd6)
  ![crud delete 2](https://github.com/Novandra7/posttest2-PBO/assets/122107967/27856e21-4c7d-404f-ac8c-d86dfc23865f)
  ![crud delete 3](https://github.com/Novandra7/posttest2-PBO/assets/122107967/a4bcdde5-6f78-44c3-8d64-8799fb724923)
  ![crud pertambahan 1](https://github.com/Novandra7/posttest2-PBO/assets/122107967/303d13bc-97c6-4d4f-b0bc-dcef642eb7fe)
  ![crud pertambahan 2](https://github.com/Novandra7/posttest2-PBO/assets/122107967/81d57c24-4f2b-4c2d-ae51-87659a2132da)

  <li>Class bola</li>
  
  ![cs](https://github.com/Novandra7/posttest2-PBO/assets/122107967/c7e90b58-2d32-4204-a74f-306794800df1)
  ![gs](https://github.com/Novandra7/posttest2-PBO/assets/122107967/911953fb-631e-4ecd-abb3-65d2a309b605)
  ![ovr](https://github.com/Novandra7/posttest2-PBO/assets/122107967/b7dbd36a-7730-4aea-8f4f-fc5022638a26)

  <li>Class balok</li>

  ![cs](https://github.com/Novandra7/posttest2-PBO/assets/122107967/88698a71-f5c2-4c02-939c-b021d549cab0)
  ![gs](https://github.com/Novandra7/posttest2-PBO/assets/122107967/6e4d38cc-84e6-4509-8de4-f70407d8fc4d)
  ![ovr](https://github.com/Novandra7/posttest2-PBO/assets/122107967/a973bc1c-7c2a-4cbd-84c8-f6736bc3f7eb)

  <li>Class prisma_segitiga</li>
  
  ![cs](https://github.com/Novandra7/posttest2-PBO/assets/122107967/24935b50-3a8c-466e-9b4d-7f951b1252c0)
  ![gs](https://github.com/Novandra7/posttest2-PBO/assets/122107967/4b1e8749-72e0-4843-94ba-5d55c97d3973)
  ![ovr](https://github.com/Novandra7/posttest2-PBO/assets/122107967/31bab10e-e669-484d-bb71-84fd25903826)
</ol>

<h2>B. Penjelasan Source Code</h2>
<ol>
  <li>Class Main</li>
  <ul>
    <li>Penyataan Impor</li>
    <p>- Mengimpor kelas-kelas dari paket com.CRUD (yang kemungkinan berisi operasi untuk Create, Read, Update, dan Delete pada beberapa data).</p>
    <p>- Mengimpor kelas Scanner dari paket java.util, yang digunakan untuk membaca masukan dari pengguna.</p>
    <li>Deklarasi Kelas</li>
    <p>- Kelas ini diberi nama Main. Kata kunci public berarti bahwa kelas ini dapat diakses dari kelas lain. Kata kunci final berarti bahwa kelas ini tidak dapat diwariskan (yaitu, tidak dapat diperluas).</p>
    <li>Pengulangan Menu</li>
    <p>- Ini memulai pengulangan tak terbatas (while(true)), yang berarti menu akan terus muncul sampai program dihentikan secara manual.</p>
    <li>Opsi Menu</li>
    <p>- Dalam loop, menu dengan beberapa opsi ditampilkan kepada pengguna. Pengguna diminta untuk memasukkan pilihan mereka.</p>
    <p>- Bergantung pada masukan pengguna, blok kode tertentu dieksekusi. Ini menggunakan pernyataan switch dengan kasus untuk berbagai opsi.</p>
    <li>Panggilan Method</li>
    <p>- Bergantung pada pilihan pengguna, metode seperti pilihanBangunRuang(), crud.create(), crud.read(), dll., dipanggil.</p>
  </ul>
  <li>Class parent_bentuk</li>
  <p><t>Class parent_bentuk adalah kelas abstrak yang menyediakan dua metode abstrak: hitungLuas dan hitungVolume. Kelas turunan yang mewarisi kelas ini wajib memberikan implementasi untuk kedua metode tersebut. Ini memungkinkan untuk menggeneralisasi perilaku yang berkaitan dengan menghitung luas dan volume dari bentuk-bentuk tertentu (yang akan diimplementasikan dalam kelas-kelas turunan).</p>
  <li>Class crud</li>
  <p>Program ini menyediakan fungsi-fungsi untuk membuat, membaca, memperbarui, dan menghapus objek-objek geometri, serta melakukan perhitungan terkait dengan objek-objek tersebut. Program ini memanfaatkan konsep objek dan pengelolaan koleksi menggunakan ArrayList.</p>
  <li>Class bola</li>
  <p>Kelas bola merepresentasikan objek bola dalam geometri. Itu memiliki atribut jariJari dan tinggi, dan dapat menghitung luas dan volume sesuai dengan rumus yang diberikan.kelas bola juga mewarisi dan mengimplementasikan metode dari kelas parent_bentuk.</p>
  <li>Class balok</li>
  <p>Kelas balok merepresentasikan objek balok dalam geometri. Itu memiliki atribut tinggi, panjang, dan lebar, dan dapat menghitung luas permukaan serta volume sesuai dengan rumus yang diberikan. Kelas balok juga mewarisi dan mengimplementasikan metode dari kelas parent_bentuk.</p>
  <li>Class prisma_segitiga</li>
  <p>Kelas prisma_segitiga merepresentasikan objek prisma segitiga dalam geometri. Itu memiliki atribut luasAlas, luasSelimut, dan tinggi, dan dapat menghitung luas permukaan serta volume sesuai dengan rumus yang diberikan. Kelas prisma_segitiga juga mewarisi dan mengimplementasikan metode dari kelas parent_bentuk.</p>
</ol>

<h2>C. Penjelasan Output</h2>
<ol>
  <li>create</li>

  ![create](https://github.com/Novandra7/posttest2-PBO/assets/122107967/02cb1b3e-99b3-46d3-ba40-d4b47b6ad8bd)
  <p>Jadi, jika pengguna memilih opsi "1", maka program akan meminta input jari-jari bola dan tinggi bola, membuat objek bola baru, dan menambahkannya ke ArrayList arrayBola. Jika pengguna memilih opsi "2" atau "3", program akan melakukan operasi serupa untuk bangun ruang lainnya.</p>

  <li>read</li>

  ![read](https://github.com/Novandra7/posttest2-PBO/assets/122107967/dfdbf6e3-5b44-463e-ba45-2f01cf1727f3)
  <p>Jadi, output dari fungsi read akan tergantung pada apa yang terdapat dalam ArrayList terkait. Jika ArrayList kosong, maka program akan mencetak pesan bahwa ArrayList masih kosong. Jika tidak, program akan mencetak informasi dari objek-objek yang ada di dalamnya sesuai dengan tipe bangun ruang yang dipilih.</p>

  <li>update</li>

  ![update](https://github.com/Novandra7/posttest2-PBO/assets/122107967/ccdeceb6-4fec-4ecc-a325-8f1e7524cc28)
  <p>Jadi, output dari fungsi update akan tergantung pada pilihan dan input yang dimasukkan oleh pengguna. Jika pengguna memasukkan nomor atau data yang tidak valid, program akan memberikan pesan kesalahan. Jika pengguna memasukkan input yang valid, data objek yang terkait akan diperbarui sesuai dengan input baru.</p>

  <li>delete</li>

  ![delete](https://github.com/Novandra7/posttest2-PBO/assets/122107967/0f0d2d9e-f162-46e4-8e0f-7469d97de085)
  <p>Jadi, output dari fungsi delete akan tergantung pada pilihan dan input yang dimasukkan oleh pengguna. Jika pengguna memasukkan nomor atau data yang tidak valid, program akan memberikan pesan kesalahan. Jika pengguna memasukkan input yang valid dan objek berhasil dihapus dan pesan sukses akan dicetak.</p>

  <li>perhitungan</li>

  ![perhitungan](https://github.com/Novandra7/posttest2-PBO/assets/122107967/ef0e7eee-fc9a-490d-93a8-889d6c90fa1e)
  <p>Jadi, output dari fungsi perhitungan akan tergantung pada pilihan dan input yang dimasukkan oleh pengguna. Hasil perhitungan luas dan volume akan dicetak sesuai dengan objek yang dipilih oleh pengguna. Jika pengguna memasukkan nomor atau data yang tidak valid, program akan memberikan pesan kesalahan.</p>

  <li>ArrayList Kosong</li>

  ![arraylist kosong](https://github.com/Novandra7/posttest2-PBO/assets/122107967/1b3b7092-7005-4ca1-a93f-3af545565494)

  <li>Salah Input</li>

  ![masukkan angka](https://github.com/Novandra7/posttest2-PBO/assets/122107967/471a792f-347a-4c20-a296-dbb91fd6051f)

  <li>EXIT</li>

  ![exit](https://github.com/Novandra7/posttest2-PBO/assets/122107967/35aadbf7-b24f-4fd2-afb8-87357770bfb5)

</ol>
