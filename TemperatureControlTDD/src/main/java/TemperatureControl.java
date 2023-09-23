import java.util.ArrayList;
import java.util.List;

public class TemperatureControl {
    private List<Integer> temperatures;

    public TemperatureControl() {
        this.temperatures = new ArrayList<>();
    }

    public void getInput(){
        temperatures.add(22);
        temperatures.add(20);
        temperatures.add(24);
        temperatures.add(17);
        temperatures.add(15);
        temperatures.add(23);
        temperatures.add(22);
    }

    public Integer getNumberOfTemperatures(){
        getInput();
        return temperatures.size();
    }

    public Double calculateAverage(){
        return 0.0;
    }
}
