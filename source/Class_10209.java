/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.openal.AL10
 *  paulscode.sound.Channel
 *  paulscode.sound.SoundBuffer
 *  paulscode.sound.Source
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.openal.AL10;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.SoundBuffer;
import paulscode.sound.Source;

public class Class_10209
extends Channel {
    public IntBuffer Field_10210;
    public float Field_10211 = 0.0f;
    public int Field_10212;
    public int Field_10213;

    public int Method_10214() {
        if (this.channelType != (4997 & -24543)) {
            return -21952 & 5283;
        }
        int n = AL10.alGetSourcei((int)this.Field_10210.get(2177 & 9244), (int)(4894 & 6391));
        if (this.Method_10230()) {
            return 78 & -28624;
        }
        return n;
    }

    public boolean Method_10215(IntBuffer intBuffer) {
        if (this.errorCheck((this.channelType != 0 ? 16425 & -30521 : 20965 & 11282) != 0, "Sound buffers may only be attached to normal sources.")) {
            return (-29920 & 12420) != 0;
        }
        AL10.alSourcei((int)this.Field_10210.get(274 & 4673), (int)(4495 & 30825), (int)intBuffer.get(16484 & -29304));
        if (this.attachedSource != null && this.attachedSource.soundBuffer != null && this.attachedSource.soundBuffer.audioFormat != null) {
            this.Method_10222(this.attachedSource.soundBuffer.audioFormat);
        }
        return this.Method_10230();
    }

    private void Method_10216() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public float Method_10217(int n) {
        return (float)AL10.alGetBufferi((int)n, (int)(-8188 & 10325)) / (float)AL10.alGetBufferi((int)n, (int)(10371 & 8479)) / ((float)AL10.alGetBufferi((int)n, (int)(8219 & 8514)) / (0.8852459f * 9.037037f)) / (float)this.Field_10213 * (1.1351352f * 880.95233f);
    }

    public boolean Method_10218(LinkedList linkedList) {
        int n;
        IntBuffer intBuffer;
        if (this.errorCheck((this.channelType != (17541 & 8731) ? 1121 & 20873 : 128 & 2573) != 0, "Buffers may only be queued for streaming sources.")) {
            return (4108 & 336) != 0;
        }
        if (this.errorCheck((linkedList == null ? 28673 & 685 : 1282 & -16339) != 0, "Buffer List null in method 'preLoadBuffers'")) {
            return (8704 & 16425) != 0;
        }
        boolean bl = this.Method_10232();
        if (bl) {
            AL10.alSourceStop((int)this.Field_10210.get(-30940 & 2056));
            this.Method_10230();
        }
        if ((n = AL10.alGetSourcei((int)this.Field_10210.get(10304 & 4993), (int)(21527 & 4126))) > 0) {
            intBuffer = BufferUtils.createIntBuffer((int)n);
            AL10.alGenBuffers((IntBuffer)intBuffer);
            if (this.errorCheck(this.Method_10230(), "Error clearing stream buffers in method 'preLoadBuffers'")) {
                return (-24239 & 4096) != 0;
            }
            AL10.alSourceUnqueueBuffers((int)this.Field_10210.get(5264 & 512), (IntBuffer)intBuffer);
            if (this.errorCheck(this.Method_10230(), "Error unqueuing stream buffers in method 'preLoadBuffers'")) {
                return (-10816 & 10248) != 0;
            }
        }
        if (bl) {
            AL10.alSourcePlay((int)this.Field_10210.get(521 & 34));
            this.Method_10230();
        }
        intBuffer = BufferUtils.createIntBuffer((int)linkedList.size());
        AL10.alGenBuffers((IntBuffer)intBuffer);
        if (this.errorCheck(this.Method_10230(), "Error generating stream buffers in method 'preLoadBuffers'")) {
            return (17953 & -20388) != 0;
        }
        ByteBuffer byteBuffer = null;
        for (int i = 16596 & 2560; i < linkedList.size(); ++i) {
            byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer((int)((byte[])linkedList.get(i)).length).put((byte[])linkedList.get(i)).flip();
            try {
                AL10.alBufferData((int)intBuffer.get(i), (int)this.Field_10212, (ByteBuffer)byteBuffer, (int)this.Field_10213);
            }
            catch (Exception exception) {
                this.errorMessage("Error creating buffers in method 'preLoadBuffers'");
                this.printStackTrace(exception);
                return (8452 & -28495) != 0;
            }
            if (!this.errorCheck(this.Method_10230(), "Error creating buffers in method 'preLoadBuffers'")) continue;
            return (104 & -13296) != 0;
        }
        try {
            AL10.alSourceQueueBuffers((int)this.Field_10210.get(9753 & 64), (IntBuffer)intBuffer);
        }
        catch (Exception exception) {
            this.errorMessage("Error queuing buffers in method 'preLoadBuffers'");
            this.printStackTrace(exception);
            return (-32590 & 12613) != 0;
        }
        if (this.errorCheck(this.Method_10230(), "Error queuing buffers in method 'preLoadBuffers'")) {
            return (-29690 & 25480) != 0;
        }
        AL10.alSourcePlay((int)this.Field_10210.get(5462 & -6112));
        if (this.errorCheck(this.Method_10230(), "Error playing source in method 'preLoadBuffers'")) {
            return (132 & 25968) != 0;
        }
        return (-25311 & 8395) != 0;
    }

    public void Method_10219(int n, int n2) {
        this.Field_10212 = n;
        this.Field_10213 = n2;
    }

    public void Method_10220() {
        if (this.Field_10210 != null) {
            try {
                AL10.alSourceStop((IntBuffer)this.Field_10210);
                AL10.alGetError();
            }
            catch (Exception exception) {
                // empty catch block
            }
            try {
                AL10.alDeleteSources((IntBuffer)this.Field_10210);
                AL10.alGetError();
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.Field_10210.clear();
        }
        this.Field_10210 = null;
        super.cleanup();
    }

    public void Method_10221() {
        AL10.alSourcePlay((int)this.Field_10210.get(-24576 & 3740));
        this.Method_10230();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Method_10222(AudioFormat audioFormat) {
        int n = 4101 & -24502;
        if (audioFormat.getChannels() == (9 & 30245)) {
            if (audioFormat.getSampleSizeInBits() == (-20405 & 17160)) {
                n = 4398 & 12688;
            } else {
                if (audioFormat.getSampleSizeInBits() != (144 & 19734)) {
                    this.errorMessage("Illegal sample size in method 'setAudioFormat'");
                    return;
                }
                n = 15633 & -28383;
            }
        } else {
            if (audioFormat.getChannels() != (2 & -32697)) {
                this.errorMessage("Audio data neither mono nor stereo in method 'setAudioFormat'");
                return;
            }
            if (audioFormat.getSampleSizeInBits() == (4108 & 393)) {
                n = 4446 & 15619;
            } else {
                if (audioFormat.getSampleSizeInBits() != (-27120 & 10682)) {
                    this.errorMessage("Illegal sample size in method 'setAudioFormat'");
                    return;
                }
                n = -28413 & 20827;
            }
        }
        this.Field_10212 = n;
        this.Field_10213 = (int)audioFormat.getSampleRate();
    }

    public void Method_10223() {
        if (this.channelType == (3 & 13617)) {
            return;
        }
        AL10.alSourceRewind((int)this.Field_10210.get(66 & 0));
        if (!this.Method_10230()) {
            this.Field_10211 = 0.0f;
        }
    }

    public void Method_10224() {
        AL10.alSourceStop((int)this.Field_10210.get(10242 & -32112));
        if (!this.Method_10230()) {
            this.Field_10211 = 0.0f;
        }
    }

    public void Method_10225() {
        try {
            AL10.alSourceStop((int)this.Field_10210.get(5325 & 18944));
            AL10.alGetError();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.channelType == (16389 & -24839)) {
            this.Method_10227();
        }
    }

    public Class_10209(int n, IntBuffer intBuffer) {
        super(n);
        this.libraryType = Class_18452.class;
        this.Field_10210 = intBuffer;
    }

    public int Method_10226(byte[] arrby) {
        IntBuffer intBuffer;
        if (this.errorCheck((this.channelType != (265 & 20709) ? 145 & -22527 : -30196 & 4496) != 0, "Raw audio data can only be fed to streaming sources.")) {
            return -1 & -1;
        }
        ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer((int)arrby.length).put(arrby).flip();
        int n = AL10.alGetSourcei((int)this.Field_10210.get(18740 & 2), (int)(13342 & 20758));
        if (n > 0) {
            intBuffer = BufferUtils.createIntBuffer((int)n);
            AL10.alGenBuffers((IntBuffer)intBuffer);
            if (this.errorCheck(this.Method_10230(), "Error clearing stream buffers in method 'feedRawAudioData'")) {
                return -1 & -1;
            }
            AL10.alSourceUnqueueBuffers((int)this.Field_10210.get(-32240 & 2144), (IntBuffer)intBuffer);
            if (this.errorCheck(this.Method_10230(), "Error unqueuing stream buffers in method 'feedRawAudioData'")) {
                return -1 & -1;
            }
            intBuffer.rewind();
            while (intBuffer.hasRemaining()) {
                int n2 = intBuffer.get();
                if (AL10.alIsBuffer((int)n2)) {
                    this.Field_10211 += this.Method_10217(n2);
                }
                this.Method_10230();
            }
            AL10.alDeleteBuffers((IntBuffer)intBuffer);
            this.Method_10230();
        }
        intBuffer = BufferUtils.createIntBuffer((int)(26881 & 4233));
        AL10.alGenBuffers((IntBuffer)intBuffer);
        if (this.errorCheck(this.Method_10230(), "Error generating stream buffers in method 'preLoadBuffers'")) {
            return -1 & -1;
        }
        AL10.alBufferData((int)intBuffer.get(16978 & 1160), (int)this.Field_10212, (ByteBuffer)byteBuffer, (int)this.Field_10213);
        if (this.Method_10230()) {
            return -1 & -1;
        }
        AL10.alSourceQueueBuffers((int)this.Field_10210.get(170 & -32688), (IntBuffer)intBuffer);
        if (this.Method_10230()) {
            return -1 & -1;
        }
        if (this.attachedSource != null && this.attachedSource.channel == this && this.attachedSource.active() && !this.Method_10232()) {
            AL10.alSourcePlay((int)this.Field_10210.get(-30080 & 12312));
            this.Method_10230();
        }
        return n;
    }

    public void Method_10227() {
        if (this.channelType != (569 & 25731)) {
            return;
        }
        if (this.Method_10230()) {
            return;
        }
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(4325 & 9));
        for (int i = AL10.alGetSourcei((int)this.Field_10210.get((int)(370 & -12148)), (int)(6421 & -4043)); i > 0; --i) {
            try {
                AL10.alSourceUnqueueBuffers((int)this.Field_10210.get(16471 & 5632), (IntBuffer)intBuffer);
            }
            catch (Exception exception) {
                return;
            }
            if (!this.Method_10230()) continue;
            return;
        }
        this.Field_10211 = 0.0f;
    }

    public void Method_10228() {
        AL10.alSourcePause((int)this.Field_10210.get(-31687 & 4352));
        this.Method_10230();
    }

    public float Method_10229() {
        float f = AL10.alGetSourcei((int)this.Field_10210.get(25331 & 6408), (int)(14959 & 20774));
        float f2 = 1.0f;
        switch (this.Field_10212) {
            case 4352: {
                f2 = 1.0f;
                break;
            }
            case 4353: {
                f2 = 2.0f;
                break;
            }
            case 4354: {
                f2 = 2.0f;
                break;
            }
            case 4355: {
                f2 = 2.2307692f * 1.7931035f;
                break;
            }
        }
        f = f / f2 / (float)this.Field_10213 * (1.45f * 689.65515f);
        if (this.channelType == (20651 & -24511)) {
            f += this.Field_10211;
        }
        return f;
    }

    private boolean Method_10230() {
        switch (AL10.alGetError()) {
            case 0: {
                return (3073 & 17348) != 0;
            }
            case 40961: {
                this.errorMessage("Invalid name parameter.");
                return (12321 & 3073) != 0;
            }
            case 40962: {
                this.errorMessage("Invalid parameter.");
                return (4869 & -6015) != 0;
            }
            case 40963: {
                this.errorMessage("Invalid enumerated parameter value.");
                return (6785 & -23519) != 0;
            }
            case 40964: {
                this.errorMessage("Illegal call.");
                return (22379 & 10257) != 0;
            }
            case 40965: {
                this.errorMessage("Unable to allocate memory.");
                return (355 & -32759) != 0;
            }
        }
        this.errorMessage("An unrecognized error occurred.");
        return (8331 & 5205) != 0;
    }

    public boolean Method_10231(byte[] arrby) {
        if (this.errorCheck((this.channelType != (18441 & 1639) ? -6943 & 4615 : 8216 & 4032) != 0, "Buffers may only be queued for streaming sources.")) {
            return (25113 & -25470) != 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer)BufferUtils.createByteBuffer((int)arrby.length).put(arrby).flip();
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(33 & -15279));
        AL10.alSourceUnqueueBuffers((int)this.Field_10210.get(-28496 & 1280), (IntBuffer)intBuffer);
        if (this.Method_10230()) {
            return (50 & -30712) != 0;
        }
        if (AL10.alIsBuffer((int)intBuffer.get(8266 & 256))) {
            this.Field_10211 += this.Method_10217(intBuffer.get(-13267 & 12608));
        }
        this.Method_10230();
        AL10.alBufferData((int)intBuffer.get(211 & 2308), (int)this.Field_10212, (ByteBuffer)byteBuffer, (int)this.Field_10213);
        if (this.Method_10230()) {
            return (-16224 & 5136) != 0;
        }
        AL10.alSourceQueueBuffers((int)this.Field_10210.get(2445 & 32), (IntBuffer)intBuffer);
        if (this.Method_10230()) {
            return (-16383 & 8192) != 0;
        }
        return (10241 & 5185) != 0;
    }

    public boolean Method_10232() {
        int n = AL10.alGetSourcei((int)this.Field_10210.get(517 & 19874), (int)(21528 & 6226));
        if (this.Method_10230()) {
            return (12 & 3107) != 0;
        }
        return (n == (20755 & 7186) ? 1089 & 2567 : -26620 & 9504) != 0;
    }
}

