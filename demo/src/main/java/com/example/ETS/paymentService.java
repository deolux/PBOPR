package com.example.ETS;

abstract class paymentService {
    public abstract String getPaymentStatus();
    public abstract String getPaymentMethod();
}

class OvoPayment extends paymentService {
    @Override
    public String getPaymentStatus() {
        return "Paid via OVO";
    }

    @Override
    public String getPaymentMethod() {
        return "OVO";
    }
}

class QrisPayment extends paymentService {
    @Override
    public String getPaymentStatus() {
        return "Paid via QRIS";
    }

    @Override
    public String getPaymentMethod() {
        return "QRIS";
    }
}

class CashPayment extends paymentService {
    @Override
    public String getPaymentStatus() {
        return "Paid in Cash";
    }

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}
