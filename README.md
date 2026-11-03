# 🛒 Marygel Systems

**Marygel Systems** es un sistema ERP modular desarrollado en **Java**, diseñado bajo los principios de la Programación Orientada a Objetos (POO). Su objetivo principal es simular la gestión comercial básica de un negocio, permitiendo administrar clientes, catálogo de productos, líneas de detalle de venta y el cálculo automatizado de transacciones mediante asociaciones de objetos y colecciones dinámicas.

---

## 🚀 Características Principales

* **Arquitectura Orientada a Objetos:** Implementación de cuatro clases principales fuertemente cohesionadas (`Cliente`, `Producto`, `DetalleVenta` y `Venta`) conectadas mediante relaciones de asociación (*Has-A*).
* **Encapsulamiento Robusto:** Atributos protegidos (`private`) con acceso controlado a través de métodos *getters* y *setters*.
* **Colecciones Dinámicas:** Uso de `ArrayList` dentro de la clase `Venta` para gestionar listas dinámicas de productos comprados.
* **Operadores Avanzados:** Uso del operador condicional ternario (`? :`) para la evaluación rápida de estados (por ejemplo, validación de clientes VIP).
* **Navegación de Objetos:** Cálculo de totales mediante la navegación directa entre asociaciones encadenadas de objetos (`miDetalle.getProducto().getPrecio()`).

---

## 📂 Estructura del Modelo (Clases)

1. **`Cliente`**: Almacena información de identificación del comprador (`cedula`, `nombre`) e incluye un indicador booleano de fidelización (`esVip`).
2. **`Producto`**: Representa los artículos del inventario con su respectivo identificador, descripción, precio unitario y stock disponible.
3. **`DetalleVenta`**: Actúa como un puente que une un `Producto` específico con la `cantidad` adquirida dentro de una transacción.
4. **`Venta`**: Gestiona el encabezado de la factura (`id`, `cliente`), contiene el `ArrayList<DetalleVenta>` y almacena el monto total calculado.
5. **`MarygelSystems`**: Clase principal (`main`) encargada de instanciar los objetos, simular una venta y renderizar la factura formateada en consola.

---

## 💻 Ejemplo de Salida en Consola

Al ejecutar la aplicación, el sistema genera un recibo estructurado como el siguiente:

```text
========================================
       FACTURA - MARYGEL SYSTEMS        
========================================
Nro. de Venta : 1001
Cliente       : Ana Gómez
Cédula        : 1023456789
¿Es VIP?      : Sí
----------------------------------------
Detalle de Productos:
 * Café Especial Marygel | Cantidad: 2 | Precio Unit: \$18500.0
----------------------------------------
TOTAL A PAGAR : \$37000.0
========================================
