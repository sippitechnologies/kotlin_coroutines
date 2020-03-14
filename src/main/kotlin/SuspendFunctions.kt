import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//add Main
//declare and initialize value to local variable
var callCounts =0
fun main() {
    //Run Suspend function in Global Scope
    GlobalScope.launch {
        greeting("Ranjeet")
    }
    GlobalScope.launch {
        anotherMessage("Hope your are doing Great Ranjeet")
    }
    print("Namaste, ")
    //Sorry I forgot to Give some Delay  so that our Coroutine Work fine
    // Give Delay
    Thread.sleep(4000)
    println("Call Counts ${callCounts}")

}

//We have done with Writing our suspend functions

// Update Local Variable inside  Suspend functions
suspend fun greeting(yourName:String)
{
    delay(1000)
    println(yourName)
    callCounts++
}
suspend fun  anotherMessage(message:String)
{
    delay(2000)
    println(message)
    callCounts++
}


