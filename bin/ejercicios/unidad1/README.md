# **Glosario Inicial – Programación II (POO en Java)**

Este glosario introduce las terminologías clave que los estudiantes verán a lo largo del curso.

---

### **Conceptos fundamentales**

- **Paradigma de programación:** Estilo o modelo de programación. Ej.: POO, programación estructurada, funcional.
- **Programación Orientada a Objetos (POO):** Paradigma que organiza el software en torno a **objetos**, que combinan estado (atributos) y comportamiento (métodos).
- **Clase:** Plantilla o molde que define cómo serán los objetos: qué datos tendrán (atributos) y qué operaciones podrán realizar (métodos).
- **Objeto:** Instancia concreta de una clase. Representa una entidad específica con valores propios.
- **Instanciación:** Proceso de crear un objeto a partir de una clase.
- **Atributo (o campo):** Variable definida en una clase que representa características o estado de los objetos.
- **Método:** Función definida en una clase que representa acciones o comportamientos de los objetos.

---

### **Principios de POO**

- **Abstracción:** Capacidad de enfocarse en las características esenciales de un objeto, ignorando los detalles irrelevantes.
- **Encapsulación:** Ocultar el estado interno de un objeto y permitir acceso solo a través de métodos controlados (getters y setters).
- **Herencia:** Relación entre clases donde una subclase adquiere atributos y métodos de una superclase.
- **Polimorfismo:** Capacidad de un objeto de adoptar múltiples formas; permite usar una misma interfaz para diferentes implementaciones.
- **Composición:** Relación fuerte donde un objeto está compuesto por otros (ej.: un “Carro” tiene “Motor”).
- **Agregación:** Relación débil entre objetos; un objeto puede existir independientemente del otro (ej.: un “Departamento” tiene “Profesores”).

---

### **Elementos técnicos en Java**

- **Paquete (`package`):** Agrupación lógica de clases.
- **Modificadores de acceso:** Controlan la visibilidad de clases, atributos y métodos (`public`, `private`, `protected`).
- **Constructor:** Método especial que se ejecuta al crear un objeto, usado para inicializarlo.
- **Sobrecarga (Overloading):** Definir varios métodos con el mismo nombre pero distinta lista de parámetros.
- **Sobrescritura (Overriding):** Redefinir un método heredado manteniendo la misma firma.
- **Interfaces:** Contratos que definen qué métodos deben implementar las clases que las usen.
- **Clases abstractas:** Clases que no pueden instanciarse directamente y sirven como base para otras.
- **Métodos estáticos:** Métodos asociados a la clase y no a un objeto (se invocan con el nombre de la clase).
- **Atributos estáticos:** Variables compartidas por todas las instancias de una clase.
- **Palabra clave `this`:** Referencia al objeto actual.
- **Palabra clave `super`:** Referencia a la superclase inmediata.

---

### **Errores y manejo de excepciones**

- **Excepción:** Evento anómalo que interrumpe el flujo normal de un programa.
- **Checked Exception:** Excepción que debe manejarse explícitamente en el código (`IOException`).
- **Unchecked Exception:** Excepción que ocurre en tiempo de ejecución (`NullPointerException`).
- **`try-catch-finally`:** Bloques usados para manejar excepciones en Java.

---

### **Colecciones y estructuras**

- **Array (Arreglo):** Estructura de datos de tamaño fijo que almacena elementos del mismo tipo.
- **ArrayList:** Lista dinámica que permite añadir y eliminar elementos.
- **HashMap:** Colección que almacena pares clave-valor.
- **Iterator:** Objeto que permite recorrer colecciones.

---

### **Polimorfismo y patrones**

- **Overriding dinámico:** Selección del método en tiempo de ejecución, según el tipo real del objeto.
- **Principio de Sustitución de Liskov:** Una subclase debe poder sustituir a su superclase sin alterar el comportamiento esperado.
- **Patrón Strategy:** Permite definir un conjunto de algoritmos intercambiables que se usan de forma polimórfica.
- **Patrón Factory:** Centraliza la creación de objetos, delegando la decisión a una clase “fábrica”.

---

### **Conceptos de calidad y buenas prácticas**

- **Cohesión:** Qué tan bien relacionados están los elementos de una clase; se busca alta cohesión.
- **Acoplamiento:** Grado de dependencia entre clases; se busca bajo acoplamiento.
- **Principio SRP (Single Responsibility Principle):** Cada clase debe tener una única responsabilidad.
- **DRY (Don’t Repeat Yourself):** Evitar duplicación de código.
- **KISS (Keep It Simple, Stupid):** Mantener el diseño simple y claro.

---