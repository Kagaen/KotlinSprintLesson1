class Forum() {
    val members: MutableMap<Int, String> = linkedMapOf()
    val forumChat: MutableList<Pair<Int, String>> = mutableListOf()

    fun printTread() {
        for ((id, message) in forumChat) {
            val memberName = members[id]
            println("$memberName: $message")
        }
    }
}

class ForumMember() {
    class Builder(val forum: Forum) {
        var userId = 0
        var userName = ""
        fun createNewUser(name: String): Builder {
            userId = forum.members.keys.maxOrNull() ?: 0
            userId +=  1
            userName = name
            forum.members[userId] = userName
            return this
        }
    }
}

class ForumMessage() {
    class Builder(val forum: Forum) {
        var authorId = 0
        var authorMessage = ""
        fun createMessage(id: Int, message: String) {
            if (forum.members.contains(id)) {
                authorId = id
                authorMessage = message
                forum.forumChat.add(authorId to authorMessage)
            }
        }
    }
}

fun main() {

    val greatForum = Forum()
    val firsMember = ForumMember.Builder(greatForum).createNewUser("The chosen one")
    val secondMember = ForumMember.Builder(greatForum).createNewUser("The chosen two")

    val message1 = ForumMessage.Builder(greatForum).createMessage(2, "Oh, Hello!")
    val message2 = ForumMessage.Builder(greatForum).createMessage(1, "Здарова, коль не шутишь")
    val message3 = ForumMessage.Builder(greatForum).createMessage(3, "Где Я?")

    greatForum.printTread()


}