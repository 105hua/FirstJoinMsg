/* Licensed under the GNU General Public License v3.0 */
package joshdev.firstJoinMsg.events

import joshdev.firstJoinMsg.FirstJoinMsg
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.TextDecoration
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerJoin : Listener {
    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        val player = event.player
        if (!player.hasPlayedBefore()) {
            FirstJoinMsg.pluginInstance.logger.info(player.name + " has joined for the first time!")
            FirstJoinMsg.pluginInstance.server.broadcast(
                Component.text(
                    "Welcome " + player.name + " to the server!",
                    NamedTextColor.YELLOW,
                    TextDecoration.BOLD,
                ),
            )
        } else {
            FirstJoinMsg.pluginInstance.logger.info(player.name + " has returned!")
        }
    }
}
