package com.github.shmulikklein.commitcraft.actions

import com.intellij.ide.BrowserUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

/**
 * Provides an action that opens the web browser and navigates to the "Ask Question" page on Stack Overflow when triggered.
 */
class SearchSoAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        BrowserUtil.browse("https://stackoverflow.com/questions/ask")
    }
}