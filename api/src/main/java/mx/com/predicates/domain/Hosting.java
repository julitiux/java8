package mx.com.predicates.domain;

public class Hosting {

  Long id;
  String name;
  String url;

  public Hosting(Long id, String name, String url) {
    this.id = id;
    this.name = name;
    this.url = url;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
