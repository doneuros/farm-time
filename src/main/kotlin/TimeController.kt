/**
 * Created by marc on 01.05.18.
 */
class TimeController{

    var time = 0L

    fun getRoundNumber() : Long {
        return time
    }

    fun nextRound() {
        time++
    }


}