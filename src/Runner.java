public class Runner {
    public static void main(String[] args){
        Car c = new Car(2016, "Toyota", 10, "Pruis");
        c.setMiles(2400);
        System.out.println(c.toString());

        Rectangle r = new Rectangle(3, 4 );
        System.out.println(r.toString());
    }
}
