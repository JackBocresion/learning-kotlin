package com.Jack.demo

import org.springframework.web.bind.annotation.*

@RestController
class BookController (val repo : BookRepositories)
{
    @PostMapping("/book")
    fun addBooks(@RequestBody book : Book)
    {
        repo.save(book)
    }

    @GetMapping("/book")
    fun getAllBooks() = repo.findAll().toList();

    @GetMapping("/book/{title}")
    fun findByTitle(@PathVariable("title") title: String) = repo.findByTitle(title)
}