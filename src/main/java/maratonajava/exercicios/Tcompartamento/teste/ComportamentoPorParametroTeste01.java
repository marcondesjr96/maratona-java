package maratonajava.exercicios.Tcompartamento.teste;

import maratonajava.exercicios.Tcompartamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
    private static List<Car> cars = List.of(new Car("Red", 2020), new Car("Green", 2022), new Car("Black", 2018));


    public static void main(String[] args) {

        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "Black"));
        System.out.println("##########");
        System.out.println(filterAge(cars, 2023));
        System.out.println("###########");
        System.out.println(filterAge(cars, 2020));


    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals("Green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }
    private static List<Car> filterCarByColor(List<Car> cars, String cor) {
        List<Car> listCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getColor().equals(cor)){
                listCars.add(car);
            }
        }
        return listCars;
    }

    private static List<Car> filterAge(List<Car> cars, int year) {
        List<Car> listCars = new ArrayList<>();
        for (Car car : cars){
            if(car.getYear() < (year)){
                listCars.add(car);
            }
        }
        return listCars;
    }
}