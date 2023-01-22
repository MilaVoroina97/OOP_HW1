public class Food extends Good{

    private int storage;
    
    protected Food(String name,int price,int number,String measurement,int storage){
        super(name,price,number,measurement);
        this.storage = storage;
        this.type = "Food product";
    }

    protected int getStorage(){
        return this.storage;
    }

    @Override
    public String toString(){
        return String.format("%s\nStorage : %d", super.toString(),this.getStorage());
    }

}
