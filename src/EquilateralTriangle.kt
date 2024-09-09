import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Shape(_name) {
    private var side : Double = 0.0

    fun setDimensions(_side : Double) {
        side = _side
    }

    override fun printDimensions() {
        println("Side length: $side")
    }

    override fun getArea(): Double {
        return (side * side * sqrt(3.0) / 4)
    }
}