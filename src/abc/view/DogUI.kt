package abc.view

import abc.presenter.DogPresenter
import java.util.*


fun main() {
    var j = 0
    while (j < 10) {
        val sc = Scanner(System.`in`)
        var presenter: DogPresenter
        presenter = DogPresenter()


        println("Bienvenido a tu admin de mascotas")
        println("Selecciona la opción deseada:")
        println("1. Agregar/Actualizar Registro de Perro")
        println("2. Eliminar Registro de Perro")
        //println("3. Actualizar Datos del Perro")
        var i = sc.nextInt()
        when (i) {
            1 -> {
                println("Cuál es el nombre del Perro?")
                val name = readln()
                println("Cuál es la raza del Perro?")
                val breed = readln()
                println("Cuál es la edad del Perro?")
                val age = readln().toInt()
                println("Cuál es el color del Perro?")
                val color = readln()
                presenter.createDog(name = name, breed = breed, age = age, color = color)

            }

            2 -> {
                println("Seguro que desea eliminar el registro?")
                println("1.- Si    2.- No")
                var x = readln().toInt()
                when(x){
                    1 -> {presenter.emptyDog()}
                    2 -> {continue}
                }

            }

            /*3 -> {
                println("Ingresa el nombre del Perro para actualizar sus datos")
                val name = readln()
                println("Qué dato deseas actualizar?")
                println("1. Nombre    2. Raza    3.Edad    4. Color")
                var upd = readln().toInt()
                when (upd) {
                    1 -> {
                        println("Ingresa el nuevo nombre")
                        val newname = readln()
                        presenter.updName(name = name, newname = newname)
                    }

                    2 -> {
                        println("Ingresa la raza")
                        val newbreed = readln()
                        presenter.updBreed(name = name, newbreed = newbreed)
                    }

                    3 -> {
                        println("Ingresa la edad")
                        val newage = readln().toInt()
                        presenter.updAge(name = name, newage = newage)
                    }

                    4 -> {
                        println("Ingresa el color")
                        val newcolor = readln()
                        presenter.updColor(name = name, newcolor = newcolor)
                    }
                }*/
            }
        }
        j++
    }
//}