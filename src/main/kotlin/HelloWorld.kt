import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {  //1 Launch the coroutine with global scope
        delay(1000) // mock background running task with delay
        println("World") // get result after delay
    }
    print("Hello,") //Print on main Thread
    Thread.sleep(3000) //Sleep the thread for more than corotine required
}