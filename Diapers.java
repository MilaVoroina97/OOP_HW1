public class Diapers extends ChildGood{

    private int size;
    private double maxWeight;
    private double minWeight;
    private String sexType;

    public Diapers(String name,int price,int number,String measurement,int minAge,boolean isHypoallergenic,
    int size,double maxWeight,double minWeight,String sexType){

        super(name, price, number, measurement, minAge, isHypoallergenic);

        this.size = size;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.sexType = sexType;

    }

    protected int getSize(){
        return this.size;
    }

    protected double getMaxWeight(){
        return this.maxWeight;
    }

    protected double getMinWeight(){
        return this.minWeight;
    }

    protected String getSexType(){
        return this.sexType;
    }

    @Override
    public String toString(){
        return String.format("%s\nSize: %s\nMin weight: %f\nMax weight: %f\nSex type: %s",
        super.toString(),this.getSize(),this.getMinWeight(), this.getMinWeight(), this.getSexType());
    }

}
