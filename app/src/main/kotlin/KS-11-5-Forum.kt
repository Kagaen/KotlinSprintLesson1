class Forum() {
    val members: MutableMap<Int, ForumMember> = mutableMapOf()
    val forumChat: MutableList<ForumMessage> = mutableListOf()

    fun printTread() {
        for (message in forumChat) {
            val memberName = members[message.authorId]?.userName
            println("$memberName: ${message.authorMessage}")
        }
    }
}

class ForumMember(val forum: Forum) {
    var userId = 0
    var userName = ""
    fun createNewUser(name: String) {
        userId = forum.members.size + 1
        userName = name
        forum.members[userId] = this
    }
}

class ForumMessage(val forum: Forum) {
    var authorId = 0
    var authorMessage = ""
    fun createMessage(id: Int, message: String) {
        if ((id != 0) && (forum.members.size >= id)) {
            authorId = id
            authorMessage = message
            forum.forumChat.add(this)
        }
    }
}

fun main() {

    val greatForum = Forum()
    val newMember = ForumMember(greatForum)
    val newMessage = ForumMessage(greatForum)

    newMember.createNewUser("The chosen one")
    newMember.createNewUser("The chosen two")

    newMessage.createMessage(2, "Oh, Hello!")
    newMessage.createMessage(1, "Здарова, коль не шутишь")
    newMessage.createMessage(3, "Где Я?")

    greatForum.printTread()

}