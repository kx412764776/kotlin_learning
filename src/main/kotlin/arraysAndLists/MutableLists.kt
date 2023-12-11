package arraysAndLists

fun main() {

    // lists are expandable
    // listOf is read only list
    val mutableNames = mutableListOf(
        "Jamila",
        "James",
        "Saleh",
        "Peter"
    )
    println(mutableNames)
    println(mutableNames[0])
    println("List size: ${mutableNames.size}")
    println("Is peter in the list: ${mutableNames.contains("Peter")}")
    println("Is Alex in the list: ${mutableNames.contains("Alex")}")
    println("first element: ${mutableNames.first()}")
    println("first element: ${mutableNames.last()}")
    println("The index of Saleh: ${mutableNames.indexOf("Saleh")}")

    mutableNames.remove("Saleh")
    println(mutableNames)

    mutableNames.add("Alex")
    println(mutableNames)

    mutableNames.add(0, "J")
    println(mutableNames)
    println(mutableNames.isEmpty())

    val emptyList = mutableListOf<Any>()
    println(emptyList)
    println(emptyList.isEmpty())
}