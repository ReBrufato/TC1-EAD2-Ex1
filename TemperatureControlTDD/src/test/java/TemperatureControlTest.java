import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

class TemperatureControlTest {
    @Test
    @DisplayName("theUserMustEnterSevenTemperatureValues")
    void theUserMustEnterSevenTemperatureValues() {
        TemperatureControl sut = new TemperatureControl();
        Integer numberInputs = sut.getNumberOfTemperatures();
        assertThat(numberInputs).isEqualTo(7);
    }

    @Test
    @DisplayName("theAverageMustBeEqualTo20")
    void theAverageMustBeEqualTo20() {
        List<Integer> list = new ArrayList<>();
        list.add(20); list.add(20); list.add(20); list.add(22); list.add(18); list.add(17); list.add(23);

        TemperatureControl sut = new TemperatureControl(list);
        Double media = sut.calculateAverage();
        assertThat(media).isEqualTo(20.0);
    }

    @Test
    @DisplayName("theAverageMustBeEqualTo30")
    void theAverageMustBeEqualTo30() {
        List<Integer> list = new ArrayList<>();
        list.add(30); list.add(27); list.add(30); list.add(33); list.add(30); list.add(32); list.add(28);

        TemperatureControl sut = new TemperatureControl(list);
        Double media = sut.calculateAverage();
        assertThat(media).isEqualTo(30.0);
    }

    @Test
    @DisplayName("shouldReturnOneDayAboveAverage")
    void shouldReturnOneDayAboveAverage() {
        List<Integer> list = new ArrayList<>();
        list.add(30); list.add(30); list.add(30); list.add(33); list.add(30); list.add(30); list.add(30);

        TemperatureControl sut = new TemperatureControl(list);
        assertThat(sut.daysAboveAverage()).isEqualTo(1);
    }

    @Test
    @DisplayName("ifUserEntersAnIncorrectNumberOfTemperaturesAnIllegalArgumentExceptionMustBeThrown.")
    void ifUserEntersAnIncorrectNumberOfTemperaturesAnIllegalArgumentExceptionMustBeThrown() {
        List<Integer> list = new ArrayList<>();
        list.add(30); list.add(30); list.add(30); list.add(33);

        TemperatureControl sut = new TemperatureControl(list);
        assertThrows(IllegalArgumentException.class,
                () -> {
                    sut.validateEntry();
                });
    }
}