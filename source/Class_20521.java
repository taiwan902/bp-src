/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 *  paulscode.sound.CommandObject
 *  paulscode.sound.CommandThread
 *  paulscode.sound.FilenameURL
 *  paulscode.sound.SoundSystemConfig
 *  paulscode.sound.SoundSystemException
 *  paulscode.sound.codecs.CodecJOrbis
 *  paulscode.sound.codecs.CodecWav
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import paulscode.sound.CommandObject;
import paulscode.sound.CommandThread;
import paulscode.sound.FilenameURL;
import paulscode.sound.SoundSystemConfig;
import paulscode.sound.SoundSystemException;
import paulscode.sound.codecs.CodecJOrbis;
import paulscode.sound.codecs.CodecWav;

public class Class_20521 {
    private final Class_29094 Field_20522;
    private static final Marker Field_20523 = MarkerManager.getMarker((String)Class_20521.Method_20538("PHRHBP"));
    private ArrayList Field_20524 = new ArrayList();
    private final Map Field_20525 = ((BiMap)this.Field_20536).inverse();
    protected CommandThread Field_20526;
    private final HashMap Field_20527 = Maps.newHashMap();
    private Class_6086 Field_20528;
    private static final Logger Field_20529 = LogManager.getLogger();
    private final Class_39702 Field_20530;
    private Map Field_20531 = Maps.newHashMap();
    private final HashMap Field_20532 = Maps.newHashMap();
    private int Field_20533 = 26509 & 6160;
    private boolean Field_20534;
    private final Multimap Field_20535 = HashMultimap.create();
    private final Map Field_20536 = HashBiMap.create();
    private final ArrayList Field_20537 = Lists.newArrayList();

    private static String Method_20538(String string) {
        int n = 4876;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_20521.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_20539(boolean bl, String string, URL uRL, String string2, boolean bl2, float f, float f2, float f3, int n, float f4) {
        this.Method_20542(new CommandObject(74 & 24847, bl, (16385 & 6211) != 0, bl2, string, (Object)new FilenameURL(uRL, string2), f, f2, f3, n, f4));
    }

    public void Method_20540(Class_626 class_626, float f) {
        if (this.Field_20534 && class_626 != null) {
            float f2 = class_626.\u0000, 2 + (class_626.\u0000= float - class_626.\u0000, 2) * f;
            float f3 = class_626.\u0000switch + (class_626.\u0000= ? - class_626.\u0000switch) * f;
            double d = class_626.\u0000%() + (class_626.\u0000= package - class_626.\u0000%()) * (double)f;
            double d2 = class_626.\u0000= final() + (class_626.\u0000, for() - class_626.\u0000= final()) * (double)f + (double)class_626.Method_837();
            double d3 = class_626.\u0000
            () + (class_626.\u0000= switch - class_626.\u0000
            ()) * (double)f;
            float f4 = Class_13337.Method_13350((f3 + 1.75f * 51.42857f) * (1.6046512f * 0.010876689f));
            float f5 = Class_13337.Method_13370((f3 + 4.9473686f * 18.191488f) * (19.0f * 9.1859436E-4f));
            float f6 = Class_13337.Method_13350(-f2 * (0.049450994f * 0.3529412f));
            float f7 = Class_13337.Method_13370(-f2 * (0.009696274f * 1.8f));
            float f8 = Class_13337.Method_13350((-f2 + 1188.0f * 0.07575758f) * (0.016907878f * 1.032258f));
            float f9 = Class_13337.Method_13370((-f2 + 38.0f * 2.368421f) * (0.010362892f * 1.6842105f));
            float f10 = f4 * f6;
            float f11 = f5 * f6;
            float f12 = f4 * f8;
            float f13 = f5 * f8;
            this.Method_20542(new CommandObject(551 & 8251, (float)d, (float)d2, (float)d3));
            this.Method_20542(new CommandObject(8942 & 39, f10, f7, f11, f12, f9, f13));
        }
    }

    static Marker Method_20541() {
        return Field_20523;
    }

    private void Method_20542(CommandObject commandObject) {
        this.Field_20524.add(commandObject);
    }

    public void Method_20543(String string) {
        this.Method_20542(new CommandObject(-32215 & 483, string));
    }

    private void Method_20544() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_20545(Class_23763 class_23763) {
        if (!this.Field_20534) {
            return (-30718 & 1048) != 0;
        }
        String string = (String)this.Field_20525.get(class_23763);
        return (string == null ? 52 & -32381 : (this.Field_20528.Method_6089(string) || this.Field_20527.containsKey(string) && (Integer)this.Field_20527.get(string) <= this.Field_20533 ? 16401 & 3 : 16384 & 535)) != 0;
    }

    public void Method_20546(String string, float f) {
        this.Method_20542(new CommandObject(24655 & -28529, string, f));
    }

    static Logger Method_20547() {
        return Field_20529;
    }

    static Class_6086 Method_20548(Class_20521 class_20521, Class_6086 class_6086) {
        class_20521.Field_20528 = class_6086;
        return class_20521.Field_20528;
    }

    public void Method_20549(Class_6295 class_6295, float f) {
        if (this.Field_20534) {
            if (class_6295 == Class_6295.Field_6300) {
                this.Field_20528.setMasterVolume(f);
            } else {
                for (String string : this.Field_20535.get((Object)class_6295)) {
                    Class_23763 class_23763 = (Class_23763)this.Field_20536.get(string);
                    float f2 = this.Method_20567(class_23763, (Class_6002)this.Field_20531.get(class_23763), class_6295);
                    if (f2 <= 0.0f) {
                        this.Method_20565(class_23763);
                        continue;
                    }
                    this.Field_20528.setVolume(string, f2);
                }
            }
        }
    }

    public void Method_20550() {
        for (String string : this.Field_20536.keySet()) {
            Object[] arrobject = new Object[4881 & 2211];
            arrobject[17025 & -30624] = string;
            Field_20529.debug(Field_20523, "Pausing channel {}", arrobject);
            this.Field_20528.pause(string);
        }
    }

    synchronized void Method_20551() {
        if (!this.Field_20534) {
            new Thread((Runnable)new Class_11145(this), "Sound Library Loader").start();
        }
    }

    public void Method_20552(String string, float f, float f2, float f3) {
        this.Method_20542(new CommandObject(525 & -22225, string, f, f2, f3));
    }

    public void Method_20553() {
        if (this.Field_20534) {
            for (String string : this.Field_20536.keySet()) {
                this.Field_20528.stop(string);
            }
            this.Field_20536.clear();
            this.Field_20532.clear();
            this.Field_20537.clear();
            this.Field_20535.clear();
            this.Field_20531.clear();
            this.Field_20527.clear();
        }
    }

    public void Method_20554() {
        if (this.Field_20534) {
            if (this.Field_20526 == null) {
                this.Method_20568();
            } else if (this.Field_20526.getState() == Thread.State.TIMED_WAITING) {
                this.Method_20568();
            }
        }
    }

    public void Method_20555() {
        this.Method_20556();
        this.Method_20551();
    }

    public void Method_20556() {
        if (this.Field_20534) {
            this.Method_20553();
            this.Field_20528.cleanup();
            this.Field_20534 = 20504 & 1856;
        }
    }

    public void Method_20557(Class_23763 class_23763, int n) {
        this.Field_20532.put(class_23763, this.Field_20533 + n);
    }

    static Class_6086 Method_20558(Class_20521 class_20521) {
        return class_20521.Field_20528;
    }

    private float Method_20559(Class_6295 class_6295) {
        return class_6295 != null && class_6295 != Class_6295.Field_6300 ? this.Field_20530.Method_39932(class_6295) : 1.0f;
    }

    private static URL Method_20560(Class_2080 class_2080) {
        String string = class_2080.Method_2085();
        String string2 = class_2080.Method_2084();
        Object[] arrobject = new Object[10319 & 4499];
        arrobject[-31610 & 24833] = "mcsounddomain";
        arrobject[385 & 3123] = string;
        arrobject[16646 & 2058] = string2;
        String string3 = String.format("%s:%s:%s", arrobject);
        Class_10031 class_10031 = new Class_10031(string, string2, class_2080);
        try {
            return new URL((URL)null, string3, class_10031);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("TODO: Sanely handle url exception! :D");
        }
    }

    public Class_20521(Class_29094 class_29094, Class_39702 class_39702) {
        this.Field_20522 = class_29094;
        this.Field_20530 = class_39702;
        try {
            SoundSystemConfig.addLibrary(Class_18452.class);
            SoundSystemConfig.setCodec((String)"ogg", CodecJOrbis.class);
            SoundSystemConfig.setCodec((String)"wav", CodecWav.class);
        }
        catch (SoundSystemException soundSystemException) {
            Field_20529.error(Field_20523, "Error linking with the LibraryJavaSound plug-in", (Throwable)soundSystemException);
        }
    }

    private float Method_20561(Class_23763 class_23763, Class_6002 class_6002) {
        return (float)Class_13337.Method_13385((double)class_23763.Method_23770() * class_6002.Method_6009(), 1.0142857142857142 * 0.49295774647887325, 1.9375 * 1.032258064516129);
    }

    public void Method_20562() {
        for (String string : this.Field_20536.keySet()) {
            Object[] arrobject = new Object[897 & -30691];
            arrobject[-12218 & 8320] = string;
            Field_20529.debug(Field_20523, "Resuming channel {}", arrobject);
            this.Field_20528.play(string);
        }
    }

    public void Method_20563(Class_23763 class_23763) {
        if (this.Field_20534) {
            if (this.Field_20528.getMasterVolume() <= 0.0f) {
                Object[] arrobject = new Object[-27247 & 45];
                arrobject[2440 & 30224] = class_23763.Method_23765();
                Field_20529.debug(Field_20523, "Skipped playing soundEvent: {}, master volume was zero", arrobject);
            } else {
                Class_38873 class_38873 = this.Field_20522.Method_29113(class_23763.Method_23765());
                if (class_38873 == null) {
                    Object[] arrobject = new Object[6721 & 24601];
                    arrobject[8967 & -14296] = class_23763.Method_23765();
                    Field_20529.warn(Field_20523, "Unable to play unknown soundEvent: {}", arrobject);
                } else {
                    Class_6002 class_6002 = class_38873.Method_38884();
                    if (class_6002 == Class_29094.Field_29097) {
                        Object[] arrobject = new Object[3073 & -32751];
                        arrobject[33 & 13460] = class_38873.Method_38882();
                        Field_20529.warn(Field_20523, "Unable to play empty soundEvent: {}", arrobject);
                    } else {
                        float f = class_23763.Method_23764();
                        float f2 = 19.428572f * 0.8235294f;
                        if (f > 1.0f) {
                            f2 *= f;
                        }
                        Class_6295 class_6295 = class_38873.Method_38883();
                        float f3 = this.Method_20567(class_23763, class_6002, class_6295);
                        Class_2080 class_2080 = class_6002.Method_6008();
                        if (f3 == 0.0f) {
                            Object[] arrobject = new Object[33 & -28587];
                            arrobject[16 & 29610] = class_2080;
                            Field_20529.debug(Field_20523, "Skipped playing sound {}, volume was zero.", arrobject);
                        } else {
                            this.Method_20569(class_2080, class_23763, f2, class_6002.Method_6012(), class_6002, class_38873);
                        }
                    }
                }
            }
        }
    }

    static boolean Method_20564(Class_20521 class_20521, boolean bl) {
        class_20521.Field_20534 = bl;
        return class_20521.Field_20534;
    }

    public void Method_20565(Class_23763 class_23763) {
        String string;
        if (this.Field_20534 && (string = (String)this.Field_20525.get(class_23763)) != null) {
            this.Method_20542(new CommandObject(16667 & -30149, string));
        }
    }

    public void Method_20566() {
        Map.Entry entry;
        Class_23763 class_23763;
        Iterator iterator2;
        this.Field_20533 += -15807 & 8211;
        for (Iterator iterator2 : this.Field_20537) {
            iterator2.\u0000strictfp();
            if (iterator2.Method_26238()) {
                this.Method_20565((Class_23763)((Object)iterator2));
                continue;
            }
            entry = (String)this.Field_20525.get(iterator2);
            this.Method_20572((String)((Object)entry), this.Method_20567((Class_23763)((Object)iterator2), (Class_6002)this.Field_20531.get(iterator2), this.Field_20522.Method_29113(iterator2.\u0000strictfp()).Method_38883()));
            this.Method_20546((String)((Object)entry), this.Method_20561((Class_23763)((Object)iterator2), (Class_6002)this.Field_20531.get(iterator2)));
            this.Method_20552((String)((Object)entry), iterator2.\u0000, `(), iterator2.\u0000%(), iterator2.\u0000
            ());
        }
        Iterator<Object> iterator3 = this.Field_20536.entrySet().iterator();
        while (iterator3.hasNext()) {
            int n;
            iterator2 = (Map.Entry)iterator3.next();
            entry = (String)iterator2.getKey();
            class_23763 = (Class_23763)iterator2.getValue();
            if (this.Field_20528.Method_6089((String)((Object)entry)) || (n = ((Integer)this.Field_20527.get(entry)).intValue()) > this.Field_20533) continue;
            int n2 = class_23763.Method_23772();
            if (class_23763.Method_23766() && n2 > 0) {
                this.Field_20532.put(class_23763, this.Field_20533 + n2);
            }
            iterator3.remove();
            if (Field_20529.isDebugEnabled()) {
                Object[] arrobject = new Object[-32207 & 23557];
                arrobject[128 & 16970] = entry;
                Field_20529.debug(Field_20523, "Removed channel {} because it's not playing anymore", arrobject);
            }
            this.Method_20543((String)((Object)entry));
            this.Field_20527.remove(entry);
            this.Field_20531.remove(class_23763);
            try {
                this.Field_20535.remove((Object)this.Field_20522.Method_29113(class_23763.Method_23765()).Method_38883(), (Object)entry);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(class_23763 instanceof Class_26237)) continue;
            this.Field_20537.remove(class_23763);
        }
        iterator2 = this.Field_20532.entrySet().iterator();
        while (iterator2.hasNext()) {
            entry = iterator2.next();
            if (this.Field_20533 < (Integer)entry.getValue()) continue;
            class_23763 = (Class_23763)entry.getKey();
            if (class_23763 instanceof Class_26237) {
                ((Class_26237)class_23763).\u0000strictfp();
            }
            this.Method_20563(class_23763);
            iterator2.remove();
        }
    }

    private float Method_20567(Class_23763 class_23763, Class_6002 class_6002, Class_6295 class_6295) {
        return (float)Class_13337.Method_13385((double)class_23763.Method_23764() * class_6002.Method_6013(), 0.0, 1.0) * this.Method_20559(class_6295);
    }

    private void Method_20568() {
        ArrayList arrayList = this.Field_20524;
        int n = arrayList.size();
        Class_6086 class_6086 = this.Field_20528;
        for (int i = 2063 & 1568; i < n; ++i) {
            class_6086.CommandQueue((CommandObject)arrayList.get(i));
        }
        arrayList.clear();
    }

    public void Method_20569(Class_2080 class_2080, Class_23763 class_23763, float f, boolean bl, Class_6002 class_6002, Class_38873 class_38873) {
        int n = class_23763.Method_23766() && class_23763.Method_23772() == 0 ? 21 & -32767 : 64 & 4639;
        String string = Class_13337.Method_13390(Class_32341.Method_32350()).toString();
        if (bl) {
            this.Method_20539((16396 & 16018) != 0, string, Class_20521.Method_20560(class_2080), class_2080.Method_2086(), n != 0, class_23763.Method_23767(), class_23763.Method_23769(), class_23763.Method_23768(), class_23763.Method_23771().Method_24035(), f);
        } else {
            boolean bl2 = -15319 & 2384;
            String string2 = string;
            URL uRL = Class_20521.Method_20560(class_2080);
            String string3 = class_2080.Method_2086();
            int n2 = n;
            float f2 = class_23763.Method_23767();
            float f3 = class_23763.Method_23769();
            float f4 = class_23763.Method_23768();
            int n3 = class_23763.Method_23771().Method_24035();
            float f5 = f;
            this.Method_20542(new CommandObject(-28582 & 8843, bl2, (2400 & -28541) != 0, n2 != 0, string2, (Object)new FilenameURL(uRL, string3), f2, f3, f4, n3, f5));
        }
        Class_6295 class_6295 = class_38873.Method_38883();
        float f6 = this.Method_20567(class_23763, class_6002, class_6295);
        double d = this.Method_20561(class_23763, class_6002);
        Object[] arrobject = new Object[9251 & -14333];
        arrobject[4400 & 4] = class_6002.Method_6008();
        arrobject[6033 & 16389] = class_38873.Method_38882();
        arrobject[16386 & 11286] = string;
        Field_20529.debug(Field_20523, "Playing sound {} for event {} as channel {}", arrobject);
        this.Method_20542(new CommandObject(12559 & 31, string, (float)d));
        this.Method_20542(new CommandObject(16398 & -27745, string, f6));
        this.Method_20542(new CommandObject(19036 & -27623, string));
        this.Field_20527.put(string, this.Field_20533 + (16476 & 1814));
        this.Field_20536.put(string, class_23763);
        this.Field_20531.put(class_23763, class_6002);
        if (class_6295 != Class_6295.Field_6300) {
            this.Field_20535.put((Object)class_6295, (Object)string);
        }
        if (class_23763 instanceof Class_26237) {
            this.Field_20537.add((Class_26237)class_23763);
        }
    }

    static Class_39702 Method_20570(Class_20521 class_20521) {
        return class_20521.Field_20530;
    }

    public void Method_20571() {
        if (this.Field_20534) {
            this.Field_20528.interruptCommandThread();
        }
    }

    public void Method_20572(String string, float f) {
        this.Method_20542(new CommandObject(-24018 & 6223, string, f));
    }
}

