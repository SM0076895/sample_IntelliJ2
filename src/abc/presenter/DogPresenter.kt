package abc.presenter

import abc.model.Dog

class DogPresenter {
    /*
    public static final Int pi = 3.1416;

    val pi = 3.1416 //el modificador de acceso por default de Kotlin es public y no es necesario escribirlo1*/

    val dogs: MutableList<Dog> = mutableListOf()

    /*public static void createDog(String param1, Int param2){

    }*/



    fun createDog(name: String, breed: String, age: Int, color: String) {
        val d1 = Dog(name = name, breed = breed, age = age, color = color)
        dogs.add(d1)
        print(dogs)
    }

    fun emptyDog(){
        //Empty registry
        val d1 = Dog(name="", breed = "", age = 0, color = "")
        dogs.add(d1)
        println(dogs)
    }

    fun updName(name: String, newname: String){
        //Update name
        val d1 = Dog(
            name = newname,
            breed = TODO(),
            age = TODO(),
            color = TODO()
        )
        dogs.add(d1)
        print(dogs)
        //dogs.copy(name = newname)
    }

    fun updBreed(name: String, newbreed: String){
        //Update Breed
        val d1 = Dog(
            name = name, breed = newbreed,
            age = TODO(),
            color = TODO()
        )
        dogs.add(d1)
        print(dogs)
        //dogs.copy(name = name, breed = newbreed)
    }

    fun updAge(name: String, newage: Int){
        //Update Age
        val d1 = Dog(
            name = name, age = newage,
            breed = TODO(),
            color = TODO()
        )
        dogs.add(d1)
        print(dogs)
        //dogs.copy(name = name, age = newage)
    }

    fun updColor(name: String, newcolor: String){
        //Update Color
        val d1 = Dog(
            name = name, color = newcolor,
            breed = TODO(),
            age = TODO()
        )
        dogs.add(d1)
        print(dogs)
        //dogs.copy(name = name, color = newcolor)
    }
}