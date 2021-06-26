package com.Jack.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
@Entity
class Book(
        @Id @GeneratedValue var id: Long = 0,
        var isbn:String = "",
        var title:String = ""
)