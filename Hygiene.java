public class Hygiene extends Good{

    private int numOfPieces;
    protected Hygiene(String name,int price,int number,String measurement,int numOfPieces){

        super(name, price, number, measurement);
        this.numOfPieces =  numOfPieces;
        this.type = "Hygiene items";
    }

    protected int getNumOfPieces(){
        return this.numOfPieces;
    }

    @Override
    public String toString(){
        return String.format("%s\nNumber of pieces in pack : %d", super.toString(), this.getNumOfPieces());
    }
}
