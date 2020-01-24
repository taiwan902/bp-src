/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Maps
 *  com.mojang.authlib.properties.Property
 *  internal.org.lwjgl.opengl.GL11
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  tv.twitch.AuthToken
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.GameInfo
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.VideoParams
 *  tv.twitch.chat.ChatRawMessage
 *  tv.twitch.chat.ChatTokenizedMessage
 *  tv.twitch.chat.ChatUserInfo
 *  tv.twitch.chat.ChatUserMode
 *  tv.twitch.chat.ChatUserSubscription
 */
import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.mojang.authlib.properties.Property;
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class Class_28018
implements Class_1821,
Class_15803,
Class_17499,
Class_7731 {
    private boolean Field_28019 = 16384 & 65;
    private boolean Field_28020;
    private boolean Field_28021;
    private static final Logger Field_28022 = LogManager.getLogger();
    private boolean Field_28023;
    private final Class_18 Field_28024;
    private Class_19135 Field_28025;
    private final Class_7383 Field_28026;
    public static final Marker Field_28027 = MarkerManager.getMarker((String)Class_28018.Method_28060("\ua241\ua243\ua242\ua250\ua257\ua25e"));
    private Class_25596 Field_28028 = Class_25596.Field_25598;
    private String Field_28029;
    private final Class_1782 Field_28030 = new Class_2840("Twitch");
    private static boolean Field_28031;
    private long Field_28032 = 571760984L & 6466195121301426692L;
    private final Class_37833 Field_28033;
    private boolean Field_28034;
    private int Field_28035 = 16414 & 4190;
    private final Map Field_28036 = Maps.newHashMap();

    public void Method_28037(Class_33547 class_33547) {
    }

    public boolean Method_28038() {
        int n = this.Field_28024.Field_84.Field_39809 == (-32751 & 1441) ? 131 & -6895 : -16126 & 11808;
        return (this.Field_28034 || this.Field_28024.Field_84.Field_39862 <= 0.0f || n != this.Field_28021 ? 15477 & 769 : 12626 & 12) != 0;
    }

    public void Method_28039() {
    }

    public boolean Method_28040() {
        return this.Field_28033.Method_37873();
    }

    public boolean Method_28041() {
        return this.Field_28023;
    }

    public void Method_28042(String string, ChatUserInfo[] arrchatUserInfo, ChatUserInfo[] arrchatUserInfo2, ChatUserInfo[] arrchatUserInfo3) {
        ChatUserInfo chatUserInfo;
        int n;
        ChatUserInfo[] arrchatUserInfo4 = arrchatUserInfo2;
        int n2 = arrchatUserInfo4.length;
        for (n = 3593 & -16368; n < n2; ++n) {
            chatUserInfo = arrchatUserInfo4[n];
            this.Field_28036.remove(chatUserInfo.displayName);
        }
        arrchatUserInfo4 = arrchatUserInfo3;
        n2 = arrchatUserInfo4.length;
        for (n = 132 & 4121; n < n2; ++n) {
            chatUserInfo = arrchatUserInfo4[n];
            this.Field_28036.put(chatUserInfo.displayName, chatUserInfo);
        }
        arrchatUserInfo4 = arrchatUserInfo;
        n2 = arrchatUserInfo4.length;
        for (n = 8196 & -9488; n < n2; ++n) {
            chatUserInfo = arrchatUserInfo4[n];
            this.Field_28036.put(chatUserInfo.displayName, chatUserInfo);
        }
    }

    private static String Method_28043(String string) {
        int n = 437;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public boolean Method_28044() {
        return (Field_28031 && this.Field_28033.Method_37881() ? 675 & 77 : 16408 & -23418) != 0;
    }

    static Class_7383 Method_28045(Class_28018 class_28018) {
        return class_28018.Field_28026;
    }

    public void Method_28046() {
        Class_39702 class_39702 = this.Field_28024.Field_84;
        VideoParams videoParams = this.Field_28033.Method_37886(Class_28018.Method_28072(class_39702.Field_39838), Class_28018.Method_28075(class_39702.Field_39742), Class_28018.Method_28066(class_39702.Field_39834), (float)this.Field_28024.Field_80 / (float)this.Field_28024.Field_44);
        switch (class_39702.Field_39727) {
            case 0: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
                break;
            }
            case 1: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
                break;
            }
            case 2: {
                videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
            }
        }
        if (this.Field_28025 == null) {
            this.Field_28025 = new Class_19135(videoParams.outputWidth, videoParams.outputHeight, (12368 & -32093) != 0);
        } else {
            this.Field_28025.Method_19156(videoParams.outputWidth, videoParams.outputHeight);
        }
        if (class_39702.Field_39777 != null && class_39702.Field_39777.length() > 0) {
            IngestServer[] arringestServer = this.Method_28098();
            int n = arringestServer.length;
            for (int i = 2080 & -7936; i < n; ++i) {
                IngestServer ingestServer = arringestServer[i];
                if (!ingestServer.serverUrl.equals(class_39702.Field_39777)) continue;
                this.Field_28033.Method_37888(ingestServer);
                break;
            }
        }
        this.Field_28035 = videoParams.targetFps;
        this.Field_28020 = class_39702.Field_39806;
        this.Field_28033.Method_37898(videoParams);
        Object[] arrobject = new Object[4260 & 518];
        arrobject[-32256 & 21960] = videoParams.outputWidth;
        arrobject[24137 & -24285] = videoParams.outputHeight;
        arrobject[16426 & 215] = videoParams.maxKbps;
        arrobject[-22381 & 103] = this.Field_28033.Method_37911().serverUrl;
        Field_28022.info(Field_28027, "Streaming at {}/{} at {} kbps to {}", arrobject);
        this.Field_28033.Method_37908(null, "Minecraft", null);
    }

    protected void Method_28047() {
        String string;
        Class_33547 class_33547 = this.Field_28026.Method_7412();
        this.Field_28029 = string = this.Field_28033.Method_37891().name;
        if (class_33547 != Class_33547.Field_33552) {
            Object[] arrobject = new Object[-31229 & 14493];
            arrobject[4628 & 24800] = class_33547;
            Field_28022.warn("Invalid twitch chat state {}", arrobject);
        } else if (this.Field_28026.Method_7407(this.Field_28029) == Class_16003.Field_16008) {
            this.Field_28026.Method_7404(string);
        } else {
            Object[] arrobject = new Object[10501 & 1539];
            arrobject[16730 & 6272] = class_33547;
            Field_28022.warn("Invalid twitch chat state {}", arrobject);
        }
    }

    public void Method_28048(String string, String string2) {
    }

    public void Method_28049() {
        int n;
        int n2 = this.Field_28024.Field_84.Field_39812;
        int n3 = this.Field_28029 != null && this.Field_28026.Method_7402(this.Field_28029) ? 8905 & -16111 : 709 & 21546;
        int n4 = n = this.Field_28026.Method_7412() == Class_33547.Field_33552 && (this.Field_28029 == null || this.Field_28026.Method_7407(this.Field_28029) == Class_16003.Field_16008) ? 2499 & 16433 : 24605 & 4290;
        if (n2 == (-29934 & 28846)) {
            if (n3 != 0) {
                Field_28022.debug(Field_28027, "Disconnecting from twitch chat per user options");
                this.Field_28026.Method_7420(this.Field_28029);
            }
        } else if (n2 == (4259 & 24605)) {
            if (n != 0 && this.Field_28033.Method_37879()) {
                Field_28022.debug(Field_28027, "Connecting to twitch chat per user options");
                this.Method_28047();
            }
        } else if (n2 == 0) {
            if (n3 != 0 && !this.Method_28086()) {
                Field_28022.debug(Field_28027, "Disconnecting from twitch chat as user is no longer streaming");
                this.Field_28026.Method_7420(this.Field_28029);
            } else if (n != 0 && this.Method_28086()) {
                Field_28022.debug(Field_28027, "Connecting to twitch chat as user is streaming");
                this.Method_28047();
            }
        }
        this.Field_28033.Method_37893();
        this.Field_28026.Method_7403();
    }

    static Logger Method_28050() {
        return Field_28022;
    }

    public void Method_28051() {
    }

    public boolean Method_28052() {
        return this.Field_28033.Method_37879();
    }

    public void Method_28053(Class_38064 class_38064, long l) {
        if (this.Method_28086() && this.Field_28020) {
            long l2 = this.Field_28033.Method_37872();
            if (!this.Field_28033.Method_37867(class_38064.Method_38074(), l2 + l, class_38064.Method_38071(), class_38064.Method_38073())) {
                Object[] arrobject = new Object[19598 & 4098];
                arrobject[1686 & -24255] = l2 + l;
                arrobject[77 & -23295] = class_38064;
                Field_28022.warn(Field_28027, "Couldn't send stream metadata action at {}: {}", arrobject);
            } else {
                Object[] arrobject = new Object[5258 & 16918];
                arrobject[608 & 21908] = l2 + l;
                arrobject[14469 & 1137] = class_38064;
                Field_28022.debug(Field_28027, "Sent stream metadata action at {}: {}", arrobject);
            }
        }
    }

    public void Method_28054() {
        Field_28022.info(Field_28027, "Logged out of twitch");
    }

    private static String Method_28055(String string) {
        int n = 20460;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28056(ErrorCode errorCode, GameInfo[] arrgameInfo) {
    }

    private static String Method_28057(String string) {
        int n = 10856;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28058() {
        if (this.Field_28033.Method_37902() && !this.Field_28033.Method_37873()) {
            int n;
            long l;
            long l2 = System.nanoTime();
            long l3 = l2 - this.Field_28032;
            int n2 = n = l3 >= (l = (long)((1000000000 & 1000274454) / this.Field_28035)) ? -32703 & 281 : 8624 & 17409;
            if (n != 0) {
                FrameBuffer frameBuffer = this.Field_28033.Method_37882();
                Class_19135 class_19135 = this.Field_28024.Method_164();
                this.Field_28025.Method_19152((5187 & 10401) != 0);
                Class_16867.Method_16934(22353 & 5897);
                Class_16867.Method_16961();
                Class_16867.Method_16962();
                Class_16867.Method_16911(0.0, this.Field_28025.Field_19140, this.Field_28025.Field_19136, 0.0, 1.962962962962963 * 509.4339622641509, 1833.3333333333333 * 1.6363636363636365);
                Class_16867.Method_16934(7938 & 5984);
                Class_16867.Method_16961();
                Class_16867.Method_16962();
                Class_16867.Method_16943(0.0f, 0.0f, -424.2424f * 4.714286f);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, 1.0f);
                Class_16867.Method_16910(1095 & 384, 2304 & 3, this.Field_28025.Field_19140, this.Field_28025.Field_19136);
                Class_16867.Method_16965();
                Class_16867.Method_16985();
                Class_16867.Method_16952();
                float f = this.Field_28025.Field_19140;
                float f2 = this.Field_28025.Field_19136;
                float f3 = (float)class_19135.Field_19140 / (float)class_19135.Field_19142;
                float f4 = (float)class_19135.Field_19136 / (float)class_19135.Field_19141;
                class_19135.Method_19153();
                GL11.glTexParameterf((int)(4065 & -29195), (int)(10261 & 11561), (float)(0.7741935f * 12566.625f));
                GL11.glTexParameterf((int)(11763 & -29211), (int)(-6062 & 10404), (float)(0.2247191f * 43294.05f));
                Class_7644 class_7644 = Class_7644.Method_7649();
                Class_22385 class_22385 = class_7644.Method_7648();
                class_22385.Method_22417(16487 & 2071, Class_29585.Field_29598);
                class_22385.Method_22443(0.0, f2, 0.0).Method_22433(0.0, f4).Method_22451();
                class_22385.Method_22443(f, f2, 0.0).Method_22433(f3, f4).Method_22451();
                class_22385.Method_22443(f, 0.0, 0.0).Method_22433(f3, 0.0).Method_22451();
                class_22385.Method_22443(0.0, 0.0, 0.0).Method_22433(0.0, 0.0).Method_22451();
                class_7644.Method_7647();
                class_19135.Method_19147();
                Class_16867.Method_16945();
                Class_16867.Method_16934(-18679 & 5953);
                Class_16867.Method_16945();
                Class_16867.Method_16934(5967 & -18640);
                this.Field_28033.Method_37899(frameBuffer);
                this.Field_28025.Method_19155();
                this.Field_28033.Method_37890(frameBuffer);
                this.Field_28032 = l2;
            }
        }
    }

    private void Method_28059() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_28060(String string) {
        int n = 6626;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28061() {
        if (this.Field_28033.Method_37896()) {
            Field_28022.debug(Field_28027, "Requested commercial from Twitch");
        } else {
            Field_28022.warn(Field_28027, "Could not request commercial from Twitch");
        }
    }

    public void Method_28062(ErrorCode errorCode) {
        if (errorCode == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED) {
            Class_2849 class_2849 = new Class_2849("stream.unavailable.soundflower.chat.link", new Object[864 & 12305]);
            class_2849.Method_1789().Method_2915(new Class_21230(Class_17245.Field_17248, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
            class_2849.Method_1789().Method_2945((16453 & 1707) != 0);
            Object[] arrobject = new Object[4289 & 263];
            arrobject[-32032 & 10496] = class_2849;
            Class_2849 class_28492 = new Class_2849("stream.unavailable.soundflower.chat", arrobject);
            class_28492.Method_1789().Method_2917(Class_5478.Field_5502);
            this.Field_28024.Field_105.Method_45458().Method_41188(class_28492);
        } else {
            Object[] arrobject = new Object[-22461 & 16573];
            arrobject[264 & -32761] = ErrorCode.getString((ErrorCode)errorCode);
            Class_2849 class_2849 = new Class_2849("stream.unavailable.unknown.chat", arrobject);
            class_2849.Method_1789().Method_2917(Class_5478.Field_5502);
            this.Field_28024.Field_105.Method_45458().Method_41188(class_2849);
        }
    }

    public void Method_28063() {
        Field_28022.info(Field_28027, "Broadcast to Twitch has stopped");
    }

    public void Method_28064(Class_32759 class_32759) {
        Object[] arrobject = new Object[21081 & -30715];
        arrobject[-31184 & 18817] = class_32759;
        Field_28022.debug(Field_28027, "Broadcast state changed to {}", arrobject);
        if (class_32759 == Class_32759.Field_32764) {
            this.Field_28033.Method_37869(Class_32759.Field_32767);
        }
    }

    public boolean Method_28065() {
        return this.Field_28033.Method_37868();
    }

    public static float Method_28066(float f) {
        return 1.0434783f * 0.09583334f + f * (0.89f * 0.11235955f);
    }

    public String Method_28067() {
        return this.Field_28029;
    }

    private static String Method_28068(String string) {
        int n = 19493;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28069() {
        if (this.Field_28033.Method_37878()) {
            Field_28022.info(Field_28027, "Stopped streaming to Twitch");
        } else {
            Field_28022.warn(Field_28027, "Could not stop streaming to Twitch");
        }
    }

    private static String Method_28070(String string) {
        int n = 19304;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 8);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_28018(Class_18 class_18, Property property) {
        this.Field_28024 = class_18;
        this.Field_28033 = new Class_37833();
        this.Field_28026 = new Class_7383();
        this.Field_28033.Method_37887(this);
        this.Field_28026.Method_7411(this);
        this.Field_28033.Method_37877("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.Field_28026.Method_7409("nmt37qblda36pvonovdkbopzfzw3wlq");
        this.Field_28030.Method_1789().Method_2917(Class_5478.Field_5484);
        if (property != null && !Strings.isNullOrEmpty((String)property.getValue()) && Class_32876.Field_32879) {
            Class_23477 class_23477 = new Class_23477(this, "Twitch authenticator", property);
            class_23477.setDaemon((17037 & 11265) != 0);
            class_23477.start();
        }
    }

    public void Method_28071(Class_36089 class_36089, Class_22345 class_22345) {
        Object[] arrobject = new Object[-32765 & 1393];
        arrobject[3156 & 24960] = class_22345;
        Field_28022.debug(Field_28027, "Ingest test state changed to {}", arrobject);
        if (class_22345 == Class_22345.Field_22353) {
            this.Field_28019 = 16643 & -31147;
        }
    }

    public static int Method_28072(float f) {
        return Class_13337.Method_13377(348.59375f * 0.6597938f + f * (192.35294f * 17.0f));
    }

    public void Method_28073() {
        this.Field_28033.Method_37875();
        this.Field_28034 = 4096 & 1226;
        this.Method_28083();
    }

    public void Method_28074(StreamInfo streamInfo) {
        Object[] arrobject = new Object[5762 & 111];
        arrobject[-30240 & 1025] = streamInfo.viewers;
        arrobject[8641 & 39] = streamInfo.streamId;
        Field_28022.debug(Field_28027, "Stream info updated; {} viewers on stream ID {}", arrobject);
    }

    public static int Method_28075(float f) {
        return Class_13337.Method_13377(25.185186f * 0.3970588f + f * (1.5166667f * 32.967033f));
    }

    public void Method_28076(boolean bl) {
        this.Field_28021 = bl;
        this.Method_28083();
    }

    public ErrorCode Method_28077() {
        return !Field_28031 ? ErrorCode.TTV_EC_OS_TOO_OLD : this.Field_28033.Method_37889();
    }

    public void Method_28078() {
        Class_36089 class_36089 = this.Field_28033.Method_37884();
        if (class_36089 != null) {
            class_36089.Method_36125(this);
        }
    }

    public void Method_28079(ErrorCode errorCode) {
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            Field_28022.debug(Field_28027, "Login attempt successful");
            this.Field_28023 = 8333 & 2881;
        } else {
            Object[] arrobject = new Object[16470 & 7179];
            arrobject[8236 & -28653] = ErrorCode.getString((ErrorCode)errorCode);
            arrobject[193 & -23283] = errorCode.getValue();
            Field_28022.warn(Field_28027, "Login attempt unsuccessful: {} (error code {})", arrobject);
            this.Field_28023 = -32720 & 1797;
        }
    }

    public Class_36089 Method_28080() {
        return this.Field_28033.Method_37871();
    }

    public void Method_28081(Class_38064 class_38064, long l, long l2) {
        if (this.Method_28086() && this.Field_28020) {
            long l3 = this.Field_28033.Method_37872();
            String string = class_38064.Method_38071();
            String string2 = class_38064.Method_38073();
            long l4 = this.Field_28033.Method_37897(class_38064.Method_38074(), l3 + l, string, string2);
            if (l4 < (20460551L & -5121091816786624072L)) {
                Object[] arrobject = new Object[-32749 & 17027];
                arrobject[17256 & 13330] = l3 + l;
                arrobject[1201 & 2893] = l3 + l2;
                arrobject[-15550 & 2107] = class_38064;
                Field_28022.warn(Field_28027, "Could not send stream metadata sequence from {} to {}: {}", arrobject);
            } else if (this.Field_28033.Method_37895(class_38064.Method_38074(), l3 + l2, l4, string, string2)) {
                Object[] arrobject = new Object[27667 & -27965];
                arrobject[1755 & 10496] = l3 + l;
                arrobject[33 & -28285] = l3 + l2;
                arrobject[4098 & 25874] = class_38064;
                Field_28022.debug(Field_28027, "Sent stream metadata sequence from {} to {}: {}", arrobject);
            } else {
                Object[] arrobject = new Object[4115 & -31225];
                arrobject[16448 & 10752] = l3 + l;
                arrobject[6553 & 16449] = l3 + l2;
                arrobject[2 & 21446] = class_38064;
                Field_28022.warn(Field_28027, "Half-sent stream metadata sequence from {} to {}: {}", arrobject);
            }
        }
    }

    private static String Method_28082(String string) {
        int n = 23185;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28083() {
        if (this.Method_28086()) {
            float f = this.Field_28024.Field_84.Field_39805;
            int n = this.Field_28034 || f <= 0.0f ? -28607 & 2085 : 18 & 21280;
            this.Field_28033.Method_37874(n != 0 ? 0.0f : f);
            this.Field_28033.Method_37905(this.Method_28038() ? 0.0f : this.Field_28024.Field_84.Field_39862);
        }
    }

    public void Method_28084(ErrorCode errorCode) {
        Object[] arrobject = new Object[4098 & -32173];
        arrobject[4621 & -16192] = ErrorCode.getString((ErrorCode)errorCode);
        arrobject[-31399 & 6147] = errorCode.getValue();
        Field_28022.warn(Field_28027, "Issue submitting frame: {} (Error code {})", arrobject);
        this.Field_28024.Field_105.Method_45458().Method_41172(new Class_2840("Issue streaming frame: " + (Object)errorCode + " (" + ErrorCode.getString((ErrorCode)errorCode) + ")"), 6210 & 6);
    }

    public ChatUserInfo Method_28085(String string) {
        return (ChatUserInfo)this.Field_28036.get(string);
    }

    public boolean Method_28086() {
        return this.Field_28033.Method_37902();
    }

    public void Method_28087(String string) {
        this.Field_28026.Method_7410(this.Field_28029, string);
    }

    public boolean Method_28088() {
        return (this.Field_28029 != null && this.Field_28029.equals(this.Field_28033.Method_37891().name) ? 29 & 2049 : 8293 & 3584) != 0;
    }

    public void Method_28089(String string) {
    }

    public void Method_28090(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            Field_28022.error(Field_28027, "Chat failed to shutdown");
        }
    }

    private boolean Method_28091(Set set, Set set2, int n) {
        return (set.contains((Object)ChatUserMode.TTV_CHAT_USERMODE_BANNED) ? -24576 & 21959 : (set.contains((Object)ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR) ? 21249 & 2065 : (set.contains((Object)ChatUserMode.TTV_CHAT_USERMODE_MODERATOR) ? 10561 & 525 : (set.contains((Object)ChatUserMode.TTV_CHAT_USERMODE_STAFF) ? -24319 & 17433 : (n == 0 ? 15425 & 13 : (n == (649 & 2055) ? (int)(set2.contains((Object)ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER) ? 1 : 0) : 769 & 8228)))))) != 0;
    }

    public void Method_28092(String string) {
        Field_28022.debug(Field_28027, "Chat disconnected");
        this.Field_28036.clear();
    }

    public void Method_28093(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            Field_28022.error(Field_28027, "Chat failed to initialize");
        }
    }

    static Class_25596 Method_28094(Class_28018 class_28018, Class_25596 class_25596) {
        class_28018.Field_28028 = class_25596;
        return class_28018.Field_28028;
    }

    public void Method_28095(ErrorCode errorCode, AuthToken authToken) {
    }

    public void Method_28096(IngestList ingestList) {
    }

    public void Method_28097(String string, ChatTokenizedMessage[] arrchatTokenizedMessage) {
    }

    public IngestServer[] Method_28098() {
        return this.Field_28033.Method_37870().getServers();
    }

    public void Method_28099() {
        this.Method_28083();
        Field_28022.info(Field_28027, "Broadcast to Twitch has started");
    }

    private void Method_28100(String string, ChatRawMessage chatRawMessage) {
        ChatUserInfo chatUserInfo = (ChatUserInfo)this.Field_28036.get(string);
        if (chatUserInfo == null) {
            chatUserInfo = new ChatUserInfo();
            chatUserInfo.displayName = string;
            this.Field_28036.put(string, chatUserInfo);
        }
        chatUserInfo.subscriptions = chatRawMessage.subscriptions;
        chatUserInfo.modes = chatRawMessage.modes;
        chatUserInfo.nameColorARGB = chatRawMessage.nameColorARGB;
    }

    public void Method_28101(String string, ChatRawMessage[] arrchatRawMessage) {
        ChatRawMessage[] arrchatRawMessage2 = arrchatRawMessage;
        int n = arrchatRawMessage2.length;
        for (int i = 21768 & 8839; i < n; ++i) {
            ChatRawMessage chatRawMessage = arrchatRawMessage2[i];
            this.Method_28100(chatRawMessage.userName, chatRawMessage);
            if (!this.Method_28091(chatRawMessage.modes, chatRawMessage.subscriptions, this.Field_28024.Field_84.Field_39853)) continue;
            Class_2840 class_2840 = new Class_2840(chatRawMessage.userName);
            Object[] arrobject = new Object[595 & 1067];
            arrobject[19587 & 8264] = this.Field_28030;
            arrobject[-32215 & 3077] = class_2840;
            arrobject[5763 & -16346] = Class_5478.Method_5555(chatRawMessage.message);
            Class_2849 class_2849 = new Class_2849("chat.stream." + (chatRawMessage.action ? "emote" : "text"), arrobject);
            if (chatRawMessage.action) {
                class_2849.Method_1789().Method_2928((2053 & 25113) != 0);
            }
            Class_2840 class_28402 = new Class_2840("");
            class_28402.Method_1787(new Class_2849("stream.userinfo.chatTooltip", new Object[1216 & 2049]));
            for (Class_1782 class_1782 : Class_45878.Method_45893(chatRawMessage.modes, chatRawMessage.subscriptions, null)) {
                class_28402.Method_1785("\n");
                class_28402.Method_1787(class_1782);
            }
            class_2840.Method_1789().Method_2936(new Class_44868(Class_14202.Field_14205, class_28402));
            class_2840.Method_1789().Method_2915(new Class_21230(Class_17245.Field_17251, chatRawMessage.userName));
            this.Field_28024.Field_105.Method_45458().Method_41188(class_2849);
        }
    }

    public void Method_28102(String string) {
    }

    public Class_25596 Method_28103() {
        return this.Field_28028;
    }

    static {
        try {
            if (Class_2090.Method_2091() == Class_2094.Field_2099) {
                System.loadLibrary(Class_28018.Method_28057("\u02a4\u02a1\u02a0\u02a1\u02a4\u02a1\u02e0\u02a1\u02a1\u02a1\u02e0\u02e0\u02e4"));
                System.loadLibrary(Class_28018.Method_28104("\u1082\u1082\u1081\u1082\u1082\u1080\u108a\u1083\u1089\u1080\u108a\u1083\u1081\u1083\u108a\u1083"));
                System.loadLibrary(Class_28018.Method_28055("\u0004\u0001\u0000\u0005\u0004\u0005\u0000\u0005\u0004\u0005\u0004\u0005\u0000\u0001"));
                if (System.getProperty(Class_28018.Method_28043("\u2a00\u2a08\u2a00\u2a0a\u2a0c\u2a0c\u2a06")).contains(Class_28018.Method_28068("\u2482\u2480"))) {
                    System.loadLibrary(Class_28018.Method_28082("\u4102\u4103\u4108\u4103\u410c\u4117\u411c\u411d\u4150\u4153"));
                } else {
                    System.loadLibrary(Class_28018.Method_28070("\u0210\u0215\u0214\u0211\u0210\u0204\u0205\u0201\u024d\u024c"));
                }
            }
            Field_28031 = -29183 & 24769;
        }
        catch (Throwable throwable) {
            Field_28031 = 2058 & 17412;
        }
    }

    private static String Method_28104(String string) {
        int n = 12818;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_28018.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_28105(String string) {
        Field_28022.debug(Field_28027, "Chat connected");
    }

    public void Method_28106() {
        Field_28022.debug(Field_28027, "Shutdown streaming");
        this.Field_28033.Method_37907();
        this.Field_28026.Method_7419();
    }

    public boolean Method_28107() {
        return this.Field_28033.Method_37885();
    }

    static Class_37833 Method_28108(Class_28018 class_28018) {
        return class_28018.Field_28033;
    }

    public void Method_28109() {
        this.Field_28033.Method_37913();
        this.Field_28034 = 9477 & 6315;
        this.Method_28083();
    }
}

