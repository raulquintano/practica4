# PRACTICA 4

# Autor
Raúl Quintano Vázquez

# Descripción
Este codigo permite saber la distancia minima de edición entre dos cadenas de caracteres.

# Licencia
Copyright [2024] [Raul Quintano Vazquez]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


## Estado del proyecto

Finalizado. Listo para su uso.

## Instalación

Clona el repositorio de este proyecto de GitHub y péguelo en el directorio que desee
https://github.com/raulquintano/practica4.git


## Funcionamiento

En primer lugar, se genera una matriz donde se irán recorriendo las distintas posiciones de los caracteres de las cadenas.
En un primer caso, si la primera cadena está vacía, la distancia minima de edición será igual a la segunda cadena, y si la segunda cadena
está vacía, la distancia mínima de edición será igual a la primera cadena.
Por otro lado, si los últimos caracteres de cada cadena son iguales, el programa simplemente avanzará a los siguientes caracteres, hasta que 
detecte que hay dos distintos.
En el último caso de sean distintos, valorará la opción de reemplazarlo, insertar uno nuevo, o simplemente borrarlo. Siempre cogiendo el camino
más corto.


