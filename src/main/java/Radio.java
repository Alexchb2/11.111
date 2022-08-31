public class Radio {

    private int minNumberRadio = 0;
    private int maxNumberRadio;
    private int numberRadio;
    private int minCurrentVolume = 0;
    private int maxCurrentVolume = 100;
    private int currentVolume;

    public Radio(){
        maxNumberRadio = 9;
    }

    public Radio(int size){
        maxNumberRadio = minNumberRadio + size - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinNumberRadio(){
        return minNumberRadio;
    }

    public int getMaxNumberRadio(){
        return maxNumberRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minCurrentVolume) {
            newCurrentVolume = minCurrentVolume;
        }
        if (newCurrentVolume > maxCurrentVolume) {
            newCurrentVolume = maxCurrentVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxCurrentVolume) {
            int target = currentVolume + 1;
            setCurrentVolume(target);
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minCurrentVolume) {
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
        if (newNumberRadio > maxNumberRadio) {
            newNumberRadio = maxNumberRadio;
        }
        numberRadio = newNumberRadio;
    }

    public void nextRadio() {
        if (numberRadio >= maxNumberRadio) {
            numberRadio = 0;
        }
        else {
            int target = numberRadio + 1;
            setNumberRadio(target);
        }
    }

    public void prevRadio() {
        if (numberRadio <= 0) {
            numberRadio = maxNumberRadio;
        }
        else {
            int target = numberRadio - 1;
            setNumberRadio(target);
        }
    }
}
