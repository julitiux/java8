package mx.com.streams.services;

import java.util.stream.IntStream;

public interface ParallelService {
  public void justPrintARangeNumberParallelOrNot(IntStream intStream);
  public Boolean isParallelRunning(IntStream intStream);
}
