class Game {

    private val scores = ArrayList<Int>()
    fun roll( rolls : Int){
        scores.add(rolls)
    }

    fun score(): Int{

        return scores.reduce{ a , b -> a + b }
    }

}