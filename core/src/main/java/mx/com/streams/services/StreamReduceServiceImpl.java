package mx.com.streams.services;

import mx.com.streams.domain.Invoice;

import java.math.BigDecimal;
import java.util.List;

public class StreamReduceServiceImpl implements StreamReduceService {

  @Override
  public Integer reduceAListWithAdd(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::sum);
  }

  @Override
  public Integer reduceAListWithMultiply(List<Integer> integerList) {
    return integerList.stream().reduce(0, (a, b) -> a * b);
  }

  @Override
  public Integer reduceAListWithDivide(List<Integer> integerList) {
    return integerList.stream().reduce(0, (a, b) -> a / b);
  }

  @Override
  public Integer reduceAListWithRest(List<Integer> integerList) {
    return integerList.stream().reduce(0, (a, b) -> a - b);
  }

  @Override
  public Integer reduceAListWithMax(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::max);
  }

  @Override
  public Integer reduceAListWithMin(List<Integer> integerList) {
    return integerList.stream().reduce(0, Integer::min);
  }

  @Override
  public String joinStringWithAPipe(List<String> stringList) {
    return stringList.stream().reduce("", (a, b) -> a + "|" + b);
  }

  @Override
  public String joinStringWithAPipeStartingWithoutPipe(List<String> stringList) {
    return stringList.stream().reduce("", (a, b) -> {
      if (!"".equals(a))
        return a + "|" + b;
      else
        return b;
    });
  }

  @Override
  public String joinStringWithAPipeOtherOption(List<String> stringList) {
    return stringList.stream().map(String::join).toString();
  }

  @Override
  public BigDecimal sumAllQuantityInvoices(List<Invoice> invoiceList) {
    return invoiceList.stream().map(Invoice::getQuantity).reduce(BigDecimal.ZERO, BigDecimal::add);
  }

}
