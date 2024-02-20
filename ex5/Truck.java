public class Truck extends Car{
    public int weight;
    
    public Truck(int speed, double regularPrice, String color, int weight){
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        if(weight > 2000){
            regularPrice = regularPrice - regularPrice * 10/100;
        } else {
            regularPrice = regularPrice - regularPrice * 20 / 100;
        }
        
        return regularPrice;
    }
}
