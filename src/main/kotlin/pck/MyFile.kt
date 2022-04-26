package pck

fun foo() {
    // MultilineLambdaItParameter should be reported
    val digits = 1234.let {
        println(it)
        listOf(it)
    }
    println(digits)

    // will break the build as expected, when uncommented
//    for (i in 0..1)
//        println(i)
}
