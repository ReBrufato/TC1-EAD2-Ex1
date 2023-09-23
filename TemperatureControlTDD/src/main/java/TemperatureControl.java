import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperatureControl {
    private List<String> temperatures;

    private Double media;

    private Scanner input;

    public Double getMedia() {
        return media;
    }

    public TemperatureControl(List<String> temperatures) {
        this.temperatures = temperatures;
        this.media = null;
    }

    public TemperatureControl() {
        this.temperatures = new ArrayList<>();
        this.media = null;
        this.input = new Scanner(System.in);
        getInput();
    }

    public void getInput(){
        System.out.println("Digite as temperaturas: ");
        temperatures = List.of(input.nextLine().split(" "));
        validateNumberEntries();
    }

    public Boolean validateNumberEntries(){
        if (getNumberOfTemperatures() < 7 || getNumberOfTemperatures() > 7){
            throw new IllegalArgumentException("Número de entradas inválido!");
        }
        return true;
    }

    public Integer getNumberOfTemperatures(){
        return temperatures.size();
    }

    public Double calculateAverage(){
        media = sumTemperatures()/7.00;
        return media;
    }

    public Double sumTemperatures(){
        Double soma = 0.00;
        for (String temperature : temperatures) {soma = soma + Double.parseDouble(temperature);}
        return soma;
    }

    public Integer daysAboveAverage(){
        Integer aboveMedia = 0;
        media = calculateAverage();
        for (String temperature : temperatures) {
            if (Integer.valueOf(temperature) > media) aboveMedia ++;
        }
        return aboveMedia;
    }
}
