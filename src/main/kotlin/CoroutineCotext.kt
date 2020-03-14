import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch(CoroutineName("First Coroutine")) {
         println("This is from Coroutine ${coroutineContext.get(CoroutineName.Key)}")   
        }
    }
}