/**
 * Created by akhil on 21/4/17.
 */


/*
* Consider the following map: Map m = ['1' : 2, '2' : 3, '3' : 4, '2':5]
* Is this a valid construction? What is the value of m['2']?
* */

class Question19 {
    static void main(String[] args) {
        Map m = ['1': 2, '2': 3, '3': 4, '2': 5]

        assert m['2'] == 5
        println m['2']
    }
}