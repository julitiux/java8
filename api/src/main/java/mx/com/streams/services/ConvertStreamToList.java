package mx.com.streams.services;

import java.util.List;
import java.util.stream.Stream;

public interface ConvertStreamToList {
  List<String> convertStreamToList(Stream<String> stream);
}
