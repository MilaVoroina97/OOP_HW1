public class Good {

    private String name;
    private int price;
    private int number;
    private String measurement;
    protected String type;

    protected Good(String name,int price,int number,String measurement){
        this.name = name;
        this.price = price;
        this.number = number;
        this.measurement = measurement;
    }

    protected String getName(){
        return this.name;
    }

    protected int getPrice(){
        return this.price;
    }

    protected int getNumber(){
        return this.number;
    }

    protected String getMeasurement(){
        return this.measurement;
    }

    protected String getType(){
        return this.type;
    }

    @Override
    public String toString(){
        return String.format("Type : %s , Name : %s , Price : %d , Number : %d, Measurement : %s",
        this.getType(), this.getName(),this.getPrice(),this.getNumber(),this.getMeasurement());
    }

}
