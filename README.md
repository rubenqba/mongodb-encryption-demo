# Spring Boot MongoDB Data Encryption Demo

Este proyecto de demostración es un ejemplo práctico de cómo implementar la encriptación de datos en una aplicación Spring Boot que utiliza MongoDB como base de datos. La implementación se basa en el soporte de encriptación proporcionado por la biblioteca [`spring-data-mongodb-encrypt`](https://github.com/agoston/spring-data-mongodb-encrypt).

El objetivo de este repositorio es demostrar cómo se pueden proteger los datos sensibles almacenados en MongoDB mediante la encriptación de campos específicos antes de su persistencia y desencriptarlos al ser recuperados de la base de datos.

## Características Principales

- **Encriptación Transparente:** La encriptación y desencriptación se manejan de forma transparente, sin necesidad de modificar el código de negocio.
- **Configuración Sencilla:** Se utiliza la anotación `@Encrypted` para marcar los campos que deben ser encriptados.
- **Integración con Spring Boot:** El proyecto está configurado para integrarse fácilmente con una aplicación Spring Boot.
- **Uso de `spring-data-mongodb-encrypt`:** Se muestra cómo utilizar las funcionalidades de encriptación proporcionadas por la biblioteca de terceros.

## Estructura del Proyecto

- **Modelo de Dominio:** Clases de entidad con campos anotados con `@Encrypted` para la encriptación de datos.
- **Repositorios:** Interfaces de repositorio de Spring Data MongoDB para operaciones CRUD así como usando `MongoTemplate`.
- **Servicios:** Capa de servicio para lógica del demo.
- **Controladores:** Controladores REST para exponer funcionalidades a través de una API HTTP.
- **Configuración de Encriptación:** Configuración centralizada para la gestión de claves y la inicialización de la encriptación.

## Cómo Empezar

Para ejecutar este proyecto, necesitarás tener instalado Java (versión 21 o superior), Maven y Docker. En la aplicación se hace uso del soporte de Spring Boot para Docker por lo que en el archivo [compose.yml](./compose.yml) se encuentra la configuración de la BD que se desplegará automáticamente. 

1. Clona el repositorio:
   ```sh
   git clone https://github.com/rubenqba/mongodb-encryption-demo.git
   ```

2. Navega al directorio del proyecto y arranca la aplicación Spring Boot:
    ```shell
    cd mongodb-encryption-demo
    mvn spring-boot:run
    ```

3. Realiza solicitudes a los endpoints definidos para probar la encriptación y desencriptación de los datos. En el archivo [rest-request.http](./rest-requests.http) se encuentran los ejemplos de peticiones al API para usarlas en IntelliJ pero pueden ser facilmente miradas a cualquier otra herramienta.

## Licencia
Este proyecto se distribuye bajo la MIT License, lo que permite su uso y distribución libremente.