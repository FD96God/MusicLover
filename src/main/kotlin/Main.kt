fun main() {
    val count = 1000
    val discount100 = 100
    val discont5 = 5.0 / 100
    val regUser = true
    val discont1= 1.0 / 100

    println("Сумма - $count")

    if (regUser) {
        if (count <= 1000) {
            val result = count - count * discont1
            println("После применения скидки 1% - $result руб.")
        } else if (count in 1001..10000) {
            val result100 = count - discount100
            println("После применения скидки в 100 руб — $result100 руб.")
            val regResult100 = result100 - result100 * discont1
            println("После применения скидки 1% - $regResult100 руб.")
        } else {
            val result5 = count - count * discont5
            println("После применения скидки 5% - $result5 руб.")
            val regResult5 = result5 - result5 * discont1
            println("После применения скидки 1% - $regResult5 руб.")
        }
    } else {
        if (count in 1001..10000) {
            val result100 = count - discount100
            println("После применения скидки в 100 руб — $result100 руб.")
        } else if (count > 10000) {
            val result5 = count - count * discont5
            println("После применения скидки 5% - $result5 руб.")
        }
    }
}