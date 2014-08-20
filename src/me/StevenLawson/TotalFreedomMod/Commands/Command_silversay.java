package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import net.minecraft.util.org.apache.commons.lang3.ArrayUtils;
import net.minecraft.util.org.apache.commons.lang3.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "SilverBot's broadcast command.", usage = "/<command> <message>")
public class Command_silversay extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
                String reason = null;
        if (args.length >= 2)
        {
            reason = StringUtils.join(ArrayUtils.subarray(args, 1, args.length), " ");
        }
       
       
       
//        TFM_Util.bcastMsg("[SilverBot] - " + player.getName + " has been warned for ", ChatColor.RED + <there  @GreatRaider >, ChatColor.GREEN + ChatColor.BOLD);
        TFM_Util.bcastMsg(ChatColor.GRAY + "[" + ChatColor.AQUA + "SilverBot" + ChatColor.GRAY + "] " + (reason != null ? (ChatColor.GRAY + reason) : "!"));
        
        return true;
    }
}
