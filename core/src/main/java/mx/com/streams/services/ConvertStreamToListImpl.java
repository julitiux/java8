package mx.com.streams.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToListImpl implements ConvertStreamToList {

  @Override
  public List<String> convertStreamToList(Stream<String> stream) {
    return stream.collect(Collectors.toList());
  }

}
