public class SprinklerOff implements Command{
    private SmartSprinkler smartsprinkler;

    public SprinklerOff(SmartSprinkler smartsprinkler) {
        this.smartsprinkler = smartsprinkler;
    }

    @Override
    public void execute() {
        smartsprinkler.turnOff();
    }
}
