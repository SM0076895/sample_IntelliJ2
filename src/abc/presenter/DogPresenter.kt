package abc.presenter

import abc.model.Dog

class DogPresenter {
    /*
    public static final Int pi = 3.1416;

    val pi = 3.1416 //el modificador de acceso por default de Kotlin es public y no es necesario escribirlo1*/

    private val dogs: MutableList<Dog> = mutableListOf()

    /*public static void createDog(String param1, Int param2){

    }*/

    /*fun createDog(name: String, breed: String, age: Int, color: String) {
        val dogRegister = Dog(name = name, breed = breed, age = age, color = color)
        dogs.add(dogRegister)
    } Se puede reducir*/



    fun createDog(name: String, breed: String, age: Int, color: String) =
        dogs.add(Dog(name = name, breed = breed, age = age, color = color))



    fun removeDog(iD: Int){
        dogs.removeAt(iD)
    }

    fun getDogs() = dogs

    fun updName(iD: Int, newname: String){
        //Update name
        dogs[iD].name = newname
    }

    fun updBreed(iD: Int, newbreed: String){
        //Update Breed
        dogs[iD].breed = newbreed
    }

    fun updAge(iD: Int, newage: Int){
        //Update Age
        dogs[iD].age = newage
    }

    fun updColor(iD: Int, newcolor: String){
        //Update Color
        dogs[iD].color = newcolor
    }
}