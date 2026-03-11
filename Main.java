public class Main {
    public static void main(String[] args) {
        
        // Car car1 = new Car("Mustang","Red");
        // Car car2 = new Car("Coverter", "Blue");
        // Car car3 = new Car("Charger","Yellow");

        // Car[] cars = {car1,car2,car3};
        // these are annonymos object without creating an unique object we can create it .
        Car[] cars = {new Car("Mustang","Red"),
                    new Car("Coverter", "Blue"),
                    new Car("Charger","Yellow")};
        // this array is called array of object.
        for(Car car : cars){
            car.drive();
        }

    



    }
}