package maratonajava.exercicios.Tcompartamento.teste;

import maratonajava.exercicios.Tcompartamento.dominio.Car;
import maratonajava.exercicios.Tcompartamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste02 {
    private static List<Car> cars = List.of(new Car("Red", 2020), new Car("Green", 2022), new Car("Black", 2018));


    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//    });
            List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
            List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
            List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2023);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);


    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if(carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

}