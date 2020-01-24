/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000continue abstract & ! import # while goto else # | while * continue void extends new { 2 + null ? instanceof do ^ , public ` final switch class 1 public if | static # while 5 strictfp ? null " " 4 9 transient const ! public default new abstract switch ~ do const
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_1758
extends Class_1674 {
    private static final Logger Field_1759 = LogManager.getLogger();
    private List Field_1760 = Lists.newArrayList();
    private byte Field_1761 = (byte)(1170 & -29919);

    public Class_1674 Method_1762() {
        Class_1758 class_1758 = new Class_1758();
        class_1758.Field_1761 = this.Field_1761;
        for (Class_1674 class_1674 : this.Field_1760) {
            Class_1674 class_16742 = class_1674.Method_1677();
            class_1758.Field_1760.add(class_16742);
        }
        return class_1758;
    }

    public Class_1674 Method_1763(int n) {
        return n >= 0 && n < this.Field_1760.size() ? (Class_1674)this.Field_1760.get(n) : new \u0000continue abstract & ! import # while goto else # | while * continue void extends new { 2 + null ? instanceof do ^ , public ` final switch class 1 public if | static # while 5 strictfp ? null " " 4 9 transient const ! public default new abstract switch ~ do const();
    }

    public byte Method_1764() {
        return (byte)(-32471 & 16907);
    }

    public int[] Method_1765(int n) {
        if (n >= 0 && n < this.Field_1760.size()) {
            Class_1674 class_1674 = (Class_1674)this.Field_1760.get(n);
            return class_1674.Method_1683() == (-32101 & 19563) ? ((Class_37367)class_1674).Method_37376() : new int[-15612 & 10258];
        }
        return new int[13952 & -32723];
    }

    public boolean Method_1766(Object object) {
        if (super.Method_1693(object)) {
            Class_1758 class_1758 = (Class_1758)object;
            if (this.Field_1761 == class_1758.Field_1761) {
                return this.Field_1760.equals(class_1758.Field_1760);
            }
        }
        return (402 & -14296) != 0;
    }

    public Class_1674 Method_1767(int n) {
        return (Class_1674)this.Field_1760.remove(n);
    }

    public Class_1699 Method_1768(int n) {
        if (n >= 0 && n < this.Field_1760.size()) {
            Class_1674 class_1674 = (Class_1674)this.Field_1760.get(n);
            return class_1674.Method_1683() == (4142 & -31478) ? (Class_1699)class_1674 : new Class_1699();
        }
        return new Class_1699();
    }

    public double Method_1769(int n) {
        if (n >= 0 && n < this.Field_1760.size()) {
            Class_1674 class_1674 = (Class_1674)this.Field_1760.get(n);
            return class_1674.Method_1683() == (582 & 16791) ? ((Class_44215)class_1674).Method_44221() : 0.0;
        }
        return 0.0;
    }

    public float Method_1770(int n) {
        if (n >= 0 && n < this.Field_1760.size()) {
            Class_1674 class_1674 = (Class_1674)this.Field_1760.get(n);
            return class_1674.Method_1683() == (6407 & 5) ? ((Class_39580)class_1674).Method_39582() : 0.0f;
        }
        return 0.0f;
    }

    public String Method_1771(int n) {
        if (n >= 0 && n < this.Field_1760.size()) {
            Class_1674 class_1674 = (Class_1674)this.Field_1760.get(n);
            return class_1674.Method_1683() == (269 & 11272) ? class_1674.Method_1688() : class_1674.Method_1698();
        }
        return "";
    }

    public int Method_1772() {
        return this.Field_1760.size();
    }

    public int Method_1773() {
        return super.Method_1676() ^ this.Field_1760.hashCode();
    }

    void Method_1774(DataOutput dataOutput) {
        this.Field_1761 = !this.Field_1760.isEmpty() ? ((Class_1674)this.Field_1760.get(8344 & 1346)).Method_1683() : (byte)(33 & 138);
        dataOutput.writeByte(this.Field_1761);
        dataOutput.writeInt(this.Field_1760.size());
        for (int i = -32512 & 8196; i < this.Field_1760.size(); ++i) {
            ((Class_1674)this.Field_1760.get(i)).Method_1685(dataOutput);
        }
    }

    private void Method_1775() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_1776() {
        return this.Field_1760.isEmpty();
    }

    public int Method_1777() {
        return this.Field_1761;
    }

    public String Method_1778() {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 130 & 293; i < this.Field_1760.size(); ++i) {
            if (i != 0) {
                stringBuilder.append((char)(-9684 & 8687));
            }
            stringBuilder.append(i).append((char)(5178 & 10683)).append(this.Field_1760.get(i));
        }
        return stringBuilder.append((char)(8541 & 1149)).toString();
    }

    void Method_1779(DataInput dataInput, int n, Class_19804 class_19804) {
        class_19804.Method_19809(2407568307885457705L & 18226552L);
        if (n > (2560 & 17216)) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.Field_1761 = dataInput.readByte();
        int n2 = dataInput.readInt();
        if (this.Field_1761 == 0 && n2 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        class_19804.Method_19809((283360L & -8343144639845300192L) * (long)n2);
        this.Field_1760 = Lists.newArrayListWithCapacity((int)n2);
        for (int i = 1056 & 8396; i < n2; ++i) {
            Class_1674 class_1674 = Class_1674.Method_1690(this.Field_1761);
            class_1674.Method_1678(dataInput, n + (18035 & 4109), class_19804);
            this.Field_1760.add(class_1674);
        }
    }

    public void Method_1780(int n, Class_1674 class_1674) {
        if (class_1674.Method_1683() == 0) {
            Field_1759.warn("Invalid TagEnd added to ListTag");
        } else if (n >= 0 && n < this.Field_1760.size()) {
            if (this.Field_1761 == 0) {
                this.Field_1761 = class_1674.Method_1683();
            } else if (this.Field_1761 != class_1674.Method_1683()) {
                Field_1759.warn("Adding mismatching tag types to tag list");
                return;
            }
            this.Field_1760.set(n, class_1674);
        } else {
            Field_1759.warn("index out of bounds to set tag in tag list");
        }
    }

    public void Method_1781(Class_1674 class_1674) {
        if (class_1674.Method_1683() == 0) {
            Field_1759.warn("Invalid TagEnd added to ListTag");
        } else {
            if (this.Field_1761 == 0) {
                this.Field_1761 = class_1674.Method_1683();
            } else if (this.Field_1761 != class_1674.Method_1683()) {
                Field_1759.warn("Adding mismatching tag types to tag list");
                return;
            }
            this.Field_1760.add(class_1674);
        }
    }
}

