package mx.com.streamCollect.services;

import mx.com.streams.services.StreamCollectService;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamCollectServiceImpl implements StreamCollectService {

  @Override
  public Map<String, Long> usingGroupBy(List<String> stringList) {
    return stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
  }

}
