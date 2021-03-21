package mx.com.streams.services;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public interface ParallelService {
  public void justPrintARangeNumberParallelOrNot(IntStream intStream);
  public void usingParallelStrem(Stream stream);
  public Boolean isParallelRunning(IntStream intStream);
}
