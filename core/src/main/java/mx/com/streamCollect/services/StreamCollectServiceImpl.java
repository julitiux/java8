package mx.com.streamCollect.services;

import mx.com.streams.services.StreamCollectService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectServiceImpl implements StreamCollectService {

  @Override
  public Map<String, Long> usingGroupBy(List<String> stringList) {
    return stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

  @Override
  public Map<String, Long> usingGroupByAndOrderByValue(List<String> stringList) {
    Map<String, Long> map = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    Map<String, Long> finalMap = null;

    stringList.stream().sorted()


    map.entrySet().stream().sorted(Map.Entry.<String, Long> comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
    return finalMap;
  }

}
