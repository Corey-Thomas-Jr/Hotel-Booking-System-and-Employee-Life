public class Customer_Cash_Option extends Customer{

    public Customer_Cash_Option(String First_Name, String Last_Name, String Email, String Phone_Number){
        super(First_Name, Last_Name, Email, Phone_Number);
    }

    @Override
    public String Payment_Process(){
        String out = "Payment Successful";
        return out;
    }

}
