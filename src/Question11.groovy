/**
 * Created by akhil on 21/4/17.
 */
int i = 2
List list = 1..10
list.each { println i + " * " + it + " = " + (it * i) }

println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
i = 12
list.each { println i + " * " + it + " = " + (it * i) }