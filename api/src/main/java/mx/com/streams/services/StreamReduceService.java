package mx.com.streams.services;

import mx.com.streams.domain.Invoice;

import java.math.BigDecimal;
import java.util.List;

public interface StreamReduceService {
  public Integer reduceAListWithAdd(List<Integer> integerList);
  public Integer reduceAListWithMultiply(List<Integer> integerList);
  public Integer reduceAListWithDivide(List<Integer> integerList);
  public Integer reduceAListWithRest(List<Integer> integerList);
  public Integer reduceAListWithMax(List<Integer> integerList);
  public Integer reduceAListWithMin(List<Integer> integerList);

  public String joinStringWithAPipe(List<String> stringList);
  public String joinStringWithAPipeStartingWithoutPipe(List<String> stringList);
  public String joinStringWithAPipeOtherOption(List<String> stringList);

  public BigDecimal sumAllQuantityInvoices(List<Invoice> invoiceList);
}
