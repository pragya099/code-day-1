 public class Car implements Engine, Media, Break{
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void Break() {
        System.out.println("Car is braking");
    }

}