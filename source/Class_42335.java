/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.MessageDeserializer;

public class Class_42335
extends Class_41947 {
    final Class_15008 Field_42336;

    private void Method_42337() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_42335(Class_15008 class_15008) {
        this.Field_42336 = class_15008;
    }

    protected void Method_42338(Class_26095 class_26095) {
        try {
            class_26095.Method_26110().Method_19093(Class_25272.Field_25292, (28681 & -32713) != 0);
        }
        catch (Class_31422 class_31422) {
            // empty catch block
        }
        class_26095.Method_26106().Method_6279("zUiYCdMjhnNJ5kMPR3N9", new Class_45604(18206 & 4158)).Method_6279("61f0RSkXHwKmqJQYBVQ6", new Class_44725(this.Field_42336)).Method_6279("TgM9dnjnTWoLe8IPlEDg", new Class_46887()).Method_6279("YDWZIptvTwr5AN5zwvfF", new MessageDeserializer(Class_31224.Field_31225)).Method_6279("4WsU6niRGZTOtfJgYNPX", new Class_39305()).Method_6279("fe2xaNKGB30U8N8SmHM5", new Class_40492(Class_31224.Field_31227));
        Class_44584 class_44584 = new Class_44584(Class_31224.Field_31225);
        Class_15008.Method_15019(this.Field_42336).add(class_44584);
        class_26095.Method_26106().Method_6279("FuHBzRcLVODorlIdLfAy", class_44584);
        class_44584.Method_44630(new Class_21577(Class_15008.Method_15016(this.Field_42336), class_44584));
    }
}

