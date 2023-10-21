import kotlin.math.*
abstract class Shape {
    abstract fun area():Double
    abstract fun perimeter():Double
}
class Circle(var r:Double):Shape(){
    override fun area():Double{
        return Math.PI*(r.pow(2)) //Math.PI
    }
    override fun perimeter():Double{
        return Math.PI*2*r
    }
}
class rectangle (var len:Double,var wid:Double):Shape(){
    override fun area():Double{
        return len*wid
    }
    override fun perimeter():Double{
        return len+wid
    }
}