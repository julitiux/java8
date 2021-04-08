package mx.com.streams.services;

import java.util.List;

public class StreamReduceServiceImpl implements StreamReduceService {

  @Override
  public Integer reduceAListWithAdd(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::sum);
  }

  @Override
  public Integer reduceAListWithMultiply(List<Integer> integerList) {
    return integerList.stream().reduce(0, (a, b) -> a * b);
  }

}
