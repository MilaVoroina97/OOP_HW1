public class Program {
    private static void showInfo(Good[] all){
        for(Good good : all){
            System.out.println(good.toString());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Bread bread = new Bread("Батон", 100, 5, "шт", 10, "Первый сорт");
        Diapers diapers = new Diapers("Pampers", 250, 50, "шт", 2, true, 
        5, 2, 1, "M");
        Eggs egg = new Eggs("Яичко", 80, 15, "шт", 10, 10);
        Lemonade lemonade = new Lemonade("Буратино", 50, 5, "л", 5);
        Masks mask = new Masks("Pantente", 40, 100, "шт", 1);
        Milk milk = new Milk("Веселый молочник", 56, 2, "л", 6, 3.2);
        Nipple nipple = new Nipple("Сосочка", 150, 1, "шт", 1, false);
        ToiletPaper toiletPaper = new ToiletPaper("Zewa", 259, 10, "шт", 8, 3);

        Good[] all = new Good[]{bread,diapers,egg,mask,milk,nipple,toiletPaper,lemonade};

        showInfo(all);

    }
}
