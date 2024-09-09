public class SmartDoorUnlock implements Command{
    private SmartDoor smartdoor;

    public SmartDoorUnlock(SmartDoor smartdoor) {
        this.smartdoor = smartdoor;
    }

    @Override
    public void execute() {
        smartdoor.unlockDoor();
    }
}
