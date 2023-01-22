public class Milk extends Food{

    private double percentOfFat;
    public Milk(String name,int price,int number,String measurement,int storage,double percentOfFat){
        super(name, price, number, measurement, storage);
        this.percentOfFat = percentOfFat;
    }

    protected double getPercentFat(){
        return this.percentOfFat;
    }

    @Override
    public String toString(){
        return String.format("%s\nPercent of fat : %s ",
        super.toString(),this.getPercentFat());
    }
}
