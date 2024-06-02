# Crear 
Creamos una carpeta com_tuuniversidad_exceptions e implementmos dos clases GlobalExceptioHandler.java y LibroException.java 

![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/f8fd353e-94fb-47fd-999f-c5d58a5d4161)
# Visualización
GlobalExceptionHandler.java

![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/6678158f-25fa-4f1e-81b6-c2d285ed790a)
# Presentación de LibroException.java
![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/1ac4eb56-eb80-4ff9-9447-3178235cc233)
# Modificación 
Se va midificando en la carpeta com_tuuniversidad_service en la clase LibroServiceImpl.javan, en la línea veinte tres, se agrega el mensaje que se presentará, cuando busquemos en el thunder una clase inexistente.
![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/73fa3bad-ad8c-438d-8467-e69a8187b70a)
# Comprobación.
Crear un libro, CREATE

![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/756a89db-4951-4160-b0f4-4ba4ebea51b0)
![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/b2686358-5bcc-41a7-ab0b-e9743c89218d)
# Si no existe el libro
Lanzar un expcetion LibroException (GET /libros/{id_libro}). Enviar el estado NOT_FOUND con un mensaje personalizado
![image](https://github.com/Diana29004/Web-API-de-Libro-con-control-de-excepciones_Mejia-Diana/assets/170267544/0c12fcc8-f435-4e20-be99-3f64f9a04ecd)




