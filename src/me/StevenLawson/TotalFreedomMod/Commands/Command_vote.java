package me.StevenLawson.TotalFreedomMod.Commands;
 
 
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
 
@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "How to vote", usage = "/<command>")
public class Command_givecows extends TFM_Command
{
   @Override
   public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
   {
           server.dispatchCommand(sender, "ping &2****&6Links to vote&2****");
           server.dispatchCommand(sender, "ping &b1)  &2http://minecraft-mp.com/server-s56156");
           server.dispatchCommand(sender, "ping &2****&6Links to vote&2****");
           player.chat("I just saw the vote links by using /vote, you should do it aswell!");
           
           return true;
}
}
 
