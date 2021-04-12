package mx.com.streams.services;

import java.util.Arrays;

public class StreamToArrayServiceImpl implements StreamToArrayService {

  @Override
  public String[] convertStringToArray(String string) {
    return Arrays.stream(string.split("\\s+")).toArray(String[]::new);
  }

  @Override
  public Integer[] convertArrayIntToArrayInteger(int[] integers) {
    return Arrays.stream(integers).map(integer -> integer * 2).boxed().toArray(Integer[]::new);
  }

}
