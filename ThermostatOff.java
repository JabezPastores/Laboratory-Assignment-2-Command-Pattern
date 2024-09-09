public class ThermostatOff implements Command{
    private Thermostat thermostat;
    public ThermostatOff(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.turnOff();
    }
}
