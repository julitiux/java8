package mx.com.streams.services;

import java.util.List;

public interface StreamSortedService {
  List<String> sortedNatural(List<String> stringList);
  List<String> sortedWithReverseOrder(List<String> stringList);
}
