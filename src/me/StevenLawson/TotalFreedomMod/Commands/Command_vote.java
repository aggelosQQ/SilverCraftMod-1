package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Config.TFM_ConfigEntry;
import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_CommandBlocker;
import me.StevenLawson.TotalFreedomMod.TFM_Log;
import me.StevenLawson.TotalFreedomMod.TFM_PermbanList;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


@CommandPermissions(level = AdminLevel.ALL, source = SourceType.BOTH)
@CommandParameters(description = "Shows where to vote", usage = "/<command> alieases = "votes")
public class Command_scm extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
        {

        playerMsg("***************************************************", ChatColor.GOLD);
        playerMsg("Links: ", ChatColor.GREEN);
        playerMsg("  ");
        playerMsg("http://minecraft-mp.com/server-s56156", ChatColor.BLUE);
        playerMsg("  ");
        playerMsg("Please Vote Daily.", ChatColor.GREEN);
        playerMsg("***************************************************", ChatColor.GOLD);
        
        return true;
    }
}
