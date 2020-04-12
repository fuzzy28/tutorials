package org.jrue.springbooteurekaclient1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("/message")
class MessageController {


    @Autowired
    private lateinit var restTemplate: RestTemplate;

    data class Person(val userId: Int, val name: String);

    @GetMapping("/{userId}")
    fun getMessage(@PathVariable userId: String): String {
        var responseEntity: ResponseEntity<Person> = restTemplate.getForEntity("http://client2/users/$userId", Person::class.java);
        var id: Int? = responseEntity.body?.userId;
        var name: String? = responseEntity.body?.name;
        if(id != 0) {
            return "Hello $name";
        }
        return "$name";
    }

}