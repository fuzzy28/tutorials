package org.jrue.springbooteurekaclient2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController {


    data class Person(val userId: Int, val name: String);

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: String) : Person {

       val users = mapOf(123 to Person(123,"John"), 124 to Person(124,"Doe"),
               125 to Person(125,"Michael"), 126 to Person(126,"Joel"));
        println("UserId ${userId} users: ${users} ${users.getOrDefault(userId.toInt(), Person(0,"Name Not found"))}")
       return users.getOrDefault(userId.toInt(), Person(0,"Name Not found"));
    }

}