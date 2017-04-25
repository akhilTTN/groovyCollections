/**
 * Created by akhil on 21/4/17.
 */
List list=1..100
list.each {print it%3==0?'Fizz \t':it%5==0?"Buzz \t":it%3==0 && it%5==0?"FizzBuzz \t":it+" "}