package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> carList = new ArrayList<>();

    public Cars(String carNames) {
        generateCar(carNames);
    }

    public List<Car> getCarList(){
        return carList;
    }

    public void generateCar(String carNames){
        String[] carStrings = carNames.split(",");
        for(String carName : carStrings){
            carList.add(new Car(carName));
        }
    }
}
