/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package programming.task2

import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    val directoryTest = "E:\\GItHub\\programming-task2-2022\\app\\src\\test\\resources"
    @Test
    fun getPermission() {
        assertEquals(
            "r-x",
            LongFormat("${directoryTest}\\onlyRead.txt").getPermission(File("${directoryTest}\\onlyRead.txt"),true)
        )
        assertEquals(
            "rwx",
            LongFormat(
                "${directoryTest}\\kotlin.jpg").getPermission(File("${directoryTest}\\kotlin.jpg"), true)
        )
    }
}
