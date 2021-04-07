package VK.model.myExceptions

import java.lang.RuntimeException

class PostNotFoundException(message : String) : RuntimeException(message) {
}