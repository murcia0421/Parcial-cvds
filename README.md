# LABORATORIO 2 CVDS
  **ESCUELA COLOMBIANA DE INGENIERIA JULIO GARAVITO**
# TABLA DE CONTENIDOS
  1) Descripcion
  2) Tecnologias implementadas
  3) Instalación
  4) Funcionamiento
  5) Autores
  6) Webgrafia

# Descripcion 
  Este laboratorio tiene como objetivo guiar el proceso de creación de un proyecto utilizando Maven, una herramienta de gestión y construcción de proyectos para Java. Además, se llevará a cabo el desarrollo
  de una aplicación básica para la Registraduría Nacional del Estado Civil, donde se registrarán personas con intención de votar para las próximas elecciones y se generarán certificados electorales para
  aquellos votantes válidos.

# Tecnologias implementadas
  Java: Lenguaje de programación principal utilizado para desarrollar la aplicación.

  Maven: Herramienta de gestión y construcción de proyectos utilizada para configurar y administrar las dependencias del proyecto, así como para compilar y ejecutar las pruebas.

  Git Bash: Interfaz de línea de comandos de Git utilizada para ejecutar comandos y operaciones relacionadas con Git en entornos Windows.

  IntelliJ IDEA: Entorno de desarrollo integrado (IDE) utilizado para escribir, editar y depurar el código Java. IntelliJ IDEA ofrece funcionalidades avanzadas de desarrollo que facilitan la escritura de código y la gestión de proyectos.

# Instalación
  **Java**
    Descarga Java desde el sitio web oficial de Java:
    Ejecuta el archivo de instalación que descargaste.
    Sigue las instrucciones en pantalla para completar el proceso de instalación
    
  **Maven**
    Descarga Apache Maven desde el sitio web oficial de Maven:
    Extrae el archivo de instalación que descargaste.
    Asegúrate de tener una instalación de JDK en tu sistema. Puedes establecer la variable de entorno JAVA_HOME      apuntando a tu instalación de JDK o tener el ejecutable de java en tu PATH.
    Agrega el directorio bin del directorio creado apache-maven-3.9.6 a la variable de entorno PATH.
    Confirma con mvn -v en una nueva terminal.
  
  **Git bash**
    Descarga Git Bash desde el sitio web oficial de Git:
    Ejecuta el archivo de instalación que descargaste.
    Haz clic en “Next” y selecciona un directorio para la instalación. Puedes ubicarlo entre tus programas.

  **Intellij**
    Descarga IntelliJ IDEA desde el sitio web oficial de JetBrains:
    Ejecuta el archivo de instalación que descargaste.
    Sigue las instrucciones en pantalla para completar el proceso de instalación1.
    Asegúrate de cumplir con los requisitos del sistema2:
    RAM: 2 GB de RAM libre (8 GB de RAM total recomendado)
    CPU: Cualquier CPU moderna (se recomienda una CPU multi-core)
    Espacio en disco: 3.5 GB en un SSD con al menos 5 GB de espacio libre
    
#Funcionamiento
**CREAR UN PROYECTO CON MAVEN**
En el directorio de trabajo ejecutar el comando necesario para crear/generar un proyecto maven basado en un arquetipo:

Grupo (groupId): edu.eci.cvds
Artefacto (artifactId): ClasesEquivalencia
Paquete (package): edu.eci.cvds.tdd
archetypeArtifactId: maven-archetype-quickstart

**ACTUALIZAR Y CREAR DEPENDENCIAS EN EL PROYECTO**
Busque el artefacto JUnit y entre a la versión más nueva. imagen

Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles.

Edite el archivo pom.xml y realice las siguientes actualizaciones:

Agregue/Reemplace la dependencia copiada a la sección de dependencias.
Hay que cambiar la versión delcompilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:
<properties>
<maven.compiler.target>1.8</maven.compiler.target>
<maven.compiler.source>1.8</maven.compiler.source>
</properties>

**Compilar y ejecutar**
Para compliar el proyecto en maven usamos el comando "mvn compile" si queremos ejecutar las pruebas unitarias unicamente usaremos el comando "mvn test"

#Ejercicio "Registraduria"

**Ejecutar las pruebas**

¿Cual es la diferencia mvn test y mvn pakage?

Su diferencia es que mvn test compila y ejecuta el proyecto con sus respectivas pruebas, en cambio mvn package compila el programa, pasa las pruebas y si estas son validas, el programa empaqueta el proyecto en un archivo .jar

#FINALIZAR EL EJERCICIO

Para este ejercicio podemos hacer uso de 5 casos de equivalencia.
	1)En caso que la persona no este viva
	2)En caso de que la persona sea menor de edad
	3)En caso de que la edad sea invalida
	4)En caso de que el numero de la cedula este duplicado
	5)En caso de que la informacion sea correcta

#REALIZAR PRUEBAS




   

    
