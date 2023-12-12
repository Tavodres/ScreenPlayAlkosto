#language: es

Característica: Agregar Productos al Carrito de Alkosto
  @AgregarProductoCarro
  Escenario:
    Dado que el usuario abre el navegador e ingresa a la pagina de Alkosto.com
    Cuando El usuario seleciona un Producto y lo agrega al carrito
    Y regresa a la pagina principal y selecciona un nuevo producto
    Entonces el usuario podra ver los productos seleccionados en el carrito