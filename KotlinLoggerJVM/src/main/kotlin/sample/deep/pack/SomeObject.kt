package sample.deep.pack

import com.javiersc.kotlinloggerjvm.*
import kotlinx.serialization.Serializable

internal object SomeObject {

    object SomeNestedObject {
        fun loggingNested() {
            logOO("OFF")
            logTT("TRACE")
            jsonA(userString)
            jsonA(user)
        }
    }

    fun logging() {
        logA("Your message")
        logAA("Your message")
        logD("Your message")
        logDD("Your message")
        logI("Your message")
        logII("Your message")
        logW("Your message")
        logWW("Your message")
        logE("Your message")
        logEE("Your message")
        logF("Your message")
        logFF("Your message")
        logO("Your message")
        logOO("Your message")
        logT("Your message")
        logTT("Your message")
        jsonA(userString)
        jsonA(user)
        jsonD(userString)
        jsonD(user)
        jsonI(userString)
        jsonI(user)
        jsonW(userString)
        jsonW(user)
        jsonE(userString)
        jsonE(user)
        jsonF(userString)
        jsonF(user)
        jsonO(userString)
        jsonO(user)
        jsonT(userString)
        jsonT(user)
        jsonAA(userString)
        jsonAA(user)
        jsonDD(userString)
        jsonDD(user)
        jsonII(userString)
        jsonII(user)
        jsonWW(userString)
        jsonWW(user)
        jsonEE(userString)
        jsonEE(user)
        jsonFF(userString)
        jsonFF(user)
        jsonOO(userString)
        jsonOO(user)
        jsonTT(userString)
        jsonTT(user)
    }

    @Serializable
    data class User(val name: String, val age: Int, val hobbies: List<String>)

    private val user =
        User("John", 19, listOf("Tennis", "Coding"))
    private const val userString =
        """
           {
              "name": "Mike",
              "age": 22,
              "surnames": [
                    "Football",
                    "Reading"
              ]
           }
        """
}