package mx.com.streams.services;

import java.util.List;

public interface StreamReduceService {
  public Integer reduceAListWithAdd(List<Integer> integerList);
  public Integer reduceAListWithMultiply(List<Integer> integerList);
  public Integer reduceAListWithDivide(List<Integer> integerList);
}
