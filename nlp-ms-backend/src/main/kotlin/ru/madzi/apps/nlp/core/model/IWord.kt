package ru.madzi.apps.nlp.core.model

interface IWord {
    val name: String
    fun stringify(): String
    fun like(text: String): Boolean
}
