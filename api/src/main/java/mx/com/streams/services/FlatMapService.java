package mx.com.streams.services;

import java.util.List;

public interface FlatMapService {
  public List<String> convertListStringStringToListString(List<List<String>> stringListList);
}
