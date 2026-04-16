class MyHashMap() {
    private val keys = mutableListOf<Int>()
    private val values = mutableListOf<Int>()

    fun put(key: Int, value: Int) {
        if (!contains(key)) {
            keys.add(key)
            values.add(value)
        } else {
            val index = count(key)
            values[index] = value
        }
    }

    fun get(key: Int): Int {
        if (contains(key)) {
            return values[count(key)]
        } else {
            return -1
        }
    }

    fun remove(key: Int) {
        if (contains(key)) {
            val index = count(key)
            keys.removeAt(index)
            values.removeAt(index)
        }
    }

    fun contains(key: Int): Boolean {
        for (i in keys) {
            if (i == key) {
                return true
            }
        }
        return false
    }

    fun count(key: Int): Int {
        var a = 0
        while (a <= keys.size - 1) {
            if (keys[a] == key) {
                return a
            }
            a++
        }
        return -1
    }
}