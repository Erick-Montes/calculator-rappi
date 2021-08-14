Feature: Funcionalidad calcular

  Scenario Outline: Calcular las 4 operaciones
    Given que el cliente ingresa a la aplicacion
    When el ingresa el numeroUno <numeroUno> la operacion <operacion> y el numeroDos <numeroDos>
    Then el visualiza que el total <total> es correcto
    Examples:
      | numeroUno | operacion | numeroDos | total |
      | 1         | +         | 2         | 3     |
      | 2         | ÷         | 1         | 2     |
      | 2         | ×         | 2         | 4     |
      | 4         | -         | 1         | 3     |