public class Hotel_Lobby_Floor_Pool extends Hotel_Pool{

    public Hotel_Lobby_Floor_Pool(String Count, String Floor) {
        super(Count, Floor);
    }

    @Override
    public String Greeting() {
     String out = "Welcome to the Lobby Floor Pool";
     return out;
    }
}
