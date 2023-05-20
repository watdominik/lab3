class Main {
    fun insertionSort(array: IntArray) {
        for (i in 1 until array.size) {
            val key = array[i]
            var j = i - 1
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                j = j - 1
            }
            array[j + 1] = key
        }
    }
}

fun main(args: Array<String>) {
    val main = Main()
    val array = intArrayOf(6, 1, 9, 3, 2, 7)
    println("Przed sortowaniem: ")
    for (num in array) {
        print("$num ")
    }
    main.insertionSort(array)
    println("\nPo sortowaniu: ")
    for (num in array) {
        print("$num ")
    }
}
