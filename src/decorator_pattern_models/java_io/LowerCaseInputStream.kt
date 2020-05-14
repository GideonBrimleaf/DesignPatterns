package decorator_pattern_models.java_io

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(`in`: InputStream) : FilterInputStream(`in`) {

    override fun read(): Int {
        val c = super.read()
        return if(c == -1) c else Character.toLowerCase(c.toChar()).toInt()
    }

    override fun read(byteArray: ByteArray, offset:Int, len:Int): Int{
        val result = super.read(byteArray, offset, len)
        byteArray.forEach { Character.toLowerCase(it.toChar()).toByte() }
        return result
    }

}