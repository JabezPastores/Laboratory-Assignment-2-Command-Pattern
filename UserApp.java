public class UserApp {
    public static void main(String [] args){
        RemoteControl remote = new RemoteControl();
        //sconce
        Sconce sconce = new Sconce();
        Command sconceOff = new SconceOff(sconce);
        Command sconceOn = new SconceOn(sconce);

        remote.setCommand(sconceOn);
        remote.pressButton();

        remote.setCommand(sconceOff);
        remote.pressButton();

        //smartDoor
        SmartDoor smartDoor = new SmartDoor();
        Command SmartDoorLock = new SmartDoorLock(smartDoor);
        Command SmartDoorUnlock = new SmartDoorUnlock(smartDoor);

        remote.setCommand(SmartDoorLock);
        remote.pressButton();

        remote.setCommand(SmartDoorUnlock);
        remote.pressButton();

        //smartSprinkler

        SmartSprinkler smartSprinkler = new SmartSprinkler();
        Command SprinklerOn = new SprinklerOn(smartSprinkler);
        Command SprinklerOff = new SprinklerOff(smartSprinkler);

        remote.setCommand(SprinklerOn);
        remote.pressButton();

        remote.setCommand(SprinklerOff);
        remote.pressButton();

        //thermostat
        Thermostat thermostat = new Thermostat();
        Command thermostatOn = new ThermostatOn(thermostat);
        Command thermostatOff = new ThermostatOff(thermostat);

        Command thermostatIncrease = new ThermostatIncrease(thermostat);
        Command thermostatDecrease = new ThermostatDecrease(thermostat);

        Command thermostatGet = new ThermostatGet(thermostat);

        int temperatureToSet = 24;
        Command thermostatSet = new ThermostatSet(thermostat, temperatureToSet);

        remote.setCommand(thermostatOn);
        remote.pressButton();

        remote.setCommand(thermostatSet);
        remote.pressButton();

        remote.setCommand(thermostatIncrease);
        remote.pressButton();

        remote.setCommand(thermostatDecrease);
        remote.pressButton();

        remote.setCommand(thermostatGet);
        remote.pressButton();

        remote.setCommand(thermostatOff);
        remote.pressButton();
    }
}
