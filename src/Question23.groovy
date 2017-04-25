/**
 * Created by akhil on 21/4/17.
 */
/*
* Write a method which retruns the value of passed key from a search string of the form
* "http://www.google.com?name=johny&age=20&hobby=cricket"
* */

class Question23 {
    static void main(String[] args) {
        String url = "http://www.google.com?name=johny&age=20&hobby=cricket"
        String query = url.split("\\?")[1]
        def list = query.split("&")
        Map map = new HashMap()
        list.each {
            pair ->
                def index = pair.indexOf("=")
                map.put(pair.substring(0, index), pair.substring(index + 1, pair.size()))
        }

        assert map == [name: 'johny', age: '20', hobby: 'cricket'] as Map
        println(map)

    }
}