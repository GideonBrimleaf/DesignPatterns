package test.decorator_pattern_test

import decorator_pattern_models.java_io.LowerCaseInputStream
import org.junit.Ignore
import org.junit.Test
import org.omg.CORBA.INTERNAL
import java.io.BufferedInputStream
import java.io.FileInputStream
import kotlin.test.assertEquals

class LowerCaseInputStreamTest {

    @Test
    fun `Testing input stream`(){
        val thing = LowerCaseInputStream(
                    BufferedInputStream(
                        FileInputStream("src/test/decorator_pattern_test/test.txt")
                    )
                )
        var c:Int
        var result = ""
        while(thing.read().also { c = it } >= 0){
            result += c.toChar()
        }
        thing.close()
        assertEquals("i know the decorator pattern there i rule!", result)
    }

}