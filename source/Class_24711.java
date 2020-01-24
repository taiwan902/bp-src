/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000continue abstract & ! import # while goto else # | while * continue void extends new { 2 + null ? instanceof do ^ , public ` final switch class 1 public if | static # while 5 strictfp ? null " " 4 9 transient const ! public default new abstract switch ~ do const
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Class_24711 {
    public static void Method_24712(Class_1699 class_1699, DataOutput dataOutput) {
        Class_24711.Method_24717(class_1699, dataOutput);
    }

    private void Method_24713() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_24714(Class_1699 class_1699, OutputStream outputStream) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));){
            Class_24711.Method_24712(class_1699, dataOutputStream);
        }
    }

    public static Class_1699 Method_24715(DataInput dataInput, Class_19804 class_19804) {
        Class_1674 class_1674 = Class_24711.Method_24716(dataInput, -20992 & 4112, class_19804);
        if (class_1674 instanceof Class_1699) {
            return (Class_1699)class_1674;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    private static Class_1674 Method_24716(DataInput dataInput, int n, Class_19804 class_19804) {
        byte by = dataInput.readByte();
        if (by == 0) {
            return new \u0000continue abstract & ! import # while goto else # | while * continue void extends new { 2 + null ? instanceof do ^ , public ` final switch class 1 public if | static # while 5 strictfp ? null " " 4 9 transient const ! public default new abstract switch ~ do const();
        }
        dataInput.readUTF();
        Class_1674 class_1674 = Class_1674.Method_1690(by);
        try {
            class_1674.Method_1678(dataInput, n, class_19804);
            return class_1674;
        }
        catch (IOException iOException) {
            Class_13268 class_13268 = Class_13268.Method_13285(iOException, "Loading NBT data");
            Class_13220 class_13220 = class_13268.Method_13280("NBT Tag");
            class_13220.Method_13231("Tag name", "[UNNAMED TAG]");
            class_13220.Method_13231("Tag type", by);
            throw new Class_1809(class_13268);
        }
    }

    private static void Method_24717(Class_1674 class_1674, DataOutput dataOutput) {
        dataOutput.writeByte(class_1674.Method_1683());
        if (class_1674.Method_1683() != 0) {
            dataOutput.writeUTF("");
            class_1674.Method_1685(dataOutput);
        }
    }

    public static void Method_24718(Class_1699 class_1699, File file) {
        File file2 = new File(file.getAbsolutePath() + "_tmp");
        if (file2.exists()) {
            file2.delete();
        }
        Class_24711.Method_24720(class_1699, file2);
        if (file.exists()) {
            file.delete();
        }
        if (file.exists()) {
            throw new IOException("Failed to delete " + file);
        }
        file2.renameTo(file);
    }

    public static Class_1699 Method_24719(File file) {
        Class_1699 class_1699;
        if (!file.exists()) {
            return null;
        }
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));){
            class_1699 = Class_24711.Method_24715(dataInputStream, Class_19804.Field_19807);
        }
        return class_1699;
    }

    public static void Method_24720(Class_1699 class_1699, File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));){
            Class_24711.Method_24712(class_1699, dataOutputStream);
        }
    }

    public static Class_1699 Method_24721(InputStream inputStream) {
        Class_1699 class_1699;
        try (DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new GZIPInputStream(inputStream)));){
            class_1699 = Class_24711.Method_24715(dataInputStream, Class_19804.Field_19807);
        }
        return class_1699;
    }

    public static Class_1699 Method_24722(DataInputStream dataInputStream) {
        return Class_24711.Method_24715(dataInputStream, Class_19804.Field_19807);
    }
}

