package mx.com.suppliers.services;

import mx.com.suppliers.services.SuplierService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SuplierServiceImpl implements SuplierService {

  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

  Supplier<LocalDateTime> now = () -> LocalDateTime.now();
  Supplier<String> format = () -> dtf.format(LocalDateTime.now());

  @Override
  public void nowDateFormat() {
    System.out.println(format.get());
  }

}
