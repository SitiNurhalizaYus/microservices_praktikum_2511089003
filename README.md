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

```java
java -version
```

Cek Docker

```java
docker --version
```

Test Docker Container

```java
docker run hello-world
```

### Dokumentasi

* hasil `java -version`
   <img width="1173" height="340" alt="Screenshot 2026-03-08 232549" src="https://github.com/user-attachments/assets/832ab9af-d3e9-488a-9d27-005b2e7e779f" />

* hasil `docker --version`
   <img width="1199" height="386" alt="image" src="https://github.com/user-attachments/assets/cd54385f-9337-4424-9a0a-a2f07eade9ff" />

* hasil `docker run hello-world`
   <img width="1919" height="980" alt="Screenshot 2026-03-08 232758" src="https://github.com/user-attachments/assets/b982c6c0-9c7c-4a3c-be4a-956716362965" />


---

# Pertemuan 2 - REST API Sederhana

Pada pertemuan ini dibuat REST API menggunakan **Spring Boot**.

Case yang digunakan:

Focus Session Tracker
API untuk mencatat sesi fokus belajar.

Contoh data:

```java
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

```java
./mvnw spring-boot:run
```

Akses API:

```java
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

```java
Client
   ↓
Eureka Server
   ↓
Microservice
```

Menjalankan Eureka Server:

```java
./mvnw spring-boot:run
```

Dashboard Eureka:

```java
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

```java
Client
   ↓
API Gateway
   ↓
Eureka Server
   ↓
Microservice
```

Contoh akses API melalui Gateway:

```java
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


