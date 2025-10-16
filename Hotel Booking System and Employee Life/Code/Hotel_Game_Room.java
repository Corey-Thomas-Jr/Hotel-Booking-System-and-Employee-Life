public abstract class Hotel_Game_Room {
    private String Count;

    Hotel_Game_Room(String Count){
        this.Count = Count;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public abstract String Greeting();

}
