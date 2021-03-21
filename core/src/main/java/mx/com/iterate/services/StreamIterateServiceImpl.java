package mx.com.iterate.services;

import mx.com.streams.services.StreamIterateService;

import java.util.stream.Stream;

public class StreamIterateServiceImpl implements StreamIterateService {

  @Override
  public void stream_0_9(Integer limit) {
    Stream.iterate(0, n -> n + 1).limit(limit).forEach(System.out::println);
  }

  @Override
  public void streamWithFilter(Integer limit) {
    Stream.iterate(0, n -> n + 1).filter(x -> x % 2 != 0).limit(limit).forEach(System.out::println);
  }

  @Override
  public void fibonacci(Integer limit) {
    Stream.iterate(new int[]{}, n -> new int[]{n[1], n[0] + n[1]}).limit(limit).map(n -> n[0]).forEach(System.out::println);
  }


}
