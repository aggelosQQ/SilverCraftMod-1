package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Sic ethanmort on people!", usage = "/<command> <player>")
public class Command_ethan extends TFM_Command
{
    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (args.length == 0)
        {
            return false;
        }

        final Player player = getPlayer(args[0]);
        
        if (player == null)
        {
            playerMsg(TotalFreedomMod.PLAYER_NOT_FOUND, ChatColor.RED);
            return true;
        }

        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + player.getName() + "WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS?", ChatColor.WHITE);
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "YOUR ON MOTHER FUCKING THIN ICE, YOU HEAR ME??", ChatColor.WHITE);
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!", ChatColor.WHITE);
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!", ChatColor.WHITE);
        player.getWorld().strikeLightning(player.getLocation());
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, IT'S PERMBAN!!!", ChatColor.WHITE);
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "YOUR ON FUCKING THIN ICE!!!!", ChatColor.WHITE);
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "IF YOU BREAK ONE MORE FUCKING BLOCK ITS PERMBAN ILL TELL AGG TO PERMBAN YOU!!!!", ChatColor.WHITE);
        TFM_Util.playerMsg(sender, "<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> " + "NOW GET YOUR FUCKING SHIT TOGETHER!!!!!", ChatColor.WHITE);
        player.setFireTicks(10000);
        player.getWorld().strikeLightning(player.getLocation());        
        player.getWorld().strikeLightning(player.getLocation());
        player.kickPlayer(ChatColor.DARK_PURPLE + "NOW GET YOUR FUCKING SHIT TOGETHER, OR IT'S PERMBAN!!");

        return true;
    }
}
