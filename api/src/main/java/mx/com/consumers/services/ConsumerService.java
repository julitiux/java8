package mx.com.consumers.services;

import java.util.List;

public interface ConsumerService {
  public void outPrintln(List<String> list);
  public void usingAConsumer(List<String> list);
  public void usingAConsumerWithAInteger(List<Integer> list);
}
