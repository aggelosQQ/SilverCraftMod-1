package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_AdminList;
import me.StevenLawson.TotalFreedomMod.TFM_Ban;
import me.StevenLawson.TotalFreedomMod.TFM_BanManager;
import me.StevenLawson.TotalFreedomMod.TFM_PlayerList;
import me.StevenLawson.TotalFreedomMod.TFM_Util;
import me.StevenLawson.TotalFreedomMod.TotalFreedomMod;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

@CommandPermissions(level=AdminLevel.SENIOR, source=SourceType.BOTH)
@CommandParameters(description="For the bad Superadmins", usage="/<command> <playername>")
public class Command_oblivion
  extends TFM_Command
{
  public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
  {
    if (args.length != 1) {
      return false;
    }
    final Player player = getPlayer(args[0]);
    if (player == null)
    {
      sender.sendMessage(TotalFreedomMod.PLAYER_NOT_FOUND);
      return true;
    }
    sender_p.chat("Hey " + player.getName() + ", I have a present for you, wanna see it?");
    player.chat("Sure what is it?");
    sender_p.chat("It's........ OBLIVION!");
    TFM_Util.adminAction(sender.getName(), "INCOMING OBLIVION! Casting a dark, fiery shadow of oblivion over " + player.getName(), true);
    TFM_Util.bcastMsg(player.getName() + "  Will be obliviated by" + sender.getName() + "'s dark, fiery power", ChatColor.RED);
    
    final String ip = player.getAddress().getAddress().getHostAddress().trim();
    
if (TFM_AdminList.isSuperAdmin(player))
{
TFM_Util.adminAction(player.getName(), "Removing " + player.getName() + "from the super admin list", true);
TFM_AdminList.removeSuperadmin(player);
}
    player.setWhitelisted(false);
    player.setOp(false);
    player.setGameMode(GameMode.SURVIVAL);
    player.closeInventory();
    player.getInventory().clear();
    player.setFireTicks(10000);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    player.chat("AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH!!!!!!!! NOOOOOOOOO!!!");
    
    new BukkitRunnable()
    {
      public void run()
      {
        player.getWorld().strikeLightning(player.getLocation());
      }
    }
    

      .runTaskLater(this.plugin, 40L);
    



    player.getWorld().createExplosion(player.getLocation(), 4.0F);
    
    BukkitRunnable bukkitRunnable = new BukkitRunnable()
      {
          public void run()
          {
              player.getWorld().strikeLightning(player.getLocation());
              // We are not premitted to swear in commands...  - @cow
              player.chat("OH NO! HELP ME! PLEASE! OH! NO! NO! NOOOOOOOOOOO!!!!!!!!!!!! WHY WAS I SO STUPID!!!!!!!!! NOOOOOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
              // ban uuid
              TFM_BanManager.addUuidBan(player);
          }
      };
    
    

    // Again, we cannot have commands swear - @cow
    TFM_Util.adminAction(player.getName(), "has been Obliviated by " + sender.getName() + "!  May the overlord continue as they burn there. ", true);
    player.setFireTicks(10000);
    // ban IPs
        for (String playerIp : TFM_PlayerList.getEntry(player).getIps())
        {
            TFM_BanManager.addIpBan(new TFM_Ban(playerIp, player.getName()));
        }
    new BukkitRunnable()
    {
      @Override
      public void run()
      {
        TFM_Util.adminAction(sender.getName(), "Has sent oblivion over: " + player.getName() + ", IP: " + ip, true);
        player.getWorld().createExplosion(player.getLocation(), 4.0F);
        player.kickPlayer(ChatColor.RED + "Next time, don't be a di'kut");
      }
    }
    
      .runTaskLater(this.plugin, 80L);
    

    return true;
  }
}
