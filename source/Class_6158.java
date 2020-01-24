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
import java.util.Properties;

public class Class_6158 {
    private int Field_6159 = -7104 & 391;
    private String Field_6160 = null;
    private Class_18407[] Field_6161 = null;
    private int Field_6162 = 256 & 5224;
    private int Field_6163 = 17173 & 8194;
    private int Field_6164 = -11594 & 1024;
    Class_2080 Field_6165 = null;
    private ByteBuffer Field_6166 = null;
    private int Field_6167 = -27520 & 8216;
    private int Field_6168 = -1 & -1;
    byte[] Field_6169 = null;
    private String Field_6170 = null;

    public boolean Method_6171() {
        if (this.Field_6168 < 0) {
            Class_2062 class_2062 = Class_21583.Method_21614(this.Field_6165);
            if (class_2062 == null) {
                return (128 & 10268) != 0;
            }
            this.Field_6168 = class_2062.Method_2063();
        }
        if (this.Field_6166 == null) {
            this.Field_6166 = Class_11552.Method_11556(this.Field_6169.length);
            this.Field_6166.put(this.Field_6169);
            this.Field_6169 = null;
        }
        if (!this.Method_6175()) {
            return (513 & 1028) != 0;
        }
        int n = this.Field_6163 * this.Field_6167 * (16900 & 8516);
        int n2 = this.Method_6173();
        int n3 = n * n2;
        if (n3 + n > this.Field_6166.capacity()) {
            return (2112 & 423) != 0;
        }
        this.Field_6166.position(n3);
        Class_16867.Method_16963(this.Field_6168);
        GL11.glTexSubImage2D((int)(-8731 & 3561), (int)(4113 & -23328), (int)this.Field_6164, (int)this.Field_6162, (int)this.Field_6163, (int)this.Field_6167, (int)(6424 & 31021), (int)(5761 & 7171), (ByteBuffer)this.Field_6166);
        return (17445 & 8195) != 0;
    }

    private void Method_6172() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_6158(String string, byte[] arrby, String string2, Class_2080 class_2080, int n, int n2, int n3, int n4, Properties properties, int n5) {
        this.Field_6170 = string;
        this.Field_6160 = string2;
        this.Field_6165 = class_2080;
        this.Field_6164 = n;
        this.Field_6162 = n2;
        this.Field_6163 = n3;
        this.Field_6167 = n4;
        int n6 = n3 * n4 * (-28666 & 188);
        if (arrby.length % n6 != 0) {
            Class_19426.Method_19610("Invalid animated texture length: " + arrby.length + ", frameWidth: " + n3 + ", frameHeight: " + n4);
        }
        this.Field_6169 = arrby;
        int n7 = arrby.length / n6;
        if (properties.get("tile.0") != null) {
            int n8 = 4100 & 8256;
            while (properties.get("tile." + n8) != null) {
                n7 = n8 + (2309 & 5257);
                ++n8;
            }
        }
        String string3 = (String)properties.get("duration");
        int n9 = Class_19426.Method_19502(string3, n5);
        this.Field_6161 = new Class_18407[n7];
        for (int i = 4101 & 1616; i < this.Field_6161.length; ++i) {
            Class_18407 class_18407;
            String string4 = (String)properties.get("tile." + i);
            int n10 = Class_19426.Method_19502(string4, i);
            String string5 = (String)properties.get("duration." + i);
            int n11 = Class_19426.Method_19502(string5, n9);
            this.Field_6161[i] = class_18407 = new Class_18407(n10, n11);
        }
    }

    public int Method_6173() {
        if (this.Field_6161.length <= 0) {
            return 68 & 1024;
        }
        if (this.Field_6159 >= this.Field_6161.length) {
            this.Field_6159 = 4400 & 129;
        }
        Class_18407 class_18407 = this.Field_6161[this.Field_6159];
        return class_18407.Field_18410;
    }

    public String Method_6174() {
        return this.Field_6160;
    }

    public boolean Method_6175() {
        if (this.Field_6161.length <= 0) {
            return (32 & -21951) != 0;
        }
        if (this.Field_6159 >= this.Field_6161.length) {
            this.Field_6159 = -32686 & 9261;
        }
        Class_18407 class_18407 = this.Field_6161[this.Field_6159];
        class_18407.Field_18409 += 3269 & 4115;
        if (class_18407.Field_18409 < class_18407.Field_18408) {
            return (64 & -32759) != 0;
        }
        class_18407.Field_18409 = 3592 & 8452;
        this.Field_6159 += 5 & 24897;
        if (this.Field_6159 >= this.Field_6161.length) {
            this.Field_6159 = -23527 & 4576;
        }
        return (24833 & 4679) != 0;
    }
}

