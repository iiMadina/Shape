import java.util.Scanner

fun main(args: Array<String>) {
    val square : Shape = Square("square")
    val circle : Shape = Circle("circle")
    val triangle : Shape = Triangle("triangle")
    val equilateralTriangle : Shape = EquilateralTriangle("equilateral triangle")
    val reader = Scanner(System.`in`)

    println("Enter length for square: ")
    var length : Double = reader.nextDouble()
    println("Enter height for square: ")
    var height : Double = reader.nextDouble()
    (square as Square).setDimensions(length, height)

    println("Enter radius for circle: ")
    var radius : Double = reader.nextDouble()
    (circle as Circle).setDimensions(radius)

    println("Enter length of side 1 for triangle: ")
    var side1 : Double = reader.nextDouble()
    println("Enter length of side 2 for triangle: ")
    var side2 : Double = reader.nextDouble()
    println("Enter length of side 3 for triangle: ")
    var side3 : Double = reader.nextDouble()
    (triangle as Triangle).setDimensions(side1, side2, side3)

    println("Enter length of 1 side for equilateral triangle: ")
    val side : Double = reader.nextDouble()
    (equilateralTriangle as EquilateralTriangle).setDimensions(side)

    val nameSquare = square.name.toString()
    println("Name of shape: $nameSquare")
    println("Length of $nameSquare: $length , height of $nameSquare: $height")
    println("Area of $nameSquare: ${square.getArea()}")
    println("")

    val nameCircle = circle.name.toString()
    println("Name of shape: $nameCircle")
    println("Radius of $nameCircle: $radius")
    println("Area of $nameCircle: ${circle.getArea()}")
    println("")

    val nameTriangle = triangle.name.toString()
    println("Name of shape: $nameTriangle")
    println("Side 1 length of $nameTriangle: $side1, side 2 length of $triangle.name: $side2, side 3 length of $triangle.name: $side3")
    println("Area of $nameTriangle: ${triangle.getArea()}")
    println("")

    val nameEquilateralTriangle = equilateralTriangle.name.toString()
    println("Name of shape: $nameEquilateralTriangle")
    println("Side length of $nameEquilateralTriangle: $side")
    println("Area of $nameEquilateralTriangle: ${equilateralTriangle.getArea()}")
    println("Thank you for running my Shape program!")
}