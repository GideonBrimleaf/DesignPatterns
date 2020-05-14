package test.decorator_pattern_test

import decorator_pattern_models.java_io.LowerCaseInputStream
import org.junit.Test
import org.omg.CORBA.INTERNAL
import java.io.BufferedInputStream
import java.io.FileInputStream
import kotlin.test.assertEquals

class LowerCaseInputStreamTest {

    @Test
    fun `Testing input stream`(){
        var c:Int
        val thing = LowerCaseInputStream(
                    BufferedInputStream(
                        FileInputStream("test.txt")
                    )
                )
        var result = ""
        while(thing.read() >=0){
            val character = thing.read()
            result += character.toChar()
        }
        thing.close()
        assertEquals("i know the decorator pattern there i rule!", result)
    }

}