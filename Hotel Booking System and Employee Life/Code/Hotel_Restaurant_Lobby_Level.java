public class Hotel_Restaurant_Lobby_Level extends Hotel_Restaurant{

    public Hotel_Restaurant_Lobby_Level(String Count, String Floor) {
        super(Count, Floor);
    }

    @Override
    public String Greeting() { 
        String out = "Welcome to the Lobby Level Restaurant";
        return out;
    }
}
