/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_15188 {
    public static Class_17847 Method_15189(Class_1699 class_1699) {
        int n = class_1699.Method_1738("xPos");
        int n2 = class_1699.Method_1738("zPos");
        Class_17847 class_17847 = new Class_17847(n, n2);
        class_17847.Field_17849 = class_1699.Method_1743("Blocks");
        class_17847.Field_17850 = new Class_7603(class_1699.Method_1743("Data"), 8327 & 17191);
        class_17847.Field_17859 = new Class_7603(class_1699.Method_1743("SkyLight"), 8215 & -31833);
        class_17847.Field_17852 = new Class_7603(class_1699.Method_1743("BlockLight"), -32633 & 567);
        class_17847.Field_17856 = class_1699.Method_1743("HeightMap");
        class_17847.Field_17851 = class_1699.Method_1733("TerrainPopulated");
        class_17847.Field_17857 = class_1699.Method_1735("Entities", 4522 & 27147);
        class_17847.Field_17854 = class_1699.Method_1735("TileEntities", 4138 & -22517);
        class_17847.Field_17853 = class_1699.Method_1735("TileTicks", 16570 & 6670);
        try {
            class_17847.Field_17848 = class_1699.Method_1705("LastUpdate");
        }
        catch (ClassCastException classCastException) {
            class_17847.Field_17848 = class_1699.Method_1738("LastUpdate");
        }
        return class_17847;
    }

    /*
     * Could not resolve type clashes
     */
    public static void Method_15190(Class_17847 class_17847, Class_1699 class_1699, Class_31916 class_31916) {
        int n;
        class_1699.Method_1739("xPos", class_17847.Field_17858);
        class_1699.Method_1739("zPos", class_17847.Field_17855);
        class_1699.Method_1718("LastUpdate", class_17847.Field_17848);
        int[] arrn = new int[class_17847.Field_17856.length];
        for (int i = 3 & 30176; i < class_17847.Field_17856.length; ++i) {
            arrn[i] = class_17847.Field_17856[i];
        }
        class_1699.Method_1725("HeightMap", arrn);
        class_1699.Method_1706("TerrainPopulated", class_17847.Field_17851);
        Class_1758 class_1758 = new Class_1758();
        for (int i = 0 & 2600; i < (3656 & 312); ++i) {
            Object object;
            reference var9_14;
            Object object2;
            int n2 = 14339 & 833;
            for (n = 118 & -23544; n < (16537 & -31152) && n2 != 0; ++n) {
                block3 : for (object = 25092 & 218; object < (4242 & 10332) && n2 != 0; ++object) {
                    for (var9_14 = (reference)(17413 & 2216); var9_14 < (-15240 & 274); ++var9_14) {
                        object2 = n << (75 & -3957) | var9_14 << (-28593 & 1703) | object + (i << (20614 & -31227));
                        byte by = class_17847.Field_17849[object2];
                        if (by == 0) continue;
                        n2 = -31960 & 24706;
                        continue block3;
                    }
                }
            }
            if (n2 != 0) continue;
            byte[] arrby = new byte[28932 & 4112];
            object = new Class_14599();
            var9_14 = new Class_14599();
            object2 = new Class_14599();
            for (int j = 256 & 1138; j < (-12200 & 8336); ++j) {
                for (int k = 6212 & 34; k < (2101 & 10194); ++k) {
                    for (int i2 = 7507 & -8160; i2 < (24600 & -31470); ++i2) {
                        int n3 = j << (20619 & 591) | i2 << (199 & -28409) | k + (i << (-16698 & 52));
                        byte by = class_17847.Field_17849[n3];
                        arrby[k << (2588 & -16376) | i2 << (8198 & 17444) | j] = (byte)(by & (2303 & 4351));
                        ((Class_14599)object).Method_14606(j, k, i2, class_17847.Field_17850.Method_7607(j, k + (i << (8774 & 20740)), i2));
                        var9_14.Method_14606(j, k, i2, class_17847.Field_17859.Method_7607(j, k + (i << (9870 & 4100)), i2));
                        ((Class_14599)object2).Method_14606(j, k, i2, class_17847.Field_17852.Method_7607(j, k + (i << (-28668 & 18455)), i2));
                    }
                }
            }
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1724("Y", (byte)(i & (-30721 & 20735)));
            class_16992.Method_1719("Blocks", arrby);
            class_16992.Method_1719("Data", ((Class_14599)object).Method_14605());
            class_16992.Method_1719("SkyLight", var9_14.Method_14605());
            class_16992.Method_1719("BlockLight", ((Class_14599)object2).Method_14605());
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Sections", class_1758);
        byte[] arrby = new byte[288 & -21247];
        Class_4810 class_4810 = new Class_4810();
        for (n = 0 & -15088; n < (-19503 & 18456); ++n) {
            for (int i = -28671 & 16528; i < (272 & 20595); ++i) {
                class_4810.Method_4814(class_17847.Field_17858 << (17414 & 204) | n, 25556 & 4096, class_17847.Field_17855 << (23380 & 1197) | i);
                arrby[i << (11396 & 278) | n] = (byte)(class_31916.Method_31924((Class_4751)class_4810, (Class_17281)Class_17281.Field_17344).Field_17343 & (8447 & -10497));
            }
        }
        class_1699.Method_1719("Biomes", arrby);
        class_1699.Method_1744("Entities", class_17847.Field_17857);
        class_1699.Method_1744("TileEntities", class_17847.Field_17854);
        if (class_17847.Field_17853 != null) {
            class_1699.Method_1744("TileTicks", class_17847.Field_17853);
        }
    }

    private void Method_15191() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

