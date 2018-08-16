package ru.madzi.apps.nlp.core

import ru.madzi.apps.nlp.core.model.IWord
import ru.madzi.apps.nlp.core.model.UnknownWord

object WordFactory {
    fun parse(word: String): IWord {
        return UnknownWord(word)
    }
}