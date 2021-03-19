package mx.com.parallel.services;

import mx.com.streams.services.ParallelService;

import java.util.stream.IntStream;

public class ParallelServiceImpl implements ParallelService {


  @Override
  public void justPrintARangeNumber(IntStream intStream) {
    intStream.forEach(System.out::println);
  }

  @Override
  public void justPrintARangeNumberParallel(IntStream intStream) {
    intStream.parallel().forEach(System.out::println);
  }
}
