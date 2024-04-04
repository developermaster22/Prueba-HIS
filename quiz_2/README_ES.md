## Requisitos
1. Por favor, completa el siguiente código para responder a la pregunta
    ```java
    class Solution {
        public int calibration(String[] table) {
            return 0;
        }
    }
    ```
2. Utiliza Java JDK 8, 11 o 17 para implementar tu respuesta.
3. Por favor, proporciona un archivo README.md explicando tu respuesta; si es posible, analiza la Complejidad Temporal y la Complejidad Espacial de tu solución.
4. Utiliza inglés o español en tu README.md.
5. Empaqueta tu respuesta, Solution.java y README.md, en un archivo zip y envíalo como {tu_nombre}_java_quiz.zip a nuestro correo electrónico, proyectohisparaguay@gmail.com.

## Cómo ejecutar el código de ejemplo en Java
Hay un archivo *Solution.java* acompañando a este archivo README, si el archivo está faltante,
por favor contáctanos para obtenerlo.

### Pasos para ejecutar el código
1. Asegúrate de que Java esté instalado en tu máquina.
2. Sigue los pasos para ejecutar el código de ejemplo:
   ```bash
   $ javac ./Solution.java
   $ java Solution
   ```

### En caso de que no puedas tener una computadora con Java instalado
Puedes utilizar cualquier compilador de Java en línea, por ejemplo, [programiz](https://www.programiz.com/java-programming/online-compiler/), para implementar tu solución.


## Explicación del Quiz
Dado una tabla de calibración (calibration_doc.txt), que es una lista de cadenas, cada cadena se puede interpretar como un número utilizando el primer dígito encontrado como el dígito de las decenas y el último como el dígito de las unidades, devolviendo la suma de todos los números. de la tabla de calibración.

**Ejemplo 1:**
```
Entrada: calibrations = [two1nine, eightwothree, abcone2threexyz, xtwone3four, 4nineeightseven2, zoneight234, 7pqrstsixteen]
Salida: 281

Explicación:
la entrada se puede convertir a [29, 83, 13, 24, 42, 14, 76], sumando los números obtendrá el resultado, 281.
```

**Ejemplo 2:**
```
Entrada: números = [oneight]
Salida: 18

Explicación:
la entrada se puede convertir a [18], ya que on"e" y "e"ight son los dos números en esa cadena. entonces la suma de la lista es 18.
```

**Restricciones:**
Esto está definido por el archivo de calibración, calibración_doc.txt.