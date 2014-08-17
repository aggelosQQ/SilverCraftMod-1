package me.StevenLawson.TotalFreedomMod.Listener;

import com.earth2me.essentials.commands.PlayerNotFoundException;
import me.StevenLawson.TotalFreedomMod.*;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class TFM_ChatListener implements Listener
{
  protected TotalFreedomMod plugin;
  
  @EventHandler(priority = EventPriority.HIGH)
  public void onPlayerChat(AsyncPlayerChatEvent event)
  {   
    Player sender_p = event.getPlayer();
     
      String message = event.getMessage();
      boolean shouldCancel = false;
      if (message.startsWith("!"))
      {
        String[] args = message.split(" ");
        if (args == null)
        {
          return;
        }
    if ((args[0].equals("!sys")) && (args.length == 2))
         {
        if (args[1].equals("teston"))
        {
              event.setCancelled(true);
              TFM_Util.adminAction("WARNING: " + sender_p, "Has Started Testing on this server.", true);
        }
        else if (args[1].equals("testoff"))
        {
             event.setCancelled(true);
              TFM_Util.adminAction("COMPLETED: " + sender_p, "Has succefully finished server testing", true);
        }
          }       
      }
    }
}
