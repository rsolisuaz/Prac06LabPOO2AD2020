# PRÁCTICA 6. USO DE LA CLASE DriverManager DE JDBC PARA ACCEDER A MySQL.

## COPIA DEL REPOSITORIO REMOTO EN SU COMPUTADORA LOCAL
Como primer paso, será necesario crear una copia local del repositorio remoto creado en Github al aceptar la tarea. Para ello, es necesario hacer los siguientes pasos:
1)	Entrar a la página cuyo URL les fue proporcionado al aceptar la tarea, en tal página dé click en el botón Code y copie el URL que aparece en el cuadro de texto de nombre **Clone with HTTPS** (comienza con *https://*)
2)	En una consola de Git Bash en Windows (o en una terminal en Linux o Mac), cree una carpeta donde quiera que se contengan sus prácticas del semestre (si es que aún no la has creado) y colócate en tal carpeta. La carpeta la puedes crear desde el Git Bash o terminal Linux/Mac usando el comando `mkdir` (o con el explorador de archivos de su sistema operativo) y en la consola de Git Bash o terminal de Linux/Mac te puedes cambiar a la carpeta mencionada usando el comando `cd`
3)	Clone el repositorio privado dando el comando `git clone URL practica06`
 (donde **URL** es el URL que copió en el paso 1)\
 Este comando creará dentro de la carpeta creada en el paso 2) una subcarpeta de nombre **practica06** donde estará una copia local del repositorio remoto.\
 Los comandos posteriores de git tendrán que darse desde tal carpeta, por tanto, cámbiate a la carpeta usando `cd practica06`


## REQUERIMIENTOS

La lista de requerimientos que deben cumplirse en esta práctica los puede encontrar en el archivo **PracticasLaboratorio06_29Sep2020.pdf**


## CALIFICACIÓN

La calificación para esta práctica dependerá del funcionamiento total de la clase CreaTablasConDriverMan, y se realizará una prueba de manera inmediata al subir su solución.


## NOTAS IMPORTANTES


1. Recuerda que el proceso que debes estar haciendo es:
   - Haz cambios  en el archivo fuente **CreaTablasConDriverMan.java** 
   - **Compila el programa en tu computadora para ver que los cambios que introdujiste no causan ningún error** (trata de ir haciendo cambios incrementales, por ejemplo, completa uno de los métodos primero y prueba que compile antes de hacer cambios en los otros métodos)
   - Si ya compila avisa a tu repositorio local que registre esos cambios dando los comandos `git add CreaTablasConDriverMan.java` y `git commit -m "MENSAJE"` donde MENSAJE es un texto que describe brevemente, pero de manera clara los cambios que realizaste desde el último commit. 

2. Una vez completados todos los métodos, ejecúta el programa de acuerdo a las instrucciones y verifica que no genera errores y muestra los mensajes esperados. 

3. Si ya se ejecuta correctamente, súbelo al repositorio remoto dando `git push`. De otra manera, corrige los errores (haciendo las compilaciones, git add y git commit correspondientes)

4. Cada vez que hagas `git push` se realizarán automáticamente pruebas sobre tu código para verificar si funciona correctamente. Recuerda que en la página de tu repositorio en la sección **Pull Requests**, se encuentra una subsección de nombre **Feedback**, donde podrás encontrar los resultados de las pruebas en la pestaña denominada **Check** (expandiendo la parte que dice **Run education/autograding@v1**), y cualquier comentario general que el profesor tenga sobre tu código en la pestaña **Conversation**. 