## Konsep Dasar Game

# Elemen Game

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
