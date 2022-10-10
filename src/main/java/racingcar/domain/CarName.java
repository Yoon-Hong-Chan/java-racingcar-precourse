package racingcar.domain;

public class CarName {
    String carName;

    public CarName(String carName) {
        validation(carName);
        this.carName = carName;
    }
    public void validation(String carName){
        if(carName.length() > 5)
            throw new IllegalArgumentException();
    }
}
