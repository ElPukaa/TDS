# Historias de usuario

---
Plantilla para copiar y pegar: 


**Como**: 
**Quiero**:
**Para**

Criterios de validación:
-
-
-

---


## Acceso usuarios

### 0. Historia de Usuario: Registro de un nuevo usuario

**Como**: usuario no registrado\
**Quiero**: poder registrarme en el sistema introduciendo mi nombre\
**Para**: poder registrar mis gastos y consultarlos posteriormente\

Criterios de verificación:

- El formulario debe solicitar el nombre.\
- El nombre no puede estar vacío.\
- Si el nombre ya está registrado notificar al usuario del error\
- Si el registro ha sido correcto iniciar sesión\

<!-- (Hugo) Es necesario implementar inicio de sesión?-->

### 0. Historia de Usuario: Inicio de sesión

**Como**: usuario no autenticado\
**Quiero**: poder autenticarme con mi nombre\
**Para**: acceder a la app\

Criterios de validación:

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

### 0. Historia de Usuario: Exportar datos a un archivo

---

## Gestion de categorías

### 0. Historia de Usuario: Ver categorías

### 0. Historia de Usuario: Crear categoría

### 0. Historia de Usuario: Actualizar categoría

---

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
- Debe haber al menos 1 usuario incluido en el gasto (CONSULTAR FUNCIONALIDAD DE LA APP; SE AÑADE UN GASTO A LA CUENTA O EN EL GASTO SE PUEDEN SELECCIONAR LOS USUARIOS (en este caso hay que hacer más cosas))\

### 0. Historia de Usuario: Configurar alertas

**Como**: usuario registrado\
**Quiero**: poder crear alertas de gastos\
**Para**: poder controlar el gasto máximo en un periodo de tiempo establecido\ 

Criterios de validación:
- El periodo de tiempo debe ser positivo/válido (se va a hacer en formato fecha (hasta el xx/yy/zzzz) o (los proximos 30 dias/semanas/años))\

---
<!-- (Nacho) No veo claro la diferenciación con la gestio  de gastos individual-->>

## Gestión de gastos comparidos

### 0. Historia de Usuario: Añadir gastos (fecha, cantidad)

### 0. Historia de Usuario: Eliminar gastos compartidos

### 0. Historia de Usuario: Actualizar gastos compartidos

### 0. Historia de Usuario: Filtrar listas compartidas (fechas)

### 0. Historia de Usuario: Configurar alertas compartidas

---

## Visualización de gastos

<!-- Considerar que una busqueda sin filtros es un filtro vacio -->

### 0. Historia de Usuario: Visualizar gastos en forma de lista

### 0. Historia de Usuario: Visualizar gastos en forma de gráfico

### 0. Historia de Usuario: Visualizar gastos en forma de calendario

### 0. Historia de Usuario: Visualizar gastos en forma de calendario en un intervalo de tiempo




**Como**: \
**Quiero**: \
**Para**: \

Criterios de validación:

-
-
-