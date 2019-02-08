package br.com.cit.dojo.ex5.model;

public class OrderHistory {
    private boolean paymentDone;
    private boolean paymentOnTime;

    public OrderHistory(boolean paymentDone, boolean paymentOnTime) {
        this.paymentDone = paymentDone;
        this.paymentOnTime = paymentOnTime;
    }

    public boolean isPaymentDone() {
        return paymentDone;
    }

    public void setPaymentDone(boolean paymentDone) {
        this.paymentDone = paymentDone;
    }

    public boolean isPaymentOnTime() {
        return paymentOnTime;
    }

    public void setPaymentOnTime(boolean paymentOnTime) {
        this.paymentOnTime = paymentOnTime;
    }
}
