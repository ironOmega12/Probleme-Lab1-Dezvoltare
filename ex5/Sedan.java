public class Sedan extends Car{
    public int length;
    
    public Sedan(int speed, double regularPrice, String color, int length){
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        if(length > 20){
            regularPrice = regularPrice - regularPrice * 5/100;
        } else {
            regularPrice = regularPrice - regularPrice * 10 / 100;
        }
        
        return regularPrice;
    }
}
