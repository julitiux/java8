package mx.com.streams.services;

import mx.com.streams.services.ParallelService;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelServiceImpl implements ParallelService {

  Consumer<IntStream> print = it -> it.forEach(System.out::println);
  Consumer<Stream> streamConsumer = it -> it.forEach(System.out::println);

  @Override
  public void justPrintARangeNumberParallelOrNot(IntStream intStream) {
    print.accept(intStream);
  }

  @Override
  public void usingParallelStrem(Stream stream) {
    streamConsumer.accept(stream);
  }

  @Override
  public Boolean isParallelRunning(IntStream intStream) {
    print.accept(intStream);
    return intStream.isParallel();
  }
}
