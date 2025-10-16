public abstract class Hotel_Break_Room {
    private String People_Count;

    public Hotel_Break_Room(String People_Count){
        this.People_Count = People_Count;
    }

    public String getPeople_Count() {
        return People_Count;
    }

    public void setPeople_Count(String people_Count) {
        People_Count = people_Count;
    }

    public abstract String Greeting();
}
