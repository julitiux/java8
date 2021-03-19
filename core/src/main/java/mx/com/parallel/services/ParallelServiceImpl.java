package mx.com.parallel.services;

import mx.com.streams.services.ParallelService;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ParallelServiceImpl implements ParallelService {

  Consumer<IntStream> print = System.out::println;

  @Override
  public void justPrintARangeNumberParallelOrNot(IntStream intStream) {
    print.accept(intStream);
  }
}
