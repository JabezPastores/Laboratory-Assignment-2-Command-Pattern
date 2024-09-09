public class ThermostatIncrease implements Command{
    private Thermostat thermostat;
    public ThermostatIncrease(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemp();
    }
}
