package Classes;

public class PromotionClient extends Actor{
    /**
     * Название акции
     */
    private String promotionName;


    /**
     * Счетчик акционных клиентов
     */
    public static int promoClientsCount ;


    public PromotionClient(String name) {
        super(name);
        this.currentClientCount = ++promoClientsCount;
        this.promotionName = "-10%";
        setPromoStatus();
    }
    public String getPromotionName() {
        return promotionName;
    }
    @Override
    public int getCurrentClientCount() {
        return this.currentClientCount;
    }

    @Override
    public String getName() {
        return super.name;
    }

//    @Override
//    public int getPromoClientsCount() {
//        return this.promoClientsCount;
//    }

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


    public void setPromoStatus(){
        super.isPromoClient = true;
    }
    public boolean getPromoStatus(){
        return super.isPromoClient;
    }
}
