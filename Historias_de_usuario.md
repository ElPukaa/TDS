# Historias de usuario

## Acceso usuarios

### 0. Historia de Usuario: Registro de un nuevo usuario

**Como**: usuario no registrado\
**Quiero**: poder registrarme en el sistema introduciendo mi nombre\
**Para**: poder registrar mis gastos y consultarlos posteriormente\

Criterios de verificación:

- El formulario debe solicitar el nombre.\
- El nombre no puede estar vacío.\
- Si el nombre ya está registrado notificar al usuario del error\


### 0. Historia de Usuario: Inicio de sesión

**Como**: usuario no autenticado\
**Quiero**: poder autenticarme con mi nombre\
**Para**: acceder a la app\

Criterios de validación:

- El nombre no puede estar vacío.\
- El usuario debe estar registrado.\

---

## Gestión de cuentas

### 0. Historia de Usuario: Crear cuentas de gasto individual

**Como**: usuario registrado\
**Quiero**: poder crear una nueva cuenta personal de gastos\
**Para**: gestionar y organizar mis gastos\

Criterios de validación:
- La cuenta debe tener un nombre único\
- La cuenta debe estar asociada al usuario que la crea\
- El saldo inicial debe ser 0\

### 0. Historia de Usuario: Crear cuentas de gasto compartidas
**Como**: usuario registrado\
**Quiero**: poder crear una nueva cuenta de gastos compartida con otros usuarios\
**Para**: gestionar y organizar gastos en grupo\

Criterios de validación:
- La cuenta debe tener un nombre único\
- La cuenta debe estar asociada a los usuarios que la crean\
- El saldo inicial debe ser 0\

### 0. Historia de Usuario: Definir porcentaje en cuentas de gasto compartidas
**Como**: usuario registrado\
**Quiero**: poder definir el porcentaje de pago correspondiente en la cuenta a cada usuario\
**Para**: gestionar y organizar los gastos compartidos de forma equitativa\

Criterios de validación:
- La suma de los porcentajes individuales debe ser IGUAL a 100\
---

## Importar/Exportar datos

### 0. Historia de Usuario: Importar datos desde un archivo

**Como**: usuario autenticado\
**Quiero**: poder seleccionar un archivo de gastos\
**Para**: poder hacerlo automaticamente, ahorrando tiempo\

Criterios de validación:
- El sistema soporta la importación del formato de archivo de ejemplo proporcionado.
- El archivo debe tener tamaño > 0
- El archivo seleccionado debe contener datos correctos


### 0. Historia de Usuario: Exportar datos a un archivo

**Como**: usuario autenticado\
**Quiero**: exportar la cuenta completa de gastos\
**Para**: realizar copias de seguridad o compartir\

Criterios de validación:

- El formato del archivo exportado debe ser compatible con los permitidos para importar.\
- El archivo exportado debe contener todos los gastos/modificaciones hechas en la cuenta.\

---

## Gestion de categorías

### 0. Historia de Usuario: Crear categoría

**Como**: usuario autenticado\
**Quiero**: poder crear una categoría\
**Para**: asociar y clasificar los gastos\

Criterios de validación:

- Debe existir una cuenta de gasto.
- 


### 0. Historia de Usuario: Ver categorías

**Como**: usuario autenticado\
**Quiero**: ver un listado en distintos formatos (tabla/lista/gráficas) de todas las categorías de gasto disponibles\
**Para**: gestionar los gastos por categorías\

Criterios de validación:
- Debe existir al menos una categoría 


### 0. Historia de Usuario: Actualizar categoría

**Como**: usuario autenticado\
**Quiero**: actulizar una categoria\
**Para**: modificar su nombre\

Criterios de validación:
- Debe existir una categoría
- El nuevo nombre debe NO estar vacío

### 0. Historia de Usuario: Eliminar categoría

**Como**: usuario autenticado\
**Quiero**: poder eliminar una categoría\
**Para**: gestionar las categorías y los gastos nuevamente\

Criterios de validación:
- La categoria debe existir
<!-- al eliminar una categoria se pregunta si eliminar todos los gastos asociados o por el contrario dejar los gastos con una categoria general -->

## Gestión de gastos

### 0. Historia de Usuario: Añadir gastos (fecha y cantidad)

**Como**: usuario registrado y perteneciente a la cuenta\
**Quiero**: poder añadir un gasto especificando la fecha y la cantidad\
**Para**: registrar mis gastos y llevar un control de ellos\

Criterios de validación:
- La cantidad del gasto debe ser positiva\
- La fecha debe ser válida\
- Debe haber al menos 1 usuario incluido en el gasto (CONSULTAR FUNCIONALIDAD DE LA APP; SE AÑADE UN GASTO A LA CUENTA O EN EL GASTO SE PUEDEN SELECCIONAR LOS USUARIOS (en este caso hay que hacer más cosas))\

### 0. Historia de Usuario: Eliminar gastos

**Como**: usuario registrado y perteneciente a la cuenta\
**Quiero**: poder eliminar un gasto\
**Para**: poder gestionar los gastos y llevar un control\

Criterios de validación:
- El gasto debe existir\

### 0. Historia de Usuario: Actualizar gastos

**Como**: usuario registrado y perteneciente a la cuenta\
**Quiero**: poder actualizar un gasto\
**Para**: corregir posibles errores al añadir un gasto\

Criterios de validación:
- El gasto debe existir
- La cantidad del gasto debe ser positiva\
- La fecha debe ser válida\

### 0. Historia de Usuario: Configurar alertas

**Como**: usuario registrado\
**Quiero**: poder crear alertas de gastos\
**Para**: poder controlar el gasto máximo en un periodo de tiempo establecido\ 

Criterios de validación:

- El periodo de tiempo debe ser positivo/válido (> 0 dias/semanas/meses/años)\

---

## Visualización de gastos

<!-- Considerar que una busqueda sin filtros es un filtro vacio -->

### 0. Historia de Usuario: Visualizar gastos en forma de lista

**Como**: usuario autenticado\
**Quiero**: poder visualizar las categorías en un formato de lista\
**Para**: gestionar las categorías en un formato de lista\

Criterios de validación:
- Debe existir la categoría

### 0. Historia de Usuario: Visualizar gastos en forma de gráfico

**Como**: usuario autenticado\
**Quiero**: poder visualizar las categorías en un formato de graficas(de barras/circulares)\
**Para**: gestionar las categorías en un formato de graficas\

Criterios de validación:
- Debe existir la categoría

### 0. Historia de Usuario: Visualizar gastos en forma de calendario

**Como**: usuario autenticado\
**Quiero**: poder visualizar las categorías en un formato de calendario\
**Para**: gestionar las categorías en un formato de calendario\

Criterios de validación:
- Debe existir la categoría

### 0. Historia de Usuario: Visualizar gastos en forma de calendario en un intervalo de tiempo

**Como**: usuario autenticado\
**Quiero**: poder visualizar las categorías en un intervalo de dos fechas\
**Para**: gestionar las categorías en un espacio de tiempo determinado\

Criterios de validación:
- Debe existir la categoría
- Ambas fechas deben ser válidas
- La primera fecha debe ser anterior a la segunda
