
public class Office extends Room{
    private String owner;

    public Office(){}

    public Office(String number, int capacity, int area, String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }



}