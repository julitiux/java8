package mx.com.streams.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileServiceImpl implements FileService {

  @Override
  public void readFileLineByLine(String filename) {
    try (Stream<String> stream = Files.lines(Paths.get(filename))) {
      stream.forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void readFileLineByLineFilterLines(String filename, String startWith) {
    try (Stream<String> stream = Files.lines(Paths.get(filename))) {
      stream.filter(line -> line.startsWith(startWith)).map(String::toUpperCase).forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
