public class Car{
    String color;
    int speed;
    void drive(){
    System.out.println("The " +color+" car is driving at " +speed+" Km/h:");
    }
    public static void main(String[] args) {
        Car c1=new Car();
        c1.color="blue";
        c1.speed=180;
        c1.drive();
    }
}
