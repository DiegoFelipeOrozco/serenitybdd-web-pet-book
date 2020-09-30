# language: es
Característica: Visualizacion de imagenes
  Como usuario web
  Quiero usar la aplicacion
  Para ver imagenes de mascotas

  Escenario: Filtrar por perros
    Cuando Sebas busca solo perros
    Entonces debe ver todas las imágenes de perros únicamente

  Escenario: Filtrar por gatos
      Cuando Sebas busca solo perros
      Entonces debe ver todas las imágenes de perros únicamente

  Escenario: Ver todo
      Cuando Katherine quiere deshacer el filtro
      Entonces debe ver todas las imágenes

  Escenario: Enfocar imagen
      Cuando Diego quiere ver una imagen en particular
      Entonces debe ver dicha imagen del tamaño de la pantalla