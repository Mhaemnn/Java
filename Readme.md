#### Sejarah singkat
`Java` adalah bahasa pemrogramana tingkat tinggi yang berorientasi objek, di edarkan oleh <i>sun microsystem</i> pada awal tahun 1996. Sejarah awal Java berawal di tahun 1991 ketika satu group insinyur-insinyur Sun, yang di pimpin oleh [Ptrick Naughton](https://en.wikipedia.org/wiki/Patrick_Naughton) dan [James Golsing](https://id.wikipedia.org/wiki/James_Gosling), ingin mendesain sebuah bahasa pemrograman komputer yang berukuran kecil yang dapat digunakan untuk peralatan elektronika seperti switchboxes TV kabel.

 ####  Install Java
 Pertam-pertama, yang perlu dilakukan adalah memperbaharui repository pada ubuntu dengan menggunakan perintah berikut:
 ```bush
 sudo apt-get update && apt-get upgrade
```
Selanjutnya, Install Java Runtime Environment(JRE). JRE adalah perangkat lunak yang untuk menjalankan program/apalikasi yang berbasis java
```bush
sudo apt-get install default-jre
```
Install Java Development Kit (JDK). JDK ini adalah perangkat lunak yang digunakan untuk mengumpulakan kompilasi kode-kode Java yang dibuat oleh pengembang apaikasi lalau menerjemahkannya kedala bytecode untuk di jalankan oleh JRE. Masukan perintah berikut untuk install JDK
```bush
sudo atp-get install default-jdk
```
Cek versi, terakhir untuk memastikan Java terinstall. Anda bisa mengeceknya menggunakan perintah berikut.
```bush
java -version 
javac -version
```
jika instalasi berhasil, outputnya akan seperti di bahaw ini.
```bush
java VERSION "17.0.1" 2021-10-19 LTS
java (TM) SE Runtime Environment (build 17.0.1+12-LTS-39)
java HotSpot(TM) 64-Bit Server VM (build 17.0.1+12-LTS-39, mixed mode, sharing)
```


