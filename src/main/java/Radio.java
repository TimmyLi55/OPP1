import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int numberOfStation;
    private int volume;
    private int maxNumberOfStation;
    private int maxVolume = 100;
    private int minVolume;
    private int maxStation = maxNumberOfStation;
    private int minStation;
}