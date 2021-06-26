package com.Jack.demo

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import org.springframework.test.util.AssertionErrors.assertEquals

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntegrationTest (@Autowired val restTemplate : TestRestTemplate){
    @BeforeAll
    fun setup()
    {
        print(">> Startup")
    }
    @Test
    fun `Test Book Endpoint`()
    {
        val entity = restTemplate.getForEntity<String>("/book")
        assertEquals("!", entity.statusCode, HttpStatus.OK)
//        Assertions.assertThat(entity.statusCode).isEqualTo(HttpStatus.OK)
        }

}