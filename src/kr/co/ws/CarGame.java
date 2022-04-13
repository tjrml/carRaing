package kr.co.ws;

import java.util.List;

public class CarGame {
    int dice;

    public CarGame(int gameCount) {
        winner(gameCount);
    }

    private List<Car> getMove(int gameCount) {
        Car car = new Car();
        List<Car> carList = car.carFactory();
        for (int i = 0; i < carList.size(); i++) {
            for (int j = 0; j < gameCount; j++) {
                dice = (int) (Math.random() * 9) + 1;
//                System.out.println("dice = " + dice);
                if (dice > 3) {
                    carList.get(i).setMove(carList.get(i).getMove() + 1);
                }
            }
            System.out.println(carList.get(i).toString());
        }
        return carList;
    }

    private void winner(int gameCount) {
        List<Car> carList = getMove(gameCount);

        for(int i = 0; i < carList.size() ; i++){
            for (int j = 0; j < carList.size(); j++) {
                if(carList.get(i).getMove() > carList.get(j).getMove()) {
                    Car temp = carList.get(i);
                    carList.set(i, carList.get(j));
                    carList.set(j, temp);
                }
            }
        }
        System.out.println("1등 " + carList.get(0));
    }


}
