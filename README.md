# Praktikum Arsitektur Berbasis Layanan (Microservices)

Repository ini berisi hasil praktikum mata kuliah **Arsitektur Berbasis Layanan**.
Setiap pertemuan berisi implementasi dan dokumentasi yang diupload secara bertahap.

---

# Daftar Isi

* [Pertemuan 1](#pertemuan-1---setup-environment) - Setup Environment
* [Pertemuan 2](#pertemuan-2---rest-api-sederhana)  - REST API Sederhana
* [Pertemuan 3](#pertemuan-3---service-discovery) - Service Discovery
* [Pertemuan 4](#pertemuan-4---api-gateway) - API Gateway

---

# Tools dan Teknologi

* Java
* Spring Boot
* Docker
* Spring Cloud
* Eureka Service Discovery
* API Gateway
* Visual Studio Code
* Postman



---

# Pertemuan 1 - Setup Environment

Pada pertemuan ini dilakukan instalasi tools yang dibutuhkan untuk pengembangan microservices.

Tools yang diinstall:

* Java JDK
* Visual Studio Code
* Docker Desktop
* Postman

### Verifikasi Instalasi

Cek Java

```
java -version
```

Cek Docker

```
docker --version
```

Test Docker Container

```
docker run hello-world
```

### Dokumentasi

* hasil `java -version`
* hasil `docker --version`
* hasil `docker run hello-world`


---

# Pertemuan 2 - REST API Sederhana

Pada pertemuan ini dibuat REST API menggunakan **Spring Boot**.

Case yang digunakan:

Focus Session Tracker
API untuk mencatat sesi fokus belajar.

Contoh data:

```
{
"id":1,
"activity":"Belajar Machine Learning",
"method":"Pomodoro",
"duration":90
}
```

Endpoint API:

| Method | Endpoint       | Deskripsi          |
| ------ | -------------- | ------------------ |
| GET    | /sessions      | Melihat semua sesi |
| POST   | /sessions      | Menambahkan sesi   |
| DELETE | /sessions/{id} | Menghapus sesi     |

Menjalankan aplikasi:

```
./mvnw spring-boot:run
```

Akses API:

```
http://localhost:8080/sessions
```

### Dokumentasi

* project di VS Code
* hasil API di browser / Postman

---

# Pertemuan 3 - Service Discovery

Pada pertemuan ini diimplementasikan **Service Discovery menggunakan Eureka**.

Komponen sistem:

* Eureka Server
* Focus Session Service

Arsitektur:

```
Client
   ↓
Eureka Server
   ↓
Microservice
```

Menjalankan Eureka Server:

```
./mvnw spring-boot:run
```

Dashboard Eureka:

```
http://localhost:8761
```

### Dokumentasi

* Dashboard Eureka
* Service yang berhasil register

---

# Pertemuan 4 - API Gateway

Pada pertemuan ini dibuat **API Gateway menggunakan Spring Cloud Gateway**.

Fungsi API Gateway:

* menjadi pintu masuk utama sistem
* mengarahkan request ke service yang sesuai

Arsitektur sistem:

```
Client
   ↓
API Gateway
   ↓
Eureka Server
   ↓
Microservice
```

Contoh akses API melalui Gateway:

```
http://localhost:8080/sessions
```

### Dokumentasi

* Konfigurasi API Gateway
* Hasil request API melalui Gateway

---

# Author
> _Nama: Siti Nurhaliza Yus_ |
> _NIM: 2511089003_ |
> _Kelas: TRPL- Alih Kredit_


