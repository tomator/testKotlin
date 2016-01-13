/**
 * Created by bici on 16/1/10.
 */
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

public class HelloWorld{

    public fun main(args: Array<String>){
        println("Hello, World!")
//        abc("how are you!")
        println(sum(11, 12))
    }

    fun abc(str: Array<String>){
        println("first argument: ${str[0]}")
        println(str)
    }

    fun sum(a: Int, b: Int): Int{
        return a + b;
    }
    fun max(a: Int, b: Int): Int{
        if(a > b){
            return a
        }else{
            return b
        }
    }

    fun min(a: Int, c: Int) = if(a < c) a else c

    fun testLoop(args: Array<String>){
        for(arg in args){
            println(arg);
        }
        for(i in args.indices){
            println(args[i])
        }
    }

    fun cases(obj: Any){
        when(obj){
            1 -> print("One")
            "hello" -> print("greeting")
            is Long -> print("Long")
            !is String -> print("not a String")
            else -> print("unknown")
        }
    }


    fun testCollections(names: Array<String>): List<String>{
        return names.filter { it.startsWith("a") }
                .sortBy( {it} )
                .map { it.toUpperCase() }
    }

    fun testMap(mapData: Map<Int,String>){
        for((k,v) in mapData){
            println("$k : $v")
        }
    }

    public object Resource{
        val age = Math.random();
    }

    fun testFile(){
        val  stream = Files.newInputStream(Paths.get("some/file.txt"));
        stream.buffered().reader().use {
            abc -> print(abc.readText())
        }
    }

}

