package mx.com.streams.services;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamToIntOrArrayServiceImpl implements IntStreamToIntOrArrayService {

  @Override
  public int getFirstElementOfArray(int[] ints) {

    IntStream intStream = Arrays.stream(ints);
    OptionalInt optionalInt = intStream.findFirst();

    return optionalInt.getAsInt();

  }

}
