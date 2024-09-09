public class Thermostat {
    private int temperature;

    public void turnOn(){
        System.out.println("The thermostat is on");
    }
    public void turnOff(){
        System.out.println("The thermostat is off");
    }
    public int getTemperature(){
        System.out.println("Thermostat temperature is " + this.temperature);
        return temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("The current temperature is: " + temperature + "celsius.");
    }
    public void increaseTemp(){
        this.temperature = temperature + 1;
        System.out.println("The temperature have been increased by 1 degree celsius.");
    }
    public void decreaseTemp(){
        this.temperature = temperature + 1;
        System.out.println("The temperature have been decreased by 1 degree celsius.");
    }
}
