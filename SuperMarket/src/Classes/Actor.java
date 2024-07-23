package Classes;

import Interfaces.iActorBehaviour;


import javax.swing.border.Border;

public abstract class Actor implements iActorBehaviour{
    protected String name;

    protected Boolean isTakeOrder = false;

    protected Boolean isMakeOrder = false;
    protected Boolean isPromoClient = false;

    protected int currentClientCount;


    public Actor(String name) {
        this.name = name;
    }
    public abstract String getName();

    /**
     *
     * @return Возвращает количество созданных акционных клиентов
     */

    public abstract int getCurrentClientCount();

//    public boolean isMakeOrder(){
//         return isMakeOrder;
//    }
//    @Override
//    public boolean isTakeOrder() {
//        return false;
//    }
//
//    public void setTakeOrder(boolean makeOrder){
//        isMakeOrder = makeOrder;
//    }
//
//
//    @Override
//    public void setMakeOrder(boolean MakeOrder) {
//
//    }
}
