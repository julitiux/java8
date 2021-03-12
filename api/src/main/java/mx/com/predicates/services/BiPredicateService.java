package mx.com.predicates.services;

import mx.com.predicates.domain.Domain;

import java.util.List;
import java.util.function.BiPredicate;

public interface BiPredicateService {
  public Boolean isTheSameSize(String string, Integer integer);
  public List<Domain> isCorrectTheDomain(List<Domain> domainList, BiPredicate<String, Integer> biPredicate);
}
