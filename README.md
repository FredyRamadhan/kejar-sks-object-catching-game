# Konsep Dasar Game

## Elemen Game

- karakter
- background
- ground, atau tempat jalan karakternya
- poin
- obstacle
- level
  
## Penjelasan Elemen

1. **Karakter**
- sumbu x statis, karena yang bergerak itu `Background`-nya
- sumbu y bisa bertambah (melompat:: arrow up) atau berkurang (menunduk:: arrow down)

2. **Background**
- sumbu y statis, karena hanya bergerak ke belakang
- sumbu y berkurang secara konsisten (gambar bergerak ke kiri), sampai habis gambarnya, lalu diulang dari awal biar kelihatan endless loop
  
3. **Ground (pijakan)**
- sumbu y statis
- sumbu x berkurang (bergeser ke kiri) secara konsisten dengan speed yang lebih cepat dari `Background` (biar ada efek depth atau 3D)
  
4. **Poin**
- Poin di-spawn di `ground`, beberapa melayang (supaya karakter perlu jump)
- sumbu y statis
- sumbu x berkurang (bergeser ke kiri) secara konstan dengan kecepatan yang sama dengan `Ground`
  
5. **Obstacle**
- `Obstacle` di-spawn di `ground`, beberapa melayang dengan height (sumbu y) yang beragam (supaya perlu jump atau duck untuk menghindar)
- sumbu y statis (di-set di awal)
- sumbu x berkurang (bergeser ke kiri) dengan kecepatan yang sama dengan `Ground`
  
6. **Level**
- Level ditentukan dengan banyaknya poin yang di-spawn (bukan banyaknya poin yang didapatkan)

# Storyline Game
1. Level
   - level minimal ada 4 (4 tahun kuliah) 
   - setiap jumlah poin yang di-spawn memenuhi akan pindah level (jumlah sks diambil terpenuhi)
     
2. Scoring system
   - poin yang didapat akan dijumlah dan dibagi jumlah poin yang dispawn (jumlah nilai dibagi jumlah SKS yang diambil; jadi GPA atau IPK)
   - poin akan berkurang jika karakter mengenai obstacle (otomatis jumlah poin yang didapat berkurang dan rerata IPK juga akan turun)
     
3. Game Termination
   - Apabila rerata IPK mencapai 0, game akan di-terminate, player gagal
   - apabila rerata IPK berada di batas minimum, player tidak akan di-terminate dan akan lanjut di level berikutnya
     
4. Game Completion
   - Game akan selesai ketika poin sudah memenuhi batas minimum
   - Game akan selesai apabila rerata IPK memenuhi batas minimum
   - Apabila player sudah mencapai level 4 dan IPK belum memenuhi, maka akan ada level tambahan dengan beberapa spawn `poin`
   - Apabila player menjalani level tambahan dan IPK memenuhi, game selesai
   - maksimal tambahan level adalah 2
   - Apabila tambahan level sudah mencapai 2 dan IPK belum memenuhi, maka game akan di-terminate (fail)
  
5. Awards
   - Apabila IPK player memenuhi batas minimum selama masih di level 4 atau kurang, Player akan mendapat predikat cumlaude
   - Apabila IPK player memenuhi batas minimum setelah mendapat level tambahan, player tidak akan mendapat cumlaude
   - Apabila player di-terminate (fail), tidak akan mendapat apa-apa


   
