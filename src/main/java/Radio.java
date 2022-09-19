public class Radio {
    private int numberOfStation;
    private int volume;

    int MaxVolume = 10;
    int MinVolume = 0;
    int MaxStation = 9;
    int MinStation = 0;

    public int getVolume() {
        return volume;
    }

    public int getNumberOfStation() {
        return numberOfStation;
    }

    public void setVolume(int newVolume) {
        if (newVolume > MaxVolume) {
            volume = MaxVolume;
        } else if (newVolume < MinVolume) {
            volume = MinVolume;
        } else {
            volume = newVolume;
        }
    }

    public void setVolumeUp() {
        if (volume + 1 >= MaxVolume) {
            volume = MaxVolume;
        } else {
            volume = volume + 1;
        }

    }

    public void setVolumeDown() {
        if (volume - 1 <= MinVolume) {
            volume = MinVolume;
        } else {
            volume = volume - 1;
        }
    }

    public void setNumberOfStation(int newNumber) {
        if (newNumber > MaxStation) {
            return;
        } else if (newNumber < MinStation) {
            return;
        } else {
            numberOfStation = newNumber;
        }
    }

    public void setNumberOfStationNext() {
        if (numberOfStation + 1 > MaxStation) {
            numberOfStation = MinStation;
        } else {
            numberOfStation = numberOfStation + 1;
        }
    }

    public void setNumberOfStationPrev() {
        if (numberOfStation - 1 < MinStation) {
            numberOfStation = MaxStation;
        } else {
            numberOfStation = numberOfStation - 1;
        }

    }
}
