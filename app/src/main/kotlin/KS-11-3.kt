fun main() {

    val room1 = Room(
        3454,
        "SafePlace",
    )

    val person1 = Member("man")
    val person2 = Member("stakan")
    val person3 = Member("Ivan")

    room1.showMembers()
    room1.addMember(person1)
    room1.showMembers()
    room1.addMember(person3)
    room1.addMember(person2)
    room1.showMembers()
    person1.longClick()
    room1.changeStatus(person1, 1)
    person1.longClick()
    room1.changeStatus(person2, 2)
    person2.longClick()

}

class Room(
    val cover: Int,
    val name: String,
    val listOfMembers: MutableList<Member> = mutableListOf(),
    val status: List<String> = listOf("Speak", "Mute", "Micro is off"),
) {
    fun addMember(member: Member) {
        if (!listOfMembers.contains(member))
        listOfMembers.add(member)
    }

    fun showMembers() {
        val text = listOfMembers.joinToString(", ") {it.name}
        println("Members of the ${name}: $text")
    }

    fun changeStatus(member: Member, statusIndex: Int) {
        member.status = status[statusIndex]
    }
}

class Member(
    val name: String,
    var status: String = "Speak",
) {
    fun longClick() {
        println("$name - $status")
    }
}

