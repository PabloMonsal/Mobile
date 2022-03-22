Feature: Inicio de sesion
  Como usuario
  Yo quiero comprar unos productos
  Para poder validar el correcto funcionamiento

  Scenario: Inicio de sesion exitoso
    Given el se loguea
    When  el compra los productos
    Then el deberia el carrito con '2' items
    And el se desloguea
