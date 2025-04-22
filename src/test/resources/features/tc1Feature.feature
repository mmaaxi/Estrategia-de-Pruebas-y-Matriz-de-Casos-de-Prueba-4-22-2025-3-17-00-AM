Feature: Validación de la Estrategia de Pruebas

  Scenario: Validar documento PDF de pruebas
    Given que el documento PDF de pruebas está disponible
    When reviso el documento PDF de pruebas
    Then el documento debe ser validado y confirmado correctamente