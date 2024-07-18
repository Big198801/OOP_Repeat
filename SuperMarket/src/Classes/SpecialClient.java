package Classes;

public class SpecialClient extends Actor{
    private int idVip;
    public SpecialClient(String name, int id) {
        super(name);
        this.idVip = id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public int getIdVip(){
        return idVip;
    }
}
