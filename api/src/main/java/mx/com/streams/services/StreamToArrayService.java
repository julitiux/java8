package mx.com.streams.services;

import java.util.stream.Stream;

public interface StreamToArrayService {
  String[] convertStringToArray(String string);
  Integer[] convertArrayIntToArrayInteger(int[] integers);
  int[] convertStreamToArrayInt(Integer startRange, Integer endRange);
  int[] convertArrayUsingStream(Stream<Integer> integerStream);
}
