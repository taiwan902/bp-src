/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.File;
import java.io.FileWriter;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_39354
extends Class_36787 {
    private static final Logger Field_39355 = LogManager.getLogger();
    private long Field_39356;
    private int Field_39357;

    private static String Method_39358() {
        String[] arrstring = new String[-8178 & 142];
        arrstring[-31743 & 520] = "Shiny numbers!";
        arrstring[335 & -23407] = "Am I not running fast enough? :(";
        arrstring[8770 & 18690] = "I'm working as hard as I can!";
        arrstring[587 & -22509] = "Will I ever be good enough for you? :(";
        arrstring[15 & 5924] = "Speedy. Zoooooom!";
        arrstring[2181 & 279] = "Hello world";
        arrstring[655 & 16406] = "40% better than a crash report.";
        arrstring[-30953 & 20687] = "Now with extra numbers";
        arrstring[-32743 & 6152] = "Now with less numbers";
        arrstring[20843 & 3597] = "Now with the same numbers";
        arrstring[16443 & 15758] = "You should add flames to things, it makes them go faster!";
        arrstring[24847 & 619] = "Do you feel the need for... optimization?";
        arrstring[16718 & 9245] = "*cracks redstone whip*";
        arrstring[4525 & -22001] = "Maybe if you treated it better then it'll have more motivation to work faster! Poor server.";
        String[] arrstring2 = arrstring;
        try {
            return arrstring2[(int)(System.nanoTime() % (long)arrstring2.length)];
        }
        catch (Throwable throwable) {
            return "Witty comment unavailable :(";
        }
    }

    private void Method_39359() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_39360() {
        return -23413 & 3;
    }

    public String Method_39361() {
        return "debug";
    }

    private void Method_39362(int n, String string, StringBuilder stringBuilder) {
        List list = Class_2457.Method_2530().Field_2500.Method_2787(string);
        if (list != null && list.size() >= (8283 & -30425)) {
            for (int i = 513 & -32463; i < list.size(); ++i) {
                Class_16340 class_16340 = (Class_16340)list.get(i);
                Object[] arrobject = new Object[1 & -16287];
                arrobject[610 & 260] = n;
                stringBuilder.append(String.format("[%02d] ", arrobject));
                for (int j = 5449 & 10246; j < n; ++j) {
                    stringBuilder.append(" ");
                }
                Object[] arrobject2 = new Object[2065 & 67];
                arrobject2[8224 & -30461] = class_16340.Field_16342;
                Object[] arrobject3 = new Object[28769 & 2075];
                arrobject3[-31744 & 8192] = class_16340.Field_16343;
                stringBuilder.append(class_16340.Field_16341).append(" - ").append(String.format("%.2f", arrobject2)).append("%/").append(String.format("%.2f", arrobject3)).append("%\n");
                if (class_16340.Field_16341.equals("unspecified")) continue;
                try {
                    this.Method_39362(n + (-31165 & 6157), string + "." + class_16340.Field_16341, stringBuilder);
                    continue;
                }
                catch (Exception exception) {
                    stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
                }
            }
        }
    }

    public List Method_39363(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (8201 & 3459)) {
            String[] arrstring2 = new String[11399 & 4402];
            arrstring2[-32765 & 20996] = "start";
            arrstring2[-32767 & 8861] = "stop";
            list = Class_39354.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = null;
        }
        return list;
    }

    private String Method_39364(long l, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---- Minecraft Profiler Results ----\n");
        stringBuilder.append("// ");
        stringBuilder.append(Class_39354.Method_39358());
        stringBuilder.append("\n\n");
        stringBuilder.append("Time span: ").append(l).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n).append(" ticks\n");
        Object[] arrobject = new Object[3113 & 16513];
        arrobject[324 & -4608] = Float.valueOf((float)n / ((float)l / (1714.2858f * 0.5833333f)));
        stringBuilder.append("// This is approximately ").append(String.format("%.2f", arrobject)).append(" ticks per second. It should be ").append(16532 & 11036).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.Method_39362(321 & 22532, "root", stringBuilder);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        return stringBuilder.toString();
    }

    public String Method_39365(Class_1367 class_1367) {
        return "commands.debug.usage";
    }

    private void Method_39366(long l, int n) {
        File file = new File(Class_2457.Method_2530().Method_2535("debug"), "profile-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
        file.getParentFile().mkdirs();
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(this.Method_39364(l, n));
            fileWriter.close();
        }
        catch (Throwable throwable) {
            Field_39355.error("Could not save profiler results to " + file, throwable);
        }
    }

    public void Method_39367(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (-32607 & 16905)) {
            throw new Class_34974("commands.debug.usage", new Object[16480 & -32762]);
        }
        if (arrstring[1136 & -13945].equals("start")) {
            if (arrstring.length != (1345 & 16427)) {
                throw new Class_34974("commands.debug.usage", new Object[2049 & 186]);
            }
            Class_39354.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.debug.start", (Object[])new Object[20 & -27640]);
            Class_2457.Method_2530().Method_2582();
            this.Field_39356 = Class_2457.Method_2513();
            this.Field_39357 = Class_2457.Method_2530().Method_2620();
        } else {
            if (!arrstring[-27104 & 24896].equals("stop")) {
                throw new Class_34974("commands.debug.usage", new Object[16412 & 12418]);
            }
            if (arrstring.length != (16677 & 8897)) {
                throw new Class_34974("commands.debug.usage", new Object[18499 & 128]);
            }
            if (!Class_2457.Method_2530().Field_2500.Field_2773) {
                throw new Class_30034("commands.debug.notStarted", new Object[796 & 14368]);
            }
            long l = Class_2457.Method_2513();
            int n = Class_2457.Method_2530().Method_2620();
            long l2 = l - this.Field_39356;
            int n2 = n - this.Field_39357;
            this.Method_39366(l2, n2);
            Class_2457.Method_2530().Field_2500.Field_2773 = 19632 & 8705;
            Object[] arrobject = new Object[1218 & 4610];
            arrobject[-30720 & 13516] = Float.valueOf((float)l2 / (616.27905f * 1.6226416f));
            arrobject[20523 & -24511] = n2;
            Class_39354.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.debug.stop", (Object[])arrobject);
        }
    }
}

