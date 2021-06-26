package com.Jack.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.RequestBody

interface BookRepositories : CrudRepository<Book, Long> {
    fun findByTitle(@RequestBody title: String): Book //like a trait
}