package mx.com.streamCollect.services;

import mx.com.streams.domain.Item;
import mx.com.streams.services.StreamCollectService;

import java.util.LinkedHashMap;
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
    Map<String, Long> finalMap = new LinkedHashMap<>();
    Map<String, Long> map = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    map.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
    return map;
  }

  @Override
  public Map<String, Integer> countTheKeyByRepeatInList(List<Item> itemList) {
    return itemList.stream().collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
  }

}
