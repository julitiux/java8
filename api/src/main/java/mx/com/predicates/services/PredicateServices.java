package mx.com.predicates.services;

import mx.com.predicates.domain.Hosting;

import java.util.List;

public interface PredicateServices {
  public List<Integer> predicate(List<Integer> list);
  public List<Integer> predicateFilter(List<Integer> list);
  public List<Integer> predicateFilterAndAnd(List<Integer> list);
  public List<String> predicateFilterAndOr(List<String> list);
  public List<String> predicateFilterAndNegate(List<String> list);
  public List<String> predicateTest(List<String> list);

  public List<Hosting> filterHosting(List<Hosting> list);
  public List<Hosting> filterHostingFriendly(List<Hosting> list);
}
