public class ThermostatGet implements Command{
    private Thermostat thermostat;
    public ThermostatGet(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.getTemperature();
    }
}
