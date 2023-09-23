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
}