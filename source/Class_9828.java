/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

public class Class_9828 {
    private int Field_9829;
    private static final byte[] Field_9830 = new byte[4768 & -18368];
    private long Field_9831;
    private final File Field_9832;
    private final int[] Field_9833 = new int[12032 & 1025];
    private RandomAccessFile Field_9834;
    private final int[] Field_9835 = new int[1033 & -15104];
    private List Field_9836;

    public boolean Method_9837(int n, int n2) {
        return (this.Method_9847(n, n2) != 0 ? -32215 & 18449 : -32675 & 17570) != 0;
    }

    private void Method_9838(int n, int n2, int n3) {
        this.Field_9833[n + n2 * (2080 & -11211)] = n3;
        this.Field_9834.seek((-11955 & 4096) + (n + n2 * (-32587 & 4136)) * (132 & 780));
        this.Field_9834.writeInt(n3);
    }

    public DataOutputStream Method_9839(int n, int n2) {
        return this.Method_9841(n, n2) ? null : new DataOutputStream(new DeflaterOutputStream(new Class_23100(this, n, n2)));
    }

    public void Method_9840() {
        if (this.Field_9834 != null) {
            this.Field_9834.close();
        }
    }

    private boolean Method_9841(int n, int n2) {
        return (n < 0 || n >= (-31136 & 48) || n2 < 0 || n2 >= (-15120 & 6702) ? -21087 & 16923 : -32744 & 224) != 0;
    }

    protected synchronized void Method_9842(int n, int n2, byte[] arrby, int n3) {
        try {
            int n4 = this.Method_9847(n, n2);
            int n5 = n4 >> (24584 & -26963);
            int n6 = n4 & (10495 & -14593);
            int n7 = (n3 + (17029 & -32395)) / (-20478 & 6193) + (16805 & -31653);
            if (n7 >= (14594 & -30936)) {
                return;
            }
            if (n5 != 0 && n6 == n7) {
                this.Method_9846(n5, arrby, n3);
            } else {
                int n8;
                int n9;
                for (n9 = 18432 & 536; n9 < n6; ++n9) {
                    this.Field_9836.set(n5 + n9, (3137 & 165) != 0);
                }
                n9 = this.Field_9836.indexOf((5173 & 65) != 0);
                int n10 = -16254 & 257;
                if (n9 != (-1 & -1)) {
                    for (n8 = n9; n8 < this.Field_9836.size(); ++n8) {
                        if (n10 != 0) {
                            n10 = ((Boolean)this.Field_9836.get(n8)).booleanValue() ? ++n10 : 25344 & -27470;
                        } else if (((Boolean)this.Field_9836.get(n8)).booleanValue()) {
                            n9 = n8;
                            n10 = 19 & 24801;
                        }
                        if (n10 >= n7) break;
                    }
                }
                if (n10 >= n7) {
                    n5 = n9;
                    this.Method_9843(n, n2, n9 << (25432 & 2058) | n7);
                    for (n8 = -24334 & 7680; n8 < n7; ++n8) {
                        this.Field_9836.set(n5 + n8, (24593 & 4750) != 0);
                    }
                    this.Method_9846(n5, arrby, n3);
                } else {
                    this.Field_9834.seek(this.Field_9834.length());
                    n5 = this.Field_9836.size();
                    for (n8 = 26694 & -32512; n8 < n7; ++n8) {
                        this.Field_9834.write(Field_9830);
                        this.Field_9836.add((26657 & 5320) != 0);
                    }
                    this.Field_9829 += (-28671 & 7900) * n7;
                    this.Method_9846(n5, arrby, n3);
                    this.Method_9843(n, n2, n5 << (11816 & 346) | n7);
                }
            }
            this.Method_9838(n, n2, (int)(Class_2457.Method_2513() / (1825047533L & 8985531874913952744L)));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private void Method_9843(int n, int n2, int n3) {
        this.Field_9835[n + n2 * (2096 & 28962)] = n3;
        this.Field_9834.seek((n + n2 * (-15838 & 1189)) * (8197 & 700));
        this.Field_9834.writeInt(n3);
    }

    public Class_9828(File file) {
        this.Field_9832 = file;
        this.Field_9829 = 1184 & 4108;
        try {
            int n;
            int n2;
            int n3;
            if (file.exists()) {
                this.Field_9831 = file.lastModified();
            }
            this.Field_9834 = new RandomAccessFile(file, "rw");
            if (this.Field_9834.length() < (-3089593116001298144L & 1617944L)) {
                for (n = 0 & 5265; n < (1044 & 11848); ++n) {
                    this.Field_9834.writeInt(10528 & 16584);
                }
                for (n = 2071 & -16128; n < (-29630 & 9912); ++n) {
                    this.Field_9834.writeInt(10642 & -15863);
                }
                this.Field_9829 += -22206 & 12293;
            }
            if ((this.Field_9834.length() & (1619546111L & -1930659503928111105L)) != (21331970L & 5858720605484876084L)) {
                n = 8512 & 2049;
                while ((long)n < (this.Field_9834.length() & (721559551L & 1155371007L))) {
                    this.Field_9834.write(528 & -24448);
                    ++n;
                }
            }
            n = (int)this.Field_9834.length() / (12416 & -25576);
            this.Field_9836 = Lists.newArrayListWithCapacity((int)n);
            for (n2 = 29060 & 48; n2 < n; ++n2) {
                this.Field_9836.add((2145 & -20335) != 0);
            }
            this.Field_9836.set(8517 & 16554, (8226 & 16588) != 0);
            this.Field_9836.set(-25917 & 16437, (-24238 & 33) != 0);
            this.Field_9834.seek(941621316L & 38818075L);
            for (n2 = 26570 & -32768; n2 < (-21224 & 5248); ++n2) {
                this.Field_9835[n2] = n3 = this.Field_9834.readInt();
                if (n3 == 0 || (n3 >> (18984 & -24497)) + (n3 & (-23297 & 16639)) > this.Field_9836.size()) continue;
                for (int i = 4992 & -8191; i < (n3 & (9215 & -16129)); ++i) {
                    this.Field_9836.set((n3 >> (-16184 & 14349)) + i, (21056 & 24) != 0);
                }
            }
            for (n2 = -30352 & 21128; n2 < (-15327 & 6092); ++n2) {
                this.Field_9833[n2] = n3 = this.Field_9834.readInt();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    public synchronized DataInputStream Method_9844(int n, int n2) {
        if (this.Method_9841(n, n2)) {
            return null;
        }
        try {
            int n3 = this.Method_9847(n, n2);
            if (n3 == 0) {
                return null;
            }
            int n4 = n3 >> (11272 & -31926);
            int n5 = n3 & (-31489 & 10751);
            if (n4 + n5 > this.Field_9836.size()) {
                return null;
            }
            this.Field_9834.seek(n4 * (20504 & 6788));
            int n6 = this.Field_9834.readInt();
            if (n6 > (14848 & 20621) * n5) {
                return null;
            }
            if (n6 <= 0) {
                return null;
            }
            byte by = this.Field_9834.readByte();
            if (by == (24585 & -28511)) {
                byte[] arrby = new byte[n6 - (2593 & 16585)];
                this.Field_9834.read(arrby);
                return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(arrby))));
            }
            if (by == (2563 & 8578)) {
                byte[] arrby = new byte[n6 - (13633 & 563)];
                this.Field_9834.read(arrby);
                return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(arrby))));
            }
            return null;
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private void Method_9845() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_9846(int n, byte[] arrby, int n2) {
        this.Field_9834.seek(n * (4608 & -11888));
        this.Field_9834.writeInt(n2 + (3081 & 4359));
        this.Field_9834.writeByte(-27430 & 16386);
        this.Field_9834.write(arrby, 8772 & 2338, n2);
    }

    private int Method_9847(int n, int n2) {
        return this.Field_9835[n + n2 * (8225 & -9926)];
    }
}

