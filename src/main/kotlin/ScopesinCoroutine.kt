import kotlinx.coroutines.*

fun main() {

    println("Program will start run blocking")// Start Program execution normally
    runBlocking { //Block the program execution
        launch {
            delay(500)
            println("I am in side runBlocking")
        }
        GlobalScope.launch {//Run Global Scope
            delay(1000)
            println("I am Global Scope")
        }
        coroutineScope {// Run coroutine scope
            delay(1500)
            println("I am Coroutine Scope")
        }

    }
    println("Program is continue ")// After run block return back to program executaion
}