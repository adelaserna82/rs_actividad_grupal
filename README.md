## Trabajo Grupal de reutilización

Tenemos que crear un sistema que aplique dos patrones estructurales.

Como en toda aplicación suele haber envío de notificaciones, es necesario de implementar el envío de email.

Hoy en día existen multidud de servicios que ofrecen el envío de email, hoy puedes utilizar uno y mañana otro. El problema que te puedes encontrar es que
tengas que cambiar de servicio y tengas que utilizar otro interfaz diferente al que tenías con anterioridad. Esto provoca que si lo cambias, tengas que revisar
todo el código y adecuar la utilización de esta nueva interfaz.

Por lo tanto, al utilizar una librería de terceros, es conveniente crear un adaptador para que si algún día tienes que cambiar la lógica del cliente no se vea afectada.

Para realizar la implementación y ejemplo de este patrón hemos ideado como lógica de negocio una cola de emails, desde el negocio se irán encolando emails ya cada medio segundo la cola de email enviará el email. La cola de email sólo soporta tener un máximo de 20 email encolados, por lo tanto, el programa tendrá que esperar hasta que libere emails en el supuesto de que llegue a 20 encolados a la vez.

Para que el programa pueda seguir funcionando, hemos creado un hilo que se encarga de desencolar cada medio segundo. Este hilo se inicia al instanciar la clase EmailQueue.

Este envío se realizar a través del adaptador que implementa una interfaz, esta intefaz es con la que se trabajará a lo largo del proyecto.

El paquete creado para la gestión de la cola de mensajes se encuentra en **src/EmailQueueWithAdapter**

Para simular la librería del servicio de tercero, hemos creado la clase **MailRelay**, que se encuentra dentro del paquete mencionado anteriormente.

Este sería el diagrama de clases:

<image src='EmailQueueWithAdapter.jpg'></image>

En la clase **src/Main.java**, hemos creado una simulación de enviar de golpe 49 emails, de tal manera podemos ver que cuando llega a 20 tiene que esperar hasta que va desencolando los emails.

Como manejo un hilo para que vaya desencolando y enviando el email en un segundo plano, una vez que he encolado todos los emails indico a la clase que cuando desencole todo lo que tiene puede matar el hilo.


