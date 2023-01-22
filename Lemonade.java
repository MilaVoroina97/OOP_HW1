public class Lemonade extends Drinks{

    public Lemonade(String name,int price,int number,String measurement,double amount){

        super(name, price, number, measurement, amount);

    }

    @Override
    public String toString(){
        return String.format(super.toString());
    }
    
}
