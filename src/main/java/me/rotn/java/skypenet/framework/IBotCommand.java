package me.rotn.java.skypenet.framework;

import com.skype.ChatMessage;
import me.rotn.java.skypenet.CommandPriority;

public abstract interface IBotCommand {

    /**
     * @param args arguments for command. i.e. /[command] [arg 0] [arg 1]
     * @return output string. This will be the message sent by the bot.
     */
    String command(ChatMessage chatMessage, String[] args);

    /**
     * @return command name. Used for command registering
     */
    String name();

    /**
     * @return level of priority for command. For public plugins, use NORMAL or lower, for your own ones, use HIGH or greater
     */
    CommandPriority getPriority();

    boolean requirePrefix();
}
