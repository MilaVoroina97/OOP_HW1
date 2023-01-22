public class ChildGood extends Good{

    private int minAge;
    private boolean isHypoallergenic;


    protected ChildGood(String name,int price,int number,String measurement,int minAge,boolean isHypoallergenic){
        super(name, price, number, measurement);
        this.minAge = minAge;
        this.isHypoallergenic = isHypoallergenic;
        this.type = "Child Goods";
    }

    protected int getMinAge(){
        return this.minAge;
    }

    protected String IsHypoallergenic(){
        if(this.isHypoallergenic == true) return "Yes";
        else return "No";
    }

    
    @Override
    public String toString(){
        return String.format("%s\nMinAge : %d , Hypoallergenic : %s ",
        super.toString(),this.getMinAge(),this.IsHypoallergenic());
    }

    
}
