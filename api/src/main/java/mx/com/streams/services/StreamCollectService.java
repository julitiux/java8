package mx.com.streams.services;

import mx.com.streams.domain.Item;

import java.util.List;
import java.util.Map;

public interface StreamCollectService {
  public Map<String, Long> usingGroupBy(List<String> stringList);
  public Map<String, Long> usingGroupByAndOrderByValue(List<String> stringList);
  public Map<String, Integer> countTheKeyByRepeatInList(List<Item> itemList);
}
