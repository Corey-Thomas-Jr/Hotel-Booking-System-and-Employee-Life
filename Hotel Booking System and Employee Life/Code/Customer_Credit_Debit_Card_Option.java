public class Customer_Credit_Debit_Card_Option extends Customer {
    
    public Customer_Credit_Debit_Card_Option(String First_Name, String Last_Name, String Email, String Phone_Number){
        super(First_Name, Last_Name, Email, Phone_Number);
    }

    @Override
    public String Payment_Process(){
        String out = "Payment Successful with a 2.5% transaction fee";
        return out;
    }
}
