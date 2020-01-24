/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.world.NextTickListEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_27702
implements Class_15769,
Class_17274 {
    private final File Field_27703;
    private static final Logger Field_27704 = LogManager.getLogger();
    private Map Field_27705 = new ConcurrentHashMap();
    private boolean Field_27706 = 9248 & 285;
    private Set Field_27707 = Collections.newSetFromMap(new ConcurrentHashMap());

    protected void Method_27708(Class_29480 class_29480, Class_1699 class_1699) {
        if (!this.Field_27707.contains(class_29480)) {
            this.Field_27705.put(class_29480, class_1699);
        }
        Class_20117.Method_20123().Method_20128(this);
    }

    private void Method_27709() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_17665 Method_27710(Class_283 class_283, Class_1699 class_1699) {
        Object object;
        Class_1758 class_1758;
        Object object2;
        Object object3;
        Class_1758 class_17582;
        Class_1758 class_17583;
        Object object4;
        int n;
        int n2 = class_1699.Method_1738("xPos");
        int n3 = class_1699.Method_1738("zPos");
        Class_17665 class_17665 = new Class_17665(class_283, n2, n3);
        class_17665.Method_17767(class_1699.Method_1701("HeightMap"));
        class_17665.Method_17710(class_1699.Method_1733("TerrainPopulated"));
        class_17665.Method_17712(class_1699.Method_1733("LightPopulated"));
        class_17665.Method_17722(class_1699.Method_1705("InhabitedTime"));
        Class_1758 class_17584 = class_1699.Method_1735("Sections", -24566 & 17499);
        int n4 = 1040 & 29010;
        Class_30238[] arrclass_30238 = new Class_30238[n4];
        int n5 = !class_283.Field_284.Method_18370() ? 2081 & 5057 : -15614 & 3216;
        for (int i = -20430 & 19009; i < class_17584.Method_1772(); ++i) {
            Class_1699 class_16992 = class_17584.Method_1768(i);
            n = class_16992.Method_1716("Y");
            object = new Class_30238(n << (5389 & 16388), n5 != 0);
            object3 = class_16992.Method_1743("Blocks");
            object4 = new Class_14599(class_16992.Method_1743("Data"));
            object2 = class_16992.Method_1715("Add", -16057 & 2695) ? new Class_14599(class_16992.Method_1743("Add")) : null;
            char[] arrc = new char[((byte[])object3).length];
            for (int j = 6658 & -32736; j < arrc.length; ++j) {
                int n6 = j & (-32753 & 19951);
                int n7 = j >> (-24564 & 2072) & (26639 & 4559);
                int n8 = j >> (516 & 8324) & (1039 & 26671);
                int n9 = object2 != null ? ((Class_14599)object2).Method_14602(n6, n7, n8) : 2560 & -23416;
                arrc[j] = (char)(n9 << (-27892 & 2077) | (object3[j] & (255 & -32001)) << (28806 & 805) | ((Class_14599)object4).Method_14602(n6, n7, n8));
            }
            ((Class_30238)object).Method_30248(arrc);
            ((Class_30238)object).Method_30261(new Class_14599(class_16992.Method_1743("BlockLight")));
            if (n5 != 0) {
                ((Class_30238)object).Method_30247(new Class_14599(class_16992.Method_1743("SkyLight")));
            }
            ((Class_30238)object).Method_30263();
            arrclass_30238[n] = object;
        }
        class_17665.Method_17725(arrclass_30238);
        if (class_1699.Method_1715("Biomes", 1055 & -13785)) {
            class_17665.Method_17720(class_1699.Method_1743("Biomes"));
        }
        if ((class_1758 = class_1699.Method_1735("Entities", 5134 & 26)) != null) {
            for (int i = 19988 & -20472; i < class_1758.Method_1772(); ++i) {
                Class_1699 class_16993 = class_1758.Method_1768(i);
                object = Class_15516.Method_15578(class_16993, class_283);
                class_17665.Method_17764((-32747 & 11) != 0);
                if (object == null) continue;
                class_17665.Method_17703((Class_1061)object);
                object3 = object;
                object4 = class_16993;
                while (((Class_1699)object4).Method_1715("Riding", 5258 & -16118)) {
                    object2 = Class_15516.Method_15578(((Class_1699)object4).Method_1703("Riding"), class_283);
                    if (object2 != null) {
                        class_17665.Method_17703((Class_1061)object2);
                        ((Class_1061)object3).Method_1163((Class_1061)object2);
                    }
                    object3 = object2;
                    object4 = ((Class_1699)object4).Method_1703("Riding");
                }
            }
        }
        if ((class_17583 = class_1699.Method_1735("TileEntities", -31669 & 4234)) != null) {
            for (n = 22560 & 340; n < class_17583.Method_1772(); ++n) {
                object = class_17583.Method_1768(n);
                object3 = Class_4879.Method_4888((Class_1699)object);
                if (object3 == null) continue;
                class_17665.Method_17715((Class_4879)object3);
            }
        }
        if (class_1699.Method_1715("TileTicks", 4107 & 2281) && (class_17582 = class_1699.Method_1735("TileTicks", 16442 & -28662)) != null) {
            for (int i = -25040 & 8192; i < class_17582.Method_1772(); ++i) {
                object3 = class_17582.Method_1768(i);
                object4 = ((Class_1699)object3).Method_1715("i", 792 & -12179) ? Class_3238.Method_3341(((Class_1699)object3).Method_1708("i")) : Class_3238.Method_3323(((Class_1699)object3).Method_1738("i"));
                class_283.Method_342(new Class_4751(((Class_1699)object3).Method_1738("x"), ((Class_1699)object3).Method_1738("y"), ((Class_1699)object3).Method_1738("z")), (Class_3238)object4, ((Class_1699)object3).Method_1738("t"), ((Class_1699)object3).Method_1738("p"));
            }
        }
        return class_17665;
    }

    public void Method_27711(Class_283 class_283, Class_17665 class_17665) {
    }

    private void Method_27712(Class_17665 class_17665, Class_283 class_283, Class_1699 class_1699) {
        Object object;
        Class_1699 class_16992;
        Object object2;
        Object object32;
        Object object4;
        Object object5;
        class_1699.Method_1724("V", (byte)(1 & 6721));
        class_1699.Method_1739("xPos", class_17665.Field_17666);
        class_1699.Method_1739("zPos", class_17665.Field_17668);
        class_1699.Method_1718("LastUpdate", class_283.Method_363());
        class_1699.Method_1725("HeightMap", class_17665.Method_17707());
        class_1699.Method_1706("TerrainPopulated", class_17665.Method_17770());
        class_1699.Method_1706("LightPopulated", class_17665.Method_17758());
        class_1699.Method_1718("InhabitedTime", class_17665.Method_17700());
        Class_30238[] arrclass_30238 = class_17665.Method_17713();
        Class_1758 class_1758 = new Class_1758();
        int n = !class_283.Field_284.Method_18370() ? 30977 & -32597 : 12364 & -30320;
        Object object6 = arrclass_30238;
        int n2 = ((Class_30238[])object6).length;
        for (int i = 12360 & 18195; i < n2; ++i) {
            object32 = object6[i];
            if (object32 == null) continue;
            class_16992 = new Class_1699();
            class_16992.Method_1724("Y", (byte)(((Class_30238)object32).Method_30253() >> (12292 & 44) & (17663 & -24321)));
            object5 = new byte[((Class_30238)object32).Method_30252().length];
            object = new Class_14599();
            object4 = null;
            for (int j = 64 & -28152; j < ((Class_30238)object32).Method_30252().length; ++j) {
                object2 = ((Class_30238)object32).Method_30252()[j];
                int n3 = j & (79 & -32753);
                int n4 = j >> (8200 & 105) & (2271 & 16431);
                int n5 = j >> (1060 & 7044) & (799 & 12399);
                if (object2 >> (-28884 & 141) != 0) {
                    if (object4 == null) {
                        object4 = new Class_14599();
                    }
                    ((Class_14599)object4).Method_14606(n3, n4, n5, (int)(object2 >> (2061 & 1100)));
                }
                object5[j] = (byte)(object2 >> (68 & -31090) & (22271 & 255));
                ((Class_14599)object).Method_14606(n3, n4, n5, object2 & (24591 & 4239));
            }
            class_16992.Method_1719("Blocks", (byte[])object5);
            class_16992.Method_1719("Data", ((Class_14599)object).Method_14605());
            if (object4 != null) {
                class_16992.Method_1719("Add", ((Class_14599)object4).Method_14605());
            }
            class_16992.Method_1719("BlockLight", ((Class_30238)object32).Method_30254().Method_14605());
            if (n != 0) {
                class_16992.Method_1719("SkyLight", ((Class_30238)object32).Method_30250().Method_14605());
            } else {
                class_16992.Method_1719("SkyLight", new byte[((Class_30238)object32).Method_30254().Method_14605().length]);
            }
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Sections", class_1758);
        class_1699.Method_1719("Biomes", class_17665.Method_17743());
        class_17665.Method_17764((16676 & 64) != 0);
        object6 = new Class_1758();
        for (n2 = -30078 & 104; n2 < class_17665.Method_17711().length; ++n2) {
            Iterator iterator = class_17665.Method_17711()[n2].Method_30053();
            while (iterator.hasNext()) {
                object32 = (Class_1061)iterator.next();
                if (!((Class_1061)object32).Method_1282(class_16992 = new Class_1699())) continue;
                class_17665.Method_17764((-16311 & 8213) != 0);
                ((Class_1758)object6).Method_1781(class_16992);
            }
        }
        class_1699.Method_1744("Entities", (Class_1674)object6);
        Class_1758 class_17582 = new Class_1758();
        for (Object object32 : class_17665.Method_17706().values()) {
            class_16992 = new Class_1699();
            ((Class_4879)object32).Method_4929(class_16992);
            class_17582.Method_1781(class_16992);
        }
        class_1699.Method_1744("TileEntities", class_17582);
        List list = class_283.Method_340(class_17665, (2049 & -31736) != 0);
        if (list != null) {
            long l = class_283.Method_363();
            object5 = new Class_1758();
            object = list.iterator();
            while (object.hasNext()) {
                object4 = (NextTickListEntry)object.next();
                Class_1699 class_16993 = new Class_1699();
                object2 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)((NextTickListEntry)object4).getBlock());
                class_16993.Method_1702("i", object2 == null ? "" : ((Class_2080)object2).Method_2086());
                class_16993.Method_1739("x", ((NextTickListEntry)object4).position.\u0000= final());
                class_16993.Method_1739("y", ((NextTickListEntry)object4).position.\u0000, `());
                class_16993.Method_1739("z", ((NextTickListEntry)object4).position.\u0000strictfp());
                class_16993.Method_1739("t", (int)(((NextTickListEntry)object4).scheduledTime - l));
                class_16993.Method_1739("p", ((NextTickListEntry)object4).priority);
                ((Class_1758)object5).Method_1781(class_16993);
            }
            class_1699.Method_1744("TileTicks", (Class_1674)object5);
        }
    }

    public Class_27702(File file) {
        this.Field_27703 = file;
    }

    protected Class_17665 Method_27713(Class_283 class_283, int n, int n2, Class_1699 class_1699) {
        if (!class_1699.Method_1715("Level", 9483 & -12246)) {
            Field_27704.error("Chunk file at " + n + "," + n2 + " is missing level data, skipping");
            return null;
        }
        Class_1699 class_16992 = class_1699.Method_1703("Level");
        if (!class_16992.Method_1715("Sections", -24567 & 1577)) {
            Field_27704.error("Chunk file at " + n + "," + n2 + " is missing block data, skipping");
            return null;
        }
        Class_17665 class_17665 = this.Method_27710(class_283, class_16992);
        if (!class_17665.Method_17769(n, n2)) {
            Field_27704.error("Chunk file at " + n + "," + n2 + " is in the wrong location; relocating. (Expected " + n + ", " + n2 + ", got " + class_17665.Field_17666 + ", " + class_17665.Field_17668 + ")");
            class_16992.Method_1739("xPos", n);
            class_16992.Method_1739("zPos", n2);
            class_17665 = this.Method_27710(class_283, class_16992);
        }
        return class_17665;
    }

    public void Method_27714() {
    }

    public Class_17665 Method_27715(Class_283 class_283, int n, int n2) {
        Class_29480 class_29480 = new Class_29480(n, n2);
        Class_1699 class_1699 = (Class_1699)this.Field_27705.get(class_29480);
        if (class_1699 == null) {
            DataInputStream dataInputStream = Class_27544.Method_27549(this.Field_27703, n, n2);
            if (dataInputStream == null) {
                return null;
            }
            class_1699 = Class_24711.Method_24722(dataInputStream);
        }
        return this.Method_27713(class_283, n, n2, class_1699);
    }

    public void Method_27716() {
        try {
            this.Field_27706 = 1057 & -11439;
            do {
                if (this.Method_27719()) continue;
            } while (true);
        }
        catch (Throwable throwable) {
            this.Field_27706 = -32479 & 3594;
            throw throwable;
        }
    }

    private void Method_27717(Class_29480 class_29480, Class_1699 class_1699) {
        DataOutputStream dataOutputStream = Class_27544.Method_27550(this.Field_27703, class_29480.Field_29483, class_29480.Field_29482);
        Class_24711.Method_24712(class_1699, dataOutputStream);
        dataOutputStream.close();
    }

    public void Method_27718(Class_283 class_283, Class_17665 class_17665) {
        class_283.Method_529();
        try {
            Class_1699 class_1699 = new Class_1699();
            Class_1699 class_16992 = new Class_1699();
            class_1699.Method_1744("Level", class_16992);
            this.Method_27712(class_17665, class_283, class_16992);
            this.Method_27708(class_17665.Method_17729(), class_1699);
        }
        catch (Exception exception) {
            Field_27704.error("Failed to save chunk", (Throwable)exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean Method_27719() {
        boolean bl;
        if (this.Field_27705.isEmpty()) {
            if (this.Field_27706) {
                Object[] arrobject = new Object[10401 & 4097];
                arrobject[2058 & 17424] = this.Field_27703.getName();
                Field_27704.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", arrobject);
            }
            return (768 & -5905) != 0;
        }
        Class_29480 class_29480 = (Class_29480)this.Field_27705.keySet().iterator().next();
        try {
            this.Field_27707.add(class_29480);
            Class_1699 class_1699 = (Class_1699)this.Field_27705.remove(class_29480);
            if (class_1699 != null) {
                try {
                    this.Method_27717(class_29480, class_1699);
                }
                catch (Exception exception) {
                    Field_27704.error("Failed to save chunk", (Throwable)exception);
                }
            }
            bl = 21505 & 2123;
        }
        finally {
            this.Field_27707.remove(class_29480);
        }
        return bl;
    }
}

