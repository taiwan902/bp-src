/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_13268 {
    private File Field_13269;
    private boolean Field_13270 = 16896 & 416;
    private final List Field_13271 = new ArrayList();
    private static final Logger Field_13272 = LogManager.getLogger();
    private final String Field_13273;
    private final Class_13220 Field_13274 = new Class_13220(this, "System Details");
    private final Throwable Field_13275;
    private boolean Field_13276 = -10197 & 9733;
    private StackTraceElement[] Field_13277 = new StackTraceElement[4096 & 1202];

    private void Method_13278() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public File Method_13279() {
        return this.Field_13269;
    }

    public Class_13220 Method_13280(String string) {
        return this.Method_13284(string, 6449 & 24579);
    }

    public Class_13220 Method_13281() {
        return this.Field_13274;
    }

    public String Method_13282() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Crash Report ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(Class_13268.Method_13290());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time: ");
        stringBuilder.append(new SimpleDateFormat().format(new Date()));
        stringBuilder.append("\n");
        stringBuilder.append("Description: ");
        stringBuilder.append(this.Field_13273);
        stringBuilder.append("\n\n");
        stringBuilder.append(this.Method_13287());
        stringBuilder.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");
        for (int i = 8 & -27648; i < (7519 & 24695); ++i) {
            stringBuilder.append("-");
        }
        stringBuilder.append("\n\n");
        this.Method_13283(stringBuilder);
        return stringBuilder.toString();
    }

    public void Method_13283(StringBuilder stringBuilder) {
        if ((this.Field_13277 == null || this.Field_13277.length <= 0) && this.Field_13271.size() > 0) {
            this.Field_13277 = (StackTraceElement[])ArrayUtils.subarray((Object[])((Class_13220)this.Field_13271.get(-11776 & 9243)).Method_13233(), (int)(3488 & -12215), (int)(-28533 & 517));
        }
        if (this.Field_13277 != null && this.Field_13277.length > 0) {
            stringBuilder.append("-- Head --\n");
            stringBuilder.append("Stacktrace:\n");
            StackTraceElement[] arrstackTraceElement = this.Field_13277;
            int n = arrstackTraceElement.length;
            for (int i = 72 & 2098; i < n; ++i) {
                StackTraceElement stackTraceElement = arrstackTraceElement[i];
                stringBuilder.append("\t").append("at ").append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            stringBuilder.append("\n");
        }
        for (Object e : this.Field_13271) {
            ((Class_13220)e).Method_13225(stringBuilder);
            stringBuilder.append("\n\n");
        }
        this.Field_13274.Method_13225(stringBuilder);
    }

    public Class_13220 Method_13284(String string, int n) {
        Class_13220 class_13220 = new Class_13220(this, string);
        if (this.Field_13276) {
            int n2 = class_13220.Method_13227(n);
            StackTraceElement[] arrstackTraceElement = this.Field_13275.getStackTrace();
            StackTraceElement stackTraceElement = null;
            StackTraceElement stackTraceElement2 = null;
            int n3 = arrstackTraceElement.length - n2;
            if (n3 < 0) {
                System.out.println("Negative index in crash report handler (" + arrstackTraceElement.length + "/" + n2 + ")");
            }
            if (arrstackTraceElement != null && (6208 & 8197) <= n3 && n3 < arrstackTraceElement.length) {
                stackTraceElement = arrstackTraceElement[n3];
                if (arrstackTraceElement.length + (5379 & 17125) - n2 < arrstackTraceElement.length) {
                    stackTraceElement2 = arrstackTraceElement[arrstackTraceElement.length + (27169 & -31677) - n2];
                }
            }
            this.Field_13276 = class_13220.Method_13230(stackTraceElement, stackTraceElement2);
            if (n2 > 0 && !this.Field_13271.isEmpty()) {
                Class_13220 class_132202 = (Class_13220)this.Field_13271.get(this.Field_13271.size() - (26709 & 1667));
                class_132202.Method_13226(n2);
            } else if (arrstackTraceElement != null && arrstackTraceElement.length >= n2 && (-32232 & 166) <= n3 && n3 < arrstackTraceElement.length) {
                this.Field_13277 = new StackTraceElement[n3];
                System.arraycopy(arrstackTraceElement, 5188 & 818, this.Field_13277, 162 & 576, this.Field_13277.length);
            } else {
                this.Field_13276 = 21628 & 257;
            }
        }
        this.Field_13271.add(class_13220);
        return class_13220;
    }

    public static Class_13268 Method_13285(Throwable throwable, String string) {
        Class_13268 class_13268 = throwable instanceof Class_1809 ? ((Class_1809)throwable).Method_1812() : new Class_13268(string, throwable);
        return class_13268;
    }

    public boolean Method_13286(File file) {
        if (this.Field_13269 != null) {
            return (258 & -32571) != 0;
        }
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.Method_13282());
            fileWriter.close();
            this.Field_13269 = file;
            return (13057 & 2117) != 0;
        }
        catch (Throwable throwable) {
            Field_13272.error("Could not save crash report to " + file, throwable);
            return (-30952 & 160) != 0;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String Method_13287() {
        StringWriter stringWriter = null;
        PrintWriter printWriter = null;
        Throwable throwable = this.Field_13275;
        if (throwable.getMessage() == null) {
            if (throwable instanceof NullPointerException) {
                throwable = new NullPointerException(this.Field_13273);
            } else if (throwable instanceof StackOverflowError) {
                throwable = new StackOverflowError(this.Field_13273);
            } else if (throwable instanceof OutOfMemoryError) {
                throwable = new OutOfMemoryError(this.Field_13273);
            }
            throwable.setStackTrace(this.Field_13275.getStackTrace());
        }
        String string = throwable.toString();
        try {
            stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            throwable.printStackTrace(printWriter);
            string = stringWriter.toString();
        }
        catch (Throwable throwable2) {
            IOUtils.closeQuietly((Writer)stringWriter);
            IOUtils.closeQuietly(printWriter);
            throw throwable2;
        }
        IOUtils.closeQuietly((Writer)stringWriter);
        IOUtils.closeQuietly((Writer)printWriter);
        return string;
    }

    public Throwable Method_13288() {
        return this.Field_13275;
    }

    public String Method_13289() {
        return this.Field_13273;
    }

    public Class_13268(String string, Throwable throwable) {
        this.Field_13273 = string;
        this.Field_13275 = throwable;
        this.Method_13291();
    }

    private static String Method_13290() {
        String[] arrstring = new String[5297 & 2661];
        arrstring[4155 & 8196] = "Minecraft (-10) zostal zabity przez Crash (+15)";
        arrstring[-27643 & 8713] = "Wszystko poszlo zgodnie z planem.";
        arrstring[5314 & -30198] = "Litwo! Ojczyzno moja! ty jeste\u015b jak zdrowie";
        arrstring[859 & 8195] = "O kurde";
        arrstring[17542 & 4100] = "Dlaczego?!?";
        arrstring[-32379 & 2069] = "Smuteczek :(";
        arrstring[-32498 & 1046] = "Przepraszam";
        arrstring[-24041 & 20615] = "Zawiodlem cie :/";
        arrstring[8216 & 6218] = "To se pograles...";
        arrstring[521 & -27635] = "Jak tam zycie?";
        arrstring[-30710 & 5659] = "O, wiem co poszlo nie tak! Szczegoly ponizej";
        arrstring[11 & 16395] = "Wina Mojangu";
        arrstring[-30578 & 524] = "To wszystko przez Dinnerbone.";
        arrstring[157 & -25265] = "Wylosowales crash z magicznej skrzyni!";
        arrstring[143 & 8206] = "Wydropiles: crash Minecrafta! Gratulacje";
        arrstring[239 & 17935] = "Don't be sad, have a hug! <3";
        arrstring[4112 & -16300] = "I just don't know what went wrong :(";
        arrstring[23345 & 145] = "Shall we play a game?";
        arrstring[3098 & 16562] = "Quite honestly, I wouldn't worry myself about that.";
        arrstring[4599 & 24603] = "I bet Cylons wouldn't have this problem.";
        arrstring[-28652 & 3100] = "Sorry :(";
        arrstring[-31467 & 24661] = "Surprise! Haha. Well, this is awkward.";
        arrstring[19638 & 12830] = "Would you like a cupcake?";
        arrstring[11287 & -28265] = "Hi. I'm Minecraft, and I'm a crashaholic.";
        arrstring[568 & 20767] = "Ooh. Shiny.";
        arrstring[537 & 3129] = "This doesn't make any sense!";
        arrstring[8670 & -15814] = "Why is it breaking :(";
        arrstring[7771 & -24257] = "Don't do that.";
        arrstring[16604 & 318] = "Ouch. That hurt :(";
        arrstring[24861 & 29] = "You're mean.";
        arrstring[30 & 9246] = "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]";
        arrstring[8479 & 16607] = "There are four lights!";
        arrstring[-29918 & 8232] = "U mnie dziala.";
        String[] arrstring2 = arrstring;
        try {
            return arrstring2[(int)(System.nanoTime() % (long)arrstring2.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    private void Method_13291() {
        this.Field_13274.Method_13232("Minecraft Version", new Class_15305(this));
        this.Field_13274.Method_13232("Operating System", new Class_13244(this));
        this.Field_13274.Method_13232("CPU", new Class_6051(this));
        this.Field_13274.Method_13232("Java VM Version", new Class_19837(this));
        this.Field_13274.Method_13232("Memory", new Class_11340(this));
        this.Field_13274.Method_13232("JVM Flags", new Class_25908(this));
        this.Field_13274.Method_13232("IntCache", new Class_31399(this));
    }
}

