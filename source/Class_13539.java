/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.GameInfoList
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.UserInfo
 */
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

public class Class_13539
implements IStreamCallbacks {
    final Class_36089 Field_13540;

    public void Method_13541(long l) {
    }

    public void Method_13542(ErrorCode errorCode) {
    }

    public void Method_13543(ErrorCode errorCode) {
    }

    public void Method_13544(ErrorCode errorCode, GameInfoList gameInfoList) {
    }

    Class_13539(Class_36089 class_36089) {
        this.Field_13540 = class_36089;
    }

    public void Method_13545(ErrorCode errorCode, StreamInfo streamInfo) {
    }

    public void Method_13546(ErrorCode errorCode) {
    }

    public void Method_13547(ErrorCode errorCode) {
    }

    private void Method_13548() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_13549(ErrorCode errorCode) {
        this.Field_13540.Field_36114 = -31360 & 2096;
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_13540.Field_36103 = 16909 & 4417;
            this.Field_13540.Field_36095 = System.currentTimeMillis();
            this.Field_13540.Method_36122(Class_22345.Field_22355);
        } else {
            this.Field_13540.Field_36105 = 8841 & 16416;
            this.Field_13540.Method_36122(Class_22345.Field_22350);
        }
    }

    public void Method_13550(ErrorCode errorCode) {
    }

    public void Method_13551(ErrorCode errorCode, ArchivingState archivingState) {
    }

    public void Method_13552(ErrorCode errorCode, IngestList ingestList) {
    }

    public void Method_13553(ErrorCode errorCode, UserInfo userInfo) {
    }

    public void Method_13554(ErrorCode errorCode, ChannelInfo channelInfo) {
    }

    public void Method_13555(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            System.out.println("IngestTester.stopCallback failed to stop - " + this.Field_13540.Field_36093.serverName + ": " + errorCode.toString());
        }
        this.Field_13540.Field_36115 = 21149 & -30622;
        this.Field_13540.Field_36103 = 25 & -32638;
        this.Field_13540.Method_36122(Class_22345.Field_22350);
        this.Field_13540.Field_36093 = null;
        if (this.Field_13540.Field_36092) {
            this.Field_13540.Method_36122(Class_22345.Field_22352);
        }
    }

    public void Method_13556(ErrorCode errorCode, AuthToken authToken) {
    }
}

