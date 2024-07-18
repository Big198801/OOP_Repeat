package Classes;

public abstract class Actor {
    protected String name;
    protected Boolean isTakeOrder;
    protected Boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
