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

    @Override
    public int getCurrentClientCount() {
        return  -1;
    }

    public int getIdVip(){
        return idVip;
    }

    @Override
    public void setMakeOrder(boolean MakeOrder) {
        super.isMakeOrder = MakeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }



    @Override
    public Actor getActor() {
        return this;
    }

    public boolean getPromoStatus(){
        return super.isPromoClient;
    }
}
