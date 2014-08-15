package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.Bridge.TFM_WorldEditBridge;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH)
@CommandParameters(description = "Silently modifies every online users WorldEdit block modification limit to 1000.", usage = "/<command>")
public class Command_silentsetl extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        for (final Player player : server.getOnlinePlayers())
        {
            TFM_WorldEditBridge.setLimit(player, 1000);
        }
        return true;
    }
}
