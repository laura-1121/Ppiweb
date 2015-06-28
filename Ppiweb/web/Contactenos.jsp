
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Pedidos más Pedidos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="Stylesheet.css">
	<link rel="icon" href="Imagenes/LogoIcono.ico" type="image/x.icon">
    </head>
    <body>
        <div id="Contenido">
            <header>
                <img id="logo" src="Imagenes/Logoo3.png"  width="250" height="200">
                <nav>
                <ul id="menu">
                    <li><a href="index.html"><strong><em>Inicio</em></strong></a></li>
                    <li><a href="#"><strong><em>Nuestra compañia</em></strong></a>
                        <ul id="sub-menu">
                            <li><a href="Mision.html">Misión y Visión</a></li>
                            <li><a href="Historia.html">Historia</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><em><strong>Catálogo de productos</strong></em></a>
                        <ul id="sub-menu">
                            <li><a href="#">Alcoba</a></li>
                            <li><a href="#">Cocina</a></li>
                            <li><a href="#">Escolar</a></li>
                            <li><a href="#">Hogar</a></li>
                            <li><a href="#">Otros</a></li>
                        </ul>
                    <li><a href="Promociones.html"><strong><em>Promociones</em></strong></a>
                    <li><a href="Contactenos.html"><strong><em>Contáctenos </em></strong></a></li>
                </ul>
            </nav>
            </header>
            <div id="Informacion">
            <h2>Información de Contácto</h2>
                <label>Telefono: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(+57) 444-15-18 <br> <br>
                <label>Dirección: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Calle 38# 30-15 <br> <br>
                <label>Correo: </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="email">almacenelhueco@gmail.com</a> <br> <br>
                <label>Pagina web: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="web">www.almacenelhueco.com</a> <br> <br>
                <label>Ubicación: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3966.1869316449524!2d-75.57286509999999!3d6.239076100000015!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8e442852bdb08ae3%3A0x59c47f7d61c62a14!2sCalle+38+%23+30%2C+Medell%C3%ADn%2C+Antioquia%2C+Colombia!5e0!3m2!1ses!2ses!4v1428619377556"></iframe>
            </div>
            <div id="MensajeContacto">
            <h2>Contáctenos</h2>
                <label>Nombre completo: </label> &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="NombreCompleto" name="NombreCompleto" placeholder=" "/> <br>
                <label>Correo: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="email" id="Correo" name="Correo" placeholder=" "/> <br>
                <label>Asunto: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select class="form-control" id="Asunto" name="Asunto">
                                                                                                                                                                            <option value> Seleccione </option>
                                                                                                                                                                            <option value> Solicitud</option>
                                                                                                                                                                            <option value> Queja o Reclamo</option>
                                                                                                                                                                            <option value> Felicitación</option>
                                                                                                                                                                            <option value> Sugerencia</option>
                                                                                                                                                                        </select> <br>
                <label>Mensaje: </label> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <textarea class="form-control" name="Mensaje" id="MensajeTexarea"> </textarea> <br>
                <button type="submit">Enviar</button>
            </div>
        </div>
</body>
</html>