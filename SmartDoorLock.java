public class SmartDoorLock implements Command{
    private SmartDoor smartdoor;

    public SmartDoorLock(SmartDoor smartdoor) {
        this.smartdoor = smartdoor;
    }

    @Override
    public void execute() {
        smartdoor.lockDoor();
    }
}
