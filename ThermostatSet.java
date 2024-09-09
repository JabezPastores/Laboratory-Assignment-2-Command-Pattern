public class ThermostatSet implements Command{
    private Thermostat thermostat;
    private int temperature;
    public ThermostatSet(Thermostat thermostat, int temperature){
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }
}
