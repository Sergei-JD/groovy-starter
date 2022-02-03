package com.groovy.starter.lesson17

trait WithId {
    Integer id

    boolean validateId() {
        id > 0
    }
}