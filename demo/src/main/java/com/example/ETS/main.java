package com.example.ETS;
import com.google.gson.Gson;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            Delivery[] deliveries = gson.fromJson(new FileReader("data.json"), Delivery[].class);
            
            System.out.printf("%-20s %-10s %-10s %-15s %-20s %-15s %-10s %-15s %-15s%n",
                    "Product Name", "Quantity", "Weight", "Destination", "Service Package", "Service Value", "Total", "Payment Method", "Payment Status");

            for (Delivery delivery : deliveries) {
                int total = delivery.getQuantity() * delivery.getPriceItem() + delivery.getServicePackage().getValue();
                PaymentService payment = new OvoPayment(); // Bisa disesuaikan

                System.out.printf("%-20s %-10d %-10d %-15s %-20s %-15d %-10d %-15s %-15s%n",
                        delivery.getProductName(), delivery.getQuantity(), delivery.getWeight(),
                        delivery.getCity().getDestination(), delivery.getServicePackage().getService(),
                        delivery.getServicePackage().getValue(), total, payment.getPaymentMethod(), payment.getPaymentStatus());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
