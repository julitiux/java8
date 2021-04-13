package mx.com.streams.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedServiceImpl implements StreamSortedService{

  @Override
  public List<String> sortedNatural(List<String> stringList) {
    return stringList.stream().sorted().collect(Collectors.toList());
  }

  @Override
  public List<String> sortedWithReverseOrder(List<String> stringList) {
    return stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
  }

}
