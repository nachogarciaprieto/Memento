
# Patrones de Diseño: MEMENTO
Los patrones de diseño son soluciones eficaces a problemas típicos. 
Memento se utiliza para volver atrás en la aplicación; memoriza el valor de ciertas variables en varios momentos para así restaurarlo si se desea.

# Ejemplo proyecto Java
![Diagrama del proyecto Java sobre Memento](https://raw.githubusercontent.com/thertejada/Memento/master/ProyectoJavaMemento/Diagrama/DiagramaProyectoEjemploMemento.png)

El proyecto guarda cadenas de texto para después poder recuperarlas (deshacer, undo).
 - **Caretaker (cuidador, vigilante):**  es responsable de mantener a salvo a Memento. No opera o examina su contenido.
 - **Memento:** almacena el estado interno de un objeto NotaDeTexto. El Memento puede almacenar todo o parte del estado. 
 - **NotaDeTexto:** crea un objeto Memento conteniendo una 'fotografía' de su estado interno.

### Menú del proyecto:
1. Edita el estado del texto en el objeto "NotaDeTexto"
2. Guarda el estado actual del texto de "NotaDeTexto" en "Memento"
3. Restaura el último estado guardado en "Memento" a "NotaDeTexto"
0. Salir

![Menú proyecto java](https://i.imgur.com/ffNsFBz.jpg)
### Ejemplo
> - Selecciona '1'. Escribe cualquier linea de texto ('Hola, esta es la primera prueba')
> - Selecciona '2'. Se guarda el estado del texto a memento > Estado 1
> ---
> - Selecciona '1'. Escribe otro texto ('Wow! Segundo texto')
> - Selecciona '2'. Se guarda el estado del texto a memento > Estado 2
> ---
> - Selecciona '1'. Escribe un tercer texto ('Vamos con la tercera prueba')
> - Selecciona '2'. Se guarda el estado del texto a memento > Estado 3
> ---
> - Ahora puedes seleccionar '3'.
> El programa restaura el ultimo guadado y lo muestra ('Wow! Segundo texto').
> Si volvemos a seleccionar el '3' restauramos el anterior estado ('Hola, esta es la primera prueba').
> 

[Descargar documentación JavaDoc](https://github.com/thertejada/Memento/raw/master/ProyectoJavaMemento/Doc/Doc.zip)







# Autores
Proyecto para IES Severo Ochoa Elche realizado por:
* Alejandro Tejada Rodríguez @thertejada
* José Ignacio García Prieto @nachogarciaprieto
* Alberto Sabuco Larrosa @Tanekikun



