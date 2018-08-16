package ru.madzi.apps.nlp.core.model

class UnknownWord(override val name: String) : IWord {
    override fun stringify(): String {
        return "Unknown($name)"
    }
    override fun like(text: String): Boolean {
        return true
    }
}
