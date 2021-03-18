package mx.com.flatMap.services;

import mx.com.streams.services.FlatMapService;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapServiceImpl implements FlatMapService {

  @Override
  public List<String> convertListStringStringToListString(List<List<String>> stringListList) {
    return stringListList.stream().map(it -> it).flatMap(it -> it.stream()).collect(Collectors.toList());
  }

}
