public abstract class Hotel_Pool {
    private String Count;
    private String Floor;

    public Hotel_Pool(String Count, String Floor){
        this.Count = Count;
        this.Floor = Floor;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public String getFloor() {
        return Floor;
    }

    public void setFloor(String floor) {
        Floor = floor;
    }

    public abstract String Greeting();
}
