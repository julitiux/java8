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
}
