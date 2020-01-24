/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.BufferUtils
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.StringUtils
 */
import internal.org.lwjgl.BufferUtils;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class Class_11260 {
    private final Class_12379 Field_11261;
    private int Field_11262;
    private final String Field_11263;
    private int Field_11264 = 13384 & 435;

    private Class_11260(Class_12379 class_12379, int n, String string) {
        this.Field_11261 = class_12379;
        this.Field_11262 = n;
        this.Field_11263 = string;
    }

    public void Method_11265(Class_17924 class_17924) {
        this.Field_11264 += 4611 & -14963;
        Class_32876.Method_32977(class_17924.Method_17948(), this.Field_11262);
    }

    protected static byte[] Method_11266(BufferedInputStream bufferedInputStream) {
        byte[] arrby;
        try {
            arrby = IOUtils.toByteArray((InputStream)bufferedInputStream);
        }
        finally {
            bufferedInputStream.close();
        }
        return arrby;
    }

    public String Method_11267() {
        return this.Field_11263;
    }

    public void Method_11268(Class_17924 class_17924) {
        this.Field_11264 -= 13 & 25603;
        if (this.Field_11264 <= 0) {
            Class_32876.Method_32937(this.Field_11262);
            this.Field_11261.Method_12396().remove(this.Field_11263);
        }
    }

    private void Method_11269() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static Class_11260 Method_11270(Class_279 class_279, Class_12379 class_12379, String string) {
        Class_11260 class_11260 = (Class_11260)class_12379.Method_12396().get(string);
        if (class_11260 == null) {
            Class_2080 class_2080 = new Class_2080("shaders/program/" + string + class_12379.Method_12393());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(class_279.Method_282(class_2080).Method_9958());
            byte[] arrby = Class_11260.Method_11266(bufferedInputStream);
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)arrby.length);
            byteBuffer.put(arrby);
            byteBuffer.position(-14704 & 14);
            int n = Class_32876.Method_32934(class_12379.Method_12390());
            Class_32876.Method_32971(n, byteBuffer);
            Class_32876.Method_32961(n);
            if (Class_32876.Method_32983(n, Class_32876.Field_32896) == 0) {
                String string2 = StringUtils.trim((String)Class_32876.Method_32973(n, -2147450367 & 230205444));
                Class_8254 class_8254 = new Class_8254("Couldn't compile " + class_12379.Method_12395() + " program: " + string2);
                class_8254.Method_8258(class_2080.Method_2084());
                throw class_8254;
            }
            class_11260 = new Class_11260(class_12379, n, string);
            class_12379.Method_12396().put(string, class_11260);
        }
        return class_11260;
    }
}

