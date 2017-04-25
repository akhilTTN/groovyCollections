/**
 * Created by akhil on 21/4/17.
 */
/*
*Consider the following map:
* Map m = [‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300], ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100], ‘Management’ : [‘Management’ : 800] ]
How many university departments are there?
How many programs are delivered by the Computing department?
How many students are enrolled in the Civil Engineering program?
* */

class Question22 {
    static void main(String[] args) {
        Map m = ['Computing': ['Computing': 600, 'Information Systems': 300], 'Engineering': ['Civil': 200, 'Mechanical': 100], 'Management': ['Management': 800]]

        assert m.size() == 3
        println "Departments: " + m.size()

        assert m.get("Computing").size() == 2
        println "Computing Departments: " + m.get("Computing").size()

        assert m.get("Engineering").get("Civil") == 200
        println "Civil Engineering Student: " + m.get("Engineering").get("Civil")

    }
}