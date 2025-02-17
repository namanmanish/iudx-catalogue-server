package iudx.catalogue.server.authenticator.authorization;

import java.util.stream.Stream;

public enum IudxRole {

  PROVIDER("provider"),
  DELEGATE("delegate");

  private final String role;

  IudxRole(String role) {
    this.role = role;
  }

  public String getRole() {
    return this.role;
  }

  public static IudxRole fromRole(final String role) {
    return Stream.of(values())
            .filter(v -> v.role.equalsIgnoreCase(role))
            .findAny()
            .orElse(null);
  }
}
