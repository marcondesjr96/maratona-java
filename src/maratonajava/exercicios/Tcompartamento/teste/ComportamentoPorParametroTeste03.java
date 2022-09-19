package maratonajava.exercicios.Tcompartamento.teste;

import maratonajava.exercicios.Tcompartamento.dominio.Car;
import maratonajava.exercicios.Tcompartamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste03 {
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
    private static <T> List<T> filter(List<T> list , Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}