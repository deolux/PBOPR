package com.example.ETS;

class Delivery {
    private status status;
    private servicePackage servicePackage;
    private city city;
    private int weight;
    private int quantity;
    private int priceItem;
    private String productName;

    // Constructor, getter, setter
    public Delivery(status status, servicePackage servicePackage, city city, int weight, int quantity, int priceItem, String productName) {
        this.status = status;
        this.servicePackage = servicePackage;
        this.city = city;
        this.weight = weight;
        this.quantity = quantity;
        this.priceItem = priceItem;
        this.productName = productName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(int priceItem) {
        this.priceItem = priceItem;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public servicePackage getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(servicePackage servicePackage) {
        this.servicePackage = servicePackage;
    }

    public city getCity() {
        return city;
    }

    public void setCity(city city) {
        this.city = city;
    }
}
