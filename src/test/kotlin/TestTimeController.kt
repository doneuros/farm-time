import org.junit.Test

/**
 * Created by marc on 01.05.18.
 */
class TestTimeController{

    @Test
    fun testNextRound(){
        var controller = TimeController()
        assert(controller.getRoundNumber()==0L)
        controller.nextRound()
        assert(controller.getRoundNumber()==1L)
    }
}


