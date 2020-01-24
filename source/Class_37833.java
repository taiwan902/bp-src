/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  tv.twitch.AuthToken
 *  tv.twitch.Core
 *  tv.twitch.CoreAPI
 *  tv.twitch.ErrorCode
 *  tv.twitch.MessageLevel
 *  tv.twitch.StandardCoreAPI
 *  tv.twitch.broadcast.ArchivingState
 *  tv.twitch.broadcast.AudioDeviceType
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.ChannelInfo
 *  tv.twitch.broadcast.DesktopStreamAPI
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.PixelFormat
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.StreamAPI
 *  tv.twitch.broadcast.StreamInfo
 *  tv.twitch.broadcast.StreamInfoForSetting
 *  tv.twitch.broadcast.UserInfo
 *  tv.twitch.broadcast.VideoParams
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.CoreAPI;
import tv.twitch.ErrorCode;
import tv.twitch.MessageLevel;
import tv.twitch.StandardCoreAPI;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamAPI;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.StreamInfoForSetting;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class Class_37833 {
    protected IStatCallbacks Field_37834 = new Class_16698(this);
    protected Class_15803 Field_37835 = null;
    protected IngestServer Field_37836 = null;
    protected Class_32759 Field_37837 = Class_32759.Field_32765;
    protected AudioParams Field_37838 = null;
    protected AuthToken Field_37839 = new AuthToken();
    private String Field_37840 = null;
    protected ChannelInfo Field_37841 = new ChannelInfo();
    private static final Logger Field_37842 = LogManager.getLogger();
    protected StreamInfo Field_37843 = new StreamInfo();
    private ErrorCode Field_37844;
    protected final int Field_37845 = 22787 & 151;
    protected Stream Field_37846 = null;
    protected boolean Field_37847 = 659 & -21495;
    protected IngestList Field_37848 = new IngestList(new IngestServer[2048 & 92]);
    protected boolean Field_37849 = -32670 & 18448;
    protected final int Field_37850 = 62 & 27807;
    protected String Field_37851 = "";
    protected Core Field_37852 = Core.getInstance();
    protected List Field_37853 = Lists.newArrayList();
    protected String Field_37854 = null;
    protected UserInfo Field_37855 = new UserInfo();
    protected List Field_37856 = Lists.newArrayList();
    protected String Field_37857 = "";
    private static final Class_12121 Field_37858 = new Class_12121(String.class, 4410 & 1138);
    protected String Field_37859 = "";
    protected IStreamCallbacks Field_37860 = new Class_6823(this);
    protected long Field_37861 = 1646297216L & 29885200L;
    protected VideoParams Field_37862 = null;
    protected boolean Field_37863 = 9280 & 4644;
    protected ArchivingState Field_37864 = new ArchivingState();
    protected Class_36089 Field_37865 = null;
    protected boolean Field_37866 = -31156 & 20752;

    public boolean Method_37867(String string, long l, String string2, String string3) {
        ErrorCode errorCode = this.Field_37846.sendActionMetaData(this.Field_37839, string, l, string2, string3);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string4 = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[529 & 10401];
            arrobject[-19446 & 2224] = string4;
            this.Method_37901(String.format("Error while sending meta data: %s\n", arrobject));
            return (8224 & -29554) != 0;
        }
        return (1033 & -7551) != 0;
    }

    public boolean Method_37868() {
        return (this.Field_37837 == Class_32759.Field_32768 ? 1 & 16393 : 280 & 29348) != 0;
    }

    protected void Method_37869(Class_32759 class_32759) {
        if (class_32759 != this.Field_37837) {
            this.Field_37837 = class_32759;
            try {
                if (this.Field_37835 != null) {
                    this.Field_37835.Method_15809(class_32759);
                }
            }
            catch (Exception exception) {
                this.Method_37901(exception.toString());
            }
        }
    }

    public IngestList Method_37870() {
        return this.Field_37848;
    }

    public Class_36089 Method_37871() {
        return this.Field_37865;
    }

    public long Method_37872() {
        return this.Field_37846.getStreamTime();
    }

    public boolean Method_37873() {
        return (this.Field_37837 == Class_32759.Field_32771 ? 16385 & 7949 : 80 & 129) != 0;
    }

    public void Method_37874(float f) {
        this.Field_37846.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, f);
    }

    public boolean Method_37875() {
        if (!this.Method_37873()) {
            return (8369 & -15352) != 0;
        }
        this.Method_37869(Class_32759.Field_32769);
        return (20225 & 167) != 0;
    }

    protected void Method_37876(String string) {
        Field_37858.Method_12129("<Warning> " + string);
        Object[] arrobject = new Object[1303 & 4609];
        arrobject[1314 & 196] = string;
        Field_37842.warn(Class_28018.Field_28027, "[Broadcast controller] {}", arrobject);
    }

    public void Method_37877(String string) {
        this.Field_37851 = string;
    }

    public boolean Method_37878() {
        if (!this.Method_37902()) {
            return (16432 & -32760) != 0;
        }
        ErrorCode errorCode = this.Field_37846.stop((-10175 & 1849) != 0);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[8193 & -13693];
            arrobject[8224 & 5136] = string;
            this.Method_37901(String.format("Error while stopping the broadcast: %s", arrobject));
            return (-15333 & 164) != 0;
        }
        this.Method_37869(Class_32759.Field_32772);
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    public boolean Method_37879() {
        return this.Field_37866;
    }

    protected boolean Method_37880() {
        return (2053 & 73) != 0;
    }

    public boolean Method_37881() {
        return this.Field_37863;
    }

    public FrameBuffer Method_37882() {
        if (this.Field_37856.size() == 0) {
            this.Method_37901(String.format("Out of free buffers, this should never happen", new Object[99 & -28404]));
            return null;
        }
        FrameBuffer frameBuffer = (FrameBuffer)this.Field_37856.get(this.Field_37856.size() - (769 & -27563));
        this.Field_37856.remove(this.Field_37856.size() - (261 & -30071));
        return frameBuffer;
    }

    public boolean Method_37883() {
        if (this.Method_37868()) {
            return (12355 & -32464) != 0;
        }
        if (this.Method_37902()) {
            this.Field_37846.stop((10792 & 4097) != 0);
        }
        this.Field_37854 = "";
        this.Field_37839 = new AuthToken();
        if (!this.Field_37866) {
            return (-20327 & 16996) != 0;
        }
        this.Field_37866 = 20995 & 10520;
        if (!this.Field_37849) {
            try {
                if (this.Field_37835 != null) {
                    this.Field_37835.Method_15812();
                }
            }
            catch (Exception exception) {
                this.Method_37901(exception.toString());
            }
        }
        this.Method_37869(Class_32759.Field_32764);
        return (2061 & -24221) != 0;
    }

    public Class_36089 Method_37884() {
        if (this.Method_37885() && this.Field_37848 != null) {
            if (this.Method_37868()) {
                return null;
            }
            this.Field_37865 = new Class_36089(this.Field_37846, this.Field_37848);
            this.Field_37865.Method_36133();
            this.Method_37869(Class_32759.Field_32768);
            return this.Field_37865;
        }
        return null;
    }

    public boolean Method_37885() {
        return (this.Field_37837 == Class_32759.Field_32766 ? 2097 & -2807 : -31741 & 18772) != 0;
    }

    public VideoParams Method_37886(int n, int n2, float f, float f2) {
        int[] arrn = this.Field_37846.getMaxResolution(n, n2, f, f2);
        VideoParams videoParams = new VideoParams();
        videoParams.maxKbps = n;
        videoParams.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
        videoParams.pixelFormat = this.Method_37909();
        videoParams.targetFps = n2;
        videoParams.outputWidth = arrn[-7770 & 3096];
        videoParams.outputHeight = arrn[-28543 & 17715];
        videoParams.disableAdaptiveBitrate = -28655 & 3136;
        videoParams.verticalFlip = 673 & 5398;
        return videoParams;
    }

    public void Method_37887(Class_15803 class_15803) {
        this.Field_37835 = class_15803;
    }

    public Class_37833() {
        if (Core.getInstance() == null) {
            this.Field_37852 = new Core((CoreAPI)new StandardCoreAPI());
        }
        this.Field_37846 = new Stream((StreamAPI)new DesktopStreamAPI());
    }

    public void Method_37888(IngestServer ingestServer) {
        this.Field_37836 = ingestServer;
    }

    public ErrorCode Method_37889() {
        return this.Field_37844;
    }

    public ErrorCode Method_37890(FrameBuffer frameBuffer) {
        if (this.Method_37873()) {
            this.Method_37875();
        } else if (!this.Method_37902()) {
            return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
        }
        ErrorCode errorCode = this.Field_37846.submitVideoFrame(frameBuffer);
        if (errorCode != ErrorCode.TTV_EC_SUCCESS) {
            String string = ErrorCode.getString((ErrorCode)errorCode);
            if (ErrorCode.succeeded((ErrorCode)errorCode)) {
                Object[] arrobject = new Object[11009 & 16445];
                arrobject[-24059 & 19592] = string;
                this.Method_37876(String.format("Warning in SubmitTexturePointer: %s\n", arrobject));
            } else {
                Object[] arrobject = new Object[6209 & 1];
                arrobject[4 & -8128] = string;
                this.Method_37901(String.format("Error in SubmitTexturePointer: %s\n", arrobject));
                this.Method_37878();
            }
            if (this.Field_37835 != null) {
                this.Field_37835.Method_15810(errorCode);
            }
        }
        return errorCode;
    }

    public ChannelInfo Method_37891() {
        return this.Field_37841;
    }

    public boolean Method_37892(String string, AuthToken authToken) {
        if (this.Method_37868()) {
            return (17440 & 4362) != 0;
        }
        this.Method_37883();
        if (string != null && !string.isEmpty()) {
            if (authToken != null && authToken.data != null && !authToken.data.isEmpty()) {
                this.Field_37854 = string;
                this.Field_37839 = authToken;
                if (this.Method_37881()) {
                    this.Method_37869(Class_32759.Field_32767);
                }
                return (16901 & 10249) != 0;
            }
            this.Method_37901("Auth token must be valid");
            return (18464 & 1536) != 0;
        }
        this.Method_37901("Username must be valid");
        return (19648 & -20223) != 0;
    }

    public void Method_37893() {
        if (this.Field_37846 != null && this.Field_37863) {
            ErrorCode errorCode = this.Field_37846.pollTasks();
            this.Method_37904(errorCode);
            if (this.Method_37868()) {
                this.Field_37865.Method_36127();
                if (this.Field_37865.Method_36131()) {
                    this.Field_37865 = null;
                    this.Method_37869(Class_32759.Field_32766);
                }
            }
            switch (Class_8749.Field_8750[this.Field_37837.ordinal()]) {
                case 1: {
                    this.Method_37869(Class_32759.Field_32774);
                    errorCode = this.Field_37846.login(this.Field_37839);
                    if (!ErrorCode.failed((ErrorCode)errorCode)) break;
                    String string = ErrorCode.getString((ErrorCode)errorCode);
                    Object[] arrobject = new Object[-30623 & 17051];
                    arrobject[7460 & 16386] = string;
                    this.Method_37901(String.format("Error in TTV_Login: %s\n", arrobject));
                    break;
                }
                case 2: {
                    this.Method_37869(Class_32759.Field_32770);
                    errorCode = this.Field_37846.getIngestServers(this.Field_37839);
                    if (!ErrorCode.failed((ErrorCode)errorCode)) break;
                    this.Method_37869(Class_32759.Field_32761);
                    String string = ErrorCode.getString((ErrorCode)errorCode);
                    Object[] arrobject = new Object[19595 & 8965];
                    arrobject[3332 & -20352] = string;
                    this.Method_37901(String.format("Error in TTV_GetIngestServers: %s\n", arrobject));
                    break;
                }
                case 3: {
                    String string;
                    this.Method_37869(Class_32759.Field_32766);
                    errorCode = this.Field_37846.getUserInfo(this.Field_37839);
                    if (ErrorCode.failed((ErrorCode)errorCode)) {
                        string = ErrorCode.getString((ErrorCode)errorCode);
                        Object[] arrobject = new Object[10241 & 225];
                        arrobject[-26878 & 10304] = string;
                        this.Method_37901(String.format("Error in TTV_GetUserInfo: %s\n", arrobject));
                    }
                    this.Method_37894();
                    errorCode = this.Field_37846.getArchivingState(this.Field_37839);
                    if (ErrorCode.failed((ErrorCode)errorCode)) {
                        string = ErrorCode.getString((ErrorCode)errorCode);
                        Object[] arrobject = new Object[-32731 & 13393];
                        arrobject[5890 & -30708] = string;
                        this.Method_37901(String.format("Error in TTV_GetArchivingState: %s\n", arrobject));
                    }
                }
                default: {
                    break;
                }
                case 11: 
                case 12: {
                    this.Method_37894();
                }
            }
        }
    }

    protected void Method_37894() {
        long l = System.nanoTime();
        long l2 = (l - this.Field_37861) / (1004198404L & 1000065560L);
        if (l2 >= (1113918827269460511L & 657459646L)) {
            this.Field_37861 = l;
            ErrorCode errorCode = this.Field_37846.getStreamInfo(this.Field_37839, this.Field_37854);
            if (ErrorCode.failed((ErrorCode)errorCode)) {
                String string = ErrorCode.getString((ErrorCode)errorCode);
                Object[] arrobject = new Object[4869 & 10249];
                arrobject[9 & 16610] = string;
                this.Method_37901(String.format("Error in TTV_GetStreamInfo: %s", arrobject));
            }
        }
    }

    public boolean Method_37895(String string, long l, long l2, String string2, String string3) {
        if (l2 == (-1L & -1L)) {
            Object[] arrobject = new Object[1113 & 18851];
            arrobject[-12264 & 101] = l2;
            this.Method_37901(String.format("Invalid sequence id: %d\n", arrobject));
            return (18433 & 13768) != 0;
        }
        ErrorCode errorCode = this.Field_37846.sendEndSpanMetaData(this.Field_37839, string, l, l2, string2, string3);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            String string4 = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[8201 & 5479];
            arrobject[3072 & 90] = string4;
            this.Method_37901(String.format("Error in SendStopSpanMetaData: %s\n", arrobject));
            return (16640 & 11312) != 0;
        }
        return (20489 & 10259) != 0;
    }

    public boolean Method_37896() {
        if (!this.Method_37902()) {
            return (2081 & -16374) != 0;
        }
        ErrorCode errorCode = this.Field_37846.runCommercial(this.Field_37839);
        this.Method_37904(errorCode);
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    public long Method_37897(String string, long l, String string2, String string3) {
        long l2 = this.Field_37846.sendStartSpanMetaData(this.Field_37839, string, l, string2, string3);
        if (l2 == (-1L & -1L)) {
            this.Method_37901(String.format("Error in SendStartSpanMetaData\n", new Object[22546 & 1568]));
        }
        return l2;
    }

    public boolean Method_37898(VideoParams videoParams) {
        if (videoParams != null && this.Method_37885()) {
            this.Field_37862 = videoParams.clone();
            this.Field_37838 = new AudioParams();
            this.Field_37838.enableMicCapture = this.Field_37838.audioEnabled = this.Field_37847 && this.Method_37880() ? 8677 & -32253 : 10 & 261;
            this.Field_37838.enablePlaybackCapture = this.Field_37838.audioEnabled;
            this.Field_37838.enablePassthroughAudio = -3840 & 66;
            if (!this.Method_37906()) {
                this.Field_37862 = null;
                this.Field_37838 = null;
                return (1537 & 16520) != 0;
            }
            ErrorCode errorCode = this.Field_37846.start(videoParams, this.Field_37838, this.Field_37836, StartFlags.None, (601 & -26489) != 0);
            if (ErrorCode.failed((ErrorCode)errorCode)) {
                this.Method_37903();
                String string = ErrorCode.getString((ErrorCode)errorCode);
                Object[] arrobject = new Object[9227 & 16689];
                arrobject[-30720 & 9856] = string;
                this.Method_37901(String.format("Error while starting to broadcast: %s", arrobject));
                this.Field_37862 = null;
                this.Field_37838 = null;
                return (-8156 & 4496) != 0;
            }
            this.Method_37869(Class_32759.Field_32773);
            return (8205 & -13309) != 0;
        }
        return (4306 & 11012) != 0;
    }

    public void Method_37899(FrameBuffer frameBuffer) {
        try {
            this.Field_37846.captureFrameBuffer_ReadPixels(frameBuffer);
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Trying to submit a frame to Twitch");
            Class_13220 class_13220 = class_13268.Method_13280("Broadcast State");
            class_13220.Method_13231("Last reported errors", Arrays.toString(Field_37858.Method_12130()));
            class_13220.Method_13231("Buffer", (Object)frameBuffer);
            class_13220.Method_13231("Free buffer count", this.Field_37856.size());
            class_13220.Method_13231("Capture buffer count", this.Field_37853.size());
            throw new Class_1809(class_13268);
        }
    }

    public boolean Method_37900() {
        if (this.Field_37863) {
            return (344 & 4640) != 0;
        }
        this.Field_37846.setStreamCallbacks(this.Field_37860);
        ErrorCode errorCode = this.Field_37852.initialize(this.Field_37851, System.getProperty("java.library.path"));
        if (!this.Method_37904(errorCode)) {
            this.Field_37846.setStreamCallbacks((IStreamCallbacks)null);
            this.Field_37844 = errorCode;
            return (1550 & 12385) != 0;
        }
        errorCode = this.Field_37852.setTraceLevel(MessageLevel.TTV_ML_ERROR);
        if (!this.Method_37904(errorCode)) {
            this.Field_37846.setStreamCallbacks((IStreamCallbacks)null);
            this.Field_37852.shutdown();
            this.Field_37844 = errorCode;
            return (-32380 & 579) != 0;
        }
        if (ErrorCode.succeeded((ErrorCode)errorCode)) {
            this.Field_37863 = 16393 & 6497;
            this.Method_37869(Class_32759.Field_32764);
            return (-27561 & 9) != 0;
        }
        this.Field_37844 = errorCode;
        this.Field_37852.shutdown();
        return (8464 & -30560) != 0;
    }

    protected void Method_37901(String string) {
        this.Field_37840 = string;
        Field_37858.Method_12129("<Error> " + string);
        Object[] arrobject = new Object[5141 & 16459];
        arrobject[13580 & 626] = string;
        Field_37842.error(Class_28018.Field_28027, "[Broadcast controller] {}", arrobject);
    }

    public boolean Method_37902() {
        return (this.Field_37837 == Class_32759.Field_32769 || this.Field_37837 == Class_32759.Field_32771 ? 913 & 5129 : 18434 & -32540) != 0;
    }

    protected void Method_37903() {
        for (int i = 27275 & -32716; i < this.Field_37853.size(); ++i) {
            FrameBuffer frameBuffer = (FrameBuffer)this.Field_37853.get(i);
            frameBuffer.free();
        }
        this.Field_37856.clear();
        this.Field_37853.clear();
    }

    protected boolean Method_37904(ErrorCode errorCode) {
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.Method_37901(ErrorCode.getString((ErrorCode)errorCode));
            return (25601 & 770) != 0;
        }
        return (41 & 20039) != 0;
    }

    public void Method_37905(float f) {
        this.Field_37846.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, f);
    }

    protected boolean Method_37906() {
        for (int i = 4374 & -32096; i < (1283 & -13789); ++i) {
            FrameBuffer frameBuffer = this.Field_37846.allocateFrameBuffer(this.Field_37862.outputWidth * this.Field_37862.outputHeight * (-16220 & 775));
            if (!frameBuffer.getIsValid()) {
                this.Method_37901(String.format("Error while allocating frame buffer", new Object[9224 & 912]));
                return (2208 & 593) != 0;
            }
            this.Field_37853.add(frameBuffer);
            this.Field_37856.add(frameBuffer);
        }
        return (8193 & 3109) != 0;
    }

    public void Method_37907() {
        if (this.Field_37837 != Class_32759.Field_32765) {
            if (this.Field_37865 != null) {
                this.Field_37865.Method_36119();
            }
            while (this.Field_37865 != null) {
                try {
                    Thread.sleep(7296318568177078491L & 2320584L);
                }
                catch (Exception exception) {
                    this.Method_37901(exception.toString());
                }
                this.Method_37893();
            }
            this.Method_37912();
        }
    }

    public boolean Method_37908(String string, String string2, String string3) {
        if (!this.Field_37866) {
            return (-12030 & 1608) != 0;
        }
        if (string == null || string.equals("")) {
            string = this.Field_37854;
        }
        if (string2 == null) {
            string2 = "";
        }
        if (string3 == null) {
            string3 = "";
        }
        StreamInfoForSetting streamInfoForSetting = new StreamInfoForSetting();
        streamInfoForSetting.streamTitle = string3;
        streamInfoForSetting.gameName = string2;
        ErrorCode errorCode = this.Field_37846.setStreamInfo(this.Field_37839, string, streamInfoForSetting);
        this.Method_37904(errorCode);
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }

    protected PixelFormat Method_37909() {
        return PixelFormat.TTV_PF_RGBA;
    }

    private void Method_37910() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public IngestServer Method_37911() {
        return this.Field_37836;
    }

    public boolean Method_37912() {
        if (!this.Field_37863) {
            return (-16365 & 8673) != 0;
        }
        if (this.Method_37868()) {
            return (26000 & 36) != 0;
        }
        this.Field_37849 = 395 & 26625;
        this.Method_37883();
        this.Field_37846.setStreamCallbacks((IStreamCallbacks)null);
        this.Field_37846.setStatCallbacks((IStatCallbacks)null);
        ErrorCode errorCode = this.Field_37852.shutdown();
        this.Method_37904(errorCode);
        this.Field_37863 = 9293 & 2864;
        this.Field_37849 = 28036 & 16;
        this.Method_37869(Class_32759.Field_32765);
        return (-21375 & 20517) != 0;
    }

    public boolean Method_37913() {
        if (!this.Method_37902()) {
            return (5256 & 18) != 0;
        }
        ErrorCode errorCode = this.Field_37846.pauseVideo();
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.Method_37878();
            String string = ErrorCode.getString((ErrorCode)errorCode);
            Object[] arrobject = new Object[305 & 4677];
            arrobject[44 & 4752] = string;
            this.Method_37901(String.format("Error pausing stream: %s\n", arrobject));
        } else {
            this.Method_37869(Class_32759.Field_32771);
        }
        return ErrorCode.succeeded((ErrorCode)errorCode);
    }
}

