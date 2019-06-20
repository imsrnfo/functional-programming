package com.igmasiri.java11components;

import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;
import reactor.util.function.Tuple4;
import reactor.util.function.Tuples;

import java.util.function.*;

public class Application {

    public static void main(String... args){

        Function<Integer,Integer> funcion = Integer -> {
            return 0;
        };
        System.out.println(funcion.apply(1));

        Function<Integer, Tuple2<Integer,Integer>> funcion2retornos = i -> {
            return Tuples.of(i,0);
        };
        System.out.println(funcion2retornos.apply(1).getT1());

        BiFunction<String, Integer, Character> function2Parametros = (s, i) -> {
            throw new IllegalArgumentException();

        };
        System.out.println(function2Parametros.apply("",1));

        Function<Tuple3<Integer,Integer,Integer>, Integer> funcion3parametros = tupla -> {
            return tupla.getT1();
        };
        System.out.println(funcion3parametros.apply(Tuples.of(0,0,0)));

        //procedimiento (funcion que retorna null)

        Consumer<Integer> procedimiento1Parametro = integer ->{
            int a = integer +1;
        };

        BiConsumer<Integer,Integer> procedimiento2parametros = (a,b) ->{
            int c = a+b;
        };

        Consumer<Tuple4<Integer,Integer,Integer,Integer>>procedimiento4parametros  = tupla4 -> {
            tupla4.getT4();
        };

        //predicados (funciones que retornan booleanos)
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(10));

        //suppliers (no toman argumentos pero retornan un objeto)
        Supplier<Integer> obtenerEntero = ()->{
            return 1;
        };
        System.out.println(obtenerEntero);

    }

}
