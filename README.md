### Biblioteca FastDevelopment <img height="35" src="https://image.flaticon.com/icons/png/512/2490/2490396.png">

Proyecto final de la Biblioteca Fast Development. La aplicacion de escritorio fue desarrollada en Netbeans con JAVA SWING. Uno de los modulos que se utilizo
fue el patron de diseño MVC, control de todo tipo de excepciones y se le integro una base de datos. 
___

#### Caso de Estudio

La futura “Biblioteca Especializada FastDevelopment” requiere registrar todos los procesos asociados a su negocio.
Entre ellos los datos de las funciones necesarias para gestionar se encuentran:

-	La compra de libros nuevos a distribuidores registrados en la empresa
-	La venta de libros nuevos a clientes registrados de la biblioteca
-	El arriendo de libros a clientes registrados de la biblioteca
___
#### LIBRO

- Un libro podrá tener el mismo ISBN que otro libro, pero distinto número de serie.
- Un libro puede ser escrito por uno o más autores, puede tener una o más categorías, puede tener uno o más idiomas.
- Cada libro debe tener asociada solo una editorial.
- El libro mantendrá un estado en la base de datos: **Vendido , Arrendado o Disponible.**
- De los autores solo se necesita conocer su nombre, apellido paterno y apellido materno.
- De la editorial solo se debe almacenar el nombre.

`Número de serie` `ISBN` `Título` `Número de páginas` `Precio referencia` `Año publicación` `Idioma` `Autores` `Categorías` `Editorial`
___
#### DISTRIBUIDORES

- Cada distribuidora tendrá asociada una sola dirección y un solo teléfono.

`Rut` `Nombre de empresa` `Dirección` `Teléfono` `Año desde que vende libros a la biblioteca`
___
#### CLIENTES

- En el registro, para cada cliente se deben almacenar sus datos personales, junto con una o más direcciones, con uno o más teléfonos, uno o más correo y la fecha de nacimiento.

`Rut` `Nombre` `Apellido paterno` `Apellido materno` `Direcciones` `Teléfonos` `Correos electrónicos` `Fecha nacimiento`
___
#### TRABAJADORES

- De cada trabajador se deberá registrar sus datos personales, una o más direcciones, uno o más teléfonos, uno o más correos y la fecha de inicio de su contrato laboral.

`Rut` `Nombre` `Apellido paterno` `Apellido materno` `Direcciones` `Teléfonos` `Correos electrónicos` `Fecha de contrato laboral`
