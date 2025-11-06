class Forum() {
    val memberId: MutableSet<Int> = mutableSetOf()
    val memberName: MutableList<String> = mutableListOf()
    val memberChat: MutableList<Pair<Int, String>> = mutableListOf()


    fun printTread() {
        for ((id, message) in memberChat) {

        }
    }
}

class ForumMember() {
    class Builder(val forum: Forum) {
        var userId = 0
        var userName = ""
        fun createNewUser(name: String): Builder {
            userId = if (forum.memberId.isEmpty()) {
                0
            } else {
                forum.memberId.last() + 1
            }
            userName = name
            forum.memberId.add(userId)
            forum.memberName.add(userName)
            return this
        }
    }
}

class ForumMessage() {
    class Builder(val forum: Forum) {
        var authorId = 0
        var message = ""
        fun createMessage(id: Int, message: String) {
            if (forum.memberId.contains(id)) {
                forum.memberChat.add(id to message)
            }
        }
    }
}

fun main() {

    val greatForum = Forum()
    val firsMember = ForumMember.Builder(greatForum).createNewUser("The chosen one")
    val secondMember = ForumMember.Builder(greatForum).createNewUser("The chosen two")
    println(greatForum.memberId)
    println(greatForum.memberName)

    val message1 = ForumMessage.Builder(greatForum).createMessage(0, "Hi!")
    val message2 = ForumMessage.Builder(greatForum).createMessage(1, "Здарова, коль не шутишь")
    val message3 = ForumMessage.Builder(greatForum).createMessage(0, "Где Я?")
    println(greatForum.memberChat)
    greatForum.printTread()


}