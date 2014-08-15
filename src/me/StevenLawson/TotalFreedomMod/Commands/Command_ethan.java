package me.StevenLawson.TotalFreedomMod.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.ONLY_IN_GAME)
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

    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> WHAT THE FUCK IS WRONG WITH YOU, YOU FUCKING DUMBASS?");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> YOUR ON MOTHER FUCKING THIN ICE, YOU HEAR ME??");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> I WILL RIP YOUR ENTIRE ASS APART, YOUR CLOSE TO PERMBAN!!!");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE MOTHER FUCKING BLOCK, IT'S PERMBAN FUCKING BITCH!!!");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> I BET YOU'RE NOT EVEN LISTENING, YOU PIECE OF FUCKING SHIT! YOU DO THAT SHIT AGAIN, IT'S PERMBAN!!!");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> YOUR ON FUCKING THIN ICE!!!!");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> IF YOU BREAK ONE MORE FUCKING BLOCK ITS PERMBAN ILL TELL MARK TO PERMBAN YOU!!!!!");
    	Bukkit.broadcastMessage("<" + ChatColor.RED + "ethanmort" + ChatColor.WHITE + "> NOW GET YOUR FUCKING SHIT TOGETHER!!!!");
        return true;
    }
}
