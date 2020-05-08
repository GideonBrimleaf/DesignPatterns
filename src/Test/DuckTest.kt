package Test

import Models.Mallard
import org.junit.Test
import kotlin.test.assertEquals

class DuckTest {

    val danaerys = Mallard("Danaerys")

    @Test
    fun `Duck can fly`(){
        assertEquals("flying", danaerys.fly())
    }

    @Test
    fun `Duck can swim`(){
        assertEquals("swimming", danaerys.swim())
    }

    @Test
    fun `Duck can quack`(){
        assertEquals("quacking", danaerys.quack())
    }

    @Test
    fun `Duck can be shown off`(){
        assertEquals("Looks like a legend", danaerys.display())
    }


}