package net.runelite.client.plugins.chattranslation;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("chattranslation")
public interface ChatTranslationConfig extends Config
{

	@ConfigItem(
			keyName = "publicChat",
			name = "Translate incoming Messages",
			description = "Would you like to Translate Public Chat?",
			position = 0,
			group = "Public Chat Translation",
			hidden = true
	)
	default boolean publicChat()
	{
		return false;
	}

	@ConfigItem(
			keyName = "translateOptionVisable",
			name = "Show 'Translate' menu option",
			description = "Adds 'Translate' to the right-click menu in the Chatbox.",
			position = 1,
			group = "Public Chat Translation",
			hidden = true
//			unhide = "publicChat"
	)
	default boolean translateOptionVisable()
	{
		return true;
	}

	@ConfigItem(
			keyName = "publicTargetLanguage",
			name = "Target Language",
			description = "Language to translate messages too.",
			position = 2,
			group = "Public Chat Translation",
			hidden = true
//			unhide = "publicChat"
	)
	default Languages publicTargetLanguage()
	{
		return Languages.ENGLISH;
	}

	@ConfigItem(
			keyName = "playerChat",
			name = "Translate outgoing Messages",
			description = "Would you like to Translate your Messages?",
			position = 3,
			group = "Player Message Translation"
	)
	default boolean playerChat()
	{
		return false;
	}

	@ConfigItem(
			keyName = "playerTargetLanguage",
			name = "Target Language",
			description = "Language to translate messages too.",
			position = 4,
			group = "Player Message Translation",
			hidden = true,
			unhide = "playerChat"
	)
	default Languages playerTargetLanguage()
	{
		return Languages.SPANISH;
	}

}
