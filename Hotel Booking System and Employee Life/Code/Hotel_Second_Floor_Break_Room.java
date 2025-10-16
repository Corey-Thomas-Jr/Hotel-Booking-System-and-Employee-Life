public class Hotel_Second_Floor_Break_Room extends Hotel_Break_Room{

    public Hotel_Second_Floor_Break_Room(String People_Count){
        super(People_Count);
    }

    @Override
    public String Greeting(){
        String out = "Welcome to the Second Floor Break Room";
        return out;
    }

}
