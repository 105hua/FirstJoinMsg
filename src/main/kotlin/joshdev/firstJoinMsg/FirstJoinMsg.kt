/* Licensed under the GNU General Public License v3.0 */
package joshdev.firstJoinMsg

import joshdev.firstJoinMsg.events.PlayerJoin
import org.bukkit.plugin.java.JavaPlugin

class FirstJoinMsg : JavaPlugin() {

    companion object {
        lateinit var pluginInstance: FirstJoinMsg
    }

    override fun onEnable() {
        // Initialize plugin instance.
        pluginInstance = this
        // Parse the join event.
        server.pluginManager.registerEvents(PlayerJoin(), this)
        // Log that the plugin has been enabled.
        logger.info("Plugin enabled.")
    }

    override fun onDisable() {
        // Log that the plugin has been disabled.
        logger.info("Plugin disabled.")
    }
}
