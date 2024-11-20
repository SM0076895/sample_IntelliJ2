package abc.view

import abc.model.Dog
import abc.presenter.DogPresenter
import java.util.*



fun main() {
    val sc = Scanner(System.`in`)
    val dogPresenter = DogPresenter()

    dogPresenter.createDog("Firu", "Schanuser", 4, "Café")
    dogPresenter.createDog("Dobby", "Pitbull", 2, "Negro")
    dogPresenter.createDog("Dalila", "Pastor", 6, "Café")

    while (true) {
        val i = startMenu()
        when (i) {
            1 -> {
                val (name, breed, age, color) = readDogData()
                dogPresenter.createDog(name = name.toString(), breed = breed.toString(), age = age.toString().toInt(), color = color.toString())
                println("Registro creado")
            }

            2 -> {
                val iD = getDogRegister(dogPresenter.getDogs())
                //Delete
                println("Seguro que desea eliminar el registro?")
                println("1.- Si    2.- No")
                val opt = sc.nextInt()
                when (opt) {
                    1 -> {
                        dogPresenter.removeDog(iD = iD - 1)
                        println("Registro eliminado")
                    }

                    2 -> {
                        continue
                    }
                }

            }

            3 -> {
                val iD = getDogRegister(dogPresenter.getDogs())
                println("1. Nombre    2. Raza    3.Edad    4. Color")
                val opt = sc.nextInt()
                when (opt) {
                    1 -> {
                        println("Ingresa el nuevo nombre")
                        val newname = readln()
                        dogPresenter.updName(iD = iD, newname = newname)
                    }

                    2 -> {
                        println("Ingresa la raza")
                        val newbreed = readln()
                        dogPresenter.updBreed(iD = iD, newbreed = newbreed)
                    }

                    3 -> {
                        println("Ingresa la edad")
                        val newage = readln().toInt()
                        dogPresenter.updAge(iD = iD, newage = newage)
                    }

                    4 -> {
                        println("Ingresa el color")
                        val newcolor = readln()
                        dogPresenter.updColor(iD = iD, newcolor = newcolor)
                    }
                }
            }
        }
    }

}

fun startMenu(): Int {
    val sc = Scanner(System.`in`)
    println("Bienvenido a tu admin de mascotas")
    println("Selecciona la opción deseada:")
    println("1. Agregar/Actualizar Registro de Perro")
    println("2. Eliminar Registro de Perro")
    println("3. Actualizar Datos del Perro")
    val i = sc.nextInt()
    return i
}

fun readDogData(): Array<Any> {
    val sc = Scanner(System.`in`)
    println("Cuál es el nombre del Perro?")
    val name = readln()
    println("Cuál es la raza del Perro?")
    val breed = readln()
    println("Cuál es la edad del Perro?")
    val age = sc.nextInt()
    println("Cuál es el color del Perro?")
    val color = readln()
    return arrayOf(name, breed, age, color)
}

fun getDogRegister(dogs: MutableList<Dog>): Int {
    val sc = Scanner(System.`in`)
    //val dogPresenter = DogPresenter()
    for (j in 0..(dogs.size) - 1) {
        println("iD: ${j + 1}")
        val dog = dogs[j]
        println("Nombre:" + dog.name)
        println("Raza:" + dog.breed)
        println("Edad:" + dog.age)
        println("Color:" + dog.color)
    }
    println("Ingresa el iD del Perro a seleccionar")
    val iD = sc.nextInt()
    return iD-1
}