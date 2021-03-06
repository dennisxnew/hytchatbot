package com.oleksii.creators;

import com.microsoft.bot.schema.models.Activity;
import com.microsoft.bot.schema.models.ActivityTypes;
import org.springframework.stereotype.Component;

@Component
public class ActivityCreator {

  private static final String spellCheckedResponsePart = "You have probably meant: ";
  private static final String echoResponsePart = "你剛剛說: ";
//  private static JazzySpellChecker spellChecker = new JazzySpellChecker();

  private ActivityCreator() {

  }

  public static Activity createSpellCheckedActivity(Activity activity) {
//    return createEmptyActivity(activity).withText(spellCheckedResponsePart + spellChecker.getCorrectedText(activity.text()));
    return null;
  }

  public static Activity createEchoActivity(Activity activity) {
    return createEmptyActivity(activity).withText("嗨!" + echoResponsePart + activity.text());
  }

  private static Activity createEmptyActivity(Activity activity) {
    return new Activity()
                .withType(ActivityTypes.MESSAGE)
                .withRecipient(activity.from())
                .withFrom(activity.recipient());
  }
}
