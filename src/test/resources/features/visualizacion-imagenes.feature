# language: es
Característica: Visualizacion de imagenes
  Como usuario web
  Quiero usar la aplicacion
  Para ver imagenes de mascotas

  Escenario: Filtrar por perros
    Cuando Sebas filtra por Perro
    Entonces debe ver todas las imagenes de perros unicamente

  Escenario: Filtrar por gatos
      Cuando Sebas filtra por Gato
      Entonces debe ver todas las imagenes de gatos unicamente

  Escenario: Ver todo
      Cuando Katherine quiere deshacer el filtro
      Entonces debe ver todas las imagenes

  Escenario: Enfocar imagen
      Cuando Diego quiere ver una imagen en particular
      Entonces debe ver dicha imagen del tamaño de la pantalla
