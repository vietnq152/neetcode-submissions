class MyHashSet() {

    // Tạo list để lưu dữ liệu
    private val data = mutableListOf<Int>()

    // Hàm add
    fun add(key: Int) {
        if(!contains(key)){
            data.add(key)
        }
    }

    // Hàm contains
    fun contains(key: Int): Boolean {
        for(i in data){
            if (i == key){
                return true
            }
        }
        return false
    }

    // Hàm remove
    fun remove(key: Int) {
        if(contains(key)){
            data.remove(key)
        }
    }
}