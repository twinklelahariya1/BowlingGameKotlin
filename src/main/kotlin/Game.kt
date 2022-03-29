class Game {

    private val scores = ArrayList<Int>()

    private val numberOfRolls = 20
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
            }else{
                scores.add(0)
            }
            remainingPins = 0
        }
    }

    fun score(): Int{

        var score = 0
        for( x in 0 until numberOfRolls step 2){
            score += scores[x] + scores[x + 1]
            if(scores[x] + scores[ x + 1 ] == 10){
                score += scores[x + 2]
            }
        }

        return score
    }
}