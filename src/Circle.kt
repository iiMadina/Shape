class Circle(_name: String) : Shape(_name) {
    private var radius : Double = 0.0

    fun setDimensions(_radius: Double) {
        radius = _radius
    }

    override fun printDimensions() {
        println("Radius: $radius")
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}