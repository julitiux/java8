package mx.com.streams.services;

public interface FileService {
  void readFileLineByLine(String filename);
  void readFileLineByLineFilterLines(String filename);
}
