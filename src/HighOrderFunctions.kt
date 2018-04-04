fun main(args: Array<String>) {
    var isInternetConnection = false
    val dataManager: (String) -> Any = if (isInternetConnection) ::getInfoInternet else ::getLocalInfo
    dataManager("User")
}

// (String) -> Any
fun getInfoInternet(data: String): Any {
//    Guardando data
    println("Get info from internet")
    return true
}


fun getLocalInfo(data: String): Any {
    //  Guardando
    println("Get info from local storage")
    return ""
}