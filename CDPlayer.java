 public class CDPlayer implements Engine, Media, Break{
    @Override
    public void start() {
        System.out.println("CD Player is starting");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stopping");
    }

    @Override
    public void Break() {
        System.out.println("CD Player is braking");
    }

}