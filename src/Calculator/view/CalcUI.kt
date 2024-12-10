package Calculator.view

import Calculator.presenter.CalcPresenter
import java.util.*

fun main(){
    val calcPresenter = CalcPresenter()

    while (true){
        val i = operationSelector()
        when(i){
            1 -> {
                //Add
                val adding = readNumbersToOperate()
                val x = calcPresenter.addData(adding)
                println("La suma es $x")
            }
            2 -> {
                //Subtract
                val adding = readNumbersToOperate()
                val x = calcPresenter.subtractData(adding)
                println("La resta es $x")
            }
            3 -> {
                //Multiplication
                val adding = readNumbersToOperate()
                val x = calcPresenter.multiplyData(adding)
                println("El resultado es $x")
            }
            4 -> {
                //Division
                val adding = readNumbersToOperate()
                val x = calcPresenter.divideData(adding)
                println("El resultado es $x")
            }
        }
    }

}

fun operationSelector(): Int{
    val sc = Scanner(System.`in`)
    println("Ingresa la operación a realizar")
    println("1. Suma  2. Resta  3. Multiplicación  4.División")
    val a = sc.nextInt()
    return a
}

fun readNumbersToOperate(): List<String> {
    println("Ingresa todos los números a operar, separados por una coma (,)")
    val adding =  readln()
    return adding.split(",")
}