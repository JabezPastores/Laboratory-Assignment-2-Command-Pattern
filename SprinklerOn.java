public class SprinklerOn implements Command{
    private SmartSprinkler smartsprinkler;

    public SprinklerOn(SmartSprinkler smartsprinkler) {
        this.smartsprinkler = smartsprinkler;
    }

    @Override
    public void execute() {
        smartsprinkler.turnOff();
    }
}
