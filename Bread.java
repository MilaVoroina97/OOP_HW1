public class Bread extends Food{

    private String flourType;
    
    public Bread(String name,int price,int number,String measurement,int storage,String flourType){
        super(name, price, number, measurement, storage);
        this.flourType = flourType;
    }

    protected String getFlourType(){
        return this.flourType;
    }

    @Override
    public String toString(){
        return String.format("%s\nType of flour : %s ",
        super.toString(),this.getFlourType());
    }
}

