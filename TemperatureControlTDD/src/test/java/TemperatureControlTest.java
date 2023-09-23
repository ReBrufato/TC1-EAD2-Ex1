import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

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
        TemperatureControl sut = new TemperatureControl();
        Double media = sut.calculateAverage();
        assertThat(media).isEqualTo(20.0);
    }
}