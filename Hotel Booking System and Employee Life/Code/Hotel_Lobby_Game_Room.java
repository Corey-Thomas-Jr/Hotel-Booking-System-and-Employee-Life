public class Hotel_Lobby_Game_Room extends Hotel_Game_Room {

    public Hotel_Lobby_Game_Room(String Count){
        super(Count);
    }

    @Override
    public String Greeting(){
        String out = "Welcome to the Lobby Game Room";
        return out;
    }

}
