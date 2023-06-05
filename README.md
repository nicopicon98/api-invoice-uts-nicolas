# api-invoice-uts-nicolas

## Controlador FacturaRestController

### GET /factura/{id}

Descripción: Obtiene una factura por su ID.

Método: GET

URL: /api/factura/{id}

Parámetros de ruta:
- {id}: ID de la factura (tipo: Long)

Respuesta exitosa:
- Código: 200 (OK)
- Cuerpo de respuesta: Factura en formato JSON

### GET /facturas

Descripción: Obtiene todas las facturas.

Método: GET

URL: /api/facturas

Respuesta exitosa:
- Código: 200 (OK)
- Cuerpo de respuesta: Lista de facturas en formato JSON

### DELETE /factura/{id}

Descripción: Elimina una factura por su ID.

Método: DELETE

URL: /api/factura/{id}

Parámetros de ruta:
- {id}: ID de la factura (tipo: Long)

Respuesta exitosa:
- Código: 204 (No Content)

### GET /facturas/filtrar-productos/{term}

Descripción: Filtra productos por término de búsqueda.

Método: GET

URL: /api/facturas/filtrar-productos/{term}

Parámetros de ruta:
- {term}: Término de búsqueda (tipo: String)

Respuesta exitosa:
- Código: 200 (OK)
- Cuerpo de respuesta: Lista de productos en formato JSON

### POST /factura

Descripción: Crea una nueva factura.

Método: POST

URL: /api/factura

Cuerpo de la solicitud: Factura en formato JSON

Respuesta exitosa:
- Código: 201 (Created)
- Cuerpo de respuesta: Factura creada en formato JSON

## Controlador ClienteRestController

### GET /clientes

Descripción: Obtiene todos los clientes.

Método: GET

URL: /api/clientes

Respuesta exitosa:
- Código: 200 (OK)
- Cuerpo de respuesta: Lista de clientes en formato JSON

### GET /cliente/{id}

Descripción: Obtiene un cliente por su ID.

Método: GET

URL: /api/cliente/{id}

Parámetros de ruta:
- {id}: ID del cliente (tipo: Long)

Respuesta exitosa:
- Código: 200 (OK)
- Cuerpo de respuesta: Cliente en formato JSON

### POST /clientes

Descripción: Crea un nuevo cliente.

Método: POST

URL: /api/clientes

Cuerpo de la solicitud: Cliente en formato JSON

Respuesta exitosa:
- Código: 201 (Created)
- Cuerpo de respuesta: Cliente creado en formato JSON

### PUT /cliente/{id}

Descripción: Actualiza un cliente existente.

Método: PUT

URL: /api/cliente/{id}

Parámetros de ruta:
- {id}: ID del cliente (tipo: Long)

Cuerpo de la solicitud: Cliente actualizado en formato JSON

Respuesta exitosa:
- Código: 201 (Created)
- Cuerpo de respuesta: Cliente actualizado en formato JSON

### DELETE /cliente/{id}

Descripción: Elimina un cliente por su ID.

Método: DELETE

URL: /api/cliente/{id}

Parámetros de ruta:
- {id}: ID del cliente (tipo: Long)

Respuesta exitosa:
- Código: 204 (No Content)

### GET /clientes/regiones

Descripción: Obtiene todas las regiones.

Método: GET

URL: /api/clientes/regiones

Respuesta exitosa:
- Código: 200 (OK)
- Cuerpo de respuesta: Lista de regiones en formato JSON
