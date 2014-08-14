package me.StevenLawson.TotalFreedomMod.Commands;
 
 
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
 
@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "Give everybody a pet cow.", usage = "/<command>", aliases = "gcow")
public class Command_givecows extends TFM_Command
{
   @Override
   public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
   {
           server.dispatchCommand(sender, "mp");
           server.dispatchCommand(sender, "wildcard spawnmob mushroomcow 1 ?");
           TFM_Util.bcastMsg(sender.getName() + TFM_Util.randomChatColor() + " decided" + TFM_Util.randomChatColor() + " to" + TFM_Util.randomChatColor() + " give" + TFM_Util.randomChatColor() + " you" + TFM_Util.randomChatColor() + " your" + TFM_Util.randomChatColor() + " own" + TFM_Util.randomChatColor() + " pet" + TFM_Util.randomChatColor() + " cow" + TFM_Util.randomChatColor() + "!", ChatColor.AQUA);
           
           return true;
}
}
 
