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

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            volume = maxVolume;
        } else if (newVolume < minVolume) {
            volume = minVolume;
        } else {
            volume = newVolume;
        }
    }

    public void setVolumeUp() {
        if (volume + 1 >= maxVolume) {
            volume = maxVolume;
        } else {
            volume = volume + 1;
        }

    }

    public void setVolumeDown() {
        if (volume - 1 <= minVolume) {
            volume = minVolume;
        } else {
            volume = volume - 1;
        }
    }

    public void setNumberOfStation(int newNumber) {
        if (newNumber > maxStation) {
            return;
        } else if (newNumber < minStation) {
            return;
        } else {
            numberOfStation = newNumber;
        }
    }

    public void setNumberOfStationNext() {
        if (numberOfStation + 1 > maxStation) {
            numberOfStation = minStation;
        } else {
            numberOfStation = numberOfStation + 1;
        }
    }

    public void setNumberOfStationPrev() {
        if (numberOfStation - 1 < minStation) {
            numberOfStation = maxStation;
        } else {
            numberOfStation = numberOfStation - 1;
        }

    }
}


