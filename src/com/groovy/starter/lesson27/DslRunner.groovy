package com.groovy.starter.lesson27

import static com.groovy.starter.lesson27.DslBuilder.*

//def email = new Email()
//email.setFrom("from@mail.ru")
//email.setTo("to@mail.ru")
//email.setTitle("title")
//
//def body = new EmailBody()
//body.setText("Some Text")
//body.setImage(List.of("image.jpg"))
//email.setBody(body)

// DSL
    // builder
mail {
    from "from@mail.ru"
    to "to@mail.ru"
    title "title"
    body {
        text "Some Text"
        images(['image.jpg', 'image.png'])
        image 'test.jpeg'
    }
}

