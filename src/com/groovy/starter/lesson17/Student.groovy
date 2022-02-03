package com.groovy.starter.lesson17

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode
import groovy.transform.Immutable
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.transform.builder.Builder
import groovy.util.logging.Slf4j

@ToString
@TupleConstructor
@EqualsAndHashCode
//@Mixin(WithId.class)
//@Canonical
@Builder
//@Slf4j
//@Immutable
class Student implements WithId{
    String firstName
    String lastName
    Integer age

    def getAt(Integer index) {
        index == 0 ? firstName : lastName
    }

    static void main(String[] args) {
//        Student.builder()
//        .lastName("Ivanov")
//        .firstName("Ivan")
//        .build()
    }

    def methodMissing(String name, Object arguments) {
        println "Missing method $name is invoked: $arguments"
        def field = name - 'findBy'
        def fieldValue = this."$field"
        println "SELECT * FROM student WHERE $field = ${fieldValue}"
    }

    def propertyMissing(String name) {
        println "Missing property $name"
        "default value"
    }

    def getInfo() {
        Closure closure = {
            println thisObject      // == this
            println owner
            println delegate
            Closure second = {
                println thisObject      // == this
                println owner
                println delegate
            }   // declaration

            second()    // execution
        }
        closure
    }
}
