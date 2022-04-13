package kr.co.ws;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    private String name;

    private int move;

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", move=" + move +
                '}';
    }

    public List<Car> carFactory() {
        String[] carName = {"Benz", "BMW", "Audi", "Genesis", "Ferrari"};
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < carName.length; i++) {
            carList.add(new Car(carName[i]));
        }
        return carList;
    }
}
