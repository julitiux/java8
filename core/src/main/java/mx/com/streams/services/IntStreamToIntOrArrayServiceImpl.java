package mx.com.streams.services;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamToIntOrArrayServiceImpl implements IntStreamToIntOrArrayService {

  @Override
  public int getFirstElementOfArray(int[] ints) {
    IntStream intStream = Arrays.stream(ints);
    OptionalInt optionalInt = intStream.findFirst();

    return optionalInt.getAsInt();
  }

  @Override
  public int getAnyElementOfArray(int[] ints) {
    IntStream intStream = Arrays.stream(ints);
    OptionalInt optionalInt = intStream.filter( number -> number % 2 == 0).findAny();

    return optionalInt.getAsInt();
  }

  @Override
  public Integer[] convertArrayIntToArrayInteger(Integer[] integers) {
    return new Integer[0];
  }

}
