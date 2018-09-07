package ch.teko.felline.todoapi.auth.controller

import ch.teko.felline.todoapi.auth.model.AuthService
import ch.teko.felline.todoapi.auth.model.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/todo-api")
class UserController(val authService: AuthService) {

    @PostMapping("/registration")
    fun registUser(@Valid @RequestBody user: User) : ResponseEntity<User> {
        val user = authService.registUser(user)
        return ResponseEntity.ok(user)
    }

    @GetMapping("/users")
    fun getAllUsers() : List<User> {
        return authService.getAllUsers()
    }

}