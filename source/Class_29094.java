/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_29094
implements Class_5591,
Class_2045 {
    private final Class_23625 Field_29095 = new Class_23625();
    private final Class_279 Field_29096;
    public static final Class_6002 Field_29097;
    private final Class_20521 Field_29098;
    private static final ParameterizedType Field_29099;
    private static final Logger Field_29100;
    private static final Gson Field_29101;

    public Class_29094(Class_279 class_279, Class_39702 class_39702) {
        this.Field_29096 = class_279;
        this.Field_29098 = new Class_20521(this, class_39702);
    }

    public void Method_29102(Class_626 class_626, float f) {
        this.Field_29098.Method_20540(class_626, f);
    }

    public void Method_29103() {
        this.Field_29098.Method_20553();
    }

    public void Method_29104() {
        if (this.Field_29098 != null) {
            this.Field_29098.Method_20554();
        }
    }

    public void Method_29105() {
        this.Field_29098.Method_20556();
    }

    private void Method_29106() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_29107() {
        this.Field_29098.Method_20550();
    }

    public void Method_29108(Class_23763 class_23763, int n) {
        this.Field_29098.Method_20557(class_23763, n);
    }

    public void Method_29109(Class_279 class_279) {
        this.Field_29098.Method_20555();
        this.Field_29095.Method_23629();
        for (String string : class_279.Method_281()) {
            try {
                for (Class_9953 class_9953 : class_279.Method_280(new Class_2080(string, "sounds.json"))) {
                    try {
                        Map map = this.Method_29110(class_9953.Method_9958());
                        for (Map.Entry entry : map.entrySet()) {
                            this.Method_29111(new Class_2080(string, (String)entry.getKey()), (Class_8643)entry.getValue());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        Field_29100.warn("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
            }
        }
        Class_12251.Method_12256(this);
    }

    protected Map Method_29110(InputStream inputStream) {
        Map map;
        try {
            map = (Map)Field_29101.fromJson((Reader)new InputStreamReader(inputStream), (Type)Field_29099);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
        return map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void Method_29111(Class_2080 class_2080, Class_8643 class_8643) {
        v0 = n = this.Field_29095.\u0000strictfp((Object)class_2080) == false ? 12309 & 18979 : 2384 & -11768;
        if (n == 0 && !class_8643.Method_8652()) {
            class_38873 = (Class_38873)this.Field_29095.\u0000strictfp((Object)class_2080);
        } else {
            if (n == 0) {
                v1 = new Object[1035 & 933];
                v1[26626 & 4645] = class_2080;
                Class_29094.Field_29100.debug("Replaced sound event location {}", v1);
            }
            class_38873 = new Class_38873(class_2080, 1.0, 1.0, class_8643.Method_8648());
            this.Field_29095.Method_23630(class_38873);
        }
        var5_5 = class_8643.Method_8649().iterator();
        block10 : while (var5_5.hasNext() != false) {
            class_40509 = (Class_40509)var5_5.next();
            string = class_40509.Method_40525();
            class_20802 = new Class_2080(string);
            string2 = string.contains(":") != false ? class_20802.Method_2085() : class_2080.Method_2085();
            switch (Class_20107.Field_20108[class_40509.Method_40526().ordinal()]) {
                case 1: {
                    class_20803 = new Class_2080(string2, "sounds/" + class_20802.Method_2084() + ".ogg");
                    inputStream = null;
                    try {
                        inputStream = this.Field_29096.Method_282(class_20803).Method_9958();
                    }
                    catch (FileNotFoundException fileNotFoundException) {
                        v2 = new Object[16530 & -24561];
                        v2[2086 & -28144] = class_20803;
                        v2[-32347 & 2115] = class_2080;
                        Class_29094.Field_29100.warn("File {} does not exist, cannot add it to event {}", v2);
                        {
                            catch (Throwable throwable) {
                                IOUtils.closeQuietly(inputStream);
                                throw throwable;
                            }
                        }
                        IOUtils.closeQuietly((InputStream)inputStream);
                        continue block10;
                        catch (IOException iOException) {
                            Class_29094.Field_29100.warn("Could not load sound file " + class_20803 + ", cannot add it to event " + class_2080, (Throwable)iOException);
                            IOUtils.closeQuietly((InputStream)inputStream);
                            continue block10;
                        }
                    }
                    IOUtils.closeQuietly((InputStream)inputStream);
                    class_10321 /* !! */  = new Class_10339(new Class_6002(class_20803, class_40509.Method_40517(), class_40509.Method_40520(), class_40509.Method_40528()), class_40509.Method_40516());
                    ** break;
                }
                case 2: {
                    class_10321 /* !! */  = new Class_43514(this, string2, class_40509);
                    ** break;
                }
            }
            throw new IllegalStateException("IN YOU FACE");
lbl46: // 2 sources:
            class_38873.Method_38885(class_10321 /* !! */ );
        }
    }

    public void Method_29112() {
        this.Field_29098.Method_20566();
    }

    public Class_38873 Method_29113(Class_2080 class_2080) {
        return (Class_38873)this.Field_29095.\u0000strictfp((Object)class_2080);
    }

    private static String Method_29114(String string) {
        int n = 23788;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_29094.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_29115(Class_23763 class_23763) {
        this.Field_29098.Method_20565(class_23763);
    }

    public void Method_29116(Class_9924 class_9924) {
        Class_2080 class_2080 = new Class_2080("blazingpack", class_9924.Field_9925);
        Class_38873 class_38873 = new Class_38873(class_2080, 1.0, 1.0, Class_6295.Field_6300);
        this.Field_29095.Method_23630(class_38873);
        Class_10339 class_10339 = new Class_10339(new Class_6002(class_2080, 1.0, 1.0, (1025 & 387) != 0), 16705 & 8243);
        class_38873.Method_38885(class_10339);
    }

    static Class_23625 Method_29117(Class_29094 class_29094) {
        return class_29094.Field_29095;
    }

    public void Method_29118(Class_6295 class_6295, float f) {
        if (class_6295 == Class_6295.Field_6300 && f <= 0.0f) {
            this.Method_29103();
        }
        this.Field_29098.Method_20549(class_6295, f);
    }

    public void Method_29119(Class_23763 class_23763) {
        this.Field_29098.Method_20563(class_23763);
    }

    static {
        Field_29100 = LogManager.getLogger();
        Field_29101 = new GsonBuilder().registerTypeAdapter(Class_8643.class, (Object)new Class_10329()).create();
        Field_29099 = new Class_21894();
        Field_29097 = new Class_6002(new Class_2080(Class_29094.Method_29114("\u92c8\u92c0\u92d3\u92c6\u929f\u92c8\u92ce\u92d4\u92d6\u92cc\u92c9\u92c0\u92da\u92d6\u92c8\u92d2\u92db\u92d1")), 0.0, 0.0, (-22912 & 4099) != 0);
    }

    public void Method_29120() {
        if (this.Field_29098 != null) {
            this.Field_29098.Method_20571();
        }
    }

    public boolean Method_29121(Class_23763 class_23763) {
        return this.Field_29098.Method_20545(class_23763);
    }

    public void Method_29122() {
        this.Field_29098.Method_20562();
    }
}

