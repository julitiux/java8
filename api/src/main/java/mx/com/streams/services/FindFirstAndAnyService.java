package mx.com.streams.services;

import java.util.List;

public interface FindFirstAndAnyService {
  String findAny(List<String> stringList);
  String findFirst(List<String> stringList);
}
