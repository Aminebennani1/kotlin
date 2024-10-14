fun main() {
    val Color = "Black"

    val message = if (Color == "Red") {
        println("Stop")
    } else if (Color == "Yellow") {
        println("Slow")
    } else if (Color == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }

    val trafficLightColors = "Amber"

    when (trafficLightColors) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }

}


