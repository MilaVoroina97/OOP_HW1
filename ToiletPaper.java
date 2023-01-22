public class ToiletPaper extends Hygiene{

    private int layers;
    public ToiletPaper(String name,int price,int number,String measurement,int numOfPieces,int layers){

        super(name, price, number, measurement, numOfPieces);
        this.layers = layers;

    }

    protected int getLayers(){
        return this.layers;
    }

    @Override
    public String toString(){
        return String.format("%s\nNumber of layers : %d", super.toString(), this.getLayers());
    }
}
