import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class TemperatureControl {
    private List<Integer> temperatures;
    private Double media;

    private Scanner input;

    public TemperatureControl(List<Integer> temperatures) {
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
        String temp[] = input.nextLine().split(" ");
        for (String temperature: temp) {
            temperatures.add(Integer.parseInt(temperature));
        }
        validateEntry();
    }

    public Boolean validateEntry(){
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
        for (Integer tempepature : temperatures) {soma = soma + tempepature;}
        return soma;
    }

    public Integer daysAboveAverage(){
        Integer aboveMedia = 0;
        media = calculateAverage();
        for (Integer tempepature : temperatures) {
            if (tempepature > media) aboveMedia ++;
        }
        return aboveMedia;
    }
}
