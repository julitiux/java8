package mx.com.streams.services;

public interface IntStreamToIntOrArrayService {
  int getFirstElementOfArray(int[] ints);
  int getAnyElementOfArray(int[] ints);
  Integer[] convertArrayIntToArrayInteger(Integer[] integers);
  int[] convertArrayIntToArrayInt(int[] ints);
}
