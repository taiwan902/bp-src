/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  tv.twitch.AuthToken
 *  tv.twitch.Core
 *  tv.twitch.CoreAPI
 *  tv.twitch.ErrorCode
 *  tv.twitch.StandardCoreAPI
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.ChatAPI
 *  tv.twitch.chat.ChatEmoticonData
 *  tv.twitch.chat.ChatTokenizationOption
 *  tv.twitch.chat.IChatAPIListener
 *  tv.twitch.chat.StandardChatAPI
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.HashSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.CoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.StandardCoreAPI;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatAPI;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.ChatTokenizationOption;
import tv.twitch.chat.IChatAPIListener;
import tv.twitch.chat.StandardChatAPI;

public class Class_7383 {
    protected Class_7731 Field_7384 = null;
    protected Core Field_7385 = Core.getInstance();
    protected int Field_7386 = -30279 & 128;
    protected HashMap Field_7387 = new HashMap();
    protected int Field_7388 = 2000 & 26581;
    protected IChatAPIListener Field_7389 = new Class_21744(this);
    protected Chat Field_7390 = null;
    protected String Field_7391 = "";
    private static final Logger Field_7392 = LogManager.getLogger();
    protected Class_22293 Field_7393 = Class_22293.Field_22295;
    protected String Field_7394 = "";
    protected String Field_7395 = "";
    protected int Field_7396 = 1014 & -11788;
    protected AuthToken Field_7397 = new AuthToken();
    protected Class_33547 Field_7398 = Class_33547.Field_33548;
    protected ChatEmoticonData Field_7399 = null;
    protected Class_22293 Field_7400 = Class_22293.Field_22295;

    protected void Method_7401(Class_33547 class_33547) {
        if (class_33547 != this.Field_7398) {
            this.Field_7398 = class_33547;
            try {
                if (this.Field_7384 != null) {
                    this.Field_7384.Method_7732(class_33547);
                }
            }
            catch (Exception exception) {
                this.Method_7417(exception.toString());
            }
        }
    }

    public boolean Method_7402(String string) {
        if (!this.Field_7387.containsKey(string)) {
            return (21032 & -22459) != 0;
        }
        Class_11946 class_11946 = (Class_11946)this.Field_7387.get(string);
        return (class_11946.Method_11966() == Class_16003.Field_16005 ? 8531 & 1153 : 420 & -15294) != 0;
    }

    public void Method_7403() {
        ErrorCode errorCode;
        if (this.Field_7398 != Class_33547.Field_33548 && ErrorCode.failed((ErrorCode)(errorCode = this.Field_7390.flushEvents()))) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[2081 & -32761];
            arrobject[6154 & 17616] = string;
            this.Method_7417(String.format("Error flushing chat events: %s", arrobject));
        }
    }

    public boolean Method_7404(String string) {
        return this.Method_7418(string, (289 & 8338) != 0);
    }

    public void Method_7405(String string) {
        this.Field_7391 = string;
    }

    protected void Method_7406() {
        if (this.Field_7399 == null) {
            this.Field_7399 = new ChatEmoticonData();
            ErrorCode errorCode = this.Field_7390.getEmoticonData(this.Field_7399);
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                try {
                    if (this.Field_7384 != null) {
                        this.Field_7384.Method_7736();
                    }
                }
                catch (Exception exception) {
                    this.Method_7417(exception.toString());
                }
            } else {
                this.Method_7417("Error preparing emoticon data: " + ErrorCode.getString((ErrorCode)errorCode));
            }
        }
    }

    public Class_16003 Method_7407(String string) {
        if (!this.Field_7387.containsKey(string)) {
            return Class_16003.Field_16008;
        }
        Class_11946 class_11946 = (Class_11946)this.Field_7387.get(string);
        return class_11946.Method_11966();
    }

    public Class_7383() {
        if (this.Field_7385 == null) {
            this.Field_7385 = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.Field_7390 = new Chat((ChatAPI)new StandardChatAPI());
    }

    public void Method_7408(AuthToken authToken) {
        this.Field_7397 = authToken;
    }

    public void Method_7409(String string) {
        this.Field_7395 = string;
    }

    public boolean Method_7410(String string, String string2) {
        if (this.Field_7398 != Class_33547.Field_33552) {
            return (1721 & 2116) != 0;
        }
        if (!this.Field_7387.containsKey(string)) {
            this.Method_7417("Not in channel: " + string);
            return (11808 & 193) != 0;
        }
        Class_11946 class_11946 = (Class_11946)this.Field_7387.get(string);
        return class_11946.Method_11957(string2);
    }

    public void Method_7411(Class_7731 class_7731) {
        this.Field_7384 = class_7731;
    }

    public Class_33547 Method_7412() {
        return this.Field_7398;
    }

    public boolean Method_7413() {
        if (this.Field_7398 != Class_33547.Field_33548) {
            return (9472 & -32742) != 0;
        }
        this.Method_7401(Class_33547.Field_33551);
        ErrorCode errorCode = this.Field_7385.initialize(this.Field_7395, (String)null);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.Method_7401(Class_33547.Field_33548);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[2605 & -31743];
            arrobject[-32764 & 15944] = string;
            this.Method_7417(String.format("Error initializing Twitch sdk: %s", arrobject));
            return (8 & 9012) != 0;
        }
        this.Field_7393 = this.Field_7400;
        HashSet<ChatTokenizationOption> hashSet = new HashSet<ChatTokenizationOption>();
        switch (Class_18605.Field_18608[this.Field_7400.ordinal()]) {
            case 1: {
                hashSet.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
                break;
            }
            case 2: {
                hashSet.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
                break;
            }
            case 3: {
                hashSet.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
            }
        }
        errorCode = this.Field_7390.initialize(hashSet, this.Field_7389);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.Field_7385.shutdown();
            this.Method_7401(Class_33547.Field_33548);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[2057 & -24495];
            arrobject[274 & 17408] = string;
            this.Method_7417(String.format("Error initializing Twitch chat: %s", arrobject));
            return (28803 & 280) != 0;
        }
        this.Method_7401(Class_33547.Field_33552);
        return (9225 & 19073) != 0;
    }

    public boolean Method_7414() {
        if (this.Field_7398 != Class_33547.Field_33552) {
            return (8549 & 1154) != 0;
        }
        ErrorCode errorCode = this.Field_7390.shutdown();
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[8203 & 4993];
            arrobject[1168 & 8774] = string;
            this.Method_7417(String.format("Error shutting down chat: %s", arrobject));
            return (35 & 18768) != 0;
        }
        this.Method_7416();
        this.Method_7401(Class_33547.Field_33550);
        return (2563 & -6863) != 0;
    }

    private void Method_7415() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_7416() {
        if (this.Field_7399 != null) {
            ErrorCode errorCode = this.Field_7390.clearEmoticonData();
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                this.Field_7399 = null;
                try {
                    if (this.Field_7384 != null) {
                        this.Field_7384.Method_7743();
                    }
                }
                catch (Exception exception) {
                    this.Method_7417(exception.toString());
                }
            } else {
                this.Method_7417("Error clearing emoticon data: " + ErrorCode.getString((ErrorCode)errorCode));
            }
        }
    }

    protected void Method_7417(String string) {
        Object[] arrobject = new Object[4381 & 3649];
        arrobject[7433 & 672] = string;
        Field_7392.error(Class_28018.Field_28027, "[Chat controller] {}", arrobject);
    }

    protected boolean Method_7418(String string, boolean bl) {
        if (this.Field_7398 != Class_33547.Field_33552) {
            return (8192 & -30047) != 0;
        }
        if (this.Field_7387.containsKey(string)) {
            this.Method_7417("Already in channel: " + string);
            return (-32752 & 1217) != 0;
        }
        if (string != null && !string.equals("")) {
            Class_11946 class_11946 = new Class_11946(this, string);
            this.Field_7387.put(string, class_11946);
            boolean bl2 = class_11946.Method_11960(bl);
            if (!bl2) {
                this.Field_7387.remove(string);
            }
            return bl2;
        }
        return (8 & 9478) != 0;
    }

    public void Method_7419() {
        if (this.Method_7412() != Class_33547.Field_33548) {
            this.Method_7414();
            if (this.Method_7412() == Class_33547.Field_33550) {
                while (this.Method_7412() != Class_33547.Field_33548) {
                    try {
                        Thread.sleep(222536173473604315L & -222536174286136120L);
                        this.Method_7403();
                    }
                    catch (InterruptedException interruptedException) {}
                }
            }
        }
    }

    public boolean Method_7420(String string) {
        if (this.Field_7398 != Class_33547.Field_33552) {
            return (1547 & 28708) != 0;
        }
        if (!this.Field_7387.containsKey(string)) {
            this.Method_7417("Not in channel: " + string);
            return (6152 & 848) != 0;
        }
        Class_11946 class_11946 = (Class_11946)this.Field_7387.get(string);
        return class_11946.Method_11972();
    }

    protected void Method_7421() {
        ErrorCode errorCode;
        if (this.Field_7393 != Class_22293.Field_22295 && this.Field_7399 == null && ErrorCode.failed((ErrorCode)(errorCode = this.Field_7390.downloadEmoticonData()))) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[10391 & 521];
            arrobject[786 & -11255] = string;
            this.Method_7417(String.format("Error trying to download emoticon data: %s", arrobject));
        }
    }
}

