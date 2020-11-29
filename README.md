# Control_Inventario
 Software para llevar control de Inventarios en el área de TI

Proyecto para la fase final de la materia de Taller de productividad basada en herramientas tecnologicas.

### Tabla de contenidos 

* [Introducción](#mi-titulo-a-anclar)
* [Descripción](#mi-titulo-a-anclar)
* [Problema identificado](#mi-titulo-a-anclar)
* [Solución](#mi-titulo-a-anclar)
* [Instalación](#mi-titulo-a-anclar)
* [Arquitectura](#mi-titulo-a-anclar)
* [Roadmap](#mi-titulo-a-anclar)
* [Referencias](#mi-titulo-a-anclar)
* [Contribución](#mi-titulo-a-anclar)

### Introducción:
Se crearía un Sistema de Inventario de Activos Fijos de Computadoras, esto para llevar un mejor control de equipos, ya que actualmente no se puede visualizar todo el equipo en existencia y en uso, esto sería de mucha utilidad para facilitar mis labores diarias, ya que trabajo en esa empresa y en el área mencionada. Y de seguir así se hace el equipo “perdedizo” y no se pide a tiempo a proveedor para mantener el stock del 10% que requiere y causaría afectación a empleados que se les descomponga su equipo o empleados nuevos que requieren equipo para sus labores

### Descripción:
Este es un programa que utiliza una base de datos (MySQL) de manera local y está creado el código en Java, ésto para poder llevar un mejor control de Inventarios de Activos para el área de TI

### Problema identificado:
Cuando no se cuenta con un Sistema Inventarios completo para llevar un control de entradas y salidas de Equipo de Cómputo

### Solución:
La solución que se planteo fue desarrollar un programa para el control de Invenmtarios de Equipo de Cómputo para el área de TI, dónde se darán de Alta los Equipos con sus características principales, se podràn editar o eliminar y guardará un registro de su ubicacíon y si se encuentra asignado a algún empleado

### Instalación

Es necesario instalar:

Java Netbeans
https://netbeans.org/index_es.html

 JDK 8
 https://www.oracle.com/mx/java/technologies/javase/javase-jdk8-downloads.html
 
 Mysql
 https://www.mysql.com/downloads/
 
 MySQL Workbench
 https://dev.mysql.com/downloads/workbench/
 
Crear la base de datos que se incluye en los archivos del repositorio e importarlo en workbench

Descargar el proyecto en una carpeta, abrirlo con Netbeans despuès de haber instalado jdk y creado la base de datos y darle run (flecha verde)
  
 

### Arquitectura
Es necesario definir la aqrquitectura que se necesita para ejecutar este programa de forma local, por lo que acontinuación se describe cada uno de los elementos necesarios.

* Lenguaje: JAVA

  Es el lenguaje que se utiliza para dearrollar este sistema:

* Librerias:

- MySQL Java conector 8.0.22 -- Driver para enlace MySQL con Netbeans

- IDE para desarrollo del código: Netbeans 12.1
	 Nota: se ocupó el JDK 1.8

* Servidor Local: Repositorio Maven

* Base de datos Local: 
	MySQL 8.0.22
	MySQL Workbench 8.0.22


### Roadmap

Para la siguiente versión, 
- creará una lista para imprimir de todos los activos registrados 
- Dar de alta componentes fisicos y virtuales como licencias
- crear Base de Datos en la nube


### Referencias

https://github.com/al02943673/Inventario_Computadoras

### Contribución:

Pasos para clonar el repositorio:
https://docs.github.com/es/free-pro-team@latest/github/creating-cloning-and-archiving-repositories/cloning-a-repository

heroku:
https://www.heroku.com/


Elaborado por **Kurt Halbinger** matrícula 02943673 **Tecmilenio**
Taller de Productividad basada en Herramientas Tecnológicas
