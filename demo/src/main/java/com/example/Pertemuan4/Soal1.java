package com.example.Pertemuan4;
public class Soal1 
{
    public static void main(String[] args) 
    {
        // 1. Buat object product dengan quantity produk 10
        Product product = new Product("Laptop", 15000000, 10);

        // 3. Buat object sales
        Sales sales = new Sales(product);

        // 4. Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 5. Lakukan restock produk
        sales.restockProduct(10);

        // 6. Lakukan memperbarui harga produk
        sales.updateProductPrice(14000000);

        // 7. Coba lakukan memperbaharui harga produk dengan nilai negatif
        sales.updateProductPrice(-5000);
    }
}