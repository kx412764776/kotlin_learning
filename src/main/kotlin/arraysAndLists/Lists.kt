package arraysAndLists

fun main() {

    // lists are expandable
    // listOf is read only list
    val readOnlyNames: List<String> = listOf(
        "Jamila",
        "James",
        "Saleh",
        "Peter"
    )
    println(readOnlyNames)
    println(readOnlyNames[0])
    println("List size: ${readOnlyNames.size}")
    println("Is peter in the list: ${readOnlyNames.contains("Peter")}")
    println("Is Alex in the list: ${readOnlyNames.contains("Alex")}")
    println("first element: ${readOnlyNames.first()}")
    println("first element: ${readOnlyNames.last()}")
    println("The index of Saleh: ${readOnlyNames.indexOf("Saleh")}")
}