package com.groovy.starter.lesson24

import com.groovy.starter.lesson17.Student

@Category(Student.class)
class DefaultStudentsMethod {

    def testStr() {
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
