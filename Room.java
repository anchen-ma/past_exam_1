public abstract class Room implements Comparable<Room>{
    private String number;
    private int capacity;
    private int area;

    public Room() {
    }

    public Room(String number, int capacity, int area) {
        this.number = number;
        this.capacity = capacity;
        this.area = area;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "{" +
            " number='" + getNumber() + "'" +
            ", capacity='" + getCapacity() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

    public int compareTo(Room r){
        
    }

}