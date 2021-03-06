package mx.com.streams.services;

public interface FileService {
  void readFileLineByLine(String filename);
  void readFileLineByLineFilterLines(String filename, String startWith);
  void readBufferedReader(String filename);
  void readBufferedReaderAndScanner(String filename);
  void readScanner(String filename);
}
