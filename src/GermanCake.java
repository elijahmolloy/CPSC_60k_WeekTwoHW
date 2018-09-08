public class GermanCake extends BakeryItem {

    private int calories;
    private int carbs;
    private int fat;
    private int protein;

    public GermanCake(int calories, int carbs, int fat, int protein) {
        this.calories = calories;
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
    }

    @Override
    public int getCarbs() {
        return this.carbs;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }

    @Override
    public int getFat() {
        return this.fat;
    }

    @Override
    public int getProtein() {
        return this.protein;
    }
}
