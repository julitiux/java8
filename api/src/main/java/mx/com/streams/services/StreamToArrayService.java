package mx.com.streams.services;

public interface StreamToArrayService {
  String[] convertStringToArray(String string);
  Integer[] convertArrayIntToArrayInteger(int[] integers);
  int[] convertStreamToArrayInt(Integer startRange, Integer endRange);
}
