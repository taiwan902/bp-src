/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.UserInfo
 *  tv.twitch.broadcast.VideoParams
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class Class_6823
implements IStreamCallbacks {
    final Class_37833 Field_6824;

    public void Method_6825(long l) {
        FrameBuffer frameBuffer = FrameBuffer.lookupBuffer((long)l);
        this.Field_6824.Field_37856.add(frameBuffer);
    }

    public void Method_6826(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            try {
                if (this.Field_6824.Field_37835 != null) {
                    this.Field_6824.Field_37835.Method_15806();
                }
            }
            catch (Exception exception) {
                this.Field_6824.Method_37901(exception.toString());
            }
            this.Field_6824.Method_37869(Class_32759.Field_32769);
        } else {
            this.Field_6824.Field_37862 = null;
            this.Field_6824.Field_37838 = null;
            this.Field_6824.Method_37869(Class_32759.Field_32766);
            try {
                if (this.Field_6824.Field_37835 != null) {
                    this.Field_6824.Field_37835.Method_15811(errorCode);
                }
            }
            catch (Exception exception) {
                this.Field_6824.Method_37901(exception.toString());
            }
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[21541 & 769];
            arrobject[4096 & 9873] = string;
            this.Field_6824.Method_37901(String.format("startCallback got failure: %s", arrobject));
        }
    }

    public void Method_6827(ErrorCode errorCode, AuthToken authToken) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_6824.Field_37839 = authToken;
            this.Field_6824.Method_37869(Class_32759.Field_32767);
        } else {
            this.Field_6824.Field_37839.data = "";
            this.Field_6824.Method_37869(Class_32759.Field_32764);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[11533 & -12287];
            arrobject[5124 & 16746] = string;
            this.Field_6824.Method_37901(String.format("RequestAuthTokenDoneCallback got failure: %s", arrobject));
        }
        try {
            if (this.Field_6824.Field_37835 != null) {
                this.Field_6824.Field_37835.Method_15813(errorCode, authToken);
            }
        }
        catch (Exception exception) {
            this.Field_6824.Method_37901(exception.toString());
        }
    }

    public void Method_6828(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[133 & 13059];
            arrobject[4296 & -23280] = string;
            this.Field_6824.Method_37876(String.format("SetStreamInfoCallback got failure: %s", arrobject));
        }
    }

    public void Method_6829(ErrorCode errorCode, UserInfo userInfo) {
        this.Field_6824.Field_37855 = userInfo;
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[2081 & -31615];
            arrobject[73 & 8214] = string;
            this.Field_6824.Method_37901(String.format("UserInfoDoneCallback got failure: %s", arrobject));
        }
    }

    public void Method_6830(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[25889 & 1];
            arrobject[1545 & -32752] = string;
            this.Field_6824.Method_37901(String.format("sendStartSpanMetaDataCallback got failure: %s", arrobject));
        }
    }

    public void Method_6831(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_6824.Field_37862 = null;
            this.Field_6824.Field_37838 = null;
            this.Field_6824.Method_37903();
            try {
                if (this.Field_6824.Field_37835 != null) {
                    this.Field_6824.Field_37835.Method_15814();
                }
            }
            catch (Exception exception) {
                this.Field_6824.Method_37901(exception.toString());
            }
            if (this.Field_6824.Field_37866) {
                this.Field_6824.Method_37869(Class_32759.Field_32766);
            } else {
                this.Field_6824.Method_37869(Class_32759.Field_32764);
            }
        } else {
            this.Field_6824.Method_37869(Class_32759.Field_32766);
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[4105 & 9447];
            arrobject[10803 & 16576] = string;
            this.Field_6824.Method_37901(String.format("stopCallback got failure: %s", arrobject));
        }
    }

    public void Method_6832(ErrorCode errorCode, ChannelInfo channelInfo) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_6824.Field_37841 = channelInfo;
            this.Field_6824.Method_37869(Class_32759.Field_32761);
            this.Field_6824.Field_37866 = -32767 & 1281;
        } else {
            this.Field_6824.Method_37869(Class_32759.Field_32764);
            this.Field_6824.Field_37866 = 467 & 24576;
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[10401 & 4165];
            arrobject[5002 & 2048] = string;
            this.Field_6824.Method_37901(String.format("LoginCallback got failure: %s", arrobject));
        }
        try {
            if (this.Field_6824.Field_37835 != null) {
                this.Field_6824.Field_37835.Method_15808(errorCode);
            }
        }
        catch (Exception exception) {
            this.Field_6824.Method_37901(exception.toString());
        }
    }

    public void Method_6833(ErrorCode errorCode, StreamInfo streamInfo) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_6824.Field_37843 = streamInfo;
            try {
                if (this.Field_6824.Field_37835 != null) {
                    this.Field_6824.Field_37835.Method_15807(streamInfo);
                }
            }
            catch (Exception exception) {
                this.Field_6824.Method_37901(exception.toString());
            }
        } else {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[-32575 & 261];
            arrobject[2218 & -19135] = string;
            this.Field_6824.Method_37876(String.format("StreamInfoDoneCallback got failure: %s", arrobject));
        }
    }

    public void Method_6834(ErrorCode errorCode, GameInfoList gameInfoList) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[-14271 & 12321];
            arrobject[9395 & 2048] = string;
            this.Field_6824.Method_37901(String.format("GameNameListCallback got failure: %s", arrobject));
        }
        try {
            if (this.Field_6824.Field_37835 != null) {
                this.Field_6824.Field_37835.Method_15805(errorCode, gameInfoList == null ? new GameInfo[1077 & 12480] : gameInfoList.list);
            }
        }
        catch (Exception exception) {
            this.Field_6824.Method_37901(exception.toString());
        }
    }

    Class_6823(Class_37833 class_37833) {
        this.Field_6824 = class_37833;
    }

    private void Method_6835() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_6836(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[-12271 & 8481];
            arrobject[774 & -6031] = string;
            this.Field_6824.Method_37901(String.format("sendEndSpanMetaDataCallback got failure: %s", arrobject));
        }
    }

    public void Method_6837(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[1121 & 661];
            arrobject[272 & 10888] = string;
            this.Field_6824.Method_37876(String.format("RunCommercialCallback got failure: %s", arrobject));
        }
    }

    public void Method_6838(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[-32627 & 4643];
            arrobject[52 & 16520] = string;
            this.Field_6824.Method_37901(String.format("sendActionMetaDataCallback got failure: %s", arrobject));
        }
    }

    public void Method_6839(ErrorCode errorCode, ArchivingState archivingState) {
        this.Field_6824.Field_37864 = archivingState;
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            // empty if block
        }
    }

    public void Method_6840(ErrorCode errorCode, IngestList ingestList) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_6824.Field_37848 = ingestList;
            this.Field_6824.Field_37836 = this.Field_6824.Field_37848.getDefaultServer();
            this.Field_6824.Method_37869(Class_32759.Field_32760);
            try {
                if (this.Field_6824.Field_37835 != null) {
                    this.Field_6824.Field_37835.Method_15804(ingestList);
                }
            }
            catch (Exception exception) {
                this.Field_6824.Method_37901(exception.toString());
            }
        } else {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[-31743 & 4225];
            arrobject[5137 & 16386] = string;
            this.Field_6824.Method_37901(String.format("IngestListCallback got failure: %s", arrobject));
            this.Field_6824.Method_37869(Class_32759.Field_32774);
        }
    }
}

