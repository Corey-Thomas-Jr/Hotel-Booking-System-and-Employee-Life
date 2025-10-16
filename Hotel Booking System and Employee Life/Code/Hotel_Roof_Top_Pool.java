public class Hotel_Roof_Top_Pool extends Hotel_Pool{

    public Hotel_Roof_Top_Pool(String Count, String Floor) {
        super(Count, Floor);
    }

    @Override
    public String Greeting() {
     String out = "Welcome to the Roof Top Pool";
     return out;
    }
}
