# KotlinLogger

###### Pretty print logs based on Log4j levels
## Features
- File, class and method names, and line number
- JSON pretty-printing support 

Note: You can configure the ANSI colors in the IntelliJ IDEA settings (search `ANSI` to find it)

#### Download
- Groovy:
```groovy
implementation 'com.javiersc.kotlinlogger:jvm:0.0.2'
```
- Kotlin DSL
```kotlin
implementation("com.javiersc.kotlinlogger:jvm:0.0.2")
```

#### Usage
```kotlin
logA("Your message")
logD("Your message")
// and more...
```

| Level     | Image                                | 
| ---       | ---                                  |
| All       | ![Normal 1](screenshots/normal1.png) |
| Debug     | ![Normal 2](screenshots/normal2.png) |
| Info      | ![Normal 3](screenshots/normal3.png) |
| Warning   | ![Normal 4](screenshots/normal4.png) |
| Error     | ![Normal 5](screenshots/normal5.png) |
| Fatal     | ![Normal 6](screenshots/normal6.png) |
| Off       | ![Normal 7](screenshots/normal7.png) |
| Trace     | ![Normal 8](screenshots/normal8.png) |

## JSON
You have all levels for JSON printing too

#### Usage
```kotlin
// json strings
val userString =
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
jsonA(userString)

// data class with Kotlin Serialization
@Serializable
data class User(val name: String, val age: Int, val hobbies: List<String>)

val user = User("John", 19, listOf("Tennis", "Coding"))
jsonA(user)
```

![JSON 1](screenshots/json1.png)

### Background color logs

#### Usage
```kotlin
logAA("Your message")
logDD("Your message")
// and more...
```

| Level     | Image                                | 
| ---       | ---                                  |
| All       | ![Background 1](screenshots/bg1.png) |
| Debug     | ![Background 2](screenshots/bg2.png) |
| Info      | ![Background 3](screenshots/bg3.png) |
| Warning   | ![Background 4](screenshots/bg4.png) |
| Error     | ![Background 5](screenshots/bg5.png) |
| Fatal     | ![Background 6](screenshots/bg6.png) |
| Off       | ![Background 7](screenshots/bg7.png) |
| TRACE     | ![Background 8](screenshots/bg8.png) |

Similarly, you have `jsonAA(...)` to use with JSON strings or serializable data classes
