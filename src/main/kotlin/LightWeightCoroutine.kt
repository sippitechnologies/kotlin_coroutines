import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {//  Run in Background
        repeat(10000)   // Creating 10000 coroutine
        {
            launch { // Run coroutine
                print("A") //print
            }
        }
    }
}