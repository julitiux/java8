package mx.com.streams.services;

import java.util.List;
import java.util.Optional;

public class FindFirstAndAnyServiceImpl implements FindFirstAndAnyService {

  @Override
  public String findAny(List<String> stringList) {
    Optional<String> optional = stringList.stream().findAny();
    return optional.orElse("No Value");
  }

}
