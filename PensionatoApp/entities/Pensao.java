package PensionatoApp.entities;

public class Pensao {
  private String name;
  private String email;

  public Pensao(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Pensao{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
