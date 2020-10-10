# language: es
Característica: Visualizacion de imagenes
    Como usuario web
    Quiero usar la aplicacion
    Para ver imagenes de mascotas

    Escenario: Filtrar por perros
        Dado que Sebas esté en la aplicacion
        Cuando filtra por Perro
        Entonces debe ver todas las imagenes de perros unicamente

    Escenario: Filtrar por gatos
        Dado que Sebas esté en la aplicacion
        Cuando filtra por Gato
        Entonces debe ver todas las imagenes de gatos unicamente

    Escenario: Ver todo
        Dado que Katherine esté en la aplicacion
        Y este filtrada por Gato
        Cuando quiere deshacer el filtro
        Entonces debe ver todas las imagenes

    Escenario: Enfocar imagen
        Dado que Diego esté en la aplicacion
        Cuando elige una imagen
        Entonces debe ver dicha imagen de mayor tamaño