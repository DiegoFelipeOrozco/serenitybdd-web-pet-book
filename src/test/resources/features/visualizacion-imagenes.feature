# language: es
Característica: Visualizacion de imagenes
  Como usuario web
  Quiero usar la aplicacion
  Para ver imagenes de mascotas

  Escenario: Filtrar por perros
    Dado que un usuario esté en la aplicacion
    Cuando un usuario busca solo perros
    Entonces debe ver todas las imagenes de perros unicamente

  Escenario: Filtrar por gatos
    Dado que un usuario esté en la aplicacion
    Cuando un usuario busca solo gatos
    Entonces debe ver todas las imagenes de gatos unicamente

  Escenario: Ver todo
    Dado que un usuario esté en la aplicacion
    Cuando un usuario deshace el filtro
    Entonces debe ver todas las imagenes

  Escenario: Enfocar imagen
    Dado que un usuario esté en la aplicacion
    Cuando elige una imagen
    Entonces debe ver dicha imagen de mayor tamaño