abstract class Shape(_name : String) : Dimensionable {
    var name = _name

    open fun getArea(): Double {
        return 0.0;
    }
}