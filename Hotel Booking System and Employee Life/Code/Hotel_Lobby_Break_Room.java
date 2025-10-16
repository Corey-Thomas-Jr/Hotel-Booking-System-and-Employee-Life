public class Hotel_Lobby_Break_Room extends Hotel_Break_Room{
    
    public Hotel_Lobby_Break_Room(String People_Count){
        super(People_Count);
    }

    @Override
    public String Greeting(){
        String out = "Welcome to the Lobby Break Room";
        return out;
    }
}
