

var Todos: ArrayList<String> = ArrayList()

fun main() {


    choice()

}
fun choice() {
    println("1 tambah todo")
    println("2 lihat todo")
    println("3 ubah todo")
    println("4 hapus todo")
    println("5 berhenti ")
    print("masukan pilian : ")

    var pilian = readLine()!!.toInt()
    when(pilian){
        1 -> addTodo()
        2 -> readTodo()
        3 -> editTodo()
        4 -> deleteTodo()
        5 -> print("selesai")
    }
}
fun addTodo() {
    print("masukan todo : ")

    var newTodo = readLine()!!.toString()
    Todos.add(newTodo)
    println( "sukses tambah newTodo" )
    choice()
}

fun readTodo(){
    println("To do List : ")
    var index: Int=0
    for (todo in Todos){
        println("$index - $todo ")
        index++
    }
    //println(Todos[0])
    //println(Todos[1])
    //println(Todos[2])
    choice()

}
fun editTodo(){
    print("masukan index todo : ")
    var index= readLine()!!.toInt()
    print("editTodo: ")
    var todo = readLine()!!.toString()
    Todos.set(index, todo)
    println("sukses edit todo")
    choice()
}

fun deleteTodo(){
    print("masukan index todo : ")
    var index= readLine()!!.toInt()
    Todos.removeAt(index)
    println("sukses delete todo")
    choice()
}