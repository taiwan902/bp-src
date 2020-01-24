/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class Class_11372 {
    public int Field_11373;
    public int Field_11374;
    public float Field_11375;
    protected int[][] Field_11376;
    public Class_11372 Field_11377;
    public boolean Field_11378;
    public int Field_11379 = -1 & -1;
    public float Field_11380;
    protected int Field_11381;
    public int Field_11382;
    private float Field_11383;
    private float Field_11384;
    private Class_26720 Field_11385;
    protected int Field_11386;
    protected int Field_11387;
    public Class_11372 Field_11388 = null;
    protected int Field_11389;
    public boolean Field_11390;
    private final String Field_11391;
    protected boolean Field_11392;
    private static String Field_11393;
    private float Field_11394;
    protected int Field_11395;
    protected int Field_11396;
    public Class_11372 Field_11397;
    private float Field_11398;
    protected List Field_11399 = new ArrayList();
    private int Field_11400 = -1 & -1;
    private static String Field_11401;

    public void Method_11402(int n) {
        this.Field_11381 = n;
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11402(this.Field_11381);
        }
    }

    private void Method_11403(int[] arrn) {
        if (arrn != null) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            long l = 1125286912L & 20930L;
            long l2 = 271099912L & 100794868L;
            long l3 = 616824960L & -7778870522761175021L;
            long l4 = 270762021L & 4547352631248431370L;
            for (n3 = 32 & -31160; n3 < arrn.length; ++n3) {
                n5 = arrn[n3];
                n = n5 >> (26140 & 4568) & (6143 & -16129);
                if (n < (-31664 & 24600)) continue;
                n4 = n5 >> (20560 & 182) & (18687 & 4351);
                n2 = n5 >> (-24056 & 23021) & (511 & 17663);
                n6 = n5 & (4351 & 16895);
                l += (long)n4;
                l2 += (long)n2;
                l3 += (long)n6;
                l4 += 1074270273L & 197283243651780097L;
            }
            if (l4 > (-8794863237108020656L & 8794863236809106570L)) {
                n3 = (int)(l / l4);
                n5 = (int)(l2 / l4);
                n = (int)(l3 / l4);
                n4 = n3 << (-32240 & 31890) | n5 << (4664 & 1034) | n;
                for (n2 = 523 & 17732; n2 < arrn.length; ++n2) {
                    n6 = arrn[n2];
                    int n7 = n6 >> (1308 & 57) & (8703 & -28929);
                    if (n7 > (1556 & 20561)) continue;
                    arrn[n2] = n4;
                }
            }
        }
    }

    static {
        Field_11401 = Class_11372.Method_11421("\u1010\u1004\u1012\u1016\u1000\u1014\u1012\u1012\u1018\u101c\u101e\u101a\u101c");
        Field_11393 = Class_11372.Method_11434("\u0000\u0006\u0002\u0006\u0002\u0006\u0000\u0000\u0000\u0004\u0006\u0002\u0006\u0004\u0004");
    }

    public void Method_11404(Class_2080 class_2080, int n) {
        Class_9953 class_9953 = Class_19426.Method_19554(class_2080);
        BufferedImage bufferedImage = Class_18695.Method_18726(class_9953.Method_9958());
        if (this.Field_11381 != bufferedImage.getWidth()) {
            bufferedImage = Class_21583.Method_21613(bufferedImage, this.Field_11381);
        }
        Class_26720 class_26720 = (Class_26720)class_9953.Method_9956("animation");
        int[][] arrarrn = new int[n][];
        arrarrn[4101 & 16976] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
        bufferedImage.getRGB(8192 & 259, -30016 & 304, bufferedImage.getWidth(), bufferedImage.getHeight(), arrarrn[-30718 & 4100], -30332 & 99, bufferedImage.getWidth());
        if (class_26720 == null) {
            this.Field_11399.add(arrarrn);
        } else {
            int n2 = bufferedImage.getHeight() / this.Field_11381;
            if (class_26720.Method_26732() > 0) {
                Iterator iterator = class_26720.Method_26728().iterator();
                while (iterator.hasNext()) {
                    int n3 = (Integer)iterator.next();
                    if (n3 >= n2) {
                        throw new RuntimeException("invalid frameindex " + n3);
                    }
                    this.Method_11425(n3);
                    this.Field_11399.set(n3, Class_11372.Method_11447(arrarrn, this.Field_11381, this.Field_11381, n3));
                }
                this.Field_11385 = class_26720;
            } else {
                ArrayList arrayList = Lists.newArrayList();
                for (int i = 4528 & 25673; i < n2; ++i) {
                    this.Field_11399.add(Class_11372.Method_11447(arrarrn, this.Field_11381, this.Field_11381, i));
                    arrayList.add(new Class_16190(i, -1 & -1));
                }
                this.Field_11385 = new Class_26720(arrayList, this.Field_11381, this.Field_11396, class_26720.Method_26735(), class_26720.Method_26733());
            }
        }
    }

    public void Method_11405() {
        this.Field_11399.clear();
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11405();
        }
    }

    public int Method_11406() {
        return this.Field_11386;
    }

    public void Method_11407(int n) {
        this.Field_11396 = n;
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11407(this.Field_11396);
        }
    }

    protected Class_11372(String string) {
        this.Field_11378 = 930 & -28608;
        this.Field_11374 = 1026 & 2081;
        this.Field_11397 = null;
        this.Field_11377 = null;
        this.Field_11390 = -26335 & 17604;
        this.Field_11391 = string;
        if (Class_19426.Method_19579()) {
            this.Field_11388 = new Class_11372(this);
        }
    }

    public void Method_11408(int n) {
        this.Field_11400 = n;
    }

    public void Method_11409(int n, int n2, int n3, int n4, boolean bl) {
        this.Field_11395 = n3;
        this.Field_11386 = n4;
        this.Field_11392 = bl;
        float f = (float)(8.88888869020674E-4 * 11.25 / (double)n);
        float f2 = (float)(0.4050632911392405 * 0.024687499448191375 / (double)n2);
        this.Field_11398 = (float)n3 / (float)n + f;
        this.Field_11383 = (float)(n3 + this.Field_11381) / (float)n - f;
        this.Field_11394 = (float)n4 / (float)n2 + f2;
        this.Field_11384 = (float)(n4 + this.Field_11396) / (float)n2 - f2;
        this.Field_11375 = Math.min(this.Field_11398, this.Field_11383);
        this.Field_11380 = Math.min(this.Field_11394, this.Field_11384);
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11409(this.Field_11381, this.Field_11396, 4128 & 64, 20520 & 12226, (24717 & -32704) != 0);
        }
    }

    private void Method_11410() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_11411() {
        Class_2080 class_2080;
        String string;
        Class_11372 class_11372;
        this.Field_11374 = Class_19426.Method_19498().Method_24119();
        if (Class_12440.Field_12461) {
            string = this.Field_11391 + "_n";
            class_2080 = new Class_2080(string);
            class_2080 = Class_19426.Method_19498().Method_24117(class_2080, 24704 & 1058);
            if (Class_19426.Method_19594(class_2080)) {
                try {
                    class_11372 = new Class_11372(string);
                    class_11372.Field_11390 = 1287 & -5583;
                    class_11372.Method_11417(this);
                    class_11372.Method_11404(class_2080, this.Field_11374 + (379 & -31615));
                    class_11372.Method_11441(this.Field_11374);
                    this.Field_11397 = class_11372;
                }
                catch (IOException iOException) {
                    Class_19426.Method_19610("Error loading normal texture: " + string);
                    Class_19426.Method_19610(iOException.getClass().getName() + ": " + iOException.getMessage());
                }
            }
        }
        if (Class_12440.Field_12493) {
            string = this.Field_11391 + "_s";
            class_2080 = new Class_2080(string);
            class_2080 = Class_19426.Method_19498().Method_24117(class_2080, -26620 & 520);
            if (Class_19426.Method_19594(class_2080)) {
                try {
                    class_11372 = new Class_11372(string);
                    class_11372.Field_11390 = 13897 & -32639;
                    class_11372.Method_11417(this);
                    class_11372.Method_11404(class_2080, this.Field_11374 + (-30639 & 13));
                    class_11372.Method_11441(this.Field_11374);
                    this.Field_11377 = class_11372;
                }
                catch (IOException iOException) {
                    Class_19426.Method_19610("Error loading specular texture: " + string);
                    Class_19426.Method_19610(iOException.getClass().getName() + ": " + iOException.getMessage());
                }
            }
        }
    }

    public static void Method_11412(String string) {
        Field_11401 = string;
    }

    public int Method_11413() {
        return this.Field_11395;
    }

    public int Method_11414() {
        return this.Field_11399.size();
    }

    public void Method_11415() {
        this.Field_11387 += 121 & -9599;
        if (!this.Method_11419()) {
            return;
        }
        if (this.Field_11387 >= this.Field_11385.Method_26727(this.Field_11389)) {
            int n = this.Field_11385.Method_26736(this.Field_11389);
            int n2 = this.Field_11385.Method_26732() == 0 ? this.Field_11399.size() : this.Field_11385.Method_26732();
            this.Field_11389 = (this.Field_11389 + (16401 & 5193)) % n2;
            this.Field_11387 = 4096 & 11405;
            int n3 = this.Field_11385.Method_26736(this.Field_11389);
            boolean bl = 2249 & 260;
            boolean bl2 = this.Field_11378;
            if (n != n3 && n3 >= 0 && n3 < this.Field_11399.size()) {
                Class_18695.Method_18712((int[][])this.Field_11399.get(n3), this.Field_11381, this.Field_11396, this.Field_11395, this.Field_11386, bl, bl2);
            }
        } else if (this.Field_11385.Method_26733()) {
            this.Method_11428();
        }
    }

    public void Method_11416() {
        if (this.Field_11379 < 0) {
            this.Field_11379 = Class_18695.Method_18705();
            Class_18695.Method_18727(this.Field_11379, this.Field_11374, this.Field_11381, this.Field_11396);
            Class_21583.Method_21610();
        }
        Class_21583.Method_21609(this.Field_11379);
    }

    public void Method_11417(Class_11372 class_11372) {
        this.Field_11395 = class_11372.Field_11395;
        this.Field_11386 = class_11372.Field_11386;
        this.Field_11381 = class_11372.Field_11381;
        this.Field_11396 = class_11372.Field_11396;
        this.Field_11392 = class_11372.Field_11392;
        this.Field_11398 = class_11372.Field_11398;
        this.Field_11383 = class_11372.Field_11383;
        this.Field_11394 = class_11372.Field_11394;
        this.Field_11384 = class_11372.Field_11384;
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11409(this.Field_11381, this.Field_11396, -30716 & 30219, 20549 & 3328, (-32487 & 25762) != 0);
        }
    }

    private void Method_11418() {
        this.Field_11385 = null;
        this.Method_11445(new ArrayList());
        this.Field_11389 = 7720 & 24657;
        this.Field_11387 = 629 & 16386;
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11418();
        }
    }

    public boolean Method_11419() {
        return (this.Field_11385 != null ? 775 & 12385 : 21122 & -24299) != 0;
    }

    public float Method_11420() {
        return this.Field_11398;
    }

    private static String Method_11421(String string) {
        int n = 3170;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11372.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_11422() {
        return "TextureAtlasSprite{name='" + this.Field_11391 + (char)(16439 & -26457) + ", frameCount=" + this.Field_11399.size() + ", rotated=" + this.Field_11392 + ", x=" + this.Field_11395 + ", y=" + this.Field_11386 + ", height=" + this.Field_11396 + ", width=" + this.Field_11381 + ", u0=" + this.Field_11398 + ", u1=" + this.Field_11383 + ", v0=" + this.Field_11394 + ", v1=" + this.Field_11384 + (char)(4605 & 8829);
    }

    public double Method_11423(float f) {
        float f2 = this.Field_11384 - this.Field_11394;
        return (f - this.Field_11394) / f2 * (12.740741f * 1.255814f);
    }

    public int Method_11424() {
        return this.Field_11396;
    }

    private void Method_11425(int n) {
        if (this.Field_11399.size() <= n) {
            for (int i = this.Field_11399.size(); i <= n; ++i) {
                this.Field_11399.add(null);
            }
        }
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11425(n);
        }
    }

    public int Method_11426() {
        return this.Field_11400;
    }

    public void Method_11427() {
        if (this.Field_11379 >= 0) {
            Class_18695.Method_18720(this.Field_11379);
            this.Field_11379 = -1 & -1;
        }
    }

    private void Method_11428() {
        int n;
        int n2;
        double d = 1.0 - (double)this.Field_11387 / (double)this.Field_11385.Method_26727(this.Field_11389);
        int n3 = this.Field_11385.Method_26736(this.Field_11389);
        if (n3 != (n2 = this.Field_11385.Method_26736((this.Field_11389 + (-31639 & 6149)) % (n = this.Field_11385.Method_26732() == 0 ? this.Field_11399.size() : this.Field_11385.Method_26732()))) && n2 >= 0 && n2 < this.Field_11399.size()) {
            int[][] arrn = (int[][])this.Field_11399.get(n3);
            int[][] arrn2 = (int[][])this.Field_11399.get(n2);
            if (this.Field_11376 == null || this.Field_11376.length != arrn.length) {
                this.Field_11376 = new int[arrn.length][];
            }
            for (int i = 23616 & 8718; i < arrn.length; ++i) {
                if (this.Field_11376[i] == null) {
                    this.Field_11376[i] = new int[arrn[i].length];
                }
                if (i >= arrn2.length || arrn2[i].length != arrn[i].length) continue;
                for (int j = -24544 & 913; j < arrn[i].length; ++j) {
                    int n4 = arrn[i][j];
                    int n5 = arrn2[i][j];
                    int n6 = (int)((double)((n4 & (150934034 & 889126912)) >> (58 & 2768)) * d + (double)((n5 & (83821070 & -620814944)) >> (8728 & 496)) * (1.0 - d));
                    int n7 = (int)((double)((n4 & (402718608 & 2686796)) >> (2077 & 1192)) * d + (double)((n5 & (18415401 & 168230674)) >> (5256 & 8238)) * (1.0 - d));
                    int n8 = (int)((double)(n4 & (2303 & 8447)) * d + (double)(n5 & (16639 & 9471)) * (1.0 - d));
                    this.Field_11376[i][j] = n4 & (-14151670 & -8387324) | n6 << (16 & 26132) | n7 << (-32179 & 4106) | n8;
                }
            }
            Class_18695.Method_18712(this.Field_11376, this.Field_11381, this.Field_11396, this.Field_11395, this.Field_11386, (-28416 & 146) != 0, (4130 & -30656) != 0);
        }
    }

    public float Method_11429() {
        return this.Field_11384;
    }

    public float Method_11430(float f) {
        f -= this.Field_11380;
        float f2 = (float)this.Field_11373 / (float)this.Field_11396;
        return f *= f2;
    }

    public int Method_11431() {
        return this.Field_11381;
    }

    public float Method_11432(float f) {
        f -= this.Field_11375;
        float f2 = (float)this.Field_11382 / (float)this.Field_11381;
        return f *= f2;
    }

    public static void Method_11433(String string) {
        Field_11393 = string;
    }

    private static String Method_11434(String string) {
        int n = 9944;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_11372.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public float Method_11435(double d) {
        float f = this.Field_11384 - this.Field_11394;
        return this.Field_11394 + f * ((float)d / (2.7777777f * 5.76f));
    }

    public boolean Method_11436(Class_279 class_279, Class_2080 class_2080) {
        return (28809 & -31965) != 0;
    }

    public float Method_11437() {
        return this.Field_11394;
    }

    public String Method_11438() {
        return this.Field_11391;
    }

    protected static Class_11372 Method_11439(Class_2080 class_2080) {
        String string = class_2080.Method_2086();
        return Field_11401.equals(string) ? new Class_21780(string) : (Field_11393.equals(string) ? new Class_16023(string) : new Class_11372(string));
    }

    public int[][] Method_11440(int n) {
        return (int[][])this.Field_11399.get(n);
    }

    public void Method_11441(int n) {
        ArrayList<int[][]> arrayList = new ArrayList<int[][]>();
        for (int i = 67 & 28; i < this.Field_11399.size(); ++i) {
            int[][] arrn = (int[][])this.Field_11399.get(i);
            if (arrn == null) continue;
            try {
                arrayList.add(Class_18695.Method_18708(n, this.Field_11381, arrn));
                continue;
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Generating mipmaps for frame");
                Class_13220 class_13220 = class_13268.Method_13280("Frame being iterated");
                class_13220.Method_13231("Frame index", i);
                class_13220.Method_13232("Frame sizes", new Class_29147(this, arrn));
                throw new Class_1809(class_13268);
            }
        }
        this.Method_11445(arrayList);
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11441(n);
        }
    }

    public boolean Method_11442(Class_279 class_279, Class_2080 class_2080) {
        return (-15980 & 4161) != 0;
    }

    public void Method_11443(BufferedImage[] arrbufferedImage, Class_26720 class_26720) {
        int n;
        int[] arrn;
        int n2;
        this.Method_11418();
        int n3 = arrbufferedImage[24578 & 2032].getWidth();
        int n4 = arrbufferedImage[0 & -21664].getHeight();
        this.Field_11381 = n3;
        this.Field_11396 = n4;
        int[][] arrarrn = new int[arrbufferedImage.length][];
        for (n2 = 5136 & 10304; n2 < arrbufferedImage.length; ++n2) {
            BufferedImage bufferedImage = arrbufferedImage[n2];
            if (bufferedImage == null) continue;
            if (n2 > 0 && (bufferedImage.getWidth() != n3 >> n2 || bufferedImage.getHeight() != n4 >> n2)) {
                Object[] arrobject = new Object[-8187 & 93];
                arrobject[-7792 & 1093] = n2;
                arrobject[-31423 & 8337] = bufferedImage.getWidth();
                arrobject[-14994 & 2178] = bufferedImage.getHeight();
                arrobject[-16125 & 7187] = n3 >> n2;
                arrobject[16468 & 9605] = n4 >> n2;
                throw new RuntimeException(String.format("Unable to load miplevel: %d, image is size: %dx%d, expected %dx%d", arrobject));
            }
            arrarrn[n2] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
            bufferedImage.getRGB(4864 & 18487, -32768 & 20546, bufferedImage.getWidth(), bufferedImage.getHeight(), arrarrn[n2], 1024 & -26162, bufferedImage.getWidth());
        }
        if (class_26720 == null) {
            if (n4 != n3) {
                throw new RuntimeException("broken aspect ratio and not an animation");
            }
            this.Field_11399.add(arrarrn);
        } else {
            int n5;
            n2 = n4 / n3;
            int n6 = n3;
            n = n3;
            this.Field_11396 = this.Field_11381;
            if (class_26720.Method_26732() > 0) {
                arrn = class_26720.Method_26728().iterator();
                while (arrn.hasNext()) {
                    n5 = (Integer)arrn.next();
                    if (n5 >= n2) {
                        throw new RuntimeException("invalid frameindex " + n5);
                    }
                    this.Method_11425(n5);
                    this.Field_11399.set(n5, Class_11372.Method_11447(arrarrn, n6, n, n5));
                }
                this.Field_11385 = class_26720;
            } else {
                arrn = new ArrayList();
                for (n5 = 18962 & -20159; n5 < n2; ++n5) {
                    this.Field_11399.add(Class_11372.Method_11447(arrarrn, n6, n, n5));
                    arrn.add(new Class_16190(n5, -1 & -1));
                }
                this.Field_11385 = new Class_26720((List)arrn, this.Field_11381, this.Field_11396, class_26720.Method_26735(), class_26720.Method_26733());
            }
        }
        if (!this.Field_11390) {
            if (Class_19426.Method_19570()) {
                this.Method_11411();
            }
            for (n2 = 2072 & -32604; n2 < this.Field_11399.size(); ++n2) {
                int[][] arrn2 = (int[][])this.Field_11399.get(n2);
                if (arrn2 == null || this.Field_11391.startsWith("minecraft:blocks/leaves_")) continue;
                for (n = 24610 & 336; n < arrn2.length; ++n) {
                    arrn = arrn2[n];
                    this.Method_11403(arrn);
                }
            }
            if (this.Field_11388 != null) {
                this.Field_11388.Method_11443(arrbufferedImage, class_26720);
            }
        }
    }

    public float Method_11444() {
        return this.Field_11383;
    }

    public void Method_11445(List list) {
        this.Field_11399 = list;
        if (this.Field_11388 != null) {
            this.Field_11388.Method_11445(list);
        }
    }

    public float Method_11446(double d) {
        float f = this.Field_11383 - this.Field_11398;
        return this.Field_11398 + f * (float)d / (0.88f * 18.181818f);
    }

    private static int[][] Method_11447(int[][] arrn, int n, int n2, int n3) {
        int[][] arrarrn = new int[arrn.length][];
        for (int i = 14705 & 17410; i < arrn.length; ++i) {
            int[] arrn2 = arrn[i];
            if (arrn2 == null) continue;
            arrarrn[i] = new int[(n >> i) * (n2 >> i)];
            System.arraycopy(arrn2, n3 * arrarrn[i].length, arrarrn[i], 40 & -24491, arrarrn[i].length);
        }
        return arrarrn;
    }

    private Class_11372(Class_11372 class_11372) {
        this.Field_11378 = 4110 & 33;
        this.Field_11374 = 17024 & -30382;
        this.Field_11397 = null;
        this.Field_11377 = null;
        this.Field_11390 = 2442 & 4721;
        this.Field_11391 = class_11372.Field_11391;
        this.Field_11378 = 20481 & 41;
    }

    public double Method_11448(float f) {
        float f2 = this.Field_11383 - this.Field_11398;
        return (f - this.Field_11398) / f2 * (1.28f * 12.5f);
    }
}

