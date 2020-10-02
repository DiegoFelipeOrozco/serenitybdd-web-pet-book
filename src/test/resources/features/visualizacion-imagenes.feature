# language: es
Característica: Visualizacion de imagenes
  Como usuario web
  Quiero usar la aplicacion
  Para ver imagenes de mascotas

  Escenario: Filtrar por perros
    Cuando un usuario busca solo perros
    Entonces debe ver todas las imagenes de perros unicamente

  Escenario: Filtrar por gatos
      Cuando un usuario busca solo gatos
      Entonces debe ver todas las imagenes de gatos unicamente

  Escenario: Ver todo
      Cuando un usuario deshace el filtro
      Entonces debe ver todas las imagenes

  Escenario: Enfocar imagen
      Cuando un usuario elige una imagen
      Entonces debe ver dicha imagen de mayor tamaño