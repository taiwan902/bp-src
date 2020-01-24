/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.openal.AL10
 *  paulscode.sound.Channel
 *  paulscode.sound.FilenameURL
 *  paulscode.sound.ICodec
 *  paulscode.sound.SoundBuffer
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 *  paulscode.sound.Vector3D
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.openal.AL10;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;
import paulscode.sound.Vector3D;

public class Class_36193
extends Source {
    private Class_10209 Field_36194;
    private IntBuffer Field_36195;
    private FloatBuffer Field_36196;
    private FloatBuffer Field_36197;
    private FloatBuffer Field_36198;

    public void Method_36199(float f) {
        super.setPitch(f);
        this.Method_36209();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean Method_36200() {
        if (!this.toStream) {
            this.errorMessage("Method 'incrementSoundSequence' may only be used for streaming sources.");
            return (-28270 & 10249) != 0;
        }
        Object object = this.soundSequenceLock;
        synchronized (object) {
            AudioFormat audioFormat;
            if (this.soundSequenceQueue == null) return (-31228 & 16385) != 0;
            if (this.soundSequenceQueue.size() <= 0) return (-31228 & 16385) != 0;
            this.filenameURL = (FilenameURL)this.soundSequenceQueue.remove(-24576 & 2225);
            if (this.codec != null) {
                this.codec.cleanup();
            }
            this.codec = SoundSystemConfig.getCodec((String)this.filenameURL.getFilename());
            if (this.codec == null) return (4097 & 8989) != 0;
            this.codec.reverseByteOrder((1089 & 2059) != 0);
            if (this.codec.getAudioFormat() == null) {
                this.codec.initialize(this.filenameURL.getURL());
            }
            if ((audioFormat = this.codec.getAudioFormat()) == null) {
                this.errorMessage("Audio Format null in method 'incrementSoundSequence'");
                return (-14142 & 10009) != 0;
            }
            int n = 16480 & -25080;
            if (audioFormat.getChannels() == (8717 & -32751)) {
                if (audioFormat.getSampleSizeInBits() == (8712 & 1116)) {
                    n = 22408 & 12562;
                } else {
                    if (audioFormat.getSampleSizeInBits() != (5722 & 10385)) {
                        this.errorMessage("Illegal sample size in method 'incrementSoundSequence'");
                        return (16904 & -24298) != 0;
                    }
                    n = 6401 & 5039;
                }
            } else {
                if (audioFormat.getChannels() != (15906 & 16514)) {
                    this.errorMessage("Audio data neither mono nor stereo in method 'incrementSoundSequence'");
                    return (265 & 24644) != 0;
                }
                if (audioFormat.getSampleSizeInBits() == (17417 & 12844)) {
                    n = 4546 & 7971;
                } else {
                    if (audioFormat.getSampleSizeInBits() != (528 & 148)) {
                        this.errorMessage("Illegal sample size in method 'incrementSoundSequence'");
                        return (12333 & 2386) != 0;
                    }
                    n = 5019 & 20771;
                }
            }
            this.Field_36194.Method_10219(n, (int)audioFormat.getSampleRate());
            this.preLoad = -7037 & 301;
            return (4097 & 8989) != 0;
        }
    }

    private void Method_36201() {
        float[] arrf = new float[11367 & 259];
        arrf[1280 & 18964] = this.position.x;
        arrf[22749 & 513] = this.position.y;
        arrf[-28313 & 2] = this.position.z;
        this.Field_36196 = BufferUtils.createFloatBuffer((int)(16515 & -28381)).put(arrf);
        float[] arrf2 = new float[-19949 & 2059];
        arrf2[24661 & 1536] = this.velocity.x;
        arrf2[1027 & -26199] = this.velocity.y;
        arrf2[514 & 1114] = this.velocity.z;
        this.Field_36197 = BufferUtils.createFloatBuffer((int)(16899 & 7379)).put(arrf2);
        this.Field_36196.flip();
        this.Field_36197.flip();
        this.Method_36214();
    }

    private void Method_36202() {
        if (this.attModel == (523 & -6142)) {
            this.gain = this.distanceFromListener <= 0.0f ? 1.0f : (this.distanceFromListener >= this.distOrRoll ? 0.0f : 1.0f - this.distanceFromListener / this.distOrRoll);
            if (this.gain > 1.0f) {
                this.gain = 1.0f;
            }
            if (this.gain < 0.0f) {
                this.gain = 0.0f;
            }
        } else {
            this.gain = 1.0f;
        }
    }

    public Class_36193(FloatBuffer floatBuffer, AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        super(audioFormat, bl, string, f, f2, f3, n, f4);
        this.Field_36194 = (Class_10209)this.channel;
        this.Field_36198 = floatBuffer;
        this.libraryType = Class_18452.class;
        this.pitch = 1.0f;
        this.Method_36201();
    }

    public void Method_36203(float f) {
        super.setDistOrRoll(f);
        if (this.channel != null && this.channel.attachedSource == this && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            if (this.attModel == (9233 & -26545)) {
                AL10.alSourcef((int)this.Field_36194.Field_10210.get(8192 & 1286), (int)(6825 & 13601), (float)f);
            } else {
                AL10.alSourcef((int)this.Field_36194.Field_10210.get(8452 & 1130), (int)(29411 & 6449), (float)0.0f);
            }
            this.Method_36212();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Method_36204(Channel channel) {
        int n;
        if (!this.active()) {
            if (this.toLoop) {
                this.toPlay = -4279 & 5;
            }
            return;
        }
        if (channel == null) {
            this.errorMessage("Unable to play source, because channel was null");
            return;
        }
        int n2 = n = this.channel != channel ? 2057 & 14305 : -26608 & 1676;
        if (this.channel != null && this.channel.attachedSource != this) {
            n = 8961 & -32765;
        }
        boolean bl = this.paused();
        super.play(channel);
        this.Field_36194 = (Class_10209)this.channel;
        if (n != 0) {
            this.Method_36210(this.position.x, this.position.y, this.position.z);
            this.Method_36209();
            if (this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
                if (Class_18452.Method_18471()) {
                    AL10.alSourcef((int)this.Field_36194.Field_10210.get(9348 & -32767), (int)(12319 & -25853), (float)this.pitch);
                    this.Method_36212();
                }
                AL10.alSource((int)this.Field_36194.Field_10210.get(10368 & -15298), (int)(-9563 & 12548), (FloatBuffer)this.Field_36196);
                this.Method_36212();
                AL10.alSource((int)this.Field_36194.Field_10210.get(1352 & 22544), (int)(-11506 & 4102), (FloatBuffer)this.Field_36197);
                this.Method_36212();
                if (this.attModel == (1 & 11323)) {
                    AL10.alSourcef((int)this.Field_36194.Field_10210.get(9729 & 6402), (int)(16037 & -28639), (float)this.distOrRoll);
                } else {
                    AL10.alSourcef((int)this.Field_36194.Field_10210.get(-20448 & 525), (int)(4773 & 7209), (float)0.0f);
                }
                this.Method_36212();
                if (this.toLoop && !this.toStream) {
                    AL10.alSourcei((int)this.Field_36194.Field_10210.get(2138 & 17953), (int)(30223 & 4199), (int)(2595 & 9617));
                } else {
                    AL10.alSourcei((int)this.Field_36194.Field_10210.get(0 & 29416), (int)(6167 & 13799), (int)(554 & 16513));
                }
                this.Method_36212();
            }
            if (!this.toStream) {
                if (this.Field_36195 == null) {
                    this.errorMessage("No sound buffer to play");
                    return;
                }
                this.Field_36194.Method_10215(this.Field_36195);
            }
        }
        if (!this.playing()) {
            if (this.toStream && !bl) {
                AudioFormat audioFormat;
                if (this.codec == null) {
                    this.errorMessage("Decoder null in method 'play'");
                    return;
                }
                if (this.codec.getAudioFormat() == null) {
                    this.codec.initialize(this.filenameURL.getURL());
                }
                if ((audioFormat = this.codec.getAudioFormat()) == null) {
                    this.errorMessage("Audio Format null in method 'play'");
                    return;
                }
                int n3 = 1055 & -14112;
                if (audioFormat.getChannels() == (12481 & 17977)) {
                    if (audioFormat.getSampleSizeInBits() == (2316 & -32566)) {
                        n3 = 4352 & 13594;
                    } else {
                        if (audioFormat.getSampleSizeInBits() != (6161 & 24816)) {
                            this.errorMessage("Illegal sample size in method 'play'");
                            return;
                        }
                        n3 = 20737 & 13067;
                    }
                } else {
                    if (audioFormat.getChannels() != (25502 & 5122)) {
                        this.errorMessage("Audio data neither mono nor stereo in method 'play'");
                        return;
                    }
                    if (audioFormat.getSampleSizeInBits() == (265 & -21796)) {
                        n3 = 4882 & 6594;
                    } else {
                        if (audioFormat.getSampleSizeInBits() != (1141 & -19694)) {
                            this.errorMessage("Illegal sample size in method 'play'");
                            return;
                        }
                        n3 = 30123 & 4355;
                    }
                }
                this.Field_36194.Method_10219(n3, (int)audioFormat.getSampleRate());
                this.preLoad = 10785 & -32691;
            }
            this.channel.play();
            if (this.pitch != 1.0f) {
                this.Method_36209();
            }
        }
    }

    public void Method_36205() {
        super.cleanup();
    }

    public Class_36193(FloatBuffer floatBuffer, IntBuffer intBuffer, boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, SoundBuffer soundBuffer, float f, float f2, float f3, int n, float f4, boolean bl4) {
        super(bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, bl4);
        this.Field_36194 = (Class_10209)this.channel;
        if (this.codec != null) {
            this.codec.reverseByteOrder((26899 & 33) != 0);
        }
        this.Field_36198 = floatBuffer;
        this.Field_36195 = intBuffer;
        this.libraryType = Class_18452.class;
        this.pitch = 1.0f;
        this.Method_36201();
    }

    private void Method_36206() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_36207() {
        if (this.Field_36198 != null) {
            double d = this.position.x - this.Field_36198.get(1152 & -28102);
            double d2 = this.position.y - this.Field_36198.get(17417 & 8855);
            double d3 = this.position.z - this.Field_36198.get(-26622 & 9242);
            this.distanceFromListener = (float)Math.sqrt(d * d + d2 * d2 + d3 * d3);
        }
    }

    public void Method_36208(int n) {
        super.setAttenuation(n);
        if (this.channel != null && this.channel.attachedSource == this && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            if (n == (10025 & 22551)) {
                AL10.alSourcef((int)this.Field_36194.Field_10210.get(17 & 8394), (int)(4521 & 20595), (float)this.distOrRoll);
            } else {
                AL10.alSourcef((int)this.Field_36194.Field_10210.get(8732 & 384), (int)(22053 & -28575), (float)0.0f);
            }
            this.Method_36212();
        }
    }

    private void Method_36209() {
        if (this.channel != null && this.channel.attachedSource == this && Class_18452.Method_18471() && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            AL10.alSourcef((int)this.Field_36194.Field_10210.get(4385 & -31040), (int)(6667 & 28707), (float)this.pitch);
            this.Method_36212();
        }
    }

    public void Method_36210(float f, float f2, float f3) {
        super.setPosition(f, f2, f3);
        if (this.Field_36196 == null) {
            this.Method_36201();
        } else {
            this.Method_36214();
        }
        this.Field_36196.put(16420 & 768, f);
        this.Field_36196.put(2101 & 16449, f2);
        this.Field_36196.put(2118 & -24549, f3);
        if (this.channel != null && this.channel.attachedSource == this && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            AL10.alSource((int)this.Field_36194.Field_10210.get(19024 & -27648), (int)(12292 & 4421), (FloatBuffer)this.Field_36196);
            this.Method_36212();
        }
    }

    public void Method_36211() {
        this.Method_36214();
    }

    private boolean Method_36212() {
        switch (AL10.alGetError()) {
            case 0: {
                return (-5834 & 9) != 0;
            }
            case 40961: {
                this.errorMessage("Invalid name parameter.");
                return (13833 & 18805) != 0;
            }
            case 40962: {
                this.errorMessage("Invalid parameter.");
                return (3211 & 8289) != 0;
            }
            case 40963: {
                this.errorMessage("Invalid enumerated parameter value.");
                return (7255 & -16247) != 0;
            }
            case 40964: {
                this.errorMessage("Illegal call.");
                return (2177 & -24575) != 0;
            }
            case 40965: {
                this.errorMessage("Unable to allocate memory.");
                return (-15095 & 10245) != 0;
            }
        }
        this.errorMessage("An unrecognized error occurred.");
        return (10373 & 21561) != 0;
    }

    public void Method_36213(float f, float f2, float f3) {
        super.setVelocity(f, f2, f3);
        float[] arrf = new float[403 & 4135];
        arrf[-21504 & 334] = f;
        arrf[-3309 & 2089] = f2;
        arrf[519 & 16490] = f3;
        this.Field_36197 = BufferUtils.createFloatBuffer((int)(4619 & -23277)).put(arrf);
        this.Field_36197.flip();
        if (this.channel != null && this.channel.attachedSource == this && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            AL10.alSource((int)this.Field_36194.Field_10210.get(1113 & -32224), (int)(28854 & 4358), (FloatBuffer)this.Field_36197);
            this.Method_36212();
        }
    }

    public void Method_36214() {
        this.Method_36207();
        this.Method_36202();
        if (this.channel != null && this.channel.attachedSource == this && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            AL10.alSourcef((int)this.Field_36194.Field_10210.get(-15728 & 260), (int)(4142 & 4762), (float)(this.gain * this.sourceVolume * Math.abs(this.fadeOutGain) * this.fadeInGain));
            this.Method_36212();
        }
        this.Method_36209();
    }

    public boolean Method_36215() {
        if (this.codec == null) {
            return (16938 & 1412) != 0;
        }
        this.codec.initialize(this.filenameURL.getURL());
        LinkedList<byte[]> linkedList = new LinkedList<byte[]>();
        for (int i = -32224 & 6420; i < SoundSystemConfig.getNumberStreamingBuffers(); ++i) {
            this.soundBuffer = this.codec.read();
            if (this.soundBuffer == null || this.soundBuffer.audioData == null) break;
            linkedList.add(this.soundBuffer.audioData);
        }
        this.Method_36214();
        this.channel.preLoadBuffers(linkedList);
        this.preLoad = 2132 & 13313;
        return (4225 & -29143) != 0;
    }

    public Class_36193(FloatBuffer floatBuffer, IntBuffer intBuffer, Source source, SoundBuffer soundBuffer) {
        super(source, soundBuffer);
        this.Field_36194 = (Class_10209)this.channel;
        if (this.codec != null) {
            this.codec.reverseByteOrder((4229 & -31663) != 0);
        }
        this.Field_36198 = floatBuffer;
        this.Field_36195 = intBuffer;
        this.libraryType = Class_18452.class;
        this.pitch = 1.0f;
        this.Method_36201();
    }

    public void Method_36216(boolean bl) {
        super.setLooping(bl);
        if (this.channel != null && this.channel.attachedSource == this && this.Field_36194 != null && this.Field_36194.Field_10210 != null) {
            if (bl) {
                AL10.alSourcei((int)this.Field_36194.Field_10210.get(512 & -31359), (int)(5135 & 13207), (int)(-32481 & 10369));
            } else {
                AL10.alSourcei((int)this.Field_36194.Field_10210.get(8262 & 22016), (int)(20535 & 14991), (int)(1122 & -19568));
            }
            this.Method_36212();
        }
    }
}

