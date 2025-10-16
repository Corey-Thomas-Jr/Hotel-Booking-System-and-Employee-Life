public class Hotel_Restaurant_Roof_Top extends Hotel_Restaurant{

    public Hotel_Restaurant_Roof_Top(String Count, String Floor) {
        super(Count, Floor);
    }

    @Override
    public String Greeting() { 
        String out = "Welcome to the Roof Top Restaurant";
        return out;
    }
    
}
