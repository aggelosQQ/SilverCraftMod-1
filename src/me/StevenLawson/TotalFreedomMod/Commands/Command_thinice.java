package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TFM_UuidResolver;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

@CommandPermissions(level = AdminLevel.SUPER, source = SourceType.BOTH)
@CommandParameters(description = "For the nubs on thinice", usage = "/<command> <playername>")
public class Command_thinice extends TFM_Command
{
    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        if (sender.getName().equals("GreatRaider"))
        {
            playerMsg("For the nubs on thinice");
            return false;
        }
        if (args.length == 0)
        {
            playerMsg(ChatColor.GRAY + "For the nubs on thinice");
            return false;
        }

        final Player player = getPlayer(args[0]);

        if (player == null)
        {
            sender.sendMessage("Couldn't find that nub..");
            return true;
        }

        TFM_Util.adminAction(player.getName(), "You're on some thin fucking ice my pedegree chum!", true);
        TFM_Util.bcastMsg("And i shall be under it when it breaks....");
        // Runable
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
            }
        }.runTaskLater(plugin, 1L * 20L);
        // Repeat
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
            }
        }.runTaskLater(plugin, 2L * 20L);
        // Repeat
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                player.getWorld().strikeLightning(player.getLocation());
                player.getWorld().strikeLightning(player.getLocation());
            }
        }.runTaskLater(plugin, 3L * 20L);
        // Get player's ip adress
        final String ip = player.getAddress().getAddress().getHostAddress().trim();

        
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                // Desuper
                if (TFM_AdminList.isSuperAdmin(player))
                {
                    TFM_Util.adminAction(sender.getName(), "Removing " + player.getName() + " from the superadmin list.", true);
                    TFM_AdminList.removeSuperadmin(player);
                }
            }
        }.runTaskLater(plugin, 4L * 20L);

        // De whitelist
        player.setWhitelisted(false);

        // Deop
        player.setOp(false);

        // Gather Ip's
        for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
        // Ban Ip's
        {
            TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
        }

        // Ban UUID
        TFM_BanManager.addUuidBan(player);

        // Change to survival
        player.setGameMode(GameMode.SURVIVAL);

        // Clear players inventory and close inventory
        player.closeInventory();
        player.getInventory().clear();

        // Set player on fire for 10000 ticks
        player.setFireTicks(10000);

        // Create a radius 8 explosion on user
        player.getWorld().createExplosion(player.getLocation(), 8F);

        // Shoot player 20 blocks high into the sky
        player.setVelocity(player.getVelocity().clone().add(new Vector(0, 20, 0)));

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                // Strike Lightning
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
                player.getWorld().strikeLightning(player.getLocation());
                // Repeat
            }
        }.runTaskLater(plugin, 5L * 20L);

        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                // Ban Message
                TFM_Util.adminAction(sender.getName(), "Banning " + player.getName() + ", IP: " + ip, true);

                // More class 8 explosions
                player.getWorld().createExplosion(player.getLocation(), 8F);

                // Disconect from server with message.
                player.kickPlayer(ChatColor.RED + "You fell from the thinice and you are now banned by " + sender.getName());
            }
        }.runTaskLater(plugin, 6L * 20L);

        return true;
    }
}
