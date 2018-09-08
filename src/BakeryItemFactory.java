public class BakeryItemFactory {

    public static BakeryItem getBakeryItem(String bakeryItemType, int calories,
                                           int carbs, int fat, int protein) {

        if (bakeryItemType.equalsIgnoreCase("applepie")) {
            return new ApplePie(calories, carbs, fat, protein);
        }

        if (bakeryItemType.equalsIgnoreCase("chocolatechipcookie")) {
            return new ChocolateChipCookie(calories, carbs, fat, protein);
        }

        if (bakeryItemType.equalsIgnoreCase("coffeecake")) {
            return new CoffeeCake(calories, carbs, fat, protein);
        }

        if  (bakeryItemType.equalsIgnoreCase("germancake")) {
            return new GermanCake(calories, carbs, fat, protein);
        }

        return null;
    }
}
