public class Main {
    public static void main(String[] args) {
        TemperatureControl temperatureControl = new TemperatureControl();
        temperatureControl.calculateAverage();
        System.out.println(temperatureControl.getMedia());
        System.out.println(temperatureControl.daysAboveAverage());
    }
}
