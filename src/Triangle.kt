import kotlin.math.sqrt

class Triangle(_name: String) : Shape(_name) {
    private var side1 : Double = 0.0
    private var side2 : Double = 0.0
    private var side3 : Double = 0.0

    fun setDimensions(_side1 : Double, _side2 : Double, _side3 : Double) {
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }

    override fun printDimensions() {
        println("Side 1 length: $side1")
        println("Side 2 length: $side2")
        println("Side 3 length: $side3")
    }

    override fun getArea() : Double {
        val perimeter = side1 + side2 + side3
        val area = sqrt(perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3))
        return area
    }
}