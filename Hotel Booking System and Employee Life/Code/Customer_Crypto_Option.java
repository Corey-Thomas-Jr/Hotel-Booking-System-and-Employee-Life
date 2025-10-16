public class Customer_Crypto_Option extends Customer {
    
    public Customer_Crypto_Option(String First_Name, String Last_Name, String Email, String Phone_Number){
        super(First_Name, Last_Name, Email, Phone_Number);
    }

    @Override
    public String Payment_Process(){
        String out = "Payment Successful with a 10% transaction fee";
        return out;
    }
}
