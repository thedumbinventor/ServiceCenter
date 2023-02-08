public class Car implements ServiceType{



    @Override
    public void oilChange() {
        System.out.println("Car Oil Changed ");

    }

    @Override
    public void brakePad() {
        System.out.println("Car BrakePad Changed");

    }

    @Override
    public void denting() {
        System.out.println("Car Dent Removed");

    }

    @Override
    public void painting() {
        System.out.println("Car Paint JOB dONE");

    }


}
