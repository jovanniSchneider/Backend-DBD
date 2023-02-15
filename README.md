# grupo_15_dbd
El proyecto fue desarrollado utilizando la version 17 de JDK, para ejecutarlo basta con tener el IDE IntelliJ, cargar las dependencias de gradle y ejecutar el proyecto desde el mismo IDE.
Primeramente se deben realizar los siguientes cambios en el archivo application.properties encontrado en src/main/resources:
1. Cambiar el valor de "spring.datasource.url = jdbc:postgresql://localhost:5432/prueba" por la base de datos local
2. Colocar en "spring.datasource.username" el username de su propia base de datos
3. Colocar en "pring.datasource.password=" la password de su propia base de datos
4. Ejecutar el programa y antes de realizar cualquier consulta poblar la base de datos con el script llamado inserts.sql
5. En caso de que la query falle, utilizar truncate cascade y volver a intentar
6. Se entrega ademas el archivo con las consultas realizadas en postman como ejemplo.
