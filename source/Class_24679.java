/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;

public class Class_24679 {
    private void Method_24680() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_24681(Class_22385 class_22385) {
        if (class_22385.Method_22407() > 0) {
            int n;
            int n2;
            Object object;
            Class_11885 class_11885 = class_22385.Method_22436();
            int n3 = class_11885.Method_11903();
            ByteBuffer byteBuffer = class_22385.Method_22420();
            List list = class_11885.Method_11911();
            boolean bl = Class_14610.Field_14637.Method_13570();
            boolean bl2 = Class_14610.Field_14620.Method_13570();
            block12 : for (n2 = 653 & 304; n2 < list.size(); ++n2) {
                Class_12423 class_12423 = (Class_12423)list.get(n2);
                object = class_12423.Method_12434();
                if (bl) {
                    Object[] arrobject = new Object[25107 & -32765];
                    arrobject[519 & -7104] = class_12423;
                    arrobject[16385 & 19] = n3;
                    arrobject[18434 & 1102] = byteBuffer;
                    Class_14610.Method_14666(object, Class_14610.Field_14637, arrobject);
                    continue;
                }
                int n4 = class_12423.Method_12439().Method_8578();
                n = class_12423.Method_12438();
                byteBuffer.position(class_11885.Method_11910(n2));
                switch (Class_30021.Field_30022[((Enum)object).ordinal()]) {
                    case 1: {
                        GL11.glVertexPointer((int)class_12423.Method_12431(), (int)n4, (int)n3, (ByteBuffer)byteBuffer);
                        Class_16867.Method_16955(13993076 & 403241215);
                        continue block12;
                    }
                    case 2: {
                        Class_32876.Method_32970(Class_32876.Field_32931 + n);
                        GL11.glTexCoordPointer((int)class_12423.Method_12431(), (int)n4, (int)n3, (ByteBuffer)byteBuffer);
                        Class_16867.Method_16955(824347260 & -2146910088);
                        Class_32876.Method_32970(Class_32876.Field_32931);
                        continue block12;
                    }
                    case 3: {
                        GL11.glColorPointer((int)class_12423.Method_12431(), (int)n4, (int)n3, (ByteBuffer)byteBuffer);
                        Class_16867.Method_16955(-1694398345 & 71467254);
                        continue block12;
                    }
                    case 4: {
                        GL11.glNormalPointer((int)n4, (int)n3, (ByteBuffer)byteBuffer);
                        Class_16867.Method_16955(1109427317 & -1198421769);
                    }
                }
            }
            if (class_22385.Method_22415()) {
                class_22385.Method_22447();
            } else if (Class_19426.Method_19570()) {
                Class_34286.Method_34297(class_22385.Method_22437(), 18552 & -28416, class_22385.Method_22407(), class_22385);
            } else {
                GL11.glDrawArrays((int)class_22385.Method_22437(), (int)(650 & 13316), (int)class_22385.Method_22407());
            }
            int n5 = list.size();
            block13 : for (n2 = 64 & 17408; n2 < n5; ++n2) {
                object = (Class_12423)list.get(n2);
                Class_8005 class_8005 = ((Class_12423)object).Method_12434();
                if (bl2) {
                    Object[] arrobject = new Object[3075 & 4507];
                    arrobject[-29565 & 4104] = object;
                    arrobject[4225 & 3] = n3;
                    arrobject[14346 & 102] = byteBuffer;
                    Class_14610.Method_14666((Object)class_8005, Class_14610.Field_14620, arrobject);
                    continue;
                }
                n = ((Class_12423)object).Method_12438();
                switch (Class_30021.Field_30022[class_8005.ordinal()]) {
                    case 1: {
                        Class_16867.Method_16937(806410996 & 1164091509);
                        continue block13;
                    }
                    case 2: {
                        Class_32876.Method_32970(Class_32876.Field_32931 + n);
                        Class_16867.Method_16937(-2141152648 & 118653052);
                        Class_32876.Method_32970(Class_32876.Field_32931);
                        continue block13;
                    }
                    case 3: {
                        Class_16867.Method_16937(137003639 & -2054846338);
                        Class_16867.Method_16932();
                        continue block13;
                    }
                    case 4: {
                        Class_16867.Method_16937(576114807 & 1149274997);
                    }
                }
            }
        }
        class_22385.Method_22434();
    }
}

