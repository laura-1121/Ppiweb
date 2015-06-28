
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
                    <li><a href="#"><strong><em>Catálogo de productos</em></strong></a>
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
            <section>
                <div id="TextoPrincipal">
                <article>
                    <hgroup>
                        <h1>Noticias</h1>
                    </hgroup>
                    <p> 12/3/15: Se añaden nueva colección de zapatos para dama.</p>
                    <p> 17/3/15: nuevos bolsos de totto en inventario!</p>			
                </article>
                </div>
                <div id="InicioSesion">
                <article>
                        <hgroup>
                            <h1>Inicio de sesión</h1>
                        </hgroup>
                        <form method="get" action="accion.html">
                            <label>Id.Usuario: </label> &nbsp;&nbsp;&nbsp; <input type="text" id="idUsuario" name="idUsuario" placeholder="Id.Uduario"/>
                            <label>Contraseña: </label> &nbsp;&nbsp; <input type="password" id="clave" name="clave" placeholder="Contraseña"/><br>
                            <br>
                            <a href="RecordarClave.html">¿Olvido su contraseña?</a> <br>
                            <button type="submit"><a id="link" href="MenuPrincipal.html">Ingresar</a></button> <button type="submit"><a id="link" href="Registrarse.html"> Registrarse</a></button>
                        </form>
                    </article>
                </div>
                <br>
                <div id="Siguenos">
                <article style="width: 362px; height: 176px">
                        <hgroup>
                            <h1>Síguenos en:</h1>
                        </hgroup>
                        <a href="www.youtube.com"><img src="Imagenes/youtubr.jpg" height="46" width="301"></a>
                        <a href="www.twitter.com"><img src="Imagenes/twitter.png" height="46" width="301"></a>
                        <a href="www.facebook.com"><img src="Imagenes/face.jpg"	height="46" width="301"></a>
               	</article>
                </div>
            </section>
        </div>
    </body>
</html>
