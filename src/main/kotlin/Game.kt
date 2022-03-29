class Game {

    private val scores = ArrayList<Int>()

    private var remainingPins = 0

    fun roll( rolls : Int){
        if(scores.size % 2 == 0){
            remainingPins = 10 - rolls
            if(remainingPins > 0) {
                scores.add(rolls)
            }
        }
        else {
            if(remainingPins >= rolls) {
                scores.add(rolls)
            }
            remainingPins = 0
        }
    }

    fun score(): Int{

        return scores.reduce{ a , b -> a + b }
    }
}