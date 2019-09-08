package com.faisal.javabpracs.reactive;

import reactor.core.publisher.Mono;

public class MonoDemo {

  public static void main(String[] args) {
    Mono.just("Hellow World")
        .doOnNext(str -> System.out.println(str))
        .subscribe();
  }
}
