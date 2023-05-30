package Desafio

enum class Level {BASIC, INTERMEDIATE, ADVANCED}

class User(val name: String)

data class EducationalContent(var name: String, val duration: Int = 60, val level: Level)

data class Bootcamp(val name: String, var contents: List<EducationalContent>) {

    val enrolledUsers = mutableListOf<User>()

    fun enroll(user: User) {
        enrolledUsers.add(user)
    }
}

data class ScoringSystem(val initialScore: Int = 0) {
    private val scores = mutableMapOf<User, Int>()

    init {
        scores.clear()
    }

    fun registerCompletion(user: User, score: Int) {
        val totalScore = scores.getOrDefault(user, initialScore) + score
        scores[user] = totalScore
    }

    fun getScore(user: User): Int {
        return scores.getOrDefault(user, initialScore)
    }
}

fun main() {
    val scoringSystem = ScoringSystem()

    val user1 = User("Matheus")
    val user2 = User("Hyan")
    val user3 = User("Luiz")

    val content1 = EducationalContent("Introduction to Kotlin", level = Level.BASIC)
    val content2 = EducationalContent("Object-Oriented Programming in Kotlin", level = Level.INTERMEDIATE)
    val content3 = EducationalContent("Kotlin applied to web development", level = Level.BASIC)

    val training = Bootcamp("Kotlin Training", listOf(content1, content2, content3))

    training.enroll(user1)
    training.enroll(user2)
    training.enroll(user3)

    scoringSystem.registerCompletion(user1, 50)
    scoringSystem.registerCompletion(user2, 80)
    scoringSystem.registerCompletion(user1, 10)
    scoringSystem.registerCompletion(user3, 0)

    for (content in training.contents) {
        println("Content: ${content.name}, Level: ${content.level}")
    }

    println("\nScore of ${user1.name}: ${scoringSystem.getScore(user1)} points")
    println("Score of ${user2.name}: ${scoringSystem.getScore(user2)} points")
    println("Score of ${user3.name}: ${scoringSystem.getScore(user3)} points")
}
