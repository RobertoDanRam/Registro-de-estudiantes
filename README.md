# Registro de Estudiantes (Actividad 9)

Programa de consola en Java enfocado en la gestión de memoria y el uso de arreglos de objetos. Permite al usuario definir dinámicamente la cantidad de registros a capturar, almacenando y consultando la información mediante una arquitectura organizada por paquetes.

**Autor:** Roberto Daniel Ramos Flores

## Características Principales

- **Dimensionamiento Dinámico:** Solicita al usuario la cantidad exacta de estudiantes a registrar antes de inicializar el arreglo, optimizando el uso de la memoria.
- **Captura Iterativa:** Utiliza bucles para solicitar secuencialmente los datos (nombre y edad) de cada estudiante hasta llenar la capacidad del arreglo.
- **Visualización de Datos:** Recorre el arreglo de objetos para imprimir en consola un reporte final con todos los estudiantes registrados y sus respectivas edades.
- **Organización Modular:** Separa la lógica de ejecución del modelo de datos mediante el uso de paquetes, sentando las bases para proyectos escalables.

## Tecnologías Utilizadas

- **Lenguaje:** Java
- **Estructuras de datos:** Arreglos (Arrays) de objetos
- **Manejo de entrada:** `Scanner` (con limpieza de buffer para lectura mixta de enteros y cadenas)
- **Entorno de desarrollo:** Visual Studio Code (VSCode)

## Estructura del Código

- `src/main/App/Main.java`: Clase principal que contiene el flujo del programa. Gestiona la captura del tamaño del arreglo, la iteración para poblar los datos mediante la entrada del usuario y la impresión del listado final[cite: 2].
- `src/model/Estudiante.java`: Modelo de datos (POJO) que representa a la entidad estudiante. Emplea encapsulamiento básico con atributos privados (`nombre`, `edad`), un constructor parametrizado y métodos de acceso (getters)[cite: 2].
