/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  internal.org.lwjgl.LWJGLException
 *  internal.org.lwjgl.openal.AL
 *  internal.org.lwjgl.openal.AL10
 *  paulscode.sound.Channel
 *  paulscode.sound.FilenameURL
 *  paulscode.sound.ICodec
 *  paulscode.sound.Library
 *  paulscode.sound.ListenerData
 *  paulscode.sound.SoundBuffer
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.Source
 *  paulscode.sound.Vector3D
 */
import internal.org.lwjgl.BufferUtils;
import internal.org.lwjgl.LWJGLException;
import internal.org.lwjgl.openal.AL;
import internal.org.lwjgl.openal.AL10;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import paulscode.sound.Channel;
import paulscode.sound.FilenameURL;
import paulscode.sound.ICodec;
import paulscode.sound.Library;
import paulscode.sound.ListenerData;
import paulscode.sound.SoundBuffer;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.Source;
import paulscode.sound.Vector3D;

public class Class_18452
extends Library {
    private FloatBuffer Field_18453 = null;
    private FloatBuffer Field_18454 = null;
    private HashMap Field_18455 = new HashMap();
    private FloatBuffer Field_18456 = null;
    private static boolean Field_18457 = 8485 & 1025;

    public void Method_18458(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, float f, float f2, float f3, int n, float f4) {
        IntBuffer intBuffer = null;
        if (!bl2) {
            intBuffer = (IntBuffer)this.Field_18455.get(filenameURL.getFilename());
            if (intBuffer == null && !this.Method_18463(filenameURL)) {
                this.errorMessage("Source '" + string + "' was not created because an error occurred while loading " + filenameURL.getFilename());
                return;
            }
            intBuffer = (IntBuffer)this.Field_18455.get(filenameURL.getFilename());
            if (intBuffer == null) {
                this.errorMessage("Source '" + string + "' was not created because a sound buffer was not found for " + filenameURL.getFilename());
                return;
            }
        }
        SoundBuffer soundBuffer = null;
        if (!bl2) {
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null && !this.Method_18463(filenameURL)) {
                this.errorMessage("Source '" + string + "' was not created because an error occurred while loading " + filenameURL.getFilename());
                return;
            }
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null) {
                this.errorMessage("Source '" + string + "' was not created because audio data was not found for " + filenameURL.getFilename());
                return;
            }
        }
        this.sourceMap.put(string, new Class_36193(this.Field_18453, intBuffer, bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, (660 & 2048) != 0));
    }

    public void Method_18459(float f, float f2, float f3, float f4, float f5, float f6) {
        super.setListenerOrientation(f, f2, f3, f4, f5, f6);
        this.Field_18456.put(28677 & 2562, f);
        this.Field_18456.put(17029 & 67, f2);
        this.Field_18456.put(-32174 & 8334, f3);
        this.Field_18456.put(-32237 & 25987, f4);
        this.Field_18456.put(5892 & 8220, f5);
        this.Field_18456.put(-32571 & 2069, f6);
        AL10.alListener((int)(22079 & 4495), (FloatBuffer)this.Field_18456);
        this.Method_18460();
    }

    private boolean Method_18460() {
        switch (AL10.alGetError()) {
            case 0: {
                return (16416 & 4) != 0;
            }
            case 40961: {
                this.errorMessage("Invalid name parameter.");
                return (-21455 & 75) != 0;
            }
            case 40962: {
                this.errorMessage("Invalid parameter.");
                return (2049 & 299) != 0;
            }
            case 40963: {
                this.errorMessage("Invalid enumerated parameter value.");
                return (-26559 & 8577) != 0;
            }
            case 40964: {
                this.errorMessage("Illegal call.");
                return (569 & -22463) != 0;
            }
            case 40965: {
                this.errorMessage("Unable to allocate memory.");
                return (5973 & 18563) != 0;
            }
        }
        this.errorMessage("An unrecognized error occurred.");
        return (12307 & 2061) != 0;
    }

    public void Method_18461() {
        super.dopplerChanged();
        AL10.alDopplerFactor((float)SoundSystemConfig.getDopplerFactor());
        this.Method_18460();
        AL10.alDopplerVelocity((float)SoundSystemConfig.getDopplerVelocity());
        this.Method_18460();
    }

    public void Method_18462(float f) {
        super.setMasterVolume(f);
        AL10.alListenerf((int)(20618 & -19349), (float)f);
        this.Method_18460();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean Method_18463(FilenameURL filenameURL) {
        if (this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method 'loadSound'");
        }
        if (this.Field_18455 == null) {
            this.Field_18455 = new HashMap();
            this.importantMessage("Open AL Buffer Map was null in method'loadSound'");
        }
        if (this.errorCheck((filenameURL == null ? 18769 & 4263 : 10296 & 16384) != 0, "Filename/URL not specified in method 'loadSound'")) {
            return (256 & 29872) != 0;
        }
        if (this.bufferMap.get(filenameURL.getFilename()) != null) {
            return (8209 & 3621) != 0;
        }
        ICodec iCodec = SoundSystemConfig.getCodec((String)filenameURL.getFilename());
        if (this.errorCheck((iCodec == null ? 3137 & 521 : 177 & 26180) != 0, "No codec found for file '" + filenameURL.getFilename() + "' in method 'loadSound'")) {
            return (160 & 16456) != 0;
        }
        iCodec.reverseByteOrder((8225 & 603) != 0);
        URL uRL = filenameURL.getURL();
        if (this.errorCheck((uRL == null ? 10905 & 1025 : 3100 & 802) != 0, "Unable to open file '" + filenameURL.getFilename() + "' in method 'loadSound'")) {
            return (31316 & -32351) != 0;
        }
        iCodec.initialize(uRL);
        SoundBuffer soundBuffer = iCodec.readAll();
        iCodec.cleanup();
        iCodec = null;
        if (this.errorCheck((soundBuffer == null ? -19199 & 2209 : 8705 & 5408) != 0, "Sound buffer null in method 'loadSound'")) {
            return (16398 & 8608) != 0;
        }
        this.bufferMap.put(filenameURL.getFilename(), soundBuffer);
        AudioFormat audioFormat = soundBuffer.audioFormat;
        int n = 8616 & -32751;
        if (audioFormat.getChannels() == (7209 & -24575)) {
            if (audioFormat.getSampleSizeInBits() == (-24951 & 328)) {
                n = 12544 & -28404;
            } else {
                if (audioFormat.getSampleSizeInBits() != (6932 & 9456)) {
                    this.errorMessage("Illegal sample size in method 'loadSound'");
                    return (18466 & 4548) != 0;
                }
                n = 4865 & 31105;
            }
        } else {
            if (audioFormat.getChannels() != (8274 & -13821)) {
                this.errorMessage("File neither mono nor stereo in method 'loadSound'");
                return (8260 & 5131) != 0;
            }
            if (audioFormat.getSampleSizeInBits() == (137 & 16456)) {
                n = -25662 & 28966;
            } else {
                if (audioFormat.getSampleSizeInBits() != (25299 & 1040)) {
                    this.errorMessage("Illegal sample size in method 'loadSound'");
                    return (130 & -6816) != 0;
                }
                n = -19197 & 4939;
            }
        }
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(137 & -12543));
        AL10.alGenBuffers((IntBuffer)intBuffer);
        if (this.errorCheck((AL10.alGetError() != 0 ? -20479 & 269 : 16404 & 8256) != 0, "alGenBuffers error when loading " + filenameURL.getFilename())) {
            return (1072 & 17347) != 0;
        }
        AL10.alBufferData((int)intBuffer.get(-32702 & 1024), (int)n, (ByteBuffer)((ByteBuffer)BufferUtils.createByteBuffer((int)soundBuffer.audioData.length).put(soundBuffer.audioData).flip()), (int)((int)audioFormat.getSampleRate()));
        if (this.errorCheck((AL10.alGetError() != 0 ? 1041 & 385 : 6149 & 8704) != 0, "alBufferData error when loading " + filenameURL.getFilename()) && this.errorCheck((intBuffer == null ? 29569 & 2085 : 7 & 28712) != 0, "Sound buffer was not created for " + filenameURL.getFilename())) {
            return (9811 & 16384) != 0;
        }
        this.Field_18455.put(filenameURL.getFilename(), intBuffer);
        return (-24375 & 6401) != 0;
    }

    public void Method_18464(float f) {
        super.setListenerAngle(f);
        this.Field_18456.put(18476 & -32765, this.listener.lookAt.x);
        this.Field_18456.put(270 & -4605, this.listener.lookAt.z);
        AL10.alListener((int)(5151 & -27985), (FloatBuffer)this.Field_18456);
        this.Method_18460();
    }

    public void Method_18465(float f, float f2, float f3) {
        super.setListenerPosition(f, f2, f3);
        this.Field_18453.put(-29520 & 76, f);
        this.Field_18453.put(4875 & -32523, f2);
        this.Field_18453.put(28819 & 2054, f3);
        AL10.alListener((int)(4358 & 15053), (FloatBuffer)this.Field_18453);
        this.Method_18460();
    }

    public void Method_18466(float f, float f2, float f3) {
        super.setListenerVelocity(f, f2, f3);
        this.Field_18454.put(8784 & 160, this.listener.velocity.x);
        this.Field_18454.put(-28375 & 3137, this.listener.velocity.y);
        this.Field_18454.put(194 & 16654, this.listener.velocity.z);
        AL10.alListener((int)(-28410 & 14366), (FloatBuffer)this.Field_18454);
    }

    public void Method_18467(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        if (this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method 'copySources'");
        }
        if (this.Field_18455 == null) {
            this.Field_18455 = new HashMap();
            this.importantMessage("Open AL Buffer Map was null in method'copySources'");
        }
        this.sourceMap.clear();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            Source source = (Source)hashMap.get(string);
            if (source == null) continue;
            SoundBuffer soundBuffer = null;
            if (!source.toStream) {
                this.Method_18463(source.filenameURL);
                soundBuffer = (SoundBuffer)this.bufferMap.get(source.filenameURL.getFilename());
            }
            if (!source.toStream && soundBuffer == null) continue;
            this.sourceMap.put(string, new Class_36193(this.Field_18453, (IntBuffer)this.Field_18455.get(source.filenameURL.getFilename()), source, soundBuffer));
        }
    }

    private static synchronized boolean Method_18468(boolean n, boolean bl) {
        if (n == (16937 & 1345)) {
            Field_18457 = bl;
        }
        return Field_18457;
    }

    protected Channel Method_18469(int n) {
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(-20473 & 1025));
        try {
            AL10.alGenSources((IntBuffer)intBuffer);
        }
        catch (Exception exception) {
            AL10.alGetError();
            return null;
        }
        if (AL10.alGetError() != 0) {
            return null;
        }
        Class_10209 class_10209 = new Class_10209(n, intBuffer);
        return class_10209;
    }

    public void Method_18470() {
        super.cleanup();
        Set set = this.bufferMap.keySet();
        for (String string : set) {
            IntBuffer intBuffer = (IntBuffer)this.Field_18455.get(string);
            if (intBuffer == null) continue;
            AL10.alDeleteBuffers((IntBuffer)intBuffer);
            this.Method_18460();
            intBuffer.clear();
        }
        this.bufferMap.clear();
        AL.destroy();
        this.bufferMap = null;
        this.Field_18453 = null;
        this.Field_18456 = null;
        this.Field_18454 = null;
    }

    public static boolean Method_18471() {
        return Class_18452.Method_18468((-30528 & 24582) != 0, (12298 & 17) != 0);
    }

    public void Method_18472(AudioFormat audioFormat, boolean bl, String string, float f, float f2, float f3, int n, float f4) {
        this.sourceMap.put(string, new Class_36193(this.Field_18453, audioFormat, bl, string, f, f2, f3, n, f4));
    }

    public void Method_18473(ListenerData listenerData) {
        super.setListenerData(listenerData);
        this.Field_18453.put(260 & 17579, listenerData.position.x);
        this.Field_18453.put(-14079 & 171, listenerData.position.y);
        this.Field_18453.put(1030 & 8418, listenerData.position.z);
        AL10.alListener((int)(-28388 & 6662), (FloatBuffer)this.Field_18453);
        this.Method_18460();
        this.Field_18456.put(256 & 2592, listenerData.lookAt.x);
        this.Field_18456.put(8261 & 17209, listenerData.lookAt.y);
        this.Field_18456.put(20490 & 226, listenerData.lookAt.z);
        this.Field_18456.put(16459 & 10775, listenerData.up.x);
        this.Field_18456.put(16391 & 4444, listenerData.up.y);
        this.Field_18456.put(-31707 & 12895, listenerData.up.z);
        AL10.alListener((int)(20511 & 6543), (FloatBuffer)this.Field_18456);
        this.Method_18460();
        this.Field_18454.put(512 & 12305, listenerData.velocity.x);
        this.Field_18454.put(17943 & 1, listenerData.velocity.y);
        this.Field_18454.put(23586 & 658, listenerData.velocity.z);
        AL10.alListener((int)(13830 & 4390), (FloatBuffer)this.Field_18454);
        this.Method_18460();
    }

    public void Method_18474() {
        int n = 537 & -30652;
        try {
            AL.create();
            n = this.Method_18460() ? 1 : 0;
        }
        catch (LWJGLException lWJGLException) {
            this.errorMessage("Unable to initialize OpenAL.  Probable cause: OpenAL not supported.");
            this.printStackTrace((Exception)((Object)lWJGLException));
            throw new Class_33114(lWJGLException.getMessage(), 4461 & 17509);
        }
        if (n != 0) {
            this.importantMessage("OpenAL did not initialize properly!");
        } else {
            this.message("OpenAL initialized.");
        }
        float[] arrf = new float[-28845 & 12299];
        arrf[16384 & 5280] = this.listener.position.x;
        arrf[4129 & 9219] = this.listener.position.y;
        arrf[16402 & 7722] = this.listener.position.z;
        this.Field_18453 = BufferUtils.createFloatBuffer((int)(22115 & 8195)).put(arrf);
        float[] arrf2 = new float[270 & -16250];
        arrf2[526 & 16448] = this.listener.lookAt.x;
        arrf2[-31707 & 3] = this.listener.lookAt.y;
        arrf2[19490 & 13250] = this.listener.lookAt.z;
        arrf2[555 & 8263] = this.listener.up.x;
        arrf2[36 & -32753] = this.listener.up.y;
        arrf2[-18235 & 23] = this.listener.up.z;
        this.Field_18456 = BufferUtils.createFloatBuffer((int)(20614 & -24529)).put(arrf2);
        float[] arrf3 = new float[259 & 23559];
        arrf3[16 & 28263] = 0.0f;
        arrf3[9 & -32697] = 0.0f;
        arrf3[4362 & -32766] = 0.0f;
        this.Field_18454 = BufferUtils.createFloatBuffer((int)(18451 & 71)).put(arrf3);
        this.Field_18453.flip();
        this.Field_18456.flip();
        this.Field_18454.flip();
        AL10.alListener((int)(22549 & 5260), (FloatBuffer)this.Field_18453);
        n = this.Method_18460() || n != 0 ? -4095 & 903 : 9 & 32;
        AL10.alListener((int)(6191 & 29791), (FloatBuffer)this.Field_18456);
        n = this.Method_18460() || n != 0 ? -30191 & 28769 : 12 & 16641;
        AL10.alListener((int)(4743 & 12614), (FloatBuffer)this.Field_18454);
        n = this.Method_18460() || n != 0 ? -26917 & 18433 : 30054 & 664;
        AL10.alDopplerFactor((float)SoundSystemConfig.getDopplerFactor());
        n = this.Method_18460() || n != 0 ? 19175 & 1025 : -20480 & 1052;
        AL10.alDopplerVelocity((float)SoundSystemConfig.getDopplerVelocity());
        int n2 = n = this.Method_18460() || n != 0 ? 4243 & -15355 : 4128 & 3205;
        if (n != 0) {
            this.importantMessage("OpenAL did not initialize properly!");
            throw new Class_33114("Problem encountered while loading OpenAL or creating the listener.  Probable cause:  OpenAL not supported", 2287 & 16997);
        }
        super.init();
        Class_10209 class_10209 = (Class_10209)((Object)this.normalChannels.get(25649 & 4551));
        try {
            AL10.alSourcef((int)class_10209.Field_10210.get(-16344 & 13377), (int)(-27341 & 6147), (float)1.0f);
            if (this.Method_18460()) {
                Class_18452.Method_18468((309 & 8771) != 0, (-12158 & 8288) != 0);
                throw new Class_33114("OpenAL: AL_PITCH not supported.", -30611 & 8812);
            }
            Class_18452.Method_18468((-28575 & 3333) != 0, (-31351 & 20581) != 0);
        }
        catch (Exception exception) {
            Class_18452.Method_18468((17 & -32191) != 0, (9370 & 4) != 0);
            throw new Class_33114("OpenAL: AL_PITCH not supported.", 109 & 2156);
        }
    }

    public String Method_18475() {
        return "LibraryLWJGLOpenAL";
    }

    public Class_18452() {
        this.reverseByteOrder = 3729 & 323;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean Method_18476(SoundBuffer soundBuffer, String string) {
        if (this.bufferMap == null) {
            this.bufferMap = new HashMap();
            this.importantMessage("Buffer Map was null in method 'loadSound'");
        }
        if (this.Field_18455 == null) {
            this.Field_18455 = new HashMap();
            this.importantMessage("Open AL Buffer Map was null in method'loadSound'");
        }
        if (this.errorCheck((string == null ? 24595 & -25403 : 16512 & -31712) != 0, "Identifier not specified in method 'loadSound'")) {
            return (-14294 & 261) != 0;
        }
        if (this.bufferMap.get(string) != null) {
            return (2051 & -12143) != 0;
        }
        if (this.errorCheck((soundBuffer == null ? 2113 & -26875 : 12 & 14672) != 0, "Sound buffer null in method 'loadSound'")) {
            return (20768 & 9816) != 0;
        }
        this.bufferMap.put(string, soundBuffer);
        AudioFormat audioFormat = soundBuffer.audioFormat;
        int n = 18506 & -32096;
        if (audioFormat.getChannels() == (24643 & 4121)) {
            if (audioFormat.getSampleSizeInBits() == (4172 & -31573)) {
                n = 6610 & 29444;
            } else {
                if (audioFormat.getSampleSizeInBits() != (-32743 & 16914)) {
                    this.errorMessage("Illegal sample size in method 'loadSound'");
                    return (142 & 31760) != 0;
                }
                n = -19191 & 6533;
            }
        } else {
            if (audioFormat.getChannels() != (-32766 & 59)) {
                this.errorMessage("File neither mono nor stereo in method 'loadSound'");
                return (-23856 & 4111) != 0;
            }
            if (audioFormat.getSampleSizeInBits() == (2828 & 72)) {
                n = 4355 & 29606;
            } else {
                if (audioFormat.getSampleSizeInBits() != (1137 & 2324)) {
                    this.errorMessage("Illegal sample size in method 'loadSound'");
                    return (1681 & 2080) != 0;
                }
                n = 4407 & 4875;
            }
        }
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)(14385 & 1291));
        AL10.alGenBuffers((IntBuffer)intBuffer);
        if (this.errorCheck((AL10.alGetError() != 0 ? -12521 & 65 : 11329 & 16660) != 0, "alGenBuffers error when saving " + string)) {
            return (16642 & 11360) != 0;
        }
        AL10.alBufferData((int)intBuffer.get(528 & 8196), (int)n, (ByteBuffer)((ByteBuffer)BufferUtils.createByteBuffer((int)soundBuffer.audioData.length).put(soundBuffer.audioData).flip()), (int)((int)audioFormat.getSampleRate()));
        if (this.errorCheck((AL10.alGetError() != 0 ? 27137 & 1157 : -32102 & 28708) != 0, "alBufferData error when saving " + string) && this.errorCheck((intBuffer == null ? 5185 & 8321 : 1088 & 4108) != 0, "Sound buffer was not created for " + string)) {
            return (2245 & -22992) != 0;
        }
        this.Field_18455.put(string, intBuffer);
        return (897 & -12287) != 0;
    }

    public void Method_18477(boolean bl, boolean bl2, boolean bl3, String string, FilenameURL filenameURL, float f, float f2, float f3, int n, float f4, boolean bl4) {
        IntBuffer intBuffer = null;
        if (!bl2) {
            intBuffer = (IntBuffer)this.Field_18455.get(filenameURL.getFilename());
            if (intBuffer == null) {
                this.Method_18463(filenameURL);
            }
            if ((intBuffer = (IntBuffer)this.Field_18455.get(filenameURL.getFilename())) == null) {
                this.errorMessage("Sound buffer was not created for " + filenameURL.getFilename());
                return;
            }
        }
        SoundBuffer soundBuffer = null;
        if (!bl2) {
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null && !this.Method_18463(filenameURL)) {
                this.errorMessage("Source '" + string + "' was not created because an error occurred while loading " + filenameURL.getFilename());
                return;
            }
            soundBuffer = (SoundBuffer)this.bufferMap.get(filenameURL.getFilename());
            if (soundBuffer == null) {
                this.errorMessage("Source '" + string + "' was not created because audio data was not found for " + filenameURL.getFilename());
                return;
            }
        }
        Class_36193 class_36193 = new Class_36193(this.Field_18453, intBuffer, bl, bl2, bl3, string, filenameURL, soundBuffer, f, f2, f3, n, f4, (68 & 24962) != 0);
        this.sourceMap.put(string, class_36193);
        this.play((Source)class_36193);
        if (bl4) {
            class_36193.setTemporary((5505 & 8281) != 0);
        }
    }

    private void Method_18478() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_18479(String string) {
        this.Field_18455.remove(string);
        super.unloadSound(string);
    }
}

