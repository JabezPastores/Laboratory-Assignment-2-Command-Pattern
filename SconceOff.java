public class SconceOff implements Command{
    private Sconce sconce;

    public SconceOff(Sconce sconce) {
        this.sconce = sconce;
    }

    @Override
    public void execute() {
        sconce.turnOff();
    }
}
