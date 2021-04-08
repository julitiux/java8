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

  @Override
  public Integer reduceAListWithDivide(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::divideUnsigned);
  }

  @Override
  public Integer reduceAListWithRest(List<Integer> integerList) {
    return integerList.stream().reduce(0, (a, b) -> a - b);
  }

  @Override
  public Integer reduceAListWithMax(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::max);
  }

  @Override
  public Integer reduceAListWithMin(List<Integer> integerList) {
    return integerList.stream().reduce(0,Integer::min);
  }

}
