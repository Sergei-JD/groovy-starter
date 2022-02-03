package com.groovy.starter.lesson16

import com.groovy.starter.lesson10.Person

class IteratesRunner {

    static void main(String[] args) {
        [1, 4, 7, 9].any {it % 2 == 0}
        [1, 4, 7, 9].find() {it % 2 == 0} == 4
        [1, 4, 7, 9].findAll() {it % 2 != 0} == [1, 7, 9]
        assert (2..4).collect() == [2, 3, 4]

        def person = new Person(25)
        person.each { println it}

        assert ["asd", "dfs", "12", "546", "234df"].grep(~/\d+/) ==["12", "546"]    //isCase switch, in, grep
    }
}
