package mx.com.consumers.services;

import java.util.Map;

public interface BiConsumerService {
  public void biConsumer(Integer integerOne, Integer integerTwo);
  public void highOrderFunction(Integer integerOne, Integer integerTwo);
  public void mapForEach(Map<Integer, String> map);
}
