package mx.com.streams.services;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamToArrayServiceImpl implements StreamToArrayService {

  @Override
  public String[] convertStringToArray(String string) {
    return Arrays.stream(string.split("\\s+")).toArray(String[]::new);
  }

  @Override
  public Integer[] convertArrayIntToArrayInteger(int[] integers) {
    return Arrays.stream(integers).map(integer -> integer * 2).boxed().toArray(Integer[]::new);
  }

  @Override
  public int[] convertStreamToArrayInt(Integer startRange, Integer endRange) {
    return IntStream.rangeClosed(startRange, endRange).toArray();
  }

  @Override
  public int[] convertArrayUsingStream(Stream<Integer> integerStream) {
    return integerStream.mapToInt(integer -> integer).toArray();
  }

}
