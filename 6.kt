import java.util.*
import kotlin.collections.HashMap

internal class MyDS {
    var arr: ArrayList<Int> = arrayListOf()
    private var hash: HashMap<Int, Int?> = HashMap()
    fun add(x: Int) {
        if (hash[x] != null) return
        arr.add(x)
        var s = arr.size
        hash[x] = s
    }

    fun remove(x: Int) {
        val index = hash[x] ?: return
        hash.remove(x)
        val size = arr.size
        val last = arr[size - 1]
        Collections.swap(arr, index, size - 1)
        arr.removeAt(size - 1) // O(1)
        hash[last] = index
    }

    fun search(x: Int): Int? {
        return hash[x]
    }

}

internal object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val ds = MyDS()
        ds.add(20)
        ds.add(30)
        println(ds.search(20))
        ds.remove(20)
        println(ds.search(20))
    }
}
