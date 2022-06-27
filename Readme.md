#### Sejarah singkat
Java adalah bahasa pemrogramana tingkat tinggi yang berorientasi objek, di edarkan oleh <i>sun microsystem</i> pada awal tahun 1996. Sejarah awal Java berawal di tahun 1991 ketika satu group insinyur-insinyur Sun, yang di pimpin oleh [Ptrick Naughton](https://en.wikipedia.org/wiki/Patrick_Naughton) dan [James Golsing](https://id.wikipedia.org/wiki/James_Gosling), ingin mendesain sebuah bahasa pemrograman komputer yang berukuran kecil yang dapat digunakan untuk peralatan elektronika seperti switchboxes TV kabel. Untuk instalasi di window bisa mengikuti dari totorial dari [W3school.com](https://www.w3schools.com/java/java_getstarted.asp)

 ####  Install Java ubuntu via terminal
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
#### Database Menggunakan XAMPP
[XAMPP](https://www.apachefriends.org/download.html) merupakan web serve open source yang berjalan pada sistem operasi cross-platfrom (Windows, Linux, MacOS). Semua keperluan untuk mengelola Website tersedia di XAMPP seperti Apache, MySQL/MariaDB, PHP, dan Perl. <br>
Setalah anda berhasil mendownload xampp dari situs resiminya `CRTL+ALT+T` dan masuk ke folder download
```bush
muhaemin@mumu:~ cd/Downloads
```
Agar package installer dapat di eksekusi jalankan ketikan printah di bawah ini
```bush
sudo chmod +x xampp-linux-x64-8.1.2-0-installer.run
```
Konfirmasi permision agar dapat di eksekusi, jalankan:
```bush
ls -l xampp-linux-x64-8.1.2-0-installer.run
```
Dengan menjalankan printah `sudo` maka jalankan printah berikut untuk meluncurkan setup wizard:
```bush
sudo ./xampp-linux-x64-8.1.2-0-installer.run
```


