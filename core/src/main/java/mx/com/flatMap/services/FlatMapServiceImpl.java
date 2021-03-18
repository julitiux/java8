package mx.com.flatMap.services;

import mx.com.streams.services.FlatMapService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapServiceImpl implements FlatMapService {

  @Override
  public List<String> convertListStringStringToListString(List<List<String>> stringListList) {
    return stringListList.stream().flatMap(Collection::stream).collect(Collectors.toList());
  }

}
