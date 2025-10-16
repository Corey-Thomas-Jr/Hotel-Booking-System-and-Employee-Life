public abstract class Hotel_Restaurant {
    private String Count;
    private String Floor;

    public Hotel_Restaurant(String Count, String Floor){
        this.Count = Count;
        this.Floor = Floor;
    }

    public abstract String Greeting();
}
