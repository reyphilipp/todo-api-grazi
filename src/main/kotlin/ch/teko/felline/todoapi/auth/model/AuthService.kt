package ch.teko.felline.todoapi.auth.model

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import kotlin.streams.toList

@Service
class AuthService(@Autowired val repository: UserRepository) {

    fun registUser(user: User) : User {
        repository.save(user)
        return user
    }

    fun getAllUsers() : List<User> {
        return repository.findAll()
    }

}