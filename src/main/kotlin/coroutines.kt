import kotlinx.coroutines.*

fun main() {

    println("Main program starts: ${Thread.currentThread().name}")
    var job =GlobalScope.launch{
        println("Coroutine starts: ${Thread.currentThread().name}")
        withTimeout(3000L) {
            repeat(5) {
                delay(1000)
                println("Coroutine ends: ${Thread.currentThread().name}")
            }
        }
    }
    runBlocking(){
        job.join()
    }
    println("Main program ends: ${Thread.currentThread().name}")

}

