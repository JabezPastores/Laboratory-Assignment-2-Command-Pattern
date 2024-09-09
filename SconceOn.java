public class SconceOn implements Command{
    private Sconce sconce;

    public SconceOn(Sconce sconce) {
        this.sconce = sconce;
    }

    @Override
    public void execute() {
        sconce.turnOn();
    }
}
