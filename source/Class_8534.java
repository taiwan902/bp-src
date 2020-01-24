/*
 * Decompiled with CFR 0.145.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class Class_8534 {
    public static Class_6975 Method_8535(byte[] arrby) {
        try {
            return Class_8534.Method_8540(Class_8534.Method_8538(arrby));
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_8534.class.getName()).log(Level.SEVERE, null, iOException);
        }
        catch (DataFormatException dataFormatException) {
            Logger.getLogger(Class_8534.class.getName()).log(Level.SEVERE, null, dataFormatException);
        }
        return null;
    }

    public static Class_36637 Method_8536(DataInput dataInput) {
        return new Class_36637(dataInput.readUTF(), dataInput.readInt(), dataInput.readInt(), dataInput.readInt(), dataInput.readInt(), dataInput.readBoolean(), dataInput.readBoolean());
    }

    private void Method_8537() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static byte[] Method_8538(byte[] arrby) {
        Inflater inflater = new Inflater();
        inflater.setInput(arrby);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(arrby.length);
        byte[] arrby2 = new byte[-19440 & 1995];
        while (!inflater.finished()) {
            byteArrayOutputStream.write(arrby2, 4102 & 432, inflater.inflate(arrby2));
        }
        byte[] arrby3 = byteArrayOutputStream.toByteArray();
        return arrby3;
    }

    public static Class_6975 Method_8539(byte[] arrby) {
        return Class_8534.Method_8535(Class_8534.Method_8541(arrby));
    }

    public static Class_6975 Method_8540(byte[] arrby) {
        Class_6975 class_6975 = null;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            int n = dataInputStream.readInt();
            int n2 = dataInputStream.readInt();
            int n3 = dataInputStream.readInt();
            int n4 = dataInputStream.readInt();
            Class_8461 class_8461 = new Class_8461(n, n2, n3, n4);
            class_6975 = new Class_6975(20726 & 512, class_8461);
            int n5 = dataInputStream.readInt();
            for (int i = 12 & -7552; i < n5; ++i) {
                class_6975.Method_6983(Class_8534.Method_8536(dataInputStream));
            }
            dataInputStream.close();
            byteArrayInputStream.close();
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_8534.class.getName()).log(Level.SEVERE, null, iOException);
        }
        return class_6975;
    }

    public static byte[] Method_8541(byte[] arrby) {
        int n;
        int n2 = (20601 & -31497) > arrby.length ? arrby.length : 2929 & 28787;
        for (n = -32440 & 18944; n < n2; ++n) {
            byte[] arrby2 = arrby;
            int n3 = n;
            arrby2[n3] = (byte)(arrby2[n3] ^ (22643 & 1137) % (n + (3427 & 25)));
        }
        n = -23943 & 1137;
        while (n < arrby.length) {
            byte[] arrby3 = arrby;
            int n4 = n++;
            arrby3[n4] = (byte)(arrby3[n4] ^ -32399 & 17013);
        }
        return arrby;
    }

    public static List Method_8542(byte[] arrby) {
        try {
            ArrayList<Class_36637> arrayList = new ArrayList<Class_36637>();
            Class_8534.Method_8541(arrby);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            int n = dataInputStream.readInt();
            for (int i = 12304 & 1344; i < n; ++i) {
                arrayList.add(Class_8534.Method_8536(dataInputStream));
            }
            dataInputStream.close();
            byteArrayInputStream.close();
            return arrayList;
        }
        catch (IOException iOException) {
            Logger.getLogger(Class_8534.class.getName()).log(Level.SEVERE, null, iOException);
            return null;
        }
    }
}

