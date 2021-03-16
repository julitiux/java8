package mx.com.streams.services;

import java.util.List;
import java.util.stream.Collectors;

public class MapServiceImpl implements MapService {

  @Override
  public List<String> stringToUpperCase(List<String> list) {
    return list.stream().map(it -> it.toUpperCase()).collect(Collectors.toList());
  }

}
