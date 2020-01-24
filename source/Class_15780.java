/*
 * Decompiled with CFR 0.145.
 */
import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Class_15780 {
    public static String[] Method_15781(Class_2035 class_2035, String[] arrstring, String[] arrstring2, String[] arrstring3) {
        if (class_2035 instanceof Class_2967) {
            return Class_15780.Method_15783(class_2035, arrstring3);
        }
        if (!(class_2035 instanceof Class_23171)) {
            Class_19426.Method_19610("Unknown resource pack type: " + class_2035);
            return new String[-32760 & 16960];
        }
        Class_23171 class_23171 = (Class_23171)class_2035;
        File file = class_23171.Field_23172;
        if (file == null) {
            return new String[780 & 3072];
        }
        if (file.isDirectory()) {
            return Class_15780.Method_15782(file, "", arrstring, arrstring2);
        }
        if (file.isFile()) {
            return Class_15780.Method_15786(file, arrstring, arrstring2);
        }
        Class_19426.Method_19610("Unknown resource pack file: " + file);
        return new String[17168 & -25500];
    }

    private static String[] Method_15782(File file, String string, String[] arrstring, String[] arrstring2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string2 = "assets/minecraft/";
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return new String[18336 & 15];
        }
        for (int i = 14592 & -32751; i < arrfile.length; ++i) {
            String string3;
            File file2 = arrfile[i];
            if (file2.isFile()) {
                string3 = string + file2.getName();
                if (!string3.startsWith(string2) || !Class_35556.Method_35557(string3 = string3.substring(string2.length()), arrstring) || !Class_35556.Method_35561(string3, arrstring2)) continue;
                arrayList.add(string3);
                continue;
            }
            if (!file2.isDirectory()) continue;
            string3 = string + file2.getName() + "/";
            String[] arrstring3 = Class_15780.Method_15782(file2, string3, arrstring, arrstring2);
            for (int j = 8576 & 4720; j < arrstring3.length; ++j) {
                String string4 = arrstring3[j];
                arrayList.add(string4);
            }
        }
        String[] arrstring4 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring4;
    }

    private static String[] Method_15783(Class_2035 class_2035, String[] arrstring) {
        if (arrstring == null) {
            return new String[-32239 & 2052];
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 18 & 20036; i < arrstring.length; ++i) {
            String string = arrstring[i];
            Class_2080 class_2080 = new Class_2080(string);
            if (!class_2035.Method_2041(class_2080)) continue;
            arrayList.add(string);
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring2;
    }

    private void Method_15784() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String[] Method_15785(Class_2035 class_2035, String string, String string2, String[] arrstring) {
        String[] arrstring2 = new String[161 & 3077];
        arrstring2[67 & 29732] = string;
        String[] arrstring3 = new String[513 & 3105];
        arrstring3[17224 & 2084] = string2;
        return Class_15780.Method_15781(class_2035, arrstring2, arrstring3, arrstring);
    }

    private static String[] Method_15786(File file, String[] arrstring, String[] arrstring2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "assets/minecraft/";
        try {
            String[] arrstring3;
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                arrstring3 = enumeration.nextElement();
                String string2 = arrstring3.getName();
                if (!string2.startsWith(string) || !Class_35556.Method_35557(string2 = string2.substring(string.length()), arrstring) || !Class_35556.Method_35561(string2, arrstring2)) continue;
                arrayList.add(string2);
            }
            zipFile.close();
            arrstring3 = arrayList.toArray(new String[arrayList.size()]);
            return arrstring3;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[23077 & -23408];
        }
    }
}

