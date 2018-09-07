package ch.teko.felline.todoapi

import ch.teko.felline.todoapi.auth.model.AuthService
import ch.teko.felline.todoapi.auth.model.User
import ch.teko.felline.todoapi.auth.model.UserRepository
import com.sun.javafx.fxml.expression.Expression
import org.hamcrest.CoreMatchers
import org.hamcrest.Matchers
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import javax.inject.Inject

@RunWith(SpringRunner::class)
@SpringBootTest
class TodoApiApplicationTests {

    @Inject
    lateinit var userRepository:UserRepository

	@Test
	fun contextLoads() {

        val sut = AuthService(userRepository)

        val user = sut.registUser(User(username = "Max", password = "secret"))
		Assert.assertThat(user.id, CoreMatchers.not(0L))
	}


}
