package com.example.cookapp.data

data class Category(
    val id: Int,
    val name: String,
    //val image: Int
)

data class Recipe(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val ingredients: List<String>,
    val steps: List<String>,
    //val image: Int
)

val categoriesList = listOf(
    Category(1, "Entradas"),
    Category(2, "Platos principales"),
    Category(3, "Postres")
)

val recipeList = listOf(
    Recipe(
        id = 1,
        categoryId = 1,
        name = "Ensalada César",
        ingredients = listOf("Lechuga romana", "Pechuga de pollo", "Pan tostado", "Queso parmesano", "Aderezo César"),
        steps = listOf("Lavar y cortar la lechuga.", "Asar la pechuga de pollo y cortarla en tiras.", "Mezclar los ingredientes en un tazón.", "Agregar el aderezo y el queso al gusto.")
    ),

    Recipe(
        id = 2,
        categoryId = 1,
        name = "Guacamole con Totopos",
        ingredients = listOf("Aguacates maduros", "Cebolla", "Cilantro", "Limón", "Sal", "Totopos de maíz"),
        steps = listOf("Extraer la pulpa de los aguacates y machacarla en un tazón.", "Picar finamente la cebolla y el cilantro.", "Mezclar todo con el jugo de limón y sal al gusto.", "Servir acompañado de los totopos.")
    ),

    Recipe(
        id = 3,
        categoryId = 1,
        name = "Brochetas Caprese",
        ingredients = listOf("Tomates cherry", "Queso mozzarella en perlas", "Hojas de albahaca", "Aceite de oliva", "Vinagre balsámico"),
        steps = listOf("Lavar los tomates y las hojas de albahaca.", "Alternar en un palillo un tomate, una hoja de albahaca y una perla de mozzarella.", "Repetir en varios palillos.", "Rociar con aceite de oliva y un hilo de vinagre balsámico.")
    ),

    Recipe(
        id = 4,
        categoryId = 2,
        name = "Pasta Alfredo",
        ingredients = listOf("Pasta fettuccine", "Crema de leche", "Mantequilla", "Ajo", "Queso parmesano"),
        steps = listOf("Cocinar la pasta en agua con sal.", "En una sartén, derretir la mantequilla y dorar el ajo.", "Agregar la crema de leche y el queso hasta espesar.", "Mezclar la pasta con la salsa.")
    ),

    Recipe(
        id = 5,
        categoryId = 2,
        name = "Pasta al Pesto con Camarones",
        ingredients = listOf("Pasta espagueti", "Camarones limpios", "Salsa pesto", "Aceite de oliva", "Sal y pimienta"),
        steps = listOf("Cocinar la pasta en agua hirviendo con sal y escurrir.", "Saltear los camarones en una sartén con aceite, sal y pimienta.", "Mezclar la pasta caliente con la salsa pesto.", "Incorporar los camarones salteados y servir.")
    ),

    Recipe(
        id = 6,
        categoryId = 2,
        name = "Salmón al Horno con Espárragos",
        ingredients = listOf("Filete de salmón", "Espárragos", "Limón", "Aceite de oliva", "Sal y pimienta"),
        steps = listOf("Precalentar el horno a 200°C.", "Colocar el salmón y los espárragos en una bandeja.", "Sazonar todo con aceite, rodajas de limón, sal y pimienta.", "Hornear durante 12 a 15 minutos.")
    ),

    Recipe(
        id = 7,
        categoryId = 3,
        name = "Mousse de Chocolate",
        ingredients = listOf("Chocolate para derretir", "Crema para batir", "Huevos", "Azúcar"),
        steps = listOf("Derretir el chocolate al baño María.", "Separar las claras de las yemas y batir las claras a punto de nieve.", "Mezclar el chocolate con las yemas y luego envolver suavemente con las claras.", "Refrigerar por al menos 4 horas.")
    ),

    Recipe(
        id = 8,
        categoryId = 3,
        name = "Plátanos con Cajeta y Nuez",
        ingredients = listOf("Plátanos maduros", "Cajeta", "Nueces picadas"),
        steps = listOf("Pelar los plátanos y cortarlos en rodajas.", "Disponer el plátano en un plato.", "Bañar generosamente con la cajeta.", "Decorar con la nuez picada por encima.")
    ),

    Recipe(
        id = 9,
        categoryId = 3,
        name = "Mousse de Limón Express",
        ingredients = listOf("Leche condensada", "Crema de leche", "Jugo de limón"),
        steps = listOf("Licuar la leche condensada con la crema de leche.", "Agregar el jugo de limón poco a poco mientras se licúa hasta espesar.", "Verter la mezcla en moldes individuales.", "Refrigerar por lo menos una hora antes de servir.")
    )


)