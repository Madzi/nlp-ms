package ru.madzi.apps.nlp.core.model

class NounWord(override val name: String) : IWord {
    override fun stringify(): String {
        return "Noun($name)"
    }
    override fun like(text: String) : Boolean {
        return name == text
    }
}
