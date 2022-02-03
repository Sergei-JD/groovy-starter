package com.groovy.starter.lesson24

import com.groovy.starter.lesson17.Student

class CategoryRunner {

    static void main(String[] args) {
        def student = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentsMethod.class) {
            student.testStr()
            student.anotherMethod("Test arg")
        }
//        student.testStr()
    }
}
