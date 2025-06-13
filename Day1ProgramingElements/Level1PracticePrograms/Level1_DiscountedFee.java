class DiscountedFee {
    public static void main(String[] args) {
        // Define fee and discount percentage
        double fee = 125000.0;
        double discountPercent = 10.0;
        
        // Calculate discount amount and final fee
        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;
        
        // Display result
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}