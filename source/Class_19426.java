/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.LWJGLException
 *  internal.org.lwjgl.Sys
 *  internal.org.lwjgl.input.Mouse
 *  internal.org.lwjgl.opengl.ContextCapabilities
 *  internal.org.lwjgl.opengl.Display
 *  internal.org.lwjgl.opengl.DisplayMode
 *  internal.org.lwjgl.opengl.GL11
 *  internal.org.lwjgl.opengl.GL30
 *  internal.org.lwjgl.opengl.GLContext
 *  internal.org.lwjgl.opengl.PixelFormat
 */
import internal.org.lwjgl.LWJGLException;
import internal.org.lwjgl.Sys;
import internal.org.lwjgl.input.Mouse;
import internal.org.lwjgl.opengl.ContextCapabilities;
import internal.org.lwjgl.opengl.Display;
import internal.org.lwjgl.opengl.DisplayMode;
import internal.org.lwjgl.opengl.GL11;
import internal.org.lwjgl.opengl.GL30;
import internal.org.lwjgl.opengl.GLContext;
import internal.org.lwjgl.opengl.PixelFormat;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_19426 {
    public static float Field_19427;
    private static boolean Field_19428;
    public static final Integer Field_19429;
    private static long Field_19430;
    public static String Field_19431;
    public static boolean Field_19432;
    public static final Boolean Field_19433;
    public static String Field_19434;
    private static int Field_19435;
    public static final Boolean Field_19436;
    public static final Boolean Field_19437;
    private static PrintStream Field_19438;
    private static int Field_19439;
    public static String[] Field_19440;
    public static boolean Field_19441;
    private static int Field_19442;
    public static final Boolean Field_19443;
    private static boolean Field_19444;
    public static final Float Field_19445;
    public static String Field_19446;
    public static final Boolean Field_19447;
    public static boolean Field_19448;
    public static Class_19668 Field_19449;
    public static final Float Field_19450;
    public static Class_19668 Field_19451;
    public static final Integer Field_19452;
    public static final Integer Field_19453;
    private static DisplayMode Field_19454;
    public static final Integer Field_19455;
    private static Thread Field_19456;
    public static float Field_19457;
    public static float Field_19458;
    private static boolean Field_19459;
    private static int Field_19460;
    private static boolean Field_19461;
    private static Class_39702 Field_19462;
    public static final Integer Field_19463;
    public static float Field_19464;
    private static String Field_19465;
    private static Class_18 Field_19466;
    public static boolean Field_19467;

    public static boolean Method_19468() {
        return Class_19426.Field_19462.Field_39740;
    }

    public static Object[] Method_19469(Object[] arrobject, Object object) {
        if (arrobject == null) {
            throw new NullPointerException("The given array is NULL");
        }
        int n = arrobject.length;
        int n2 = n + (4097 & 51);
        Object[] arrobject2 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n2);
        System.arraycopy(arrobject, -31696 & 4676, arrobject2, 907 & 8240, n);
        arrobject2[n] = object;
        return arrobject2;
    }

    public static Class_24997 Method_19470() {
        return Field_19466 == null ? null : Class_19426.Field_19466.Field_33;
    }

    private static int Method_19471() {
        return !GLContext.getCapabilities().OpenGL11 ? -16246 & 267 : (!GLContext.getCapabilities().OpenGL12 ? 79 & 907 : (!GLContext.getCapabilities().OpenGL13 ? 44 & -22386 : (!GLContext.getCapabilities().OpenGL14 ? 9389 & 20765 : (!GLContext.getCapabilities().OpenGL15 ? 5758 & 26638 : (!GLContext.getCapabilities().OpenGL20 ? 4271 & 18719 : (!GLContext.getCapabilities().OpenGL21 ? 6847 & 16404 : (!GLContext.getCapabilities().OpenGL30 ? 2101 & -19947 : (!GLContext.getCapabilities().OpenGL31 ? 2591 & 17438 : (!GLContext.getCapabilities().OpenGL32 ? 17471 & -32737 : (!GLContext.getCapabilities().OpenGL33 ? 1073 & 29418 : (!GLContext.getCapabilities().OpenGL40 ? -21403 & 4899 : -16212 & 7273)))))))))));
    }

    public static DisplayMode Method_19472(Dimension dimension) {
        DisplayMode[] arrdisplayMode = Display.getAvailableDisplayModes();
        for (int i = 32 & -27129; i < arrdisplayMode.length; ++i) {
            DisplayMode displayMode = arrdisplayMode[i];
            if (displayMode.getWidth() != dimension.width || displayMode.getHeight() != dimension.height || Field_19454 != null && (displayMode.getBitsPerPixel() != Field_19454.getBitsPerPixel() || displayMode.getFrequency() != Field_19454.getFrequency())) continue;
            return displayMode;
        }
        return Field_19454;
    }

    public static boolean Method_19473() {
        return (Class_19426.Field_19462.Field_39799 == (-32509 & 519) ? -32503 & 25601 : 1408 & 4096) != 0;
    }

    public static InputStream Method_19474(Class_279 class_279, Class_2080 class_2080) {
        Class_9953 class_9953 = class_279.Method_282(class_2080);
        return class_9953 == null ? null : class_9953.Method_9958();
    }

    public static boolean Method_19475() {
        return (Class_19426.Field_19462.Field_39707 == (4107 & 8215) ? -15485 & 8193 : 8484 & 1601) != 0;
    }

    public static boolean Method_19476() {
        return Class_19426.Field_19462.Field_39785;
    }

    public static boolean Method_19477() {
        return Class_19426.Field_19462.Field_39735;
    }

    public static boolean Method_19478() {
        return (!Class_19426.Method_19485() ? 16450 & -22615 : (!Class_19426.Method_19570() || Class_12440.Method_12737() ? 41 & -26367 : 1030 & 4608)) != 0;
    }

    public static boolean Method_19479() {
        return Field_19444;
    }

    public static boolean Method_19480() {
        return (Class_19426.Field_19462.Field_39843 != 0 ? (Class_19426.Field_19462.Field_39843 == (16682 & 11287) ? 1115 & 677 : 417 & 7178) : (int)((Class_19426.Method_19570() && !Class_12440.Field_12496.Method_15685() ? Class_12440.Field_12496.Method_15679() : (Field_19460 != 0 ? (Field_19460 == (834 & 2058) ? 4689 & -32631 : 0 & 34) : Class_19426.Field_19462.Field_39788)) ? 1 : 0)) != 0;
    }

    public static int Method_19481() {
        return Field_19439;
    }

    public static boolean Method_19482() {
        return Class_19426.Field_19462.Field_39712;
    }

    public static boolean Method_19483() {
        return (Class_19426.Field_19462.Field_39718 == 0 ? Class_19426.Field_19462.Field_39788 : (Class_19426.Field_19462.Field_39718 == (-25078 & 8386) ? -32709 & 23685 : 64 & 19113)) != 0;
    }

    public static boolean Method_19484() {
        return (Class_19426.Field_19462.Field_39799 == 0 ? Class_19426.Field_19462.Field_39788 : (Class_19426.Field_19462.Field_39799 == (8258 & 946) ? -15533 & 6149 : 1 & 24724)) != 0;
    }

    public static boolean Method_19485() {
        return Class_19426.Field_19462.Field_39753;
    }

    public static boolean Method_19486() {
        return (Class_19426.Field_19462.Field_39797 == (-24317 & 16447) ? 801 & -32635 : 3084 & 643) != 0;
    }

    public static Class_2035[] Method_19487() {
        Class_10502 class_10502 = Field_19466.Method_200();
        List list = class_10502.Method_10520();
        ArrayList<Class_2035> arrayList = new ArrayList<Class_2035>();
        for (Object e : list) {
            arrayList.add(((Class_10400)e).Method_10407());
        }
        Class_2035[] arrclass_2035 = arrayList.toArray(new Class_2035[arrayList.size()]);
        return arrclass_2035;
    }

    public static boolean Method_19488() {
        return ((Boolean)Class_19426.Field_19462.Field_39732.Field_8894.\u0000strictfp() == false ? 17289 & 6145 : 24 & 16449) != 0;
    }

    public static boolean Method_19489() {
        return Class_19426.Field_19462.Field_39847;
    }

    public static void Method_19490(boolean bl) {
        Field_19444 = bl;
    }

    public static boolean Method_19491() {
        return Class_19426.Field_19462.Field_39791;
    }

    public static boolean Method_19492() {
        return Class_19426.Field_19462.Field_39765;
    }

    public static InputStream Method_19493(Class_2080 class_2080) {
        return Class_19426.Method_19474(Field_19466.Method_208(), class_2080);
    }

    public static boolean Method_19494() {
        return Class_19426.Field_19462.Field_39871;
    }

    private static void Method_19495(String string, int n) {
        try {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            if (threadGroup == null) {
                return;
            }
            int n2 = (threadGroup.activeCount() + (-28118 & 286)) * (5162 & -32110);
            Thread[] arrthread = new Thread[n2];
            threadGroup.enumerate(arrthread, (8832 & 42) != 0);
            for (int i = -16368 & 8482; i < arrthread.length; ++i) {
                Thread thread = arrthread[i];
                if (thread == null || !thread.getName().startsWith(string)) continue;
                thread.setPriority(n);
            }
        }
        catch (Throwable throwable) {
            Class_19426.Method_19526(throwable.getClass().getName() + ": " + throwable.getMessage());
        }
    }

    public static void Method_19496() {
        if (Class_19426.Method_19481() > 0) {
            int n = Class_19426.Method_19481();
            DisplayMode displayMode = Display.getDisplayMode();
            Class_19426.Method_19526("FSAA Samples: " + n);
            try {
                Display.destroy();
                Display.setDisplayMode((DisplayMode)displayMode);
                Display.create((PixelFormat)new PixelFormat().withDepthBits(8282 & 280).withSamples(n));
                Display.setResizable((9269 & 6592) != 0);
                Display.setResizable((4867 & 1201) != 0);
            }
            catch (LWJGLException lWJGLException) {
                Class_19426.Method_19610("Error setting FSAA: " + n + "x");
                lWJGLException.printStackTrace();
                try {
                    Display.setDisplayMode((DisplayMode)displayMode);
                    Display.create((PixelFormat)new PixelFormat().withDepthBits(31032 & 1181));
                    Display.setResizable((8773 & 6426) != 0);
                    Display.setResizable((9225 & 4657) != 0);
                }
                catch (LWJGLException lWJGLException2) {
                    lWJGLException2.printStackTrace();
                    try {
                        Display.setDisplayMode((DisplayMode)displayMode);
                        Display.create();
                        Display.setResizable((2946 & -32735) != 0);
                        Display.setResizable((8729 & 33) != 0);
                    }
                    catch (LWJGLException lWJGLException3) {
                        lWJGLException3.printStackTrace();
                    }
                }
            }
        }
    }

    public static void Method_19497(String string) {
        Class_19426.Method_19526(string);
    }

    public static Class_24069 Method_19498() {
        return Class_19426.Method_19519().Method_189();
    }

    public static boolean Method_19499() {
        return Class_19426.Field_19462.Field_39776;
    }

    public static Dimension Method_19500() {
        if (Field_19454 == null) {
            return null;
        }
        if (Field_19462 == null) {
            return new Dimension(Field_19454.getWidth(), Field_19454.getHeight());
        }
        String string = Class_19426.Field_19462.Field_39846;
        if (string.equals("Default")) {
            return new Dimension(Field_19454.getWidth(), Field_19454.getHeight());
        }
        String[] arrstring = Class_19426.Method_19561(string, " x");
        return arrstring.length < (-24430 & 34) ? new Dimension(Field_19454.getWidth(), Field_19454.getHeight()) : new Dimension(Class_19426.Method_19502(arrstring[-6592 & 2049], -1 & -1), Class_19426.Method_19502(arrstring[10389 & -32759], -1 & -1));
    }

    public static boolean Method_19501(Class_2080 class_2080) {
        Class_2035 class_2035 = Class_19426.Method_19525(class_2080);
        return (class_2035 == Class_19426.Method_19576() ? -18383 & 527 : 4161 & -16368) != 0;
    }

    public static int Method_19502(String string, int n) {
        try {
            return string == null ? n : Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return n;
        }
    }

    public static boolean Method_19503() {
        return Class_19426.Field_19462.Field_39828;
    }

    public static void Method_19504() {
        Field_19466.Method_164().Method_19156(Class_19426.Field_19466.Field_80, Class_19426.Field_19466.Field_44);
        if (Class_19426.Field_19466.Field_58 != null) {
            Class_19426.Field_19466.Field_58.Method_22934(Class_19426.Field_19466.Field_80, Class_19426.Field_19466.Field_44);
        }
    }

    public static float Method_19505() {
        return Class_19426.Method_19570() && Class_12440.Field_12654 >= 0.0f ? Class_12440.Field_12654 : Class_19426.Field_19462.Field_39808;
    }

    public static boolean Method_19506() {
        return Class_19426.Field_19462.Field_39755;
    }

    public static Class_19668 Method_19507(String string, Class_19668 class_19668) {
        try {
            if (string == null) {
                return class_19668;
            }
            Pattern pattern = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
            Matcher matcher = pattern.matcher(string);
            if (!matcher.matches()) {
                return class_19668;
            }
            int n = Integer.parseInt(matcher.group(3 & -12159));
            int n2 = Integer.parseInt(matcher.group(21646 & -22526));
            int n3 = matcher.group(5629 & 8196) != null ? Integer.parseInt(matcher.group(17412 & 533)) : 2306 & -32744;
            String string2 = matcher.group(-29307 & 28701);
            return new Class_19668(n, n2, n3, string2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return class_19668;
        }
    }

    public static boolean Method_19508() {
        return Class_19426.Field_19462.Field_39739;
    }

    public static int Method_19509() {
        if (Field_19442 < 0) {
            String[] arrstring = Class_19426.Method_19561("1.8.8", ".");
            int n = 2336 & -28527;
            if (arrstring.length > 0) {
                n += (26385 & -20714) * Class_19426.Method_19502(arrstring[8244 & 20490], 2304 & 25600);
            }
            if (arrstring.length > (7505 & -32767)) {
                n += (16501 & 4068) * Class_19426.Method_19502(arrstring[-5085 & 321], -15976 & 7168);
            }
            if (arrstring.length > (9739 & 2210)) {
                n += (8225 & 16907) * Class_19426.Method_19502(arrstring[-30434 & 28802], 2064 & 1600);
            }
            Field_19442 = n;
        }
        return Field_19442;
    }

    public static boolean Method_19510() {
        return (Class_19426.Method_19603() <= (8209 & 3073) ? -28647 & 8705 : 17968 & 4) != 0;
    }

    public static boolean Method_19511() {
        return Class_19426.Field_19462.Field_39867;
    }

    public static boolean Method_19512() {
        Field_19462.getClass();
        return ((10247 & 1091) != (1543 & -30653) ? 545 & -21495 : 6594 & 25617) != 0;
    }

    public static int Method_19513() {
        if (Field_19462 == null) {
            return Field_19463;
        }
        switch (Class_19426.Field_19462.Field_39760) {
            case 0: {
                return 26370 & 14098;
            }
            case 1: {
                return 9990 & -20710;
            }
            case 2: {
                if (Class_19426.Method_19579()) {
                    return 9985 & -2287;
                }
                return 10062 & 28418;
            }
            case 3: {
                if (Class_19426.Method_19579()) {
                    return 12035 & -22629;
                }
                return 10170 & 9991;
            }
        }
        return 30503 & 12122;
    }

    public static void Method_19514(long l) {
        try {
            Thread.currentThread();
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    public static String[] Method_19515(InputStream inputStream) {
        ArrayList<String> arrayList = new ArrayList<String>();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "ASCII");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        do {
            String string;
            if ((string = bufferedReader.readLine()) == null) {
                String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
                return arrstring;
            }
            arrayList.add(string);
        } while (true);
    }

    public static boolean Method_19516() {
        return Class_19426.Field_19462.Field_39761;
    }

    public static String[] Method_19517() {
        if (Field_19440 == null) {
            Field_19440 = Class_19426.Method_19588();
        }
        return Field_19440;
    }

    public static boolean Method_19518() {
        return Class_19426.Field_19462.Field_39841;
    }

    public static Class_18 Method_19519() {
        return Field_19466;
    }

    public static int Method_19520() {
        String[] arrstring = new String[19151 & -24525];
        arrstring[1538 & 6432] = "sun.arch.data.model";
        arrstring[2089 & -28671] = "com.ibm.vm.bitmode";
        arrstring[2 & -18045] = "os.arch";
        String[] arrstring2 = arrstring;
        for (int i = 8272 & 257; i < arrstring2.length; ++i) {
            String string = arrstring2[i];
            String string2 = System.getProperty(string);
            if (string2 == null || !string2.contains("64")) continue;
            return 6221 & 64;
        }
        return 1380 & 58;
    }

    public static boolean Method_19521() {
        return (!Class_19426.Method_19602() ? 20612 & 9768 : (Class_19426.Field_19462.Field_39797 == (582 & 4538) ? -29181 & 12289 : 1024 & -31972)) != 0;
    }

    public static int Method_19522(int n) {
        n = n ^ -32513 & 2365 ^ n >> (1086 & 81);
        n += n << (20619 & 3639);
        n ^= n >> (9468 & 7);
        n *= 1073146735 & -1479218387;
        n ^= n >> (15 & 191);
        return n;
    }

    public static boolean Method_19523() {
        return Class_19426.Field_19462.Field_39849;
    }

    public static void Method_19524() {
        try {
            if (Field_19466.Method_238()) {
                if (Field_19459) {
                    return;
                }
                Field_19459 = 20865 & 8229;
                Field_19428 = 771 & -8160;
                DisplayMode displayMode = Display.getDisplayMode();
                Dimension dimension = Class_19426.Method_19500();
                if (dimension == null) {
                    return;
                }
                if (displayMode.getWidth() == dimension.width && displayMode.getHeight() == dimension.height) {
                    return;
                }
                DisplayMode displayMode2 = Class_19426.Method_19472(dimension);
                if (displayMode2 == null) {
                    return;
                }
                Display.setDisplayMode((DisplayMode)displayMode2);
                Class_19426.Field_19466.Field_80 = Display.getDisplayMode().getWidth();
                Class_19426.Field_19466.Field_44 = Display.getDisplayMode().getHeight();
                if (Class_19426.Field_19466.Field_80 <= 0) {
                    Class_19426.Field_19466.Field_80 = 17187 & 13;
                }
                if (Class_19426.Field_19466.Field_44 <= 0) {
                    Class_19426.Field_19466.Field_44 = 20617 & 1281;
                }
                if (Class_19426.Field_19466.Field_36 != null) {
                    Class_31566 class_31566 = new Class_31566(Field_19466);
                    int n = class_31566.Method_31574();
                    int n2 = class_31566.Method_31575();
                    Class_19426.Field_19466.Field_36.Method_1530(Field_19466, n, n2);
                }
                Class_19426.Field_19466.Field_64 = new Class_10956(Field_19466);
                Class_19426.Method_19504();
                Display.setFullscreen((-32671 & 6401) != 0);
                Class_19426.Field_19466.Field_84.Method_39893();
                Class_16867.Method_16965();
            } else {
                if (Field_19428) {
                    return;
                }
                Field_19428 = 1 & -15763;
                Field_19459 = 4416 & 1667;
                Class_19426.Field_19466.Field_84.Method_39893();
                Display.update();
                Class_16867.Method_16965();
                Display.setResizable((9220 & 21016) != 0);
                Display.setResizable((2257 & 24615) != 0);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static Class_2035 Method_19525(Class_2080 class_2080) {
        Class_2035[] arrclass_2035 = Class_19426.Method_19487();
        for (int i = arrclass_2035.length - (-22101 & 4101); i >= 0; --i) {
            Class_2035 class_2035 = arrclass_2035[i];
            if (!class_2035.Method_2041(class_2080)) continue;
            return class_2035;
        }
        if (Class_19426.Method_19576().Method_2041(class_2080)) {
            return Class_19426.Method_19576();
        }
        return null;
    }

    public static void Method_19526(String string) {
        Field_19438.print("[OptiFine] ");
        Field_19438.println(string);
    }

    private static Class_19668 Method_19527() {
        return GLContext.getCapabilities().OpenGL44 ? new Class_19668(4615 & -32636, 21181 & 10244) : (GLContext.getCapabilities().OpenGL43 ? new Class_19668(261 & -32650, -27253 & 83) : (GLContext.getCapabilities().OpenGL42 ? new Class_19668(12 & 25749, 578 & 2475) : (GLContext.getCapabilities().OpenGL41 ? new Class_19668(5397 & 2596, 16929 & 6529) : (GLContext.getCapabilities().OpenGL40 ? new Class_19668(76 & 24580, 4653 & -31344) : (GLContext.getCapabilities().OpenGL33 ? new Class_19668(9619 & 6211, -32765 & 17031) : (GLContext.getCapabilities().OpenGL32 ? new Class_19668(8551 & -28533, 4526 & 2130) : (GLContext.getCapabilities().OpenGL31 ? new Class_19668(4675 & 18451, 26433 & -28635) : (GLContext.getCapabilities().OpenGL30 ? new Class_19668(6535 & 115, -23959 & 4224) : (GLContext.getCapabilities().OpenGL21 ? new Class_19668(258 & 3675, 20243 & 4321) : (GLContext.getCapabilities().OpenGL20 ? new Class_19668(-32757 & 50, 384 & 4097) : (GLContext.getCapabilities().OpenGL15 ? new Class_19668(-30715 & 4763, -8147 & 1109) : (GLContext.getCapabilities().OpenGL14 ? new Class_19668(779 & -29583, 22231 & -32756) : (GLContext.getCapabilities().OpenGL13 ? new Class_19668(17921 & -32615, 24583 & 8035) : (GLContext.getCapabilities().OpenGL12 ? new Class_19668(-27387 & 16961, 8466 & 23686) : (GLContext.getCapabilities().OpenGL11 ? new Class_19668(-24549 & 17157, 4619 & 33) : new Class_19668(3585 & -24445, 6145 & -32122))))))))))))))));
    }

    public static Object[] Method_19528(Object[] arrobject, Object object, int n) {
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(arrobject));
        arrayList.add(n, object);
        Object[] arrobject2 = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), arrayList.size());
        return arrayList.toArray(arrobject2);
    }

    public static boolean Method_19529(Object object, Object object2) {
        return (object == object2 ? -30715 & 12699 : (object == null ? 2114 & -3823 : (int)(object.equals(object2) ? 1 : 0))) != 0;
    }

    public static boolean Method_19530() {
        return Class_19426.Field_19462.Field_39877;
    }

    public static boolean Method_19531() {
        return Class_19426.Field_19462.Field_39796;
    }

    public static Class_34695 Method_19532() {
        return Field_19466.Method_253();
    }

    public static boolean Method_19533(Class_279 class_279, Class_2080 class_2080) {
        try {
            Class_9953 class_9953 = class_279.Method_282(class_2080);
            return (class_9953 != null ? 1033 & 8241 : 72 & 14464) != 0;
        }
        catch (IOException iOException) {
            return (4377 & -31712) != 0;
        }
    }

    public static DisplayMode[] Method_19534() {
        try {
            Object object;
            DisplayMode[] arrdisplayMode = Display.getAvailableDisplayModes();
            ArrayList<DisplayMode> arrayList = new ArrayList<DisplayMode>();
            for (int i = 5380 & 26696; i < arrdisplayMode.length; ++i) {
                object = arrdisplayMode[i];
                if (Field_19454 != null && (object.getBitsPerPixel() != Field_19454.getBitsPerPixel() || object.getFrequency() != Field_19454.getFrequency())) continue;
                arrayList.add((DisplayMode)object);
            }
            DisplayMode[] arrdisplayMode2 = arrayList.toArray((T[])new DisplayMode[arrayList.size()]);
            object = new Class_21459();
            Arrays.sort(arrdisplayMode2, object);
            return arrdisplayMode2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            DisplayMode[] arrdisplayMode = new DisplayMode[5637 & -16215];
            arrdisplayMode[256 & -31664] = Field_19454;
            return arrdisplayMode;
        }
    }

    public static boolean Method_19535() {
        return Class_19426.Field_19462.Field_39861;
    }

    public static boolean Method_19536() {
        return (Class_19426.Field_19462.Field_39707 == (-32463 & 25091) ? 1025 & 18467 : -24565 & 17536) != 0;
    }

    public static boolean Method_19537() {
        return (Class_19426.Field_19462.Field_39797 == (-29055 & 259) ? 2561 & -32591 : 25096 & 5120) != 0;
    }

    public static boolean Method_19538() {
        return (Class_19426.Method_19481() > 0 ? 131 & 6193 : -19448 & 16401) != 0;
    }

    public static String Method_19539(String string) {
        return string == null ? "" : string;
    }

    public static int Method_19540() {
        String string = System.getenv("ProgramFiles(X86)");
        return string != null ? -32679 & 4550 : -32540 & 11816;
    }

    public static boolean Method_19541() {
        return Class_19426.Field_19462.Field_39810;
    }

    public static boolean Method_19542() {
        return (Thread.currentThread() == Field_19456 ? 5123 & 641 : 12294 & 18960) != 0;
    }

    public static float Method_19543(float f) {
        return f < 0.0f ? 0.0f : (f > 1.0f ? 1.0f : f);
    }

    public static boolean Method_19544() {
        Field_19462.getClass();
        return ((775 & 1043) == (-31737 & 26650) ? 4241 & 20077 : -23984 & 0) != 0;
    }

    public static String Method_19545() {
        return "OptiFine_1.8.8_HD_U_E1 BP";
    }

    public static boolean Method_19546() {
        return (Class_19426.Field_19462.Field_39832 == 0 ? Class_19426.Field_19462.Field_39788 : (Class_19426.Field_19462.Field_39832 == (-13534 & 9354) ? 259 & 5 : -32670 & 3073)) != 0;
    }

    public static int[] Method_19547(Integer[] arrinteger) {
        if (arrinteger == null) {
            return null;
        }
        if (arrinteger.length == 0) {
            return new int[256 & 18603];
        }
        int[] arrn = new int[arrinteger.length];
        for (int i = -24568 & 5120; i < arrn.length; ++i) {
            arrn[i] = arrinteger[i];
        }
        return arrn;
    }

    private static String Method_19548(String string) {
        int n = string.indexOf(18024 & -24280);
        if (n < 0) {
            return "";
        }
        int n2 = string.indexOf(35 & -11228, n);
        return n2 < 0 ? "" : string.substring(n + (17281 & 8237), n2);
    }

    public static boolean Method_19549() {
        return (Class_19426.Field_19462.Field_39817 != (-24314 & 114) ? 18561 & 8513 : -24446 & 20480) != 0;
    }

    public static void Method_19550(File file, String string) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] arrby = string.getBytes("ASCII");
        fileOutputStream.write(arrby);
        fileOutputStream.close();
    }

    public static String Method_19551(List list, String string) {
        if (list == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(list.size() * (10343 & -32763));
        for (int i = 491 & 8212; i < list.size(); ++i) {
            Object e = list.get(i);
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(e));
        }
        return stringBuffer.toString();
    }

    public static double Method_19552(double d, double d2, double d3) {
        return d < d2 ? d2 : (d > d3 ? d3 : d);
    }

    public static Class_19668 Method_19553() {
        if (Field_19451 == null) {
            String string = GL11.glGetString((int)(-24702 & 24415));
            Field_19451 = Class_19426.Method_19507(string, null);
            if (Field_19451 == null) {
                Field_19451 = Class_19426.Method_19527();
            }
            if (Field_19451 == null) {
                Field_19451 = new Class_19668(-32719 & 1795, 14608 & -31581);
            }
        }
        return Field_19451;
    }

    public static Class_9953 Method_19554(Class_2080 class_2080) {
        return Field_19466.Method_208().Method_282(class_2080);
    }

    public static String Method_19555(Object[] arrobject) {
        if (arrobject == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrobject.length * (12549 & 17125));
        for (int i = 8456 & 131; i < arrobject.length; ++i) {
            Object object = arrobject[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(String.valueOf(object));
        }
        return stringBuffer.toString();
    }

    public static boolean Method_19556() {
        return (Class_19426.Method_19571().Field_39746 > 0 ? 19011 & -28411 : -32748 & 19330) != 0;
    }

    public static boolean Method_19557() {
        return (Class_19426.Field_19462.Field_39707 == 0 || Class_19426.Field_19462.Field_39707 == (258 & 9795) ? 3585 & 16523 : -10748 & 10338) != 0;
    }

    public static String Method_19558(int[] arrn) {
        if (arrn == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrn.length * (8197 & 17487));
        for (int i = -32638 & 584; i < arrn.length; ++i) {
            int n = arrn[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(String.valueOf(n));
        }
        return stringBuffer.toString();
    }

    public static Class_19668 Method_19559() {
        String string;
        if (Field_19449 == null && (Field_19449 = Class_19426.Method_19507(string = GL11.glGetString((int)(683970461 & -2076591220)), null)) == null) {
            Field_19449 = new Class_19668(6539 & -15355, 2126 & -16357);
        }
        return Field_19449;
    }

    public static void Method_19560() {
        Field_19460 = 1057 & -29950;
        Class_279 class_279 = Class_19426.Method_19564();
        if (class_279 != null) {
            try {
                InputStream inputStream = class_279.Method_282(new Class_2080("mcpatcher/color.properties")).Method_9958();
                if (inputStream == null) {
                    return;
                }
                Properties properties = new Properties();
                properties.load(inputStream);
                inputStream.close();
                String string = properties.getProperty("clouds");
                if (string == null) {
                    return;
                }
                Class_19426.Method_19526("Texture pack clouds: " + string);
                string = string.toLowerCase();
                if (string.equals("fast")) {
                    Field_19460 = 4625 & -24249;
                }
                if (string.equals("fancy")) {
                    Field_19460 = -27897 & 3138;
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public static String[] Method_19561(String string, String string2) {
        String[] arrstring;
        StringTokenizer stringTokenizer = new StringTokenizer(string, string2);
        ArrayList<String[]> arrayList = new ArrayList<String[]>();
        while (stringTokenizer.hasMoreTokens()) {
            arrstring = stringTokenizer.nextToken();
            arrayList.add(arrstring);
        }
        arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    public static boolean Method_19562() {
        return Class_19426.Field_19462.Field_39789;
    }

    public static boolean Method_19563() {
        return Class_19426.Field_19462.Field_39784;
    }

    public static Class_279 Method_19564() {
        return Field_19466.Method_208();
    }

    public static float Method_19565(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static int Method_19566(Class_4751 class_4751, int n) {
        int n2 = Class_19426.Method_19522(n + (9767 & -32579));
        n2 = Class_19426.Method_19522(n2 + class_4751.\u0000= final());
        n2 = Class_19426.Method_19522(n2 + class_4751.\u0000strictfp());
        n2 = Class_19426.Method_19522(n2 + class_4751.\u0000, `());
        return n2;
    }

    public static boolean Method_19567() {
        return (Class_19426.Field_19462.Field_39821 != (10763 & 17475) ? 14427 & -31999 : 8704 & 18436) != 0;
    }

    public static boolean Method_19568() {
        return Class_19426.Field_19462.Field_39872;
    }

    public static void Method_19569() {
        Field_19435 = Runtime.getRuntime().availableProcessors();
    }

    public static boolean Method_19570() {
        return Class_12440.Field_12467;
    }

    public static Class_39702 Method_19571() {
        return Field_19462;
    }

    public static boolean Method_19572() {
        boolean bl = Class_19426.Method_19599();
        long l = System.currentTimeMillis();
        if (bl) {
            Field_19430 = l;
            return (-22503 & 1) != 0;
        }
        return (l - Field_19430 < (-4838170656157493145L & 44302580L) ? -16369 & 15361 : 528 & 24940) != 0;
    }

    private void Method_19573() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_19574(Class_39702 class_39702) {
        Field_19462 = class_39702;
        Field_19466 = Class_18.Field_89;
        Field_19454 = Display.getDesktopDisplayMode();
        Class_19426.Method_19569();
    }

    public static int Method_19575() {
        return Class_19426.Field_19462.Field_39750;
    }

    public static Class_2035 Method_19576() {
        return Class_19426.Field_19466.Method_200().Field_10509;
    }

    public static String Method_19577() {
        int n = Class_19426.Method_19471();
        String string = "" + n / (10 & 6190) + "." + n % (5150 & 16714);
        return string;
    }

    public static int Method_19578() {
        return Class_19426.Field_19462.Field_39778;
    }

    public static boolean Method_19579() {
        return (Class_19426.Method_19575() > (-31583 & 18519) ? -13279 & 389 : (Class_19426.Method_19481() > 0 ? 11459 & 20485 : 8224 & -32768)) != 0;
    }

    public static boolean Method_19580() {
        return (!Class_19426.Method_19485() ? 8320 & -26877 : (!Class_19426.Method_19570() || Class_12440.Method_12755() ? 4363 & -21499 : -16248 & 4932)) != 0;
    }

    public static Class_2651 Method_19581() {
        if (Field_19466 == null) {
            return null;
        }
        Class_570 class_570 = Class_19426.Field_19466.Field_72;
        if (class_570 == null) {
            return null;
        }
        if (!Field_19466.Method_251()) {
            return null;
        }
        Class_3013 class_3013 = Field_19466.Method_180();
        if (class_3013 == null) {
            return null;
        }
        Class_18343 class_18343 = class_570.Field_284;
        if (class_18343 == null) {
            return null;
        }
        int n = class_18343.Method_18379();
        try {
            Class_2651 class_2651 = class_3013.\u0000strictfp(n);
            return class_2651;
        }
        catch (NullPointerException nullPointerException) {
            return null;
        }
    }

    public static boolean Method_19582() {
        return (Class_19426.Field_19462.Field_39843 != 0 ? (Class_19426.Field_19462.Field_39843 == (18443 & 8567) ? 11397 & 515 : 4161 & 11392) : (Class_19426.Method_19570() && !Class_12440.Field_12496.Method_15685() ? Class_12440.Field_12496.Method_15677() : (Field_19460 != 0 ? (Field_19460 == (18067 & 4419) ? 8211 & 33 : 10 & 3200) : 18052 & -24574))) != 0;
    }

    public static void Method_19583() {
        Class_18 class_18 = Field_19466;
        int n = Class_18.Method_163();
        String string = Class_19426.Method_19548(Class_19426.Field_19466.Field_83);
        int n2 = Class_19426.Field_19466.Field_33.Method_25126();
        int n3 = Class_19426.Field_19466.Field_33.Method_25154();
        int n4 = Class_19426.Field_19466.Field_33.Method_25125();
        String string2 = "" + n + " fps, C: " + n2 + ", E: " + n3 + "+" + n4 + ", U: " + string;
        Class_19426.Field_19466.Field_27.Method_28692(string2, 29710 & 291, 5266 & 8203, -2034976 & -2038550);
    }

    public static void Method_19584() {
        if (!Field_19461 && Display.isCreated()) {
            Field_19461 = 12881 & -16383;
            Class_19426.Method_19609();
        }
    }

    public static void Method_19585() {
        Class_19426.Method_19584();
        Field_19439 = Class_19426.Field_19462.Field_39746;
        Class_19426.Method_19496();
        Class_19426.Method_19524();
        Field_19456 = Thread.currentThread();
        Class_19426.Method_19601();
    }

    public static String Method_19586(InputStream inputStream) {
        return Class_19426.Method_19593(inputStream, "ASCII");
    }

    public static boolean Method_19587() {
        return (Class_19426.Field_19462.Field_39821 == (-32478 & 2) ? -26359 & 25111 : -24559 & 480) != 0;
    }

    static {
        Field_19465 = null;
        Field_19444 = 8321 & -30396;
        Field_19446 = null;
        Field_19434 = null;
        Field_19431 = null;
        Field_19441 = 8256 & 2094;
        Field_19467 = 2305 & -27008;
        Field_19462 = null;
        Field_19466 = null;
        Field_19461 = 540 & -15968;
        Field_19456 = null;
        Field_19454 = null;
        Field_19439 = 7714 & 128;
        Field_19435 = 6144 & -7968;
        Field_19432 = -28144 & 17728;
        Field_19460 = 514 & -15024;
        Field_19448 = 14368 & 1921;
        Field_19459 = 16656 & -28663;
        Field_19428 = 16642 & 133;
        Field_19438 = new PrintStream(new FileOutputStream(FileDescriptor.out));
        Field_19436 = (21001 & 257) != 0;
        Field_19450 = Float.valueOf(0.5102041f * 0.39200002f);
        Field_19433 = (-32752 & 7240) != 0;
        Field_19443 = (2368 & 9344) != 0;
        Field_19455 = 4368 & 1574;
        Field_19463 = 26480 & 9984;
        Field_19445 = Float.valueOf(0.07313433f * 1.3673469f);
        Field_19447 = (32 & -7616) != 0;
        Field_19453 = -17664 & 16417;
        Field_19429 = 10329 & -27367;
        Field_19452 = 19467 & 12807;
        Field_19437 = (16514 & -30716) != 0;
        Field_19430 = System.currentTimeMillis();
        Field_19440 = null;
        Field_19451 = null;
        Field_19449 = null;
        Field_19442 = -1 & -1;
        Field_19457 = 1.0f;
        Field_19427 = 0.0f;
        Field_19464 = 1.0f;
    }

    private static String[] Method_19588() {
        Object object;
        try {
            int n;
            object = Class_19426.Method_19553();
            if (((Class_19668)object).Method_19673() >= (13059 & 75) && (n = GL11.glGetInteger((int)(37469 & -1534033121))) > 0) {
                String[] arrstring = new String[n];
                for (int i = 8197 & 6904; i < n; ++i) {
                    arrstring[i] = GL30.glGetStringi((int)(-8441 & 8051), (int)i);
                }
                return arrstring;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            object = GL11.glGetString((int)(7987 & 8003));
            String[] arrstring = ((String)object).split(" ");
            return arrstring;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return new String[2816 & 17411];
        }
    }

    public static boolean Method_19589() {
        return Class_19426.Field_19462.Field_39749;
    }

    public static boolean Method_19590() {
        return Class_19426.Field_19462.Field_39723;
    }

    public static boolean Method_19591() {
        return Class_19426.Field_19462.Field_39767;
    }

    public static boolean Method_19592() {
        return Class_19426.Field_19462.Field_39850;
    }

    public static String Method_19593(InputStream inputStream, String string) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, string);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuffer stringBuffer = new StringBuffer();
        String string2;
        while ((string2 = bufferedReader.readLine()) != null) {
            stringBuffer.append(string2);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static boolean Method_19594(Class_2080 class_2080) {
        try {
            Class_9953 class_9953 = Class_19426.Method_19554(class_2080);
            return (class_9953 != null ? 1 & 167 : 16385 & 8432) != 0;
        }
        catch (IOException iOException) {
            return (146 & 29448) != 0;
        }
    }

    public static float Method_19595(String string, float f) {
        try {
            return string == null ? f : Float.parseFloat(string);
        }
        catch (NumberFormatException numberFormatException) {
            return f;
        }
    }

    public static boolean Method_19596(String string, boolean bl) {
        try {
            if (string == null) {
                return bl;
            }
            string = string.trim();
            return Boolean.parseBoolean(string);
        }
        catch (NumberFormatException numberFormatException) {
            return bl;
        }
    }

    public static boolean Method_19597() {
        return (Class_19426.Field_19462.Field_39704 != (66 & 518) ? 2049 & 17669 : -30657 & 64) != 0;
    }

    public static String[] Method_19598() {
        DisplayMode[] arrdisplayMode = Class_19426.Method_19534();
        String[] arrstring = new String[arrdisplayMode.length];
        for (int i = 14720 & 4; i < arrdisplayMode.length; ++i) {
            String string;
            DisplayMode displayMode = arrdisplayMode[i];
            arrstring[i] = string = "" + displayMode.getWidth() + "x" + displayMode.getHeight();
        }
        return arrstring;
    }

    private static boolean Method_19599() {
        return (Mouse.isButtonDown((int)(6192 & 8200)) ? 4363 & 27297 : (int)(Mouse.isButtonDown((int)(25601 & 4117)) ? 1 : 0)) != 0;
    }

    public static boolean Method_19600() {
        return Class_19426.Field_19462.Field_39813;
    }

    public static void Method_19601() {
        Class_19426.Method_19569();
        int n = -24532 & 19720;
        if (Class_19426.Method_19510()) {
            if (Class_19426.Method_19608()) {
                Field_19456.setPriority(2062 & 554);
                Class_19426.Method_19495("Server thread", 8209 & 16897);
            } else {
                Field_19456.setPriority(69 & 2709);
                Class_19426.Method_19495("Server thread", 135 & 7429);
            }
        } else {
            Field_19456.setPriority(21130 & -32390);
            Class_19426.Method_19495("Server thread", 8197 & 455);
        }
    }

    public static boolean Method_19602() {
        return Field_19441;
    }

    public static int Method_19603() {
        return Field_19435;
    }

    public static boolean Method_19604() {
        return (Class_19426.Field_19462.Field_39782 == 0 ? Class_19426.Field_19462.Field_39788 : (Class_19426.Field_19462.Field_39782 == (-16345 & 14362) ? 2177 & 4133 : 9348 & -32742)) != 0;
    }

    public static String Method_19605(int[] arrn, String string) {
        if (arrn == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(arrn.length * (69 & 1461));
        for (int i = 8449 & -16352; i < arrn.length; ++i) {
            int n = arrn[i];
            if (i > 0) {
                stringBuffer.append(string);
            }
            stringBuffer.append(String.valueOf(n));
        }
        return stringBuffer.toString();
    }

    public static int Method_19606(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static boolean Method_19607() {
        return Class_19426.Field_19462.Field_39793;
    }

    public static boolean Method_19608() {
        return Class_19426.Field_19462.Field_39752;
    }

    private static void Method_19609() {
        Class_19426.Method_19497("");
        Class_19426.Method_19497(Class_19426.Method_19545());
        Class_19426.Method_19497("" + new Date());
        Class_19426.Method_19497("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
        Class_19426.Method_19497("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
        Class_19426.Method_19497("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
        Class_19426.Method_19497("LWJGL: " + Sys.getVersion());
        Field_19446 = GL11.glGetString((int)(8002 & 8070));
        Field_19434 = GL11.glGetString((int)(-16485 & 7969));
        Field_19431 = GL11.glGetString((int)(7959 & 16128));
        Class_19426.Method_19497("OpenGL: " + Field_19434 + ", version " + Field_19446 + ", " + Field_19431);
        Class_19426.Method_19497("OpenGL Version: " + Class_19426.Method_19577());
        if (!GLContext.getCapabilities().OpenGL12) {
            Class_19426.Method_19497("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
        }
        if (!(Field_19441 = GLContext.getCapabilities().GL_NV_fog_distance)) {
            Class_19426.Method_19497("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
        }
        if (!(Field_19467 = GLContext.getCapabilities().GL_ARB_occlusion_query)) {
            Class_19426.Method_19497("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
        }
        int n = Class_18.Method_224();
        Class_19426.Method_19526("Maximum texture size: " + n + "x" + n);
    }

    public static void Method_19610(String string) {
        Field_19438.print("[OptiFine] [WARN] ");
        Field_19438.println(string);
    }

    public static void Method_19611(String string, String string2) {
        Class_43206 class_43206 = new Class_43206(Class_19426.Field_19466.Field_36, string, string2);
        Field_19466.Method_218(class_43206);
    }

    public static boolean Method_19612() {
        return (Class_19426.Method_19575() > (8449 & 16997) ? 5249 & -22239 : 130 & 16969) != 0;
    }

    public static float Method_19613() {
        return Class_19426.Field_19462.Field_39766;
    }

    public static String Method_19614() {
        if (Field_19466 == null) {
            return "";
        }
        if (Field_19466.Method_200() == null) {
            return "";
        }
        Class_2035[] arrclass_2035 = Class_19426.Method_19487();
        if (arrclass_2035.length <= 0) {
            return Class_19426.Method_19576().Method_2036();
        }
        String[] arrstring = new String[arrclass_2035.length];
        for (int i = 34 & 4224; i < arrclass_2035.length; ++i) {
            arrstring[i] = arrclass_2035[i].Method_2036();
        }
        String string = Class_19426.Method_19555(arrstring);
        return string;
    }
}

