package racingcar.domain;

public class Car {
    CarName carName;
    CarDistance carDistance;
    public Car(String carName) {
        this.carName = new CarName(carName);
        carDistance = new CarDistance();
    }
}
