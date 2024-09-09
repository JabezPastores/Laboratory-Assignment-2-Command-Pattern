public class ThermostatDecrease implements Command{
    private Thermostat thermostat;
    public ThermostatDecrease(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemp();
    }
}
