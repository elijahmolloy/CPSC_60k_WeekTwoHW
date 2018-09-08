public class FactoryTest {


    // I wonder if it would be appropriate to assign an enum for bakeryItemType instead of a string..?
    public static void main(String[] args) {
        BakeryItem applePie = BakeryItemFactory.getBakeryItem("applepie", 10, 10, 10, 10);
        BakeryItem chocolateChipCookie = BakeryItemFactory.getBakeryItem("chocolatechipcookie", 100, 100, 100, 100);
        BakeryItem coffeeCake = BakeryItemFactory.getBakeryItem("coffeeCake", 1000, 1000, 1000, 1000);
        BakeryItem germanCake = BakeryItemFactory.getBakeryItem("germancake", 500, 500, 500, 500);

        System.out.println("Apple Pie : " + applePie.toString());
        System.out.println("Chocolate Chip Cookie : " + chocolateChipCookie.toString());
        System.out.println("Coffee Cake : " + coffeeCake.toString());
        System.out.println("German Cake : " + germanCake.toString());
    }
}
