public class Ford extends Car{
    public int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public double getSalePrice() {
        regularPrice = regularPrice - regularPrice * manufacturerDiscount / 100;
        return regularPrice;
    }
}
