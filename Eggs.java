public class Eggs extends Food{

    private int numbInOnePack;

    public Eggs(String name,int price,int number,String measurement,int storage,int numbInOnePack){

        super(name, price, number, measurement, storage);
        this.numbInOnePack = numbInOnePack;

    }

    protected int getNumInPack(){
        return this.numbInOnePack;
    }

    @Override
    public String toString(){
        return String.format("%s\nNumber of eggs in ine package: %d ",
        super.toString(),this.getNumInPack());
    }
}
