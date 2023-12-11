package classesAndObjects

fun main() {
    val tv1 = SmartDevice(
        "Samsung Smart TV QLED",
        1000.0
    )
    println("${tv1.brand} - ${tv1.price}")
    println(tv1)
    tv1.turnOn()
    tv1.getDeviceState()

    val phone = SmartDevice()
    phone.brand = "Iphone 15 pro max"
    phone.price = 2099.0
    println("${phone.brand} - ${phone.price}")
    phone.turnOff()
    phone.getDeviceState()

    val headphone = SmartDevice("Bang & Olufsen")
    headphone.price = 459.0
    println("${headphone.brand} - ${headphone.price}")
    headphone.turnOn()
    headphone.getDeviceState()

    val tv2 = SmartDevice(
        "Samsung Smart TV QLED",
        1000.0,
        isSwitchedOn = true
    )

    println("== ${tv1 == tv2}")
    println("=== (memory location) ${tv1 === tv2}")
}

// blueprint
class SmartDevice constructor(
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean? = false
){
    // properties. variables. val or var
//    var brand: String = ""
//        get() = field
//        set(value) {
//            field = value
//        }
//    var price: Double = 0.0
//        get() = field
//        set(value) {
//            field = value
//        }
//    var isSwitchedOn: Boolean = false

    // constructor
    constructor() : this(null, null)
    constructor(
        brand: String
    ) : this(brand, 0.0)

    // behaviours. functions
    fun getDeviceState() {
        println("$brand is on: $isSwitchedOn")
    }
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on")
    }
    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off")
    }

    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + (isSwitchedOn?.hashCode() ?: 0)
        return result
    }


}