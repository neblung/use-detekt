package pck

fun foo() {
    val digits = 1234.let {
        println(it)
        listOf(it)
    }
    println(digits)

    for (i in 0..1)
        println(i)
}
