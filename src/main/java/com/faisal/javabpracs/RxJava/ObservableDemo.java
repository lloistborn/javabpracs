package com.faisal.javabpracs.RxJava;

import io.reactivex.Observable;
import java.util.Arrays;
import java.util.List;

public class ObservableDemo {

  public static void main(String[] args) {
    String[] shapesArray = new String[] {"rectangle", "square", "triangle"};
    List<String> shapeList = Arrays.asList(shapesArray);

    Observable.fromIterable(shapeList)
        .subscribe(x -> System.out.println(x),
            x -> System.err.println("error"),
            () -> System.out.println("completed list"));

    Observable.fromArray(shapesArray)
        .subscribe(x -> System.out.println(x),
            x -> System.err.println("error"),
            () -> System.out.println("completed array"));

    Observable.just(shapeList)
        .subscribe(x -> System.out.println(x),
            x -> System.err.println("error"),
            () -> System.out.println("completed list"));

    Observable.just(shapesArray)
        .subscribe(x -> System.out.println(Arrays.toString(x)),
            x -> System.err.println("error"),
            () -> System.out.println("completed array"));
  }
}
