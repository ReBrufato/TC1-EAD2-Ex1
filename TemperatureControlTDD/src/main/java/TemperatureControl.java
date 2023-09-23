import java.util.ArrayList;
import java.util.List;

public class TemperatureControl {
    private List<Integer> temperatures;
    private Double media;

    public TemperatureControl(List<Integer> temperatures) {
        this.temperatures = temperatures;
        this.media = null;
    }

    public TemperatureControl() {
        this.temperatures = new ArrayList<>();
        this.media = null;
        getInput();
    }

    public void getInput(){
        temperatures.add(20);
        temperatures.add(20);
        temperatures.add(20);
        temperatures.add(20);
        temperatures.add(20);
        temperatures.add(20);
        temperatures.add(20);
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
        return 0;
    }
}
