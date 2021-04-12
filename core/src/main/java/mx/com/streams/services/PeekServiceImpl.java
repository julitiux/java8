package mx.com.streams.services;

import java.util.List;

public class PeekServiceImpl implements PeekService {

  @Override
  public void testPeekFirst(List<String> stringList) {
    stringList.stream().peek(System.out::println).count();
  }

}
