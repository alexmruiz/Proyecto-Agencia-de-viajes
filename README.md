# Agencia de Viajes - Microservicios

Este proyecto es una aplicación web basada en microservicios que simula una agencia de viajes. Está desarrollada en **Spring Boot** y utiliza **MongoDB** como base de datos principal. 
La aplicación está compuesta por los siguientes microservicios:

## Microservicios
1. **Hoteles**: Gestiona la información relacionada con los hoteles disponibles.
2. **Vuelos**: Maneja los vuelos disponibles para reserva.
3. **Reservas**: Permite gestionar las reservas de vuelos y hoteles.

## Servicios Adicionales
- **Eureka Server**: Actúa como servidor de descubrimiento de servicios, permitiendo que los microservicios se registren y comuniquen entre sí.
- **Spring Cloud Config**: Centraliza la configuración de los microservicios, con los archivos de configuración almacenados en un repositorio GitHub.
- **API Gateway**: Maneja el enrutamiento de las solicitudes a los microservicios correspondientes, actuando como punto de entrada a la aplicación.

## Base de Datos
El sistema utiliza **MongoDB** como base de datos, permitiendo el almacenamiento de información de vuelos, hoteles y reservas.

## Requisitos
- **Java 21**
- **Spring Boot**
- **MongoDB**
- **Docker (opcional)**
- **Git** para la gestión del repositorio de configuración

## Ejecución
1. Clona el repositorio.
2. Configura y ejecuta los microservicios de manera individual o utilizando **Docker** para contenerización.
3. Asegúrate de tener configurado MongoDB en tu entorno local o en la nube.

## Arquitectura
Este proyecto sigue una arquitectura de microservicios, lo que permite escalabilidad y desacoplamiento de los componentes. 
La comunicación entre los microservicios se maneja mediante **RestTemplate**.
