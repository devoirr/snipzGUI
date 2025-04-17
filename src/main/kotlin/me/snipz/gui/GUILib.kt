package me.snipz.gui

import org.bukkit.plugin.Plugin

object GUILib {

    private var initialized = false

    fun init(plugin: Plugin) {
        if (initialized)
            return

        val listener = GUIListener(plugin)
        plugin.server.pluginManager.registerEvents(listener, plugin)

        initialized = true
    }

}