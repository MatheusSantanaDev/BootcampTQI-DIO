import java.time.LocalDate
import java.time.format.DateTimeFormatter


fun main() {
    println("Enter with date: (dd/mm/yyyy)")
    val inputDate = readLine() ?: ""

    val dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val date = LocalDate.parse(inputDate, dateFormatter)
    val monthName = date.month.name.toLowerCase().capitalize()

    println("The date is:")
    println("${date.dayOfMonth} de $monthName de ${date.year}")
}