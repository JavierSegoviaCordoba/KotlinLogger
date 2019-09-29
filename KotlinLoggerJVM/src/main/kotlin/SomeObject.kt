import com.javiersc.kotlinloggerjvm.*
import kotlinx.serialization.Serializable

object SomeObject {

    object SomeNestedObject {
        fun loggingNested() {
            logOO("OFF")
            logTT("TRACE")
            jsonA(userString)
            jsonA(user)
        }
    }

    fun logging() {
        logA("VERBOSE")
        logAA("VERBOSE")
        logD("DEBUG")
        logDD("DEBUG")
        logI("INFO")
        logII("INFO")
        logW("WARNING")
        logWW("WARNING")
        logE("ERROR")
        logEE("ERROR")
        logF("FATAL")
        logFF("FATAL")
        logO("OFF")
        logOO("OFF")
        logT("TRACE")
        logTT("TRACE")
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

    private val user = User("John", 19, listOf("Tennis", "Coding"))
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