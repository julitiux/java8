package mx.com.streams.services;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAValueNullServiceImpl implements FilterAValueNullService {

  @Override
  public List<String> filterValueNullInAList(List<String> stringList) {
    return stringList.stream().filter(it -> it != null).collect(Collectors.toList());
  }

}
