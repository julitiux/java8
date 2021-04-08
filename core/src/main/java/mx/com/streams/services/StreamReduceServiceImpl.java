package mx.com.streams.services;

import java.util.List;

public class StreamReduceServiceImpl implements StreamReduceService {

  @Override
  public Integer reduceAList(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::sum);
  }

}
