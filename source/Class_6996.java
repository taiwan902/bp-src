/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;

public class Class_6996 {
    private int Field_6997 = Class_32876.Method_32951();
    public static int Field_6998;
    private static int Field_6999;
    public static Class_16294 Field_7000;
    private int Field_7001;
    private static int Field_7002;
    private int Field_7003;
    private int Field_7004 = -1 & -1;

    public void Method_7005() {
        if (this.Field_7001 == (-1 & -1)) {
            return;
        }
        Class_6996 class_6996 = Field_7000.Method_16303(this.Field_7001);
        if (this != class_6996) {
            throw new RuntimeException("wrong order in releaseGenBuffer");
        }
        Class_6996 class_69962 = Field_7000.Method_16303(Field_6999 -= -23551 & 4219);
        Field_7000.Method_16298(this.Field_7001, class_69962);
        Field_7000.Method_16298(Field_6999, class_6996);
        class_69962.Field_7001 = this.Field_7001;
        this.Field_7001 = -1 & -1;
    }

    public Class_6996() {
        Field_7002 += 8193 & 3219;
    }

    public void Method_7006() {
        if (this.Field_6997 >= 0) {
            Field_6998 -= this.Field_7003;
            this.Field_7003 = 2688 & 280;
            Class_32876.Method_32957(this.Field_6997);
            this.Field_6997 = -1 & -1;
            this.Field_7004 = -1 & -1;
            Field_7002 -= -28285 & 16421;
        }
    }

    static {
        Field_7000 = new Class_16294(1254528 & 1623281700);
        Field_6999 = 1024 & 794;
        Field_6998 = 9856 & -16311;
        Field_7002 = -13824 & 386;
    }

    public static int Method_7007() {
        return Field_7002;
    }

    public static Class_6996 Method_7008() {
        Class_6996 class_6996 = null;
        if (Field_6999 < Field_7000.Method_16297()) {
            class_6996 = Field_7000.Method_16303(Field_6999);
        } else {
            class_6996 = new Class_6996();
            Field_7000.Method_16304(class_6996);
        }
        class_6996.Field_7001 = Field_6999;
        Field_6999 += -30431 & 17555;
        return class_6996;
    }

    private void Method_7009() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_7010() {
        Class_6996 class_6996;
        while (Field_7000.Method_16297() > 0 && (class_6996 = Field_7000.Method_16303(Field_7000.Method_16297() - (1 & -13699))).Method_7015()) {
            class_6996.Method_7006();
            Field_7000.Method_16299();
        }
    }

    public void Method_7011(int n, int n2) {
        GL11.glDrawArrays((int)n, (int)(770 & 11460), (int)n2);
    }

    public void Method_7012() {
        Class_32876.Method_32981(Class_32876.Field_32881, 256 & 18449);
    }

    public void Method_7013() {
        Class_32876.Method_32981(Class_32876.Field_32881, this.Field_6997);
    }

    public void Method_7014(ByteBuffer byteBuffer) {
        Field_6998 -= this.Field_7003;
        this.Method_7013();
        Class_32876.Method_32936(Class_32876.Field_32881, byteBuffer, -2008708876 & 570612455);
        this.Method_7012();
        this.Field_7003 = byteBuffer.limit();
        Field_6998 += this.Field_7003;
    }

    public boolean Method_7015() {
        return (this.Field_7001 == (-1 & -1) ? -27349 & 10449 : -31216 & 384) != 0;
    }
}

