class Square(_name: String) : Shape(_name) {
    private var length : Double = 0.0
    private var height : Double = 0.0

    fun setDimensions(_length: Double, _height: Double) {
        length = _length
        height = _height
    }

    override fun printDimensions() {
        println("Length: $length")
        println("Height: $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}