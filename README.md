# Kotlin 'Hipster' Functions
Ejemplificación del uso básico de funciones with, let, run, apply

## Diferencia Entre las funciones
| Function   | Function type | Target passed as | Returns            |
|------------|---------------|------------------|--------------------|
| **`also`** | Extension     | `it`             | Target             |
| **`apply`**| Extension     | `this`           | Target             |
| **`let`**  | Extension     | `it`             | Block return value |
| **`run`**  | Extension     | `this`           | Block return value |
| **`with`** | Regular       | `this`           | Block return value |

## Artículos de Referencia
[Difference Between Kotlin Funtions](https://proandroiddev.com/the-difference-between-kotlins-functions-let-apply-with-run-and-else-ca51a4c696b8)
[Mastering Kotlin Standard Functions](https://medium.com/@elye.project/mastering-kotlin-standard-functions-run-with-let-also-and-apply-9cd334b0ef84)
