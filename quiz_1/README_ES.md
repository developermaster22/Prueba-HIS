## Requisitos
1. Por favor, completa el siguiente código para responder a la pregunta
    ```java
    class Solution {
        public int[] buildArray(int[] nums) {
            return nums;
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
Dado un arreglo de permutación basado en cero nums (indexado en 0), construye un arreglo **ans** de la misma longitud donde **ans[i] = nums[nums[i]]** para cada **0 <= i < nums.length** y devuélvelo.

Una permutación basada en cero nums es un arreglo de enteros distintos de 0 a nums.length - 1 (inclusive).

**Ejemplo 1:**
```
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explicación: El arreglo ans se construye de la siguiente manera:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
```

**Ejemplo 2:**
```
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explicación: El arreglo ans se construye de la siguiente manera:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
```

**Restricciones:**

1 <= nums.length <= 1000
0 <= nums[i] < nums.length
Los elementos en nums son distintos.
