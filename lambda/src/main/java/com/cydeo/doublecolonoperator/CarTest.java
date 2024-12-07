package com.cydeo.doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // Zero argument
        Supplier<Car> c1 =() -> new Car();
        System.out.println(c1.get().getModelYear());

        Supplier<Car> c2 = Car :: new;
        System.out.println(c2.get().getModelYear());

        // Onr Argument
        Function<Integer, Car> f1 = makeYear -> new Car(makeYear);
        System.out.println(f1.apply(2009).getModelYear());

        Function<Integer, Car> f2 = Car :: new;
        System.out.println(f2.apply(2022).getModelYear());

        //Two Argument

        BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
        Car honda = b1.apply("Honda", 2021);
        System.out.println(honda.getMake() + " " + honda.getModelYear());

        BiFunction<String, Integer, Car> b2 = Car :: new;
        Car nissan = b2.apply("Nissan", 2001);
        System.out.println(nissan.getMake() + " " + nissan.getModelYear());
    }
}
