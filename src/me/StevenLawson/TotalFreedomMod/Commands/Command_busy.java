package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerData;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Are you busy? Tell the players that you are off duty", usage = "/<command> [on | off]")
public class Command_busy extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        TFM_PlayerData playerdata = TFM_PlayerData.getPlayerData(sender_p);
        //
        if (playerdata.isBusy())
        {
            if (TFM_AdminList.isSeniorAdmin(sender_p))
            {
                sender_p.setPlayerListName(ChatColor.GRAY + sender_p.getName());
                TFM_PlayerData.getPlayerData(sender_p).setTag("&8[&dOff Duty Senior Admin&8]");
            }
            else if (TFM_AdminList.isTelnetAdmin(sender_p, true))
            {
                sender_p.setPlayerListName(ChatColor.GRAY + sender_p.getName());
                TFM_PlayerData.getPlayerData(sender_p).setTag("&8[&2Off Duty Telnet Admin&8]");
            }

            TFM_Util.bcastMsg(sender.getName() + " is now off-duty", ChatColor.RED);
            playerdata.setBusy(false);
        }
        else
        {
            if (TFM_AdminList.isSeniorAdmin(sender_p))
            {
                sender_p.setPlayerListName(ChatColor.GRAY + sender_p.getName());
                TFM_PlayerData.getPlayerData(sender_p).setTag("&8[&dSenior Admin&8]");
            }
            else if (TFM_AdminList.isTelnetAdmin(sender_p, true))
            {
                sender_p.setPlayerListName(ChatColor.GRAY + sender_p.getName());
                TFM_PlayerData.getPlayerData(sender_p).setTag("&8[&2Telnet Admin&8]");
            }

            TFM_Util.bcastMsg(sender.getName() + " is now on-duty", ChatColor.GREEN);
            playerdata.setBusy(true);
            
        }
        return true;
    }
}
