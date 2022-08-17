public class Radio {
    int numberRadio;
    int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            int target = currentVolume + 1;
            setCurrentVolume(target);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            int target = currentVolume - 1;
            setCurrentVolume(target);
        }
    }

    public int getNumberRadio() {
        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            newNumberRadio = -1;
        }
        if (newNumberRadio > 9) {
            newNumberRadio = 9;
        }
        numberRadio = newNumberRadio;
    }

    public void nextRadio() {
        if (numberRadio < 9) {
            int target = numberRadio + 1;
            setNumberRadio(target);
        }
    }

    public void prevRadio() {
        if (numberRadio > 0) {
            int target = numberRadio - 1;
            setNumberRadio(target);
        }
        if (numberRadio == 0) {
            numberRadio = 9;
        }
    }
}
