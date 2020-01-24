/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  tv.twitch.ErrorCode
 *  tv.twitch.broadcast.AudioParams
 *  tv.twitch.broadcast.EncodingCpuUsage
 *  tv.twitch.broadcast.FrameBuffer
 *  tv.twitch.broadcast.IStatCallbacks
 *  tv.twitch.broadcast.IStreamCallbacks
 *  tv.twitch.broadcast.IngestList
 *  tv.twitch.broadcast.IngestServer
 *  tv.twitch.broadcast.PixelFormat
 *  tv.twitch.broadcast.RTMPState
 *  tv.twitch.broadcast.StartFlags
 *  tv.twitch.broadcast.Stream
 *  tv.twitch.broadcast.VideoParams
 */
import com.google.common.collect.Lists;
import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.VideoParams;

public class Class_36089 {
    protected Stream Field_36090 = null;
    protected IStreamCallbacks Field_36091 = new Class_13539(this);
    protected boolean Field_36092 = 8256 & -25472;
    protected IngestServer Field_36093 = null;
    protected IStreamCallbacks Field_36094 = null;
    protected long Field_36095 = 4395008L & 6596045266305951750L;
    protected int Field_36096 = -1 & -1;
    protected int Field_36097 = 16641 & 98;
    protected IStatCallbacks Field_36098 = null;
    protected IStatCallbacks Field_36099 = new Class_6746(this);
    protected long Field_36100 = 5048984350268883008L & 1677731864L;
    protected AudioParams Field_36101 = null;
    protected long Field_36102 = 310644785L & 85541376L;
    protected boolean Field_36103 = 6176 & 8262;
    protected Class_22345 Field_36104 = Class_22345.Field_22354;
    protected boolean Field_36105 = 25176 & 4100;
    protected long Field_36106 = 7514413559158292464L & 2115547L;
    protected List Field_36107 = null;
    protected long Field_36108 = 8577602201734619120L & 15875906L;
    protected float Field_36109 = 0.0f;
    protected float Field_36110 = 0.0f;
    protected IngestList Field_36111 = null;
    protected RTMPState Field_36112 = RTMPState.Invalid;
    protected Class_17499 Field_36113 = null;
    protected boolean Field_36114 = 512 & 18704;
    protected boolean Field_36115 = 16396 & 273;
    protected boolean Field_36116 = 16580 & -26624;
    protected VideoParams Field_36117 = null;

    public float Method_36118() {
        return this.Field_36109;
    }

    public void Method_36119() {
        if (!this.Method_36131() && !this.Field_36092) {
            this.Field_36092 = 12321 & 3349;
            if (this.Field_36093 != null) {
                this.Field_36093.bitrateKbps = 0.0f;
            }
        }
    }

    public IngestServer Method_36120() {
        return this.Field_36093;
    }

    protected long Method_36121() {
        return System.currentTimeMillis() - this.Field_36095;
    }

    protected void Method_36122(Class_22345 class_22345) {
        if (class_22345 != this.Field_36104) {
            this.Field_36104 = class_22345;
            if (this.Field_36113 != null) {
                this.Field_36113.Method_17500(this, class_22345);
            }
        }
    }

    public int Method_36123() {
        return this.Field_36096;
    }

    private void Method_36124() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_36125(Class_17499 class_17499) {
        this.Field_36113 = class_17499;
    }

    public Class_36089(Stream stream, IngestList ingestList) {
        this.Field_36090 = stream;
        this.Field_36111 = ingestList;
    }

    protected void Method_36126(IngestServer ingestServer) {
        if (this.Field_36114) {
            this.Field_36116 = -28151 & 8193;
        } else if (this.Field_36103) {
            this.Field_36115 = 257 & 10841;
            ErrorCode errorCode = this.Field_36090.stop((17433 & -24157) != 0);
            if (ErrorCode.failed((ErrorCode)errorCode)) {
                this.Field_36091.stopCallback(ErrorCode.TTV_EC_SUCCESS);
                System.out.println("Stop failed: " + errorCode.toString());
            }
            this.Field_36090.pollStats();
        } else {
            this.Field_36091.stopCallback(ErrorCode.TTV_EC_SUCCESS);
        }
    }

    public void Method_36127() {
        if (!(this.Method_36131() || this.Field_36104 == Class_22345.Field_22354 || this.Field_36114 || this.Field_36115)) {
            switch (Class_20306.Field_20307[this.Field_36104.ordinal()]) {
                case 1: 
                case 2: {
                    if (this.Field_36093 != null) {
                        if (this.Field_36116 || !this.Field_36105) {
                            this.Field_36093.bitrateKbps = 0.0f;
                        }
                        this.Method_36126(this.Field_36093);
                        break;
                    }
                    this.Field_36095 = 545801480L & 38013156L;
                    this.Field_36116 = 1417 & 6146;
                    this.Field_36105 = -15639 & 3;
                    if (this.Field_36104 != Class_22345.Field_22349) {
                        this.Field_36096 += 4105 & -30621;
                    }
                    if (this.Field_36096 < this.Field_36111.getServers().length) {
                        this.Field_36093 = this.Field_36111.getServers()[this.Field_36096];
                        this.Method_36129(this.Field_36093);
                        break;
                    }
                    this.Method_36122(Class_22345.Field_22353);
                    break;
                }
                case 3: 
                case 4: {
                    this.Method_36128(this.Field_36093);
                    break;
                }
                case 5: {
                    this.Method_36122(Class_22345.Field_22348);
                }
            }
            this.Method_36130();
            if (this.Field_36104 == Class_22345.Field_22348 || this.Field_36104 == Class_22345.Field_22353) {
                this.Method_36132();
            }
        }
    }

    protected boolean Method_36128(IngestServer ingestServer) {
        if (!this.Field_36116 && !this.Field_36092 && this.Method_36121() < this.Field_36108) {
            if (!this.Field_36114 && !this.Field_36115) {
                ErrorCode errorCode = this.Field_36090.submitVideoFrame((FrameBuffer)this.Field_36107.get(this.Field_36097));
                if (ErrorCode.failed((ErrorCode)errorCode)) {
                    this.Field_36105 = -20382 & 2560;
                    this.Method_36122(Class_22345.Field_22350);
                    return (512 & 17549) != 0;
                }
                this.Field_36097 = (this.Field_36097 + (4201 & 769)) % this.Field_36107.size();
                this.Field_36090.pollStats();
                if (this.Field_36112 == RTMPState.SendVideo) {
                    this.Method_36122(Class_22345.Field_22346);
                    long l = this.Method_36121();
                    if (l > (1620314400L & 269090820L) && this.Field_36100 > this.Field_36102) {
                        ingestServer.bitrateKbps = (float)(this.Field_36100 * (-652165567942492118L & 652165565997295320L)) / (float)this.Method_36121();
                        this.Field_36102 = this.Field_36100;
                    }
                }
                return (1923 & 12289) != 0;
            }
            return (16531 & -27647) != 0;
        }
        this.Method_36122(Class_22345.Field_22350);
        return (18449 & 1315) != 0;
    }

    protected boolean Method_36129(IngestServer ingestServer) {
        this.Field_36105 = -15187 & 833;
        this.Field_36100 = 17042528L & 167805194L;
        this.Field_36112 = RTMPState.Idle;
        this.Field_36093 = ingestServer;
        this.Field_36114 = 257 & -20383;
        this.Method_36122(Class_22345.Field_22355);
        ErrorCode errorCode = this.Field_36090.start(this.Field_36117, this.Field_36101, ingestServer, StartFlags.TTV_Start_BandwidthTest, (-23543 & 2069) != 0);
        if (ErrorCode.failed((ErrorCode)errorCode)) {
            this.Field_36114 = 4384 & -15678;
            this.Field_36105 = 12857 & -32378;
            this.Method_36122(Class_22345.Field_22350);
            return (1280 & 527) != 0;
        }
        this.Field_36102 = this.Field_36100;
        ingestServer.bitrateKbps = 0.0f;
        this.Field_36097 = 128 & 6400;
        return (75 & 17413) != 0;
    }

    protected void Method_36130() {
        float f = this.Method_36121();
        switch (Class_20306.Field_20307[this.Field_36104.ordinal()]) {
            case 1: 
            case 3: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                this.Field_36109 = 0.0f;
                break;
            }
            case 2: {
                this.Field_36109 = 1.0f;
                break;
            }
            default: {
                this.Field_36109 = f / (float)this.Field_36108;
            }
        }
        switch (Class_20306.Field_20307[this.Field_36104.ordinal()]) {
            case 7: 
            case 8: 
            case 9: {
                this.Field_36110 = 1.0f;
                break;
            }
            default: {
                this.Field_36110 = (float)this.Field_36096 / (float)this.Field_36111.getServers().length;
                this.Field_36110 += this.Field_36109 / (float)this.Field_36111.getServers().length;
            }
        }
    }

    public boolean Method_36131() {
        return (this.Field_36104 == Class_22345.Field_22353 || this.Field_36104 == Class_22345.Field_22348 || this.Field_36104 == Class_22345.Field_22347 ? 1319 & -24039 : -29400 & 17029) != 0;
    }

    protected void Method_36132() {
        this.Field_36093 = null;
        if (this.Field_36107 != null) {
            for (int i = -30720 & 8706; i < this.Field_36107.size(); ++i) {
                ((FrameBuffer)this.Field_36107.get(i)).free();
            }
            this.Field_36107 = null;
        }
        if (this.Field_36090.getStatCallbacks() == this.Field_36099) {
            this.Field_36090.setStatCallbacks(this.Field_36098);
            this.Field_36098 = null;
        }
        if (this.Field_36090.getStreamCallbacks() == this.Field_36091) {
            this.Field_36090.setStreamCallbacks(this.Field_36094);
            this.Field_36094 = null;
        }
    }

    public void Method_36133() {
        if (this.Field_36104 == Class_22345.Field_22354) {
            this.Field_36096 = -32512 & 19634;
            this.Field_36092 = 16544 & -19952;
            this.Field_36116 = 1283 & 22656;
            this.Field_36103 = 400 & 12873;
            this.Field_36114 = -30688 & 1746;
            this.Field_36115 = 24620 & 4419;
            this.Field_36098 = this.Field_36090.getStatCallbacks();
            this.Field_36090.setStatCallbacks(this.Field_36099);
            this.Field_36094 = this.Field_36090.getStreamCallbacks();
            this.Field_36090.setStreamCallbacks(this.Field_36091);
            this.Field_36117 = new VideoParams();
            this.Field_36117.targetFps = 4540 & 8317;
            this.Field_36117.maxKbps = 3501 & 7596;
            this.Field_36117.outputWidth = -15006 & 5385;
            this.Field_36117.outputHeight = 6874 & 756;
            this.Field_36117.pixelFormat = PixelFormat.TTV_PF_BGRA;
            this.Field_36117.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
            this.Field_36117.disableAdaptiveBitrate = -28671 & 8259;
            this.Field_36117.verticalFlip = 1592 & 2178;
            this.Field_36090.getDefaultParams(this.Field_36117);
            this.Field_36101 = new AudioParams();
            this.Field_36101.audioEnabled = -31072 & 8528;
            this.Field_36101.enableMicCapture = 33 & -4736;
            this.Field_36101.enablePlaybackCapture = -32757 & 1072;
            this.Field_36101.enablePassthroughAudio = -32128 & 4096;
            this.Field_36107 = Lists.newArrayList();
            int n = 12547 & -31597;
            for (int i = 31104 & 1616; i < n; ++i) {
                FrameBuffer frameBuffer = this.Field_36090.allocateFrameBuffer(this.Field_36117.outputWidth * this.Field_36117.outputHeight * (16532 & 8493));
                if (!frameBuffer.getIsValid()) {
                    this.Method_36132();
                    this.Method_36122(Class_22345.Field_22347);
                    return;
                }
                this.Field_36107.add(frameBuffer);
                this.Field_36090.randomizeFrameBuffer(frameBuffer);
            }
            this.Method_36122(Class_22345.Field_22349);
            this.Field_36095 = System.currentTimeMillis();
        }
    }
}

