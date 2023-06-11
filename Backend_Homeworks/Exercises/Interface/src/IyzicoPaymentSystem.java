public class IyzicoPaymentSystem implements PaymentProvider{

    @Override
    public boolean cancelCharge(int chargeId) {
        return true;
    }

    @Override
    public int charge(double totalPrice) {
        return (int)totalPrice;
    }

    @Override
    public String loadInvoice(int chargeId) {
        return String.valueOf(chargeId);
    }
    
}
