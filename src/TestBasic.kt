/**
* Created by bici on 16/1/10.
*/
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths

fun main(args: Array<String>){
//    println(parseInt("abc"))
    println(getStringLength(""))

    var x = 90;
    if(x in 1..100){
        print(x)
    }

    val list = listOf("abc", "haha")
    val map = mapOf("1" to "abc", 2 to "haha")

    var str: String = "abc";
    str.hello();

    val files = File("abc").listFiles();
    println(files?.size() ?: "empty");

    val datas = mapOf("name" to "dandan", "email" to "dandan@bici.com")
    val email = datas["email"] ?: throw IllegalStateException("email is missing")
    val address = datas["address"];
    email?.let {
        println(email);
    }
    address?.let {
        println(address);
    }

    var a: Int = 100;
    println(a === a);
    val boxA: Int? = a;
    val boxB: Int? = a;
    println(boxA == boxB);
    println(boxA === boxB);

    var b: Long = a.toLong();
    print(b);
}

fun parseInt(str: String): Int?{
    return Integer.parseInt(str)
}

fun getStringLength(obj: Any): Int?{
    if(obj is String){
        return obj.length();
    }else{
        return null;
    }
}

fun testLoop(args: Array<String>){
    for(arg in args){
        println(arg);
    }
    for(i in args.indices){
        println(args[i+1])
    }
}

fun testCollections(names: Array<String>){
    names.filter { it.startsWith("a") }
    .sortBy( {it} )
    .map { it.toUpperCase() }
}

fun foo(a: Int = 0, b: String = "abc"){}

fun String.hello(){
    println("hello")
}

fun arrayOfMinusOnes(size: Int): IntArray{
    return IntArray(size)
}

fun testFile(){
    val  stream = Files.newInputStream(Paths.get("/some/file.txt"));
    stream.buffered().reader().use {
        reader -> print(reader.readText())
    }

}

interface Foo<out T : Any> : Any{
    fun foo(a: Int): T
}

class FooImpl : Foo<String>{

    override
    fun foo(a: Int) : String{
        return "abc"
    }
}
