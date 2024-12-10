package Calculator.presenter

class CalcPresenter {

    fun addData(adding: List<String>): Int {
        val added = adding.map{ it.toInt() }.toIntArray()
        var j = 1
        var x = added[0]
        for ( j in 1..(added.size-1) ){
            x = x+added[j]
        }
        return x
    }

    fun subtractData(adding: List<String>): Int{
        val added = adding.map{ it.toInt() }.toIntArray()
        var j = 1
        var x = added[0]
        for ( j in 1..(added.size-1) ){
            x = x-added[j]
        }
        return x
    }

    fun multiplyData(adding: List<String>): Int{
        val added = adding.map{ it.toInt() }.toIntArray()
        var j = 1
        var x = added[0]
        for ( j in 1..(added.size-1) ){
            x = x*added[j]
        }
        return x
    }

    fun divideData(adding: List<String>): Double{
        val added = adding.map{ it.toInt() }.toIntArray()
        var j = 1
        var x: Double = added[0].toDouble()
        for ( j in 1..(added.size-1) ){
            x = x/added[j]
        }
        return x
    }

}