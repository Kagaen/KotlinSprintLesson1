class Quiz(
    _question: String,
    _ask: String,
) {

    var question = _question
        get() = field

    var ask = _ask
        get() = field
        set(value: String) {
            field = value
        }
}

