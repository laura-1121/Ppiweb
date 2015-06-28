

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
            
            <div id="MenuIzquierdo">
                <h2>Herramientas</h2>
                <p>

                </p>
            </div>
            <div id="Cliente">
                <h2>Registrar Empleado</h2>
                <p>
                Los campos con (*) son campos obligatorios. <br>
                <br>
                Tipo Documento: &nbsp;&nbsp;&nbsp;&nbsp; <select class="form-control" id="TipoDocumento" name="Asunto">
                                                        <option value> Seleccione</option>
                                                        <option value> Nit</option>
                                                        <option value> CC</option>
                                                        <option value> Cedula extranjera</option>
                                                     </select> &nbsp;&nbsp;&nbsp;&nbsp;
                Documento: &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="Documento" name="Documento" placeholder=" "/><br>
                Nombres: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="Nombres" name="Nombres" placeholder=" "/> &nbsp;&nbsp;&nbsp;
                Apellidos: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="Apellidos" name="Nombres" placeholder=" "/> <br>
                Fecha Nacimiento: &nbsp; <input type="text" id="FechaNacimiento" name="FechaNacimiento" placeholder="dd/mm/aaaa"/> &nbsp;&nbsp;&nbsp;
                Genero: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select class="form-control" id="TipoDocumento" name="Asunto">
                            <option value> Seleccione</option>
                            <option value> Hombre</option>
                            <option value> Mujer</option>
                        </select> &nbsp;&nbsp;&nbsp;&nbsp;<br>
                Telefono: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="Telefono" name="Telefono" placeholder=" "/> &nbsp;&nbsp;&nbsp;
                Celular: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="Celular" name="Celular" placeholder=" "/> <br>
                Dirección: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="Telefono" name="Telefono" placeholder=" "/> &nbsp;&nbsp;&nbsp;
                Correo: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="email" id="Celular" name="Celular" placeholder=" "/> <br>
                <center><button type="submit" value="Registrar">Registrar</button> <button type="reset" > Limpiar</button> </center>
            </div>
        </div>
    </body>
</html>