/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.Core
 *  tv.twitch.ErrorCode
 *  tv.twitch.chat.Chat
 *  tv.twitch.chat.IChatAPIListener
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.IChatAPIListener;

public class Class_21744
implements IChatAPIListener {
    final Class_7383 Field_21745;

    public void Method_21746(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_21745.Method_7406();
        }
    }

    private void Method_21747() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_21748(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_21745.Field_7390.setMessageFlushInterval(this.Field_21745.Field_7396);
            this.Field_21745.Field_7390.setUserChangeEventInterval(this.Field_21745.Field_7388);
            this.Field_21745.Method_7421();
            this.Field_21745.Method_7401(Class_33547.Field_33552);
        } else {
            this.Field_21745.Method_7401(Class_33547.Field_33548);
        }
        try {
            if (this.Field_21745.Field_7384 != null) {
                this.Field_21745.Field_7384.Method_7738(errorCode);
            }
        }
        catch (Exception exception) {
            this.Field_21745.Method_7417(exception.toString());
        }
    }

    public void Method_21749(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            ErrorCode errorCode2 = this.Field_21745.Field_7385.shutdown();
            if (ErrorCode.failed((ErrorCode)errorCode2)) {
                String string = ErrorCode.getString((ErrorCode)errorCode2);
                Object[] arrobject = new Object[4129 & -30695];
                arrobject[2816 & 8330] = string;
                this.Field_21745.Method_7417(String.format("Error shutting down the Twitch sdk: %s", arrobject));
            }
            this.Field_21745.Method_7401(Class_33547.Field_33548);
        } else {
            this.Field_21745.Method_7401(Class_33547.Field_33552);
            Object[] arrobject = new Object[115 & 16385];
            arrobject[1028 & -28416] = errorCode;
            this.Field_21745.Method_7417(String.format("Error shutting down Twith chat: %s", arrobject));
        }
        try {
            if (this.Field_21745.Field_7384 != null) {
                this.Field_21745.Field_7384.Method_7733(errorCode);
            }
        }
        catch (Exception exception) {
            this.Field_21745.Method_7417(exception.toString());
        }
    }

    Class_21744(Class_7383 class_7383) {
        this.Field_21745 = class_7383;
    }
}

