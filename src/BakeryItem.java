public abstract class BakeryItem {
    public abstract int getCarbs();
    public abstract int getCalories();
    public abstract int getFat();
    public abstract int getProtein();

    @Override
    public String toString() {
        return "[Calories : " + this.getCalories() + "]. [Carbs : " + this.getCarbs()
                + "]. [Fat : " + getFat() + "]. [Protein : " + this.getProtein() + "].";
    }
}
