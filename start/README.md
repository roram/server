# Server HTTP

## Objetivo
El objetivo de este proyecto es poder aprender más sobre el funcionamiento de los servidores utilizando Java como lenguaje principal y sin la utilización de ningún framework y comprender mejor qué resuelven frameworks como Spring-boot.

## Actualmente implementado
Ahora mismo se puede descargar el proyecto e inicializarlo desde IntelliJ utilizando Java 17. Una vez que inicie, si nos dirigimos a http://localhost:8080/hello vamos a recibir un mensaje que dice **¡Hola Mundo!**

---

# Lista de tareas a implementar

- [ ] Ampliación de servidor básico
- [ ] Crear sistema de enrutamiento
- [ ] Manejo de datos y formatos
- [ ] Implementar conceptos avanzados
- [ ] Explorar conceptos de Servlets

---

## Ampliación de servidor básico
- [ ] Investigar e implementar diferentes métodos HTTP (GET, POST, PUT, DELETE)
- [ ] Desarrollar un sistema para extraer y procesar parámetros de URL (`/hello?name=Juan`)
- [ ] Funcionamiento de las cookies en HTTP y cómo implementar su manejo
- [ ] Implementar y configurar headers HTTP personalizados
- [ ] Manejar diferentes códigos de estado HTTP (200, 201, 400, 404, 500)

## Crear sistema de enrutamiento
- [ ] Diseñar un mecanismo para dirigir solicitudes a diferentes manejadores según la URL
- [ ] Implementar un sistema para servir archivos estáticos (HTML, CSS, JS) desde el sistema de archivos
- [ ] Explorar patrones de URL y parámetros de ruta como `/usuarios/:id`
- [ ] Crear un sistema de middleware para procesar solicitudes en cadena
- [ ] Implementar redirecciones y reescritura de URLs

## Manejo de datos y formatos
- [ ] Leer datos del cuerpo de una solicitud HTTP
- [ ] Desarrollar funciones para serializar y deserializar JSON manualmente
- [ ] Explorar diferentes tipos de contenido y sus headers correspondientes
- [ ] Implementar validación básica de datos recibidos
- [ ] Manejar la codificación de caracteres correctamente (UTF-8)
- [ ] Implementar content negotiation (responder con diferentes formatos según solicitud)

## Implementar conceptos avanzados
- [ ] Manejo de sesiones para persistencia entre solicitudes
- [ ] Implementar un pool de threads para gestionar concurrencia
- [ ] Configurar timeouts y límites de conexión
- [ ] Implementar autenticación básica (Basic Auth)
- [ ] Añadir soporte para CORS (Cross-Origin Resource Sharing)
- [ ] Implementar técnicas básicas de seguridad y prevención de ataques
- [ ] Crear un sistema simple de logging para registrar solicitudes

## Explorar conceptos de Servlets
- [ ] Estudiar la especificación de Servlets y su ciclo de vida
- [ ] Entender cómo funcionan los contenedores de Servlets
- [ ] Comparar implementación propia vs especificación Servlet
- [ ] Investigar cómo implementar filtros en un entorno Servlet
- [ ] Comprender el concepto de contexto de aplicación web

---

## Recursos recomendados para investigación

- Documentación oficial de Java para `com.sun.net.httpserver`
- Especificación HTTP (RFC 7230-7235)
- Documentación sobre manejo de streams y bytes en Java
- Guías sobre HTTP headers y sus significados
- Especificación Jakarta Servlet
