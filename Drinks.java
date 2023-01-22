public class Drinks extends Good{

    private double amount;
    protected Drinks(String name,int price,int number,String measurement,double amount){
        super(name,price,number,measurement);
        this.amount = amount;
        this.type = "Drinks";
    }

    protected double getAmount(){
        return this.amount;
    }

    @Override
    public String toString(){
        return String.format("%s\nAmount : %f",super.toString(),this.getAmount());
    }
}
