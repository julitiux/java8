package mx.com.streams.services;

import java.util.stream.IntStream;

public interface ParallelService {
  public void justPrintARangeNumber(IntStream intStream);
  public void justPrintARangeNumberParallel(IntStream intStream);
}
