/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.ChatBadgeData
 *  tv.twitch.chat.ChatChannelInfo
 *  tv.twitch.chat.ChatEvent
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.IChatChannelListener
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

public class Class_11946
implements IChatChannelListener {
    protected boolean Field_11947;
    protected ChatBadgeData Field_11948;
    protected LinkedList Field_11949;
    final Class_7383 Field_11950;
    protected List Field_11951;
    protected String Field_11952;
    protected Class_16003 Field_11953;
    protected LinkedList Field_11954;

    public void Method_11955(String string, ErrorCode errorCode) {
        if (!ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_11950.Field_7387.remove(string);
            this.Method_11970();
        }
    }

    public void Method_11956(String string) {
        if (this.Field_11950.Field_7393 == Class_22293.Field_22295) {
            this.Field_11954.clear();
            this.Field_11949.clear();
        } else {
            ListIterator listIterator;
            ChatRawMessage chatRawMessage;
            if (this.Field_11954.size() > 0) {
                listIterator = this.Field_11954.listIterator();
                while (listIterator.hasNext()) {
                    chatRawMessage = (ChatRawMessage)listIterator.next();
                    if (!chatRawMessage.userName.equals(string)) continue;
                    listIterator.remove();
                }
            }
            if (this.Field_11949.size() > 0) {
                listIterator = this.Field_11949.listIterator();
                while (listIterator.hasNext()) {
                    chatRawMessage = (ChatTokenizedMessage)listIterator.next();
                    if (!chatRawMessage.displayName.equals(string)) continue;
                    listIterator.remove();
                }
            }
        }
        try {
            if (this.Field_11950.Field_7384 != null) {
                this.Field_11950.Field_7384.Method_7740(this.Field_11952, string);
            }
        }
        catch (Exception exception) {
            this.Field_11950.Method_7417(exception.toString());
        }
    }

    public boolean Method_11957(String string) {
        if (this.Field_11953 != Class_16003.Field_16005) {
            return (12560 & 2660) != 0;
        }
        ErrorCode errorCode = this.Field_11950.Field_7390.sendMessage(this.Field_11952, string);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string2 = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[8195 & 485];
            arrobject[-6143 & 5798] = string2;
            this.Field_11950.Method_7417(String.format("Error sending chat message: %s", arrobject));
            return (-30144 & 13352) != 0;
        }
        return (16385 & -32647) != 0;
    }

    public void Method_11958(String string, String string2) {
        this.Method_11956(string2);
    }

    protected void Method_11959(Class_16003 class_16003) {
        if (class_16003 != this.Field_11953) {
            this.Field_11953 = class_16003;
        }
    }

    public boolean Method_11960(boolean bl) {
        this.Field_11947 = bl;
        ErrorCode errorCode = ErrorCode.TTV_EC_SUCCESS;
        errorCode = bl ? this.Field_11950.Field_7390.connectAnonymous(this.Field_11952, (IChatChannelListener)this) : this.Field_11950.Field_7390.connect(this.Field_11952, this.Field_11950.Field_7391, this.Field_11950.Field_7397.data, (IChatChannelListener)this);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[603 & -5887];
            arrobject[-32503 & 21540] = string;
            this.Field_11950.Method_7417(String.format("Error connecting: %s", arrobject));
            this.Method_11962(this.Field_11952);
            return (24705 & 3092) != 0;
        }
        this.Method_11959(Class_16003.Field_16007);
        this.Method_11971();
        return (6915 & 8369) != 0;
    }

    public void Method_11961(String string, ChatRawMessage[] arrchatRawMessage) {
        for (int i = 30440 & -32768; i < arrchatRawMessage.length; ++i) {
            this.Field_11954.addLast(arrchatRawMessage[i]);
        }
        try {
            if (this.Field_11950.Field_7384 != null) {
                this.Field_11950.Field_7384.Method_7741(this.Field_11952, arrchatRawMessage);
            }
        }
        catch (Exception exception) {
            this.Field_11950.Method_7417(exception.toString());
        }
        while (this.Field_11954.size() > this.Field_11950.Field_7386) {
            this.Field_11954.removeFirst();
        }
    }

    protected void Method_11962(String string) {
        try {
            if (this.Field_11950.Field_7384 != null) {
                this.Field_11950.Field_7384.Method_7739(string);
            }
        }
        catch (Exception exception) {
            this.Field_11950.Method_7417(exception.toString());
        }
    }

    protected void Method_11963(String string) {
        try {
            if (this.Field_11950.Field_7384 != null) {
                this.Field_11950.Field_7384.Method_7735(string);
            }
        }
        catch (Exception exception) {
            this.Field_11950.Method_7417(exception.toString());
        }
    }

    protected void Method_11964() {
        if (this.Field_11948 != null) {
            ErrorCode errorCode = this.Field_11950.Field_7390.clearBadgeData(this.Field_11952);
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                this.Field_11948 = null;
                try {
                    if (this.Field_11950.Field_7384 != null) {
                        this.Field_11950.Field_7384.Method_7744(this.Field_11952);
                    }
                }
                catch (Exception exception) {
                    this.Field_11950.Method_7417(exception.toString());
                }
            } else {
                this.Field_11950.Method_7417("Error releasing badge data: " + ErrorCode.getString((ErrorCode)errorCode));
            }
        }
    }

    public void Method_11965(String string, ChatEvent chatEvent, ChatChannelInfo chatChannelInfo) {
        switch (Class_18605.Field_18606[chatEvent.ordinal()]) {
            case 1: {
                this.Method_11959(Class_16003.Field_16005);
                this.Method_11963(string);
                break;
            }
            case 2: {
                this.Method_11970();
            }
        }
    }

    public Class_16003 Method_11966() {
        return this.Field_11953;
    }

    private void Method_11967() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_11968() {
        if (this.Field_11948 == null) {
            this.Field_11948 = new ChatBadgeData();
            ErrorCode errorCode = this.Field_11950.Field_7390.getBadgeData(this.Field_11952, this.Field_11948);
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                try {
                    if (this.Field_11950.Field_7384 != null) {
                        this.Field_11950.Field_7384.Method_7742(this.Field_11952);
                    }
                }
                catch (Exception exception) {
                    this.Field_11950.Method_7417(exception.toString());
                }
            } else {
                this.Field_11950.Method_7417("Error preparing badge data: " + ErrorCode.getString((ErrorCode)errorCode));
            }
        }
    }

    public void Method_11969(String string, ChatUserInfo[] arrchatUserInfo, ChatUserInfo[] arrchatUserInfo2, ChatUserInfo[] arrchatUserInfo3) {
        int n;
        int n2;
        for (n = 812 & 8192; n < arrchatUserInfo2.length; ++n) {
            n2 = this.Field_11951.indexOf((Object)arrchatUserInfo2[n]);
            if (n2 < 0) continue;
            this.Field_11951.remove(n2);
        }
        for (n = 540 & 23842; n < arrchatUserInfo3.length; ++n) {
            n2 = this.Field_11951.indexOf((Object)arrchatUserInfo3[n]);
            if (n2 >= 0) {
                this.Field_11951.remove(n2);
            }
            this.Field_11951.add(arrchatUserInfo3[n]);
        }
        for (n = -11572 & 1280; n < arrchatUserInfo.length; ++n) {
            this.Field_11951.add(arrchatUserInfo[n]);
        }
        try {
            if (this.Field_11950.Field_7384 != null) {
                this.Field_11950.Field_7384.Method_7734(this.Field_11952, arrchatUserInfo, arrchatUserInfo2, arrchatUserInfo3);
            }
        }
        catch (Exception exception) {
            this.Field_11950.Method_7417(exception.toString());
        }
    }

    private void Method_11970() {
        if (this.Field_11953 != Class_16003.Field_16008) {
            this.Method_11959(Class_16003.Field_16008);
            this.Method_11962(this.Field_11952);
            this.Method_11964();
        }
    }

    protected void Method_11971() {
        ErrorCode errorCode;
        if (this.Field_11950.Field_7393 != Class_22293.Field_22295 && this.Field_11948 == null && ErrorCode.failed((ErrorCode)(errorCode = this.Field_11950.Field_7390.downloadBadgeData(this.Field_11952)))) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[49 & 25997];
            arrobject[258 & 23568] = string;
            this.Field_11950.Method_7417(String.format("Error trying to download badge data: %s", arrobject));
        }
    }

    public boolean Method_11972() {
        switch (Class_18605.Field_18607[this.Field_11953.ordinal()]) {
            case 1: 
            case 2: {
                ErrorCode errorCode = this.Field_11950.Field_7390.disconnect(this.Field_11952);
                if (ErrorCode.failed((ErrorCode)errorCode)) {
                    String string = ErrorCode.getString((ErrorCode)errorCode);
                    Object[] arrobject = new Object[7 & -20735];
                    arrobject[10528 & 4224] = string;
                    this.Field_11950.Method_7417(String.format("Error disconnecting: %s", arrobject));
                    return (-31732 & 16449) != 0;
                }
                this.Method_11959(Class_16003.Field_16006);
                return (-22527 & 147) != 0;
            }
        }
        return (-32576 & 10244) != 0;
    }

    public void Method_11973(String string, ChatTokenizedMessage[] arrchatTokenizedMessage) {
        for (int i = 8192 & -32504; i < arrchatTokenizedMessage.length; ++i) {
            this.Field_11949.addLast(arrchatTokenizedMessage[i]);
        }
        try {
            if (this.Field_11950.Field_7384 != null) {
                this.Field_11950.Field_7384.Method_7737(this.Field_11952, arrchatTokenizedMessage);
            }
        }
        catch (Exception exception) {
            this.Field_11950.Method_7417(exception.toString());
        }
        while (this.Field_11949.size() > this.Field_11950.Field_7386) {
            this.Field_11949.removeFirst();
        }
    }

    public Class_11946(Class_7383 class_7383, String string) {
        this.Field_11950 = class_7383;
        this.Field_11952 = null;
        this.Field_11947 = 12 & 17536;
        this.Field_11953 = Class_16003.Field_16004;
        this.Field_11951 = Lists.newArrayList();
        this.Field_11954 = new LinkedList();
        this.Field_11949 = new LinkedList();
        this.Field_11948 = null;
        this.Field_11952 = string;
    }

    public void Method_11974(String string, ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Method_11968();
        }
    }
}

