/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

public class Class_1699
extends Class_1674 {
    private Map Field_1700 = Maps.newHashMap();

    public int[] Method_1701(String string) {
        try {
            return !this.Method_1715(string, 4171 & 25615) ? new int[8417 & -15608] : ((Class_37367)this.Field_1700.get(string)).Method_37376();
        }
        catch (ClassCastException classCastException) {
            throw new Class_1809(this.Method_1723(string, 2763 & 27, classCastException));
        }
    }

    public void Method_1702(String string, String string2) {
        this.Field_1700.put(string, new Class_1746(string2));
    }

    public Class_1699 Method_1703(String string) {
        try {
            return !this.Method_1715(string, 8734 & 22539) ? new Class_1699() : (Class_1699)this.Field_1700.get(string);
        }
        catch (ClassCastException classCastException) {
            throw new Class_1809(this.Method_1723(string, 14 & 20747, classCastException));
        }
    }

    public void Method_1704(String string, float f) {
        this.Field_1700.put(string, new Class_39580(f));
    }

    public long Method_1705(String string) {
        try {
            return !this.Method_1715(string, 363 & 19571) ? 1628575936L & 8537532813124043275L : ((Class_39033)this.Field_1700.get(string)).Method_39039();
        }
        catch (ClassCastException classCastException) {
            return 403701842L & -7186415105074912475L;
        }
    }

    public void Method_1706(String string, boolean bl) {
        this.Method_1724(string, (byte)(bl ? 1057 & -24383 : 0 & -19711));
    }

    public boolean Method_1707(String string) {
        return this.Field_1700.containsKey(string);
    }

    public String Method_1708(String string) {
        try {
            return !this.Method_1715(string, -16100 & 2699) ? "" : ((Class_1674)this.Field_1700.get(string)).Method_1688();
        }
        catch (ClassCastException classCastException) {
            return "";
        }
    }

    void Method_1709(DataInput dataInput, int n, Class_19804 class_19804) {
        byte by;
        class_19804.Method_19809(-7764843798329818230L & 1863322052L);
        if (n > (593 & 27136)) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.Field_1700.clear();
        while ((by = Class_1699.Method_1741(dataInput, class_19804)) != 0) {
            String string = Class_1699.Method_1713(dataInput, class_19804);
            class_19804.Method_19809((20712 & -21263) + (20752 & -32201) * string.length());
            Class_1674 class_1674 = Class_1699.Method_1712(by, string, dataInput, n + (1351 & -8175), class_19804);
            if (this.Field_1700.put(string, class_1674) == null) continue;
            class_19804.Method_19809(1545732392L & 580154288L);
        }
    }

    public Set Method_1710() {
        return this.Field_1700.keySet();
    }

    public byte Method_1711(String string) {
        Class_1674 class_1674 = (Class_1674)this.Field_1700.get(string);
        return (byte)(class_1674 != null ? class_1674.Method_1683() : -28463 & 16384);
    }

    static Class_1674 Method_1712(byte by, String string, DataInput dataInput, int n, Class_19804 class_19804) {
        Class_1674 class_1674 = Class_1674.Method_1690(by);
        try {
            class_1674.Method_1678(dataInput, n, class_19804);
            return class_1674;
        }
        catch (IOException iOException) {
            Class_13268 class_13268 = Class_13268.Method_13285(iOException, "Loading NBT data");
            Class_13220 class_13220 = class_13268.Method_13280("NBT Tag");
            class_13220.Method_13231("Tag name", string);
            class_13220.Method_13231("Tag type", by);
            throw new Class_1809(class_13268);
        }
    }

    private static String Method_1713(DataInput dataInput, Class_19804 class_19804) {
        return dataInput.readUTF();
    }

    void Method_1714(DataOutput dataOutput) {
        for (String string : this.Field_1700.keySet()) {
            Class_1674 class_1674 = (Class_1674)this.Field_1700.get(string);
            Class_1699.Method_1742(string, class_1674, dataOutput);
        }
        dataOutput.writeByte(16682 & 3072);
    }

    public boolean Method_1715(String string, int n) {
        byte by = this.Method_1711(string);
        if (by == n) {
            return (4893 & 2049) != 0;
        }
        if (n != (-31633 & 12387)) {
            if (by > 0) {
                // empty if block
            }
            return (2184 & 33) != 0;
        }
        return (by == (9221 & 2689) || by == (-16345 & 154) || by == (135 & 28971) || by == (1813 & 20654) || by == (8837 & -28635) || by == (14118 & 16599) ? 525 & 6403 : 15128 & 132) != 0;
    }

    public byte Method_1716(String string) {
        try {
            return (byte)(!this.Method_1715(string, 111 & -10653) ? 10302 & 4096 : ((Class_39033)this.Field_1700.get(string)).Method_39038());
        }
        catch (ClassCastException classCastException) {
            return (byte)(609 & -24164);
        }
    }

    static Map Method_1717(Class_1699 class_1699) {
        return class_1699.Field_1700;
    }

    public void Method_1718(String string, long l) {
        this.Field_1700.put(string, new Class_45819(l));
    }

    public void Method_1719(String string, byte[] arrby) {
        this.Field_1700.put(string, new Class_41664(arrby));
    }

    public Class_1674 Method_1720(String string) {
        return (Class_1674)this.Field_1700.get(string);
    }

    public double Method_1721(String string) {
        try {
            return !this.Method_1715(string, 31211 & 627) ? 0.0 : ((Class_39033)this.Field_1700.get(string)).Method_39034();
        }
        catch (ClassCastException classCastException) {
            return 0.0;
        }
    }

    private void Method_1722() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_13268 Method_1723(String string, int n, ClassCastException classCastException) {
        Class_13268 class_13268 = Class_13268.Method_13285(classCastException, "Reading NBT data");
        Class_13220 class_13220 = class_13268.Method_13284("Corrupt NBT tag", 449 & 13327);
        class_13220.Method_13232("Tag type found", new Class_23556(this, string));
        class_13220.Method_13232("Tag type expected", new Class_41404(this, n));
        class_13220.Method_13231("Tag name", string);
        return class_13268;
    }

    public void Method_1724(String string, byte by) {
        this.Field_1700.put(string, new Class_45569(by));
    }

    public void Method_1725(String string, int[] arrn) {
        this.Field_1700.put(string, new Class_37367(arrn));
    }

    public short Method_1726(String string) {
        try {
            return (short)(!this.Method_1715(string, 359 & 18659) ? 17168 & 15364 : ((Class_39033)this.Field_1700.get(string)).Method_39036());
        }
        catch (ClassCastException classCastException) {
            return (short)(24584 & -28652);
        }
    }

    public int Method_1727() {
        return super.Method_1676() ^ this.Field_1700.hashCode();
    }

    public void Method_1728(String string, double d) {
        this.Field_1700.put(string, new Class_44215(d));
    }

    public String Method_1729() {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Map.Entry entry : this.Field_1700.entrySet()) {
            if (stringBuilder.length() != (26881 & 4169)) {
                stringBuilder.append((char)(-30659 & 17198));
            }
            stringBuilder.append((String)entry.getKey()).append((char)(1086 & 12346)).append(entry.getValue());
        }
        return stringBuilder.append((char)(3709 & 12413)).toString();
    }

    public void Method_1730(Class_1699 class_1699) {
        for (String string : class_1699.Field_1700.keySet()) {
            Class_1674 class_1674 = (Class_1674)class_1699.Field_1700.get(string);
            if (class_1674.Method_1683() == (18602 & 4106)) {
                if (this.Method_1715(string, 16650 & -31733)) {
                    Class_1699 class_16992 = this.Method_1703(string);
                    class_16992.Method_1730((Class_1699)class_1674);
                    continue;
                }
                this.Method_1744(string, class_1674.Method_1677());
                continue;
            }
            this.Method_1744(string, class_1674.Method_1677());
        }
    }

    public void Method_1731(String string, short s) {
        this.Field_1700.put(string, new Class_39686(s));
    }

    public Class_1674 Method_1732() {
        Class_1699 class_1699 = new Class_1699();
        for (String string : this.Field_1700.keySet()) {
            class_1699.Method_1744(string, ((Class_1674)this.Field_1700.get(string)).Method_1677());
        }
        return class_1699;
    }

    public boolean Method_1733(String string) {
        return (this.Method_1716(string) != 0 ? -31997 & 24725 : 18818 & -28559) != 0;
    }

    public boolean Method_1734(Object object) {
        if (super.Method_1693(object)) {
            Class_1699 class_1699 = (Class_1699)object;
            return this.Field_1700.entrySet().equals(class_1699.Field_1700.entrySet());
        }
        return (1024 & 528) != 0;
    }

    public Class_1758 Method_1735(String string, int n) {
        try {
            if (this.Method_1711(string) != (-23285 & 4205)) {
                return new Class_1758();
            }
            Class_1758 class_1758 = (Class_1758)this.Field_1700.get(string);
            return class_1758.Method_1772() > 0 && class_1758.Method_1777() != n ? new Class_1758() : class_1758;
        }
        catch (ClassCastException classCastException) {
            throw new Class_1809(this.Method_1723(string, 1321 & 525, classCastException));
        }
    }

    public boolean Method_1736() {
        return this.Field_1700.isEmpty();
    }

    public byte Method_1737() {
        return (byte)(-24485 & 1034);
    }

    public int Method_1738(String string) {
        try {
            return !this.Method_1715(string, 31867 & 611) ? 3397 & 552 : ((Class_39033)this.Field_1700.get(string)).Method_39040();
        }
        catch (ClassCastException classCastException) {
            return 3076 & -28255;
        }
    }

    public void Method_1739(String string, int n) {
        this.Field_1700.put(string, new Class_45018(n));
    }

    public void Method_1740(String string) {
        this.Field_1700.remove(string);
    }

    private static byte Method_1741(DataInput dataInput, Class_19804 class_19804) {
        return dataInput.readByte();
    }

    private static void Method_1742(String string, Class_1674 class_1674, DataOutput dataOutput) {
        dataOutput.writeByte(class_1674.Method_1683());
        if (class_1674.Method_1683() != 0) {
            dataOutput.writeUTF(string);
            class_1674.Method_1685(dataOutput);
        }
    }

    public byte[] Method_1743(String string) {
        try {
            return !this.Method_1715(string, 1543 & -14265) ? new byte[24834 & 6789] : ((Class_41664)this.Field_1700.get(string)).Method_41667();
        }
        catch (ClassCastException classCastException) {
            throw new Class_1809(this.Method_1723(string, 16431 & 1159, classCastException));
        }
    }

    public void Method_1744(String string, Class_1674 class_1674) {
        this.Field_1700.put(string, class_1674);
    }

    public float Method_1745(String string) {
        try {
            return !this.Method_1715(string, 24679 & -27277) ? 0.0f : ((Class_39033)this.Field_1700.get(string)).Method_39037();
        }
        catch (ClassCastException classCastException) {
            return 0.0f;
        }
    }
}

