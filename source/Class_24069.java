/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import javax.imageio.ImageIO;
import net.minecraft.client.renderer.texture.ExludedSetLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_24069
extends Class_23424
implements Class_2059 {
    static String Field_24070;
    private final Map Field_24071 = new HashMap();
    private static HashSet Field_24072;
    private double Field_24073;
    private final String Field_24074;
    public static final Class_2080 Field_24075;
    private Class_11372[] Field_24076;
    private final Class_14175 Field_24077;
    private int Field_24078;
    private int Field_24079;
    static List Field_24080;
    public int Field_24081;
    static String Field_24082;
    private final List Field_24083 = new ArrayList();
    public static final Class_2080 Field_24084;
    private static String Field_24085;
    static List Field_24086;
    private final Map Field_24087 = new HashMap();
    private int Field_24088;
    private final Class_11372 Field_24089 = new Class_11372("missingno");
    public int Field_24090;
    private int Field_24091;
    private static BufferedImage Field_24092;
    private static final Logger Field_24093;
    private double Field_24094;

    private static String Method_24095(String string) {
        int n = 7701;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_11372 Method_24096(double d, double d2) {
        if (this.Field_24076 == null) {
            return null;
        }
        int n = (int)(d2 / this.Field_24094);
        int n2 = (int)(d / this.Field_24073);
        int n3 = n * this.Field_24091 + n2;
        return n3 >= 0 && n3 <= this.Field_24076.length ? this.Field_24076[n3] : null;
    }

    private int[] Method_24097(int n) {
        BufferedImage bufferedImage = new BufferedImage(1170 & 573, 2104 & -23280, 9282 & 16803);
        bufferedImage.setRGB(10 & 20624, -32766 & 3425, 2874 & -16299, 15896 & 16499, Class_18695.Field_18698, 8370 & 4108, 4120 & 26832);
        BufferedImage bufferedImage2 = Class_21583.Method_21605(bufferedImage, n);
        int[] arrn = new int[n * n];
        bufferedImage2.getRGB(5906 & 2080, 148 & 1024, n, n, arrn, 1096 & -22016, n);
        return arrn;
    }

    static {
        Field_24093 = LogManager.getLogger();
        Field_24075 = new Class_2080(Class_24069.Method_24095("\u2044\u2041\u2040\u2041\u2044\u2040\u2040\u2040\u2044"));
        Field_24084 = new Class_2080(Class_24069.Method_24127("\u00c8\u00d9\u00c4\u00c9\u00cc\u00c9\u00dc\u00c9\u0098\u00d5\u00c0\u00d9\u00d0\u00c1\u009c\u00d1\u00c0\u00c1\u00cc\u00c5\u00d8\u0085\u00d8\u00c5\u00c0"));
        Field_24072 = new HashSet();
        ExludedSetLoader.\u0000strictfp(Field_24072);
        Field_24085 = Class_24069.Method_24116("\u1aa0\u1a89\u1a8a\u1a83\u1a8c\u1aad\u1aee\u1a87\u1a88\u1aa9\u1aa2\u1a8b\u1a8c\u1a8d\u1a8e\u1a87\u1a98\u1a99\u1ab2\u1a9b\u1a9c\u1abd\u1a9e\u1a9f\u1a98\u1a99\u1a9a\u1a9b\u1a9c\u1a9d\u1a9e\u1abf\u1a88\u1a89\u1a82\u1a8b\u1a8c\u1a8d\u1a8e\u1aa7\u1aa8\u1aa1\u1aaa\u1aeb\u1a8c\u1a8d\u1a8e\u1a8f\u1a98\u1ab1\u1a92\u1a93\u1a9c\u1afd\u1a9e\u1a9f\u1af0\u1ab9\u1a9a\u1af3\u1a9c\u1a9d\u1af6\u1abf\u1aa8\u1aa9\u1aaa\u1a8b\u1a8c\u1a8d\u1a8e\u1a8f\u1a88\u1a81\u1a8a\u1a83\u1a8c\u1a85\u1a86\u1a8f\u1a98\u1a99\u1aba\u1a9b\u1a9c\u1a9d\u1a9e\u1a97\u1a98\u1ab9\u1a9a\u1a9b\u1ab4\u1abd\u1abe\u1a97\u1a88\u1a89\u1a8a\u1a8b\u1a8c\u1aed\u1a8e\u1a87\u1a88\u1a89\u1a8a\u1a83\u1aec\u1aad\u1aae\u1aaf\u1a98\u1ab1\u1a9a\u1afb\u1af4\u1a9d\u1ab6\u1a9f\u1af8\u1ab9\u1a9a\u1a9b\u1a9c\u1a9d\u1ab6\u1aff\u1a88\u1a89\u1aa2\u1aeb\u1a8c\u1aed\u1ae6\u1aaf\u1aa8\u1a89\u1a8a\u1aab\u1aac\u1a8d\u1a8e\u1a8f\u1ab8\u1ab1\u1a9a\u1ab3\u1abc\u1a9d\u1a9e\u1ab7\u1a90\u1a91\u1aba\u1abb\u1abc\u1a9d\u1abe\u1abf\u1a88\u1ae9\u1aa2\u1a83\u1a8c\u1a8d\u1aae\u1a8f\u1a88\u1aa1\u1aaa\u1a8b\u1a8c\u1a8d\u1a8e\u1aef\u1a98\u1a99\u1a9a\u1a9b\u1a9c\u1a9d\u1ab6\u1a9f\u1ab8\u1a91\u1aba\u1a9b\u1abc\u1a95\u1a96\u1af7\u1a80\u1a81\u1aaa\u1aab\u1aa4\u1aa5\u1a8e\u1aa7\u1aa8\u1aa9\u1a8a\u1aeb\u1a84\u1a85\u1a8e\u1a87\u1a98\u1ab9\u1afa\u1abb\u1ab4\u1afd\u1a96\u1a9f\u1a90\u1ab1\u1a9a\u1ab3\u1a94\u1abd\u1a9e\u1abf\u1aa8\u1a89\u1aaa\u1aa3\u1aa4\u1a8d\u1aee\u1aaf\u1ae8\u1aa1\u1a8a\u1aab\u1aec\u1ae5\u1a86\u1aa7\u1ab0\u1ab1\u1a92\u1a93\u1a94\u1abd\u1a9e\u1ab7\u1a98\u1a99\u1a9a\u1ab3\u1a94\u1af5\u1a9e\u1ab7\u1aa8\u1ae1\u1aaa\u1aab\u1a8c\u1aad\u1aa6\u1aa7\u1a88\u1a89\u1aea\u1aa3\u1a84\u1aa5\u1aa6\u1aa7\u1a90\u1ab1\u1a92\u1af3\u1abc\u1a9d\u1a9e\u1a9f\u1ab0\u1a99\u1afa\u1afb\u1afc\u1afd\u1abe\u1a97\u1aa0\u1ae1\u1a82\u1a8b\u1aac\u1aed\u1ae6\u1a87\u1ae8\u1ae9\u1ae2\u1aeb\u1a8c\u1a85\u1aa6\u1aef\u1a98\u1ab9\u1af2\u1a9b\u1af4\u1af5\u1a9e\u1af7\u1ab8\u1ab1\u1af2\u1abb\u1afc\u1af5\u1abe\u1a9f\u1a88\u1a81\u1a82\u1aa3\u1a8c\u1a85\u1aae\u1aa7\u1a80\u1a89\u1aaa\u1aeb\u1a84\u1a85\u1aae\u1aaf\u1ab8\u1af9\u1af2\u1a93\u1ab4\u1ab5\u1afe\u1abf\u1a90\u1a99\u1ab2\u1afb\u1ab4\u1abd\u1afe\u1abf\u1aa8\u1aa1\u1a8a\u1a8b\u1a8c\u1a85\u1aa6\u1aa7\u1a88\u1aa9\u1aa2\u1a83\u1aa4\u1a8d\u1a86\u1aef\u1ab8\u1a91\u1a9a\u1abb\u1a94\u1a9d\u1abe\u1abf\u1a98\u1ab1\u1a92\u1a93\u1a9c\u1a9d\u1abe\u1a97\u1a88\u1aa9\u1a82\u1a8b\u1aa4\u1a85\u1a8e\u1aa7\u1a80\u1a89\u1aaa\u1a8b\u1a8c\u1a8d\u1a8e\u1a8f\u1a90\u1a99\u1a92\u1a93\u1abc\u1a9d\u1afe\u1abf\u1ab8\u1ab9\u1ab2\u1abb\u1a9c\u1a95\u1a9e\u1a97\u1aa8\u1a89\u1aaa\u1aab\u1aac\u1aa5\u1aee\u1aaf\u1a80\u1a81\u1a8a\u1aab\u1a84\u1aad\u1a86\u1aaf\u1a90\u1ab9\u1aba\u1a9b\u1afc\u1a9d\u1a9e\u1a97\u1a90\u1a99\u1a92\u1a93\u1ab4\u1a9d\u1a96\u1a9f\u1aa0\u1a89\u1a8a\u1aeb\u1a84\u1aad\u1aa6\u1a8f\u1a80\u1a89\u1a8a\u1a8b\u1a84\u1aa5\u1a86\u1a87\u1a90\u1a91\u1a9a\u1a93\u1ab4\u1a95\u1abe\u1af7\u1a98\u1ab1\u1aba\u1a9b\u1ab4\u1abd\u1af6\u1abf\u1a88\u1ae9\u1a8a\u1aa3\u1ae4\u1a85\u1a8e\u1a8f\u1aa0\u1aa9\u1a82\u1aab\u1a8c\u1a8d\u1a8e\u1aaf\u1ab0\u1a99\u1a9a\u1afb\u1abc\u1abd\u1a9e\u1abf\u1a98\u1af9\u1aba\u1a9b\u1ab4\u1a9d\u1abe\u1ab7\u1a88\u1aa1\u1aea\u1aab\u1aac\u1aa5\u1aee\u1a87\u1a80\u1aa9\u1aaa\u1a8b\u1aec\u1a85\u1aa6\u1a8f\u1a98\u1a91\u1aba\u1af3\u1af4\u1a9d\u1abe\u1a9f\u1ab0\u1a99\u1a92\u1ab3\u1a94\u1abd\u1afe\u1a97\u1a80\u1a89\u1a82\u1a8b\u1a8c\u1aa5\u1a8e\u1a87\u1aa0\u1a89\u1aa2\u1aa3\u1aac\u1a8d\u1aae\u1a8f\u1ab8\u1ab1\u1a9a\u1abb\u1a9c\u1abd\u1ab6\u1abf\u1a98\u1ab1\u1ab2\u1a93\u1afc\u1afd\u1ab6\u1a97\u1a88\u1a81\u1a8a\u1aa3\u1aa4\u1aad\u1aee\u1a8f\u1a88\u1a89\u1a8a\u1aab\u1aec\u1a8d\u1aa6\u1aaf\u1ab0\u1ab9\u1a9a\u1ab3\u1abc\u1abd\u1abe\u1abf\u1af0\u1ab9\u1ab2\u1afb\u1abc\u1a9d\u1afe\u1ab7\u1aa8\u1a81\u1aa2\u1ae3\u1a84\u1aad\u1a8e\u1a8f\u1a80\u1a89\u1aea\u1a83\u1aa4\u1a85\u1aae\u1a87\u1a90\u1ab9\u1aba\u1abb\u1a9c\u1abd\u1a9e\u1a9f\u1ab0\u1a99\u1a9a\u1a9b\u1afc\u1a9d\u1abe\u1a97\u1a88\u1aa1\u1a8a\u1a8b\u1aac\u1aa5\u1a8e\u1a87\u1aa0\u1ae9\u1a8a\u1aab\u1ae4\u1a8d\u1a86\u1aa7\u1ab8\u1a91\u1a9a\u1ab3\u1a9c\u1abd\u1a96\u1abf\u1af0\u1ab1\u1afa\u1a9b\u1a9c\u1ab5\u1abe\u1a97\u1a88\u1aa9\u1a8a\u1a8b\u1a8c\u1aad\u1a8e\u1a8f\u1a88\u1a89\u1aa2\u1a8b\u1aa4\u1aed\u1a8e\u1aa7\u1a90\u1a99\u1afa\u1a9b\u1a94\u1a95\u1a9e\u1a97\u1ab8\u1a99\u1aba\u1a9b\u1a9c\u1ab5\u1a9e\u1a9f\u1a80\u1a81\u1a8a\u1aab\u1ae4\u1aa5\u1a86\u1ae7\u1aa0\u1ae9\u1ae2\u1a83\u1aac\u1aad\u1aae\u1aa7\u1af8\u1ab9\u1ab2\u1a9b\u1abc\u1abd\u1afe\u1abf\u1af8\u1ab9\u1a9a\u1a93\u1a94\u1ab5\u1a9e\u1a9f\u1aa8\u1a81\u1a82\u1aeb\u1aa4\u1a8d\u1aae\u1a8f\u1a80\u1a89\u1aa2\u1aeb\u1a8c\u1a8d\u1a86\u1aa7\u1a90\u1ab1\u1aba\u1a9b\u1a9c\u1a95\u1ab6\u1a97\u1a90\u1ab1\u1aba\u1abb\u1a9c\u1abd\u1ab6\u1a9f\u1aa0\u1aa9\u1ae2\u1a8b\u1ae4\u1ae5\u1aae\u1a87\u1aa8\u1ae9\u1a82\u1a83\u1aac\u1a85\u1a8e\u1aaf\u1ab0\u1ab1\u1a9a\u1a9b\u1a9c\u1af5\u1ab6\u1a9f\u1ab0\u1a91\u1a9a\u1ab3\u1ab4\u1a9d\u1abe\u1aff\u1a88\u1ae9\u1aaa\u1aeb\u1a84\u1ae5\u1aa6\u1aaf\u1aa0\u1aa1\u1aea\u1a83\u1aa4\u1aa5\u1aae\u1a87\u1a90\u1a99\u1ab2\u1a9b\u1afc\u1a95\u1a9e\u1abf\u1ab8\u1af1\u1aba\u1afb\u1a9c\u1abd\u1abe\u1a97\u1a88\u1aa9\u1aaa\u1aab\u1a84\u1aa5\u1ae6\u1aa7\u1ae8\u1a81\u1aa2\u1aa3\u1a8c\u1aa5\u1aae\u1a87\u1ab8\u1a99\u1aba\u1abb\u1ab4\u1a9d\u1ab6\u1ab7\u1ab0\u1a99\u1aba\u1af3\u1a9c\u1abd\u1afe\u1aff\u1ae0\u1a89\u1aa2\u1aeb\u1aac\u1a8d\u1aee\u1aa7\u1ae8\u1a89\u1aaa\u1aab\u1a8c\u1aad\u1a86\u1aa7\u1a90\u1a91\u1a92\u1a93\u1a94\u1a95\u1a9e\u1abf\u1ab8\u1a99\u1aba\u1a93\u1ab4\u1a9d\u1abe\u1aff\u1ae0\u1aa9\u1aa2\u1aa3\u1aec\u1aed\u1a86\u1aaf\u1ae8\u1aa9\u1aea\u1a83\u1aa4\u1aed\u1aee\u1aa7\u1a98\u1ab1\u1a9a\u1afb\u1abc\u1ab5\u1ab6\u1a9f\u1ab0\u1a99\u1afa\u1a93\u1a9c\u1afd\u1af6\u1a9f\u1aa8\u1a89\u1aaa\u1a83\u1aac\u1ae5\u1a8e\u1a87\u1a80\u1aa9\u1ae2\u1a83\u1a84\u1a8d\u1aae\u1a87\u1a90\u1af9\u1a9a\u1afb\u1a9c\u1abd\u1abe\u1a9f\u1af8\u1ab9\u1a9a\u1afb\u1abc\u1afd\u1abe\u1a9f\u1a80\u1aa1\u1a82\u1a83\u1aec\u1aed\u1a8e\u1aa7\u1aa8\u1ae9\u1aaa\u1aab\u1aac\u1a85\u1aee\u1aaf\u1ab8\u1ab1\u1aba\u1a93\u1abc\u1abd\u1abe\u1a9f\u1ab8\u1af1\u1aba\u1ab3\u1afc\u1a9d\u1ab6\u1a9f\u1ae8\u1a89\u1aa2\u1aab\u1a8c\u1aa5\u1a86\u1aa7\u1a88\u1a89\u1aaa\u1a8b\u1aa4\u1aad\u1aae\u1aaf\u1a90\u1af1\u1a9a\u1ab3\u1afc\u1afd\u1af6\u1abf\u1a98\u1ab1\u1aba\u1abb\u1ab4\u1afd\u1abe\u1ab7\u1aa8\u1aa9\u1aa2\u1aab\u1aac\u1a85\u1aae\u1aa7\u1ae0\u1aa9\u1a8a\u1aab\u1ae4\u1a8d\u1aa6\u1aa7\u1ab8\u1a99\u1aba\u1ab3\u1a9c\u1afd\u1afe\u1ab7\u1af0\u1af1\u1afa\u1af3\u1a94\u1abd\u1afe\u1abf\u1a88\u1ae9\u1a8a\u1aab\u1a8c\u1a8d\u1aae\u1aaf\u1aa8\u1aa1\u1aaa\u1aab\u1aa4\u1aad\u1ae6\u1aa7\u1a90\u1a91\u1a9a\u1a93\u1abc\u1a95\u1a96\u1aff\u1ab0\u1ab9\u1af2\u1ab3\u1afc\u1abd\u1ab6\u1abf\u1ae8\u1a81\u1a82\u1a83\u1a8c\u1aa5\u1aa6\u1a87\u1a88\u1aa9\u1a8a\u1a8b\u1aa4\u1ae5\u1a86\u1aa7\u1ab8\u1ab9\u1aba\u1afb\u1abc\u1abd\u1ab6\u1aff\u1a98\u1ab1\u1aba\u1afb\u1abc\u1a9d\u1a96\u1a9f\u1ae0\u1aa1\u1aea\u1a8b\u1a8c\u1a8d\u1aae\u1aaf\u1ae8\u1a89\u1aa2\u1a83\u1a8c\u1aad\u1ae6\u1aaf\u1af8\u1af9\u1aba\u1ab3\u1a9c\u1a95\u1ab6\u1aff\u1af0\u1a99\u1ab2\u1ab3\u1a94\u1a9d\u1a96\u1a97\u1a88\u1aa9\u1aa2\u1aab\u1aa4\u1aad\u1a86\u1aaf\u1ae8\u1aa9\u1aaa\u1aab\u1aac\u1aed\u1a8e\u1aaf\u1a98\u1ab9\u1a9a\u1ab3\u1ab4\u1abd\u1af6\u1a9f\u1a90\u1af9\u1a9a\u1abb\u1afc\u1abd\u1abe\u1abf\u1ae8\u1aa9\u1a82\u1a8b\u1aec\u1ae5\u1ae6\u1a87\u1aa8\u1ae1\u1a8a\u1aa3\u1a8c\u1aad\u1aae\u1aef\u1af0\u1ab9\u1a92\u1a93\u1afc\u1abd\u1afe\u1abf\u1a98\u1a99\u1aba\u1ab3\u1a9c\u1a95\u1ab6\u1ab7\u1ae8\u1aa9\u1aaa\u1aa3\u1a8c\u1aad\u1aee\u1aaf\u1ae8\u1aa9\u1a82\u1aab\u1aac\u1aa5\u1ae6\u1a8f\u1ab0\u1a91\u1a92\u1afb\u1abc\u1afd\u1a96\u1abf\u1a98\u1ab9\u1a9a\u1afb\u1afc\u1abd\u1a96\u1abf\u1aa8\u1aa9\u1aea\u1aa3\u1a8c\u1a8d\u1a86\u1a87\u1aa0\u1ae9\u1aaa\u1aab\u1a84\u1a8d\u1aa6\u1aaf\u1af0\u1a91\u1a9a\u1a9b\u1abc\u1abd\u1abe\u1aff\u1ab8\u1a91\u1a9a\u1abb\u1ab4\u1a9d\u1abe\u1aff\u1aa0\u1aa1\u1a82\u1a83\u1aa4\u1aa5\u1a8e\u1a87\u1aa0\u1ae9\u1aa2\u1aeb\u1aec\u1a8d\u1aae\u1aaf\u1a90\u1ab9\u1a9a\u1a93\u1a9c\u1abd\u1af6\u1a97\u1a90\u1a91\u1af2\u1a9b\u1a94\u1afd\u1abe\u1ab7\u1ae8\u1ae1\u1aa2\u1aeb\u1ae4\u1aed\u1aae\u1a87\u1a88\u1ae9\u1ae2\u1aab\u1a84\u1a8d\u1a8e\u1a87\u1af0\u1ab9\u1ab2\u1a9b\u1a94\u1afd\u1abe\u1aff\u1ab8\u1ab1\u1a92\u1afb\u1abc\u1ab5\u1af6\u1af7\u1aa0\u1aa9\u1a8a\u1aab\u1a84\u1a8d\u1a86\u1a8f\u1a88\u1ae9\u1a8a\u1aa3\u1a8c\u1aad\u1aae\u1a8f\u1ab8\u1ab1\u1a92\u1a93\u1a9c\u1afd\u1abe\u1a9f\u1a90\u1a91\u1ab2\u1a93\u1abc\u1a95\u1a9e\u1aff\u1a80\u1aa9\u1aaa\u1aab\u1aa4\u1aad\u1a8e\u1aa7\u1ae0\u1a89\u1aaa\u1aeb\u1aac\u1ae5\u1aa6\u1a8f\u1a90\u1a99\u1a9a\u1abb\u1abc\u1afd\u1af6\u1a9f\u1ab8\u1a99\u1afa\u1abb\u1ab4\u1a9d\u1abe\u1ab7\u1aa8\u1aa9\u1a82\u1aa3\u1a8c\u1aed\u1aa6\u1aef\u1ae0\u1aa1\u1a82\u1aeb\u1ae4\u1aad\u1aa6\u1aa7\u1ab8\u1a99\u1ab2\u1a93\u1ab4\u1a95\u1a9e\u1a9f\u1a90\u1a99\u1afa\u1a93\u1a9c\u1ab5\u1a96\u1a9f\u1aa8\u1a81\u1aaa\u1aeb\u1aac\u1aad\u1aae\u1aef\u1a88\u1aa9\u1a8a\u1a83\u1a8c\u1a85\u1aae\u1a8f\u1ab0\u1ab9\u1aba\u1ab3\u1afc\u1a95\u1abe\u1a97\u1a98\u1a91\u1aba\u1afb\u1a94\u1af5\u1ab6\u1aff\u1a88\u1aa9\u1aea\u1a83\u1aa4\u1aed\u1aee\u1aef\u1aa8\u1ae9\u1a8a\u1aab\u1a8c\u1aa5\u1a8e\u1a8f\u1af0\u1ab9\u1aba\u1afb\u1abc\u1afd\u1a96\u1a9f\u1a90\u1a99\u1a9a\u1a9b\u1a9c\u1a9d\u1a9e\u1a9f\u1aa0\u1aa9\u1a8a\u1aab\u1aac\u1aad\u1aa6\u1a8f\u1a88\u1aa1\u1a8a\u1a8b\u1aac\u1a8d\u1a8e\u1aaf\u1af8\u1a99\u1ab2\u1abb\u1a94\u1abd\u1ab6\u1a9f\u1ab8\u1ab9\u1aba\u1a9b\u1a94\u1abd\u1ab6\u1a9f\u1aa8\u1a89\u1a8a\u1aeb\u1a84\u1a85\u1aa6\u1aa7\u1a88\u1a89\u1aaa\u1ae3\u1aac\u1aa5\u1aa6\u1aaf\u1ab0\u1a91\u1aba\u1a93\u1afc\u1af5\u1afe\u1ab7\u1af8\u1ab9\u1aba\u1a93\u1abc\u1a95\u1ab6\u1aff\u1ae0\u1aa9\u1aaa\u1aab\u1ae4\u1ae5\u1aae\u1a87\u1aa0\u1a81\u1aa2\u1a8b\u1aec\u1ae5\u1a86\u1aaf\u1ab0\u1af9\u1a9a\u1af3\u1abc\u1a95\u1afe\u1aff\u1af8\u1af1\u1afa\u1a9b\u1afc\u1af5\u1abe\u1a97\u1ae8\u1ae1\u1aaa\u1a8b\u1aec\u1a85\u1a86\u1aaf\u1a88\u1a81\u1aa2\u1aeb\u1ae4\u1aed\u1ae6\u1aef\u1ab8\u1a99\u1a9a\u1ab3\u1af4\u1a95\u1afe\u1ab7\u1ab8\u1a99\u1ab2\u1a93\u1a94\u1a9d\u1a96\u1a97\u1a88\u1aa1\u1aaa\u1aab\u1aec\u1a8d\u1aa6\u1a8f\u1ae8\u1a81\u1a82\u1aa3\u1a8c\u1aad\u1a86\u1a8f\u1ab0\u1af9\u1afa\u1a9b\u1afc\u1abd\u1af6\u1abf\u1a98\u1ab1\u1afa\u1ab3\u1ab4\u1ab5\u1a96\u1ab7\u1aa8\u1aa1\u1aa2\u1aeb\u1aa4\u1a8d\u1a8e\u1aa7\u1aa8\u1aa1\u1aaa\u1aab\u1a8c\u1aed\u1aae\u1aaf\u1ab8\u1a99\u1aba\u1ab3\u1af4\u1abd\u1afe\u1af7\u1ab0\u1af1\u1a9a\u1ab3\u1abc\u1af5\u1a96\u1a97\u1a88\u1a81\u1a8a\u1a83\u1a8c\u1a8d\u1aa6\u1a8f\u1aa8\u1aa9\u1aaa\u1aab\u1aa4\u1aad\u1ae6\u1aa7\u1af8\u1ab1\u1aba\u1a9b\u1a9c\u1a9d\u1abe\u1ab7\u1a98\u1a99\u1aba\u1abb\u1a9c\u1af5\u1afe\u1abf\u1aa8\u1a81\u1aea\u1aa3\u1a8c\u1a85\u1a8e\u1a8f\u1aa0\u1aa1\u1ae2\u1a83\u1aec\u1a85\u1a8e\u1aaf\u1a90\u1ab1\u1a9a\u1abb\u1ab4\u1af5\u1a9e\u1ab7\u1a90\u1a99\u1aba\u1a93\u1afc\u1afd\u1a96\u1aff\u1a88\u1a81\u1ae2\u1aab\u1aac\u1a8d\u1aa6\u1aa7\u1a88\u1aa1\u1ae2\u1a8b\u1aa4\u1a85\u1a8e\u1a8f\u1a90\u1ab9\u1afa\u1afb\u1abc\u1abd\u1a9e\u1a97\u1ab8\u1ab9\u1a9a\u1abb\u1a94\u1a95\u1afe\u1a97\u1ae0\u1ae9\u1aaa\u1aab\u1aac\u1aad\u1aae\u1aef\u1ae0\u1aa9\u1a8a\u1a83\u1aa4\u1aa5\u1aee\u1ae7\u1a98\u1ab1\u1aba\u1abb\u1af4\u1abd\u1a96\u1a97\u1a98\u1ab1\u1af2\u1af3\u1af4\u1a95\u1af6\u1ab7\u1a80\u1ae9\u1ae2\u1aa3\u1ae4\u1ae5\u1aae\u1a87\u1aa8\u1ae1\u1a82\u1ae3\u1aac\u1a8d\u1aa6\u1a8f\u1a90\u1ab9\u1a9a\u1a93\u1abc\u1ab5\u1abe\u1abf\u1a90\u1ab1\u1aba\u1af3\u1ab4\u1a95\u1afe\u1aff\u1ae0\u1aa1\u1a82\u1aab\u1aac\u1a85\u1aae\u1aa7\u1aa8\u1ae1\u1aa2\u1aab\u1aac\u1aed\u1aee\u1a87\u1ab0\u1ab9\u1a9a\u1ab3\u1ab4\u1abd\u1abe\u1a97\u1a90\u1a91\u1aba\u1abb\u1afc\u1a95\u1af6\u1ab7\u1aa8\u1a89\u1aa2\u1a83\u1aec\u1a85\u1aee\u1aef\u1aa0\u1ae9\u1ae2\u1aab\u1aac\u1aa5\u1a86\u1aef\u1a90\u1af9\u1aba\u1abb\u1abc\u1ab5\u1abe\u1a9f\u1ab0\u1ab1\u1aba\u1a93\u1a94\u1afd\u1a96\u1a9f\u1ae8\u1a89\u1aaa\u1aeb\u1aac\u1a8d\u1a86\u1aa7\u1aa8\u1aa1\u1aa2\u1aeb\u1aa4\u1aa5\u1aa6\u1aaf\u1af8\u1af9\u1afa\u1af3\u1abc\u1afd\u1a96\u1ab7\u1ab0\u1a99\u1aba\u1ab3\u1abc\u1a95\u1ab6\u1abf\u1aa8\u1a89\u1aaa\u1a8b\u1a8c\u1aad\u1aae\u1a8f\u1a80\u1aa1\u1a8a\u1aab\u1aa4\u1aa5\u1a86\u1aef\u1a90\u1ab9\u1aba\u1abb\u1ab4\u1abd\u1a96\u1a97\u1a98\u1a99\u1a9a\u1a9b\u1a94\u1a9d\u1ab6\u1ab7\u1ae0\u1aa9\u1aea\u1aab\u1a84\u1a8d\u1aee\u1aaf\u1aa8\u1aa9\u1aa2\u1aa3\u1a84\u1a8d\u1a86\u1a8f\u1a98\u1ab9\u1a92\u1ab3\u1a9c\u1abd\u1a9e\u1aff\u1af0\u1a99\u1a9a\u1afb\u1abc\u1abd\u1afe\u1ab7\u1aa8\u1a81\u1aaa\u1aa3\u1aa4\u1a85\u1a8e\u1a87\u1a88\u1ae1\u1a82\u1ae3\u1aa4\u1a85\u1aa6\u1a87\u1a90\u1af1\u1a9a\u1abb\u1a9c\u1a95\u1a9e\u1abf\u1ab0\u1ab9\u1ab2\u1ab3\u1a94\u1afd\u1ab6\u1ab7\u1a88\u1aa1\u1aa2\u1aa3\u1a8c\u1a8d\u1a86\u1a8f\u1a88\u1a81\u1aaa\u1a8b\u1ae4\u1aad\u1a8e\u1a8f\u1a98\u1af1\u1afa\u1abb\u1a94\u1a9d\u1a96\u1abf\u1a98\u1ab9\u1a92\u1abb\u1abc\u1a9d\u1a96\u1aff\u1a80\u1ae9\u1aaa\u1a8b\u1a8c\u1aad\u1ae6\u1aa7\u1aa8\u1a81\u1aa2\u1aeb\u1ae4\u1ae5\u1ae6\u1aa7\u1ab8\u1af1\u1ab2\u1afb\u1ab4\u1abd\u1afe\u1af7\u1ab8\u1a91\u1a92\u1a93\u1abc\u1a95\u1ab6\u1aff\u1ae0\u1ae9\u1aaa\u1a8b\u1aac\u1a8d\u1a8e\u1aef\u1a88\u1aa1\u1aea\u1ae3\u1a8c\u1a85\u1ae6\u1a87\u1af0\u1a99\u1a92\u1a93\u1af4\u1ab5\u1a96\u1a97\u1a98\u1a99\u1a9a\u1a9b\u1a9c\u1a9d\u1ab6\u1a9f\u1a88\u1aa1\u1a8a\u1aab\u1a8c\u1aa5\u1a8e\u1a8f");
        Field_24092 = null;
        Field_24070 = Class_24069.Method_24099("\u12d0\u12c0\u12d1\u12c9\u12cc\u12cd\u12c4\u12dc\u12d9\u12c0\u12c0\u12c9\u12cc\u12cd\u12d4\u12c4\u12c0\u12c8\u1298\u12c0\u12c4\u12c4\u12d5\u12d4\u12d8\u12d0\u12c9\u12c0\u12dd\u12dd\u12c4\u12c4\u12b8\u12e1\u12e8\u12e8\u12f5\u12fc\u12ed\u12f4\u12e1\u12e8\u12e1\u12e8\u12f4\u12e5\u12e4\u12fc\u12e0\u12f1\u12b8\u12f0\u12e4\u12f5\u12ed\u12ec\u12e1\u12e8\u12f0\u12e8\u12ec\u12ec\u12ec\u12e4\u1280\u12d8\u1281\u1289\u128c\u1294\u1284\u1295\u1290\u1299\u1280\u1299\u12d4\u128d\u1284\u129c\u1281\u1289\u1280\u1298\u1295\u128d\u1284\u128d\u1299\u1290\u1299\u1280\u129c\u128c\u1294\u129d\u12a8\u12b1\u12f8\u12b1\u12a4\u12a5\u12b4\u12b5\u12a0\u12a1\u12a8\u12b0\u12ad\u12bc\u12bc\u12bd\u12b8\u12a9\u12a8\u12a9\u12a4\u12fc\u12a4\u12ad\u12a8\u12b8\u12b8\u12b0\u12bd\u12ac\u12a5\u12ac\u1258\u1251\u1248\u1251\u125c\u125c\u1244\u124d\u1241\u1240\u1258\u1210\u124d\u124c\u125d\u1245\u1218\u1241\u1249\u1248\u1254\u1244\u1255\u125c\u1259\u1258\u1241\u1240\u125d\u1254\u125c\u1245\u1268\u1271\u1260\u1238\u126c\u1274\u1274\u126d\u1279\u1260\u1260\u1260\u1274\u127d\u126c\u126d\u1238\u1260\u1269\u1260\u126d\u1264\u126d\u1275\u1260\u1261\u1268\u1270\u127d\u126c\u126d\u1265\u1200\u1218\u1210\u1208\u1205\u1204\u125c\u1204\u1201\u1208\u1218\u1218\u1214\u121d\u120c\u120d\u1258\u1200\u1209\u1200\u1214\u1214\u121c\u1215\u1208\u1201\u1208\u1210\u121d\u1204\u121d\u1254\u1221\u1229\u1228\u1230\u1224\u1235\u123c\u122c\u1231\u1228\u1230\u1228\u1234\u122d\u122c\u1224\u1230\u1238\u1278\u1231\u1224\u1225\u1234\u1235\u1220\u1221\u1228\u1230\u122d\u123c\u123c\u123d\u13d8\u13c0\u13d1\u13c8\u13d4\u13d4\u13dc\u13cc\u13d9\u13c8\u13d9\u13c1\u13cc\u13d4\u1394\u13cd\u13c0\u13c1\u13d8\u13c1\u13c4\u13c4\u13d5\u13dc\u13d8\u13c0\u13c9\u13c8\u1394\u13cc\u13c5\u13cc\u13f0\u13f0\u13f8\u13f1\u13e4\u13ed\u13e4\u13fc\u13f9\u13e0\u13f9\u13f0\u13fd\u13ec\u13ed\u13b4\u13e0\u13e9\u13e0\u13f0\u13f4\u13fc\u13e5\u13ed\u13e8\u13e8\u13e0\u13b0\u13ec\u13e5\u13ec\u13fc\u1390\u1398\u1391\u1380\u138d\u1384\u139c\u1395\u1380\u1399\u1390\u1398\u1385\u1384\u139d\u138c\u13d8\u1389\u1380\u1380\u1395\u1384\u1394\u139c\u1380\u1388\u1380\u13d0\u139d\u138c\u1384\u1385\u13b8\u13a0\u13a0\u13b1\u13ac\u13b5\u13a4\u13b5\u13a0\u13b9\u13b0\u13b9\u13a4\u13bc\u13ac\u13bd\u13a0\u13a1\u13f8\u13a1\u13ac\u13b4\u13a5\u13ad\u13a8\u13b0\u13b9\u13a1\u13ac\u13a5\u13bd\u13b4\u1341\u1340\u1351\u1349\u135c\u1355\u134c\u1355\u1310\u1348\u1341\u1348\u135c\u135c\u1314\u135c\u1340\u1351\u1349\u1348\u134d\u1344\u135c\u134d\u1358\u1341\u1348\u1341\u134c\u1314\u134c\u1345\u1360\u1370\u1370\u1378\u1375\u136c\u136d\u136c\u1330\u1360\u1368\u1368\u1334\u1364\u1364\u136d\u1378\u1370\u1371\u1360\u1374\u136d\u1364\u1375\u1330\u1378\u1368\u1379\u1365\u1364\u1365\u136c\u1318\u1301\u1308\u1311\u1304\u130d\u135c\u1315\u1308\u1308\u1309\u1318\u1354\u130c\u1305\u130c\u1310\u1310\u1318\u1311\u1304\u130d\u1304\u131c\u1319\u1300\u1319\u1310\u130d\u1305\u131c\u130c\u1378\u1331\u1320\u1328\u132d\u133c\u1324\u1324\u1339\u1320\u1339\u1328\u133d\u1324\u133d\u1374\u1328\u1320\u1329\u1328\u132d\u133c\u1334\u1335\u1328\u1320\u1330\u1328\u1324\u1325\u1325\u132c\u12c0\u12d1\u12c0\u12c1\u129c\u12c4\u12cd\u12c5\u12c9\u12d9\u12c8\u12c0\u12cc\u12d4\u12cc\u12d4\u12c0\u1298\u12c0\u12c9\u12c4\u12d4\u12d4\u12dc\u12c0\u12d9\u12c8\u12c1\u12cc\u12cc\u1294\u12cc\u12e9\u12e0\u12f0\u12f0\u12fc\u12ed\u12ec\u12ec\u12e8\u12b0\u12f9\u12e8\u12e4\u12e5\u12f4\u12ed\u12e0\u12f1\u12e0\u12e0\u12f5\u12ec\u12f5\u12bc\u12e1\u12e8\u12e8\u12f9\u12ec\u12fc\u12f4\u12ec\u1280\u1280\u1280\u1288\u1284\u12dc\u1284\u1284\u1299\u1299\u1280\u1299\u129c\u1294\u129c\u129d\u1280\u1280\u1280\u1298\u12d4\u12dc\u1284\u1284\u1299\u1299\u1280\u1299\u129c\u1294\u129c\u129d\u12a0\u12a0\u12a0\u12b8\u12f5\u12fc\u12a4\u12a4\u12b9\u12b9\u12a0\u12b9\u12bc\u12b4\u12bc\u12bd\u12a0\u12a0\u12a0\u12b8\u12f4\u12fc\u12a4\u12a4\u12b9\u12b9\u12a0\u12b9\u12bc\u12b4\u12bc\u12bd\u1240\u1240\u1240\u1258\u1215\u121c\u1255\u1255\u1248\u1259\u1249\u1240\u1244\u125d\u1214\u124d\u1248\u1250\u1241\u1249\u1244\u125c\u1255\u124d\u1248\u1241\u1259\u1250\u125c\u1254\u125d\u1244\u1269\u1260\u1260\u1278\u1275\u126c\u1275\u123c\u1268\u1268\u1278\u1261\u126d\u127d\u1264\u1265\u1278\u1261\u1268\u1271\u1275\u126c\u126c\u123c\u1269\u1261\u1260\u1278\u126c\u127d\u1274\u126d\u1200\u1209\u1201\u1200\u120d\u120c\u120c\u120d\u1250\u1219\u1208\u1209\u121c\u121d\u1204\u1205\u1200\u1218\u1211\u1208\u1215\u1204\u120d\u121c\u1200\u1201\u1250\u1209\u1205\u1204\u121c\u120c\u1231\u1238\u1231\u1230\u122d\u122c\u1235\u123c\u1239\u1220\u1221\u1220\u1274\u122d\u1224\u123c\u1221\u1229\u1220\u1238\u1235\u122d\u1224\u122d\u1239\u1230\u1238\u1238\u1225\u122d\u1225\u1224\u13d0\u13c0\u13d1\u13d8\u13c5\u13c4\u13c4\u13cc\u1390\u13d9\u13c8\u13c9\u13dc\u13dd\u13c4\u13c5\u13c0\u13d8\u13c1\u13d0\u13d4\u13d5\u13dc\u13c4\u13d9\u13c0\u13d8\u13d8\u1394\u13cc\u13cc\u13c4\u13e0\u13f8\u13f0\u13e8\u13e5\u13e4\u13bc\u13e5\u13f9\u13e8\u13f8\u13e0\u13e5\u13ec\u13f4\u13fc\u13f1\u13e0\u13e9\u13e1\u13bc\u13e5\u13ed\u13ec\u13f8\u13e8\u13f9\u13f0\u13e5\u13e4\u13fc\u13fc\u1391\u1388\u1389\u1388\u1384\u13dc\u138d\u1384\u1399\u1388\u1399\u13d0\u138c\u1385\u138c\u139c\u1390\u1398\u1398\u1380\u138d\u138d\u138c\u1394\u13d0\u1388\u1388\u1388\u139d\u139c\u139c\u1394\u13b0\u13a8\u13a1\u13a0\u13fc\u13ac\u13b5\u13ac\u13a1\u13b0\u13b9\u13b9\u13ac\u13bd\u13ad\u13a4\u13a8\u13b1\u13f8\u13a0\u13a4\u13a4\u13b5\u13b4\u13b8\u13b0\u13b9\u13a0\u13bd\u13f4\u13bd\u13bc\u1348\u1351\u1348\u1348\u134d\u135c\u1354\u1355\u1348\u1340\u1350\u1349\u1344\u135c\u134c\u1344\u1349\u1349\u1340\u1340\u1355\u1344\u1345\u131c\u1348\u1341\u1348\u1358\u135c\u1354\u135c\u1344\u1369\u1371\u1360\u1371\u133c\u136c\u1375\u136c\u1361\u1370\u1369\u1368\u137d\u137c\u1334\u136c\u1369\u1360\u1370\u1370\u137c\u1365\u136d\u1374\u1368\u1330\u1368\u1361\u136c\u137c\u137c\u1374\u1311\u1310\u1311\u1311\u130d\u1304\u135c\u1305\u1300\u1300\u1319\u1310\u130c\u130c\u130c\u130c\u1308\u1300\u1318\u1310\u1315\u1315\u1304\u1315\u1350\u1309\u1300\u1318\u130d\u1305\u130c\u1314\u1331\u1329\u1320\u1329\u1335\u133c\u1325\u1324\u1339\u1321\u1330\u1329\u1324\u133d\u133d\u1324\u1328\u1378\u1331\u1330\u132c\u1335\u132c\u132c\u1321\u1330\u1338\u1339\u132c\u1324\u1334\u132c\u12c8\u12c9\u12c9\u12c0\u12c4\u12d5\u12c4\u12c5\u1290\u12d9\u12d9\u12c0\u12dd\u12d4\u12dc\u12c4\u12d1\u12c0\u12d8\u12d0\u12cc\u12d4\u12d5\u12c4\u12c8\u1290\u12c9\u12c8\u12dc\u12dd\u12dd\u12c4\u12f8\u12f8\u12f0\u12f1\u12e4\u12e4\u12e4\u12fc\u12b8\u12b0\u12e9\u12e8\u12fc\u12fd\u12fd\u12e4\u12f8\u12f8\u12f0\u12f1\u12e4\u12e4\u12e4\u12fc\u12b9\u12b0\u12f9\u12e8\u12e4\u12e5\u12f4\u12ec\u1288\u1289\u1281\u1280\u128d\u12dc\u1285\u1284\u1298\u1299\u1299\u1280\u1294\u1294\u129c\u129d\u1280\u1280\u1280\u1298\u12d4\u12dc\u1285\u1284\u1298\u1299\u1299\u1280\u1294\u1294\u129c\u129d\u12a0\u12a0\u12a0\u12b8\u12f5\u12fc\u12a5\u12a4\u12b8\u12b9\u12b9\u12a0\u12b4\u12b4\u12bc\u12bd\u12a0\u12a0\u12a0\u12b8\u12fc\u12fc\u12a5\u12a4\u12b8\u12b9\u12b9\u12a0\u12b4\u12b4\u12bc\u12bd\u1240\u1240\u1240\u1258\u121d\u121c\u1245\u1244\u1258\u1259\u1259\u1240\u1254\u1254\u125c\u125d\u1240\u1240\u1240\u1258\u1214\u121c\u1245\u1244\u1258\u1259\u1259\u1240\u1254\u1254\u125c\u125d\u1260\u1260\u1260\u1278\u1235\u123c\u1265\u1264\u1278\u1279\u1279\u1260\u1274\u1274\u127c\u127d\u1260\u1260\u1260\u1278\u1234\u123c\u1265\u1264\u1278\u1279\u1279\u1260\u1274\u1274\u127c\u127d\u1200\u1200\u1200\u1218\u1255\u125c\u1215\u120c\u1219\u1208\u1219\u1200\u120c\u121c\u1214\u121c\u1211\u1200\u1200\u1200\u121c\u1254\u125c\u1215\u1200\u1219\u1208\u1219\u1204\u120c\u121c\u1214\u1230\u1231\u1220\u1220\u1224\u123c\u1274\u127c\u1239\u1220\u1239\u1228\u123d\u1224\u122c\u123c\u1238\u1230\u1231\u1220\u1224\u1224\u123c\u1275\u1270\u1239\u1220\u1239\u122c\u123d\u1224\u122c\u13d0\u13d8\u13d0\u13d1\u13c4\u13c4\u13c4\u13dc\u1399\u1390\u13d8\u13c8\u13dd\u13c5\u13c4\u13c5\u13c0\u13d8\u13c8\u13c0\u13cc\u139c\u13d4\u13c4\u13c9\u1390\u13d9\u13c8\u13c4\u13c5\u13d4\u13c5\u13e8\u13f1\u13e8\u13e0\u13ed\u13bc\u13e4\u13ed\u13e8\u13f8\u13f8\u13f0\u13fd\u13ec\u13e5\u13ec\u13f8\u13f1\u13e8\u13f1\u13fc\u13f5\u13ec\u13ed\u13e0\u13b0\u13e8\u13e0\u13ec\u13e4\u13ec\u13f4\u1390\u1391\u1380\u1380\u1384\u139c\u13d5\u13dc\u1388\u1380\u1388\u1380\u138c\u1394\u139c\u139d\u1380\u1380\u1380\u1398\u13d5\u13dc\u1384\u138c\u1388\u1380\u1388\u1390\u139c\u139d\u138c\u138c\u13a0\u13b8\u13f0\u13f8\u13a5\u13ac\u13ac\u13b5\u13b0\u13a0\u13b9\u13a0\u13a5\u13b4\u13bc\u13bd\u13b1\u13a0\u13b1\u13f8\u13a4\u13ad\u13a4\u13b4\u13b8\u13b0\u13b9\u13a8\u13a5\u13ac\u13b4\u13bd\u1348\u1351\u1358\u1349\u134c\u1344\u134d\u1355\u1350\u1349\u1341\u1358\u134c\u1314\u135d\u134c\u1341\u1350\u1351\u1348\u134d\u1344\u135c\u1345\u1358\u1358\u1359\u1350\u1345\u1344\u1345\u134c\u1378\u1368\u1371\u1360\u1375\u136d\u1364\u137c\u1330\u1369\u1360\u1378\u136d\u1365\u136c\u1374\u1371\u1369\u1360\u1369\u1375\u137c\u1375\u1364\u1368\u1360\u1361\u1360\u136c\u1374\u137d\u1364\u1311\u1358\u1311\u1300\u1305\u1314\u1315\u130c\u1301\u1308\u1310\u1319\u1304\u131d\u130c\u1305\u1318\u1308\u1301\u1301\u135c\u1304\u130d\u1304\u1318\u1318\u1310\u1308\u131d\u130c\u130c\u1305\u1378\u1321\u1320\u1321\u133c\u132d\u1324\u1324\u1329\u1330\u1328\u1321\u132d\u1374\u132d\u1325\u1328\u1330\u1320\u1331\u133c\u1335\u1334\u132d\u1320\u1339\u1330\u1320\u133d\u132c\u1325\u132c\u12c0\u1298\u12c1\u12c8\u12d4\u12c5\u12cd\u12c4\u12d0\u12d9\u12c1\u12c8\u12c5\u12dd\u12d4\u12dc\u12d0\u12c9\u12c1\u12c9\u12cc\u12d4\u12c4\u12d5\u12d0\u12d9\u12c0\u12d9\u1294\u12dd\u12cc\u12c4\u12e9\u12f8\u12e1\u12e0\u12f5\u12e4\u12e4\u12f5\u12e0\u12f9\u12f0\u12f9\u12e4\u12fc\u12ec\u12fd\u12e0\u12e1\u12b8\u12e0\u12e4\u12ec\u12e4\u12fc\u12f9\u12e0\u12f9\u12b0\u12ed\u12e5\u12e4\u12fc\u1280\u1291\u1298\u1281\u128d\u1294\u1284\u129c\u1280\u1299\u1288\u1281\u1284\u128d\u12d4\u128c\u1289\u1280\u1290\u1290\u129c\u1295\u1284\u128d\u1288\u1290\u1299\u1280\u129d\u1294\u129d\u129c\u12b1\u12b1\u12a9\u12a0\u12fc\u12ac\u12b4\u12b4\u12a1\u12b9\u12a0\u12a0\u12a4\u12b4\u12ad\u12bd\u12a8\u12b0\u12a9\u12f8\u12a5\u12ac\u12ac\u12b5\u12b0\u12b8\u12a0\u12a0\u12ad\u12b4\u12bc\u12bd\u1251\u1240\u1251\u1218\u1254\u1244\u1255\u124d\u1240\u1241\u1248\u1250\u125c\u125d\u125d\u125c\u1240\u1240\u1218\u1251\u1244\u124d\u124d\u1244\u1259\u1248\u1258\u1258\u1214\u124c\u1245\u124c\u1270\u1270\u1278\u1270\u126d\u126c\u1275\u1264\u1230\u1268\u1268\u1260\u126c\u1274\u126d\u1264\u1271\u1271\u1268\u1268\u123c\u1265\u126c\u1274\u1269\u1261\u1268\u1270\u127d\u1265\u126c\u1265\u1211\u1218\u1200\u1211\u1204\u1214\u1214\u121c\u1209\u1200\u1219\u1219\u1204\u1204\u1254\u121c\u1200\u1211\u1200\u1211\u121c\u1205\u120d\u120c\u1218\u1250\u1201\u1208\u121d\u1205\u120c\u121d\u1238\u1230\u1220\u1231\u1235\u123c\u1234\u1235\u1228\u1228\u1228\u1230\u127c\u1274\u1225\u122c\u1231\u1229\u1220\u1231\u123c\u1234\u1224\u1235\u1239\u1230\u1238\u1239\u122c\u122c\u122c\u1234\u1391\u1398\u13c0\u13c9\u13c4\u13d4\u13d4\u13dc\u13d9\u13c8\u13c1\u13c8\u13d4\u13dd\u13c4\u13dd\u13d8\u13c1\u13d1\u13c8\u13d4\u13cd\u139c\u13c4\u13c1\u13c8\u13d8\u13d8\u13d4\u13dd\u13cc\u13c5\u13e0\u13f8\u13f1\u13e8\u13f5\u13fc\u13ec\u13e4\u13e8\u13e8\u13e1\u13f9\u13ec\u13b4\u13e5\u13ec\u13f1\u13e9\u13e0\u13f1\u13fc\u13f4\u13e4\u13f5\u13f9\u13f0\u13f8\u13f9\u13ec\u13ec\u13ec\u13f4\u13d1\u13d8\u1380\u1380\u1394\u138d\u1385\u1395\u1380\u1381\u1390\u1398\u1384\u138d\u138c\u13d4\u1380\u1389\u1380\u1390\u1394\u139c\u138d\u138c\u1388\u1381\u1399\u1390\u138d\u1385\u139c\u138c\u13f8\u13b0\u13a9\u13a8\u13ac\u13a4\u13fc\u13a4\u13a1\u13a8\u13b8\u13b8\u13b4\u13bd\u13ac\u13a5\u13a0\u13b8\u13b1\u13a8\u13b5\u13bc\u13ac\u13b5\u13a8\u13a1\u13a8\u13a8\u13f4\u13ac\u13a5\u13ac\u1350\u1350\u1358\u1351\u1344\u134d\u1344\u135c\u1359\u1340\u1359\u1350\u134c\u135d\u134c\u1354\u1318\u1340\u1349\u1340\u1354\u1354\u135c\u1344\u1350\u1348\u1341\u1310\u135d\u1344\u135d\u134c\u1369\u1378\u1368\u1369\u133c\u136c\u1364\u136d\u1360\u1361\u1370\u1378\u137d\u136c\u1364\u1374\u1361\u1368\u1370\u1360\u136c\u136d\u136d\u1364\u1368\u1379\u1368\u1369\u1334\u136c\u136c\u1364\u1300\u1318\u1308\u1309\u130d\u1304\u1315\u135c\u1301\u1308\u1308\u1319\u130c\u131c\u1314\u130d\u1308\u1300\u1318\u1308\u1304\u130c\u135c\u1305\u1300\u1319\u1308\u1310\u1305\u130c\u1314\u130c\u1331\u1338\u1370\u1378\u1325\u132c\u1335\u1324\u1330\u1321\u1328\u1330\u132c\u133d\u1334\u137d\u1378\u1321\u1328\u1330\u1325\u132d\u1324\u133c\u1339\u1321\u1328\u1321\u133d\u1334\u133d\u132c\u12c0\u12c8\u12c9\u12c8\u12c4\u12dc\u12c5\u12cc\u12d9\u12d9\u12c0\u12c0\u1294\u12cd\u12c4\u12dc\u12c1\u12c9\u12c0\u12d8\u12d5\u12cd\u12c4\u12cd\u12d9\u12d0\u12d8\u12d8\u12c5\u12cd\u12c5\u12c4\u12f0\u12e0\u12f1\u12f8\u12e5\u12ec\u12f5\u12f5\u12e0\u12e0\u12b0\u12f8\u12e5\u12ec\u12ec\u12fd\u12f8\u12f0\u12f1\u12e0\u12e4\u12e4\u12fc\u12b4\u12b0\u12f8\u12e1\u12e8\u12ec\u12fd\u12f4\u12fc\u1291\u1280\u1280\u1280\u129c\u12d5\u12dc\u1294\u1281\u1288\u1288\u1299\u1294\u129c\u129d\u128c\u1280\u1280\u1298\u12d0\u12dc\u1285\u128c\u128c\u1299\u1290\u1281\u1298\u1285\u128c\u1285\u128c\u12b8\u12b0\u12b1\u12b1\u12a4\u12b5\u12fc\u12a5\u12a0\u12a0\u12b9\u12b0\u12ac\u12ac\u12ac\u12ac\u12a8\u12a0\u12b8\u12a9\u12ac\u12b4\u12a4\u12b5\u12f0\u12a9\u12a0\u12b8\u12ad\u12a5\u12ac\u12b4\u1251\u1249\u1240\u1249\u1255\u125c\u1254\u125c\u1259\u1240\u1241\u1248\u124c\u1254\u124d\u1244\u1251\u1251\u1248\u1248\u121c\u1244\u124d\u1244\u1258\u1258\u1250\u1259\u124c\u1245\u124c\u1254\u1271\u1268\u1271\u1278\u1274\u126c\u126d\u1275\u1268\u1279\u1230\u1268\u1265\u126c\u127c\u127c\u1278\u1271\u1260\u1269\u1264\u127c\u1275\u126c\u1279\u1270\u1268\u1279\u126c\u126c\u1265\u1234\u1200\u1209\u1200\u1210\u1214\u121c\u1215\u1204\u1201\u1208\u1210\u1219\u1204\u121d\u1214\u1205\u1208\u1208\u1200\u1258\u1214\u120d\u1204\u1204\u1219\u1210\u1218\u1219\u120c\u120c\u120c\u1214\u1271\u1278\u1230\u1229\u1224\u1224\u1235\u123c\u1238\u1239\u1228\u1228\u122c\u1234\u127c\u1274\u1221\u1229\u1228\u1230\u1224\u1235\u123c\u1235\u1220\u1238\u1228\u1270\u123c\u1225\u122c\u122c\u13d1\u13d8\u13d0\u13d1\u13c4\u13c4\u13c4\u13dc\u1399\u1390\u13c1\u13c0\u13dd\u13dd\u13cc\u13dd\u13d8\u13d1\u13c8\u13d1\u139c\u13d4\u13cd\u13c4\u13c8\u13d9\u13d0\u13d8\u13dd\u13cc\u13cc\u13cc\u13f8\u13b0\u13b8\u13f0\u13ed\u13e4\u13e4\u13f5\u13f0\u13f8\u13f9\u13e8\u13ec\u13ec\u13f4\u13bd\u13b8\u13e0\u13e9\u13e1\u13e5\u13f5\u13e4\u13ec\u13e8\u13f0\u13f8\u13e0\u13ed\u13ec\u13b4\u13fd\u1391\u1388\u1391\u1398\u1394\u138c\u1395\u1384\u13d0\u1398\u1388\u1399\u138c\u139d\u1385\u1384\u1389\u1398\u13d8\u1380\u138d\u1384\u1394\u1394\u1390\u1389\u1399\u1380\u139c\u1385\u13d4\u138c\u13a9\u13a0\u13b0\u13b0\u13bc\u13ac\u13a4\u13a4\u13a8\u13a1\u13b9\u13a8\u13f4\u13ad\u13ac\u13ac\u13a1\u13a1\u13b0\u13b0\u13ad\u13fc\u13ad\u13a4\u13a8\u13b9\u13a8\u13b8\u13b4\u13ad\u13a4\u13bd\u1340\u1349\u1318\u1341\u134c\u1354\u1345\u134d\u1348\u1350\u1359\u1341\u134c\u1345\u135d\u1354\u1350\u1350\u1349\u1341\u134d\u134c\u1354\u1344\u1359\u1350\u1349\u1359\u1344\u1345\u135d\u1314\u1361\u1360\u1361\u1378\u1365\u1364\u1364\u1375\u1370\u1368\u1361\u1369\u1334\u137d\u1364\u137d\u1371\u1360\u1369\u1338\u1364\u136d\u1364\u1374\u1378\u1370\u1379\u1368\u1365\u136c\u1374\u137d\u1308\u1311\u1318\u1300\u131c\u1304\u130d\u135c\u1308\u1301\u1308\u1318\u131c\u1314\u130c\u131d\u1300\u1318\u1358\u1309\u1304\u1305\u1305\u1304\u1319\u1350\u1319\u1308\u1304\u1305\u1314\u130c\u1328\u1329\u1321\u1320\u132d\u133c\u1335\u132c\u1338\u1328\u1339\u1328\u132d\u1374\u133c\u132c\u1331\u1320\u1331\u1338\u1334\u1335\u132c\u132d\u1321\u1370\u1329\u1321\u1324\u133c\u132c\u133d\u12d8\u12c0\u12c9\u12c9\u12cc\u12d4\u12cc\u129c\u12d9\u12c8\u12c0\u12c1\u12d4\u12c5\u12c4\u12dd\u12c8\u12c0\u12c9\u12d8\u12d5\u12d4\u12d5\u12cd\u12c8\u12c9\u1290\u12c9\u12c4\u12dc\u12cd\u12c5\u12e0\u12f8\u12f1\u12e9\u12e4\u12ed\u12f5\u12fc\u12e8\u12f9\u12e8\u12f8\u12fc\u12f4\u12fd\u12e4\u12f1\u12b8\u12f1\u12e8\u12ed\u12e4\u12bc\u12e5\u12e0\u12f8\u12e9\u12e1\u12ec\u12f4\u12fd\u12e5\u1280\u1289\u1291\u1298\u1295\u128c\u1294\u1284\u1290\u1289\u1280\u1299\u129d\u1284\u1284\u12d4\u1289\u1280\u1280\u1291\u1284\u1294\u129c\u128d\u1298\u1281\u1288\u1281\u128c\u12d4\u128c\u1285\u12b1\u12a8\u12a9\u12b8\u12b5\u12ac\u12b5\u12bc\u12a9\u12a8\u12a0\u12a8\u12ac\u12ac\u12ad\u12b4\u12f1\u12f8\u12a0\u12a9\u12b5\u12ac\u12ad\u12bc\u12b9\u12a0\u12b9\u12b0\u12ad\u12ac\u12a4\u12ac\u1240\u1240\u1241\u1258\u1214\u121c\u1244\u124d\u1259\u1240\u1241\u1250\u125d\u1244\u125d\u1254\u1241\u1240\u1248\u1240\u1244\u1244\u1245\u125c\u1219\u1210\u1249\u1248\u124d\u1254\u1245\u124c\u1260\u1261\u1278\u1270\u126c\u1265\u1264\u123c\u1269\u1261\u1260\u1278\u126c\u127d\u1274\u127d\u1270\u1269\u1268\u1271\u127c\u1275\u1264\u1265\u1230\u1268\u1279\u1268\u127c\u127c\u1274\u127c\u1208\u1201\u1200\u1218\u120c\u1215\u1204\u1215\u1201\u1208\u1210\u1250\u1205\u120c\u120c\u121d\u1200\u1210\u1218\u1210\u1215\u1215\u1214\u1204\u1208\u1250\u1208\u1208\u121c\u1205\u120d\u121d\u1228\u1229\u1238\u1231\u122c\u1235\u127c\u1224\u1221\u1228\u1238\u1238\u1234\u123d\u122c\u1225\u1220\u1238\u1231\u1228\u1235\u123c\u1225\u122d\u1228\u1228\u1220");
        Field_24082 = Class_24069.Method_24102("\u8110\u8104\u8116\u8112\u8114\u8114\u8106\u8116\u8110\u8110\u8106\u8116\u8110\u8114\u8106\u8102\u8104\u8104\u8106\u8102\u8104\u8110\u8102\u8106\u8104\u8104\u8102\u8102\u8110\u8104\u8102\u8116\u8134\u8120\u8126\u8122\u8130\u8134\u8136\u8122\u8130\u8134\u8122\u8136\u8124\u8134\u8136\u8136\u8130\u8134\u8122\u8122\u8124\u8124\u8132\u8122\u8120\u8120\u8132\u8132\u8124\u8130\u8132\u8126\u8110\u8114\u8116\u8116\u8114\u8104\u8112\u8116\u8110\u8100\u8102\u8116\u8110\u8114\u8116\u8106\u8104\u8100\u8112\u8112\u8104\u8104\u8112\u8102\u8110\u8100\u8102\u8102\u8110\u8100\u8106\u8106\u8120\u8134\u8136\u8136\u8130\u8134\u8122\u8136\u8120\u8130\u8132\u8126\u8130\u8134\u8136\u8136\u8124\u8120\u8122\u8132\u8120\u8124\u8126\u8122\u8124\u8134\u8136\u8122\u8124\u8134");
        Field_24086 = Arrays.asList(Field_24070.split(Class_24069.Method_24104("\u1100")));
        Field_24080 = Arrays.asList(Field_24082.split(Class_24069.Method_24113("\u0206")));
    }

    private boolean Method_24098(String string) {
        String string2 = string.toLowerCase();
        return (string2.startsWith("mcpatcher/") || string2.startsWith("optifine/") ? -30711 & 16453 : 6184 & -24191) != 0;
    }

    private static String Method_24099(String string) {
        int n = 2013;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24100(Class_279 class_279) {
        if (this.Field_24077 != null) {
            this.Method_24122(class_279, this.Field_24077);
        }
    }

    private void Method_24101() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_24069(String string, Class_14175 class_14175) {
        this.Field_24074 = string;
        this.Field_24077 = class_14175;
        this.Field_24081 = 4236 & -24560;
        this.Field_24090 = -32576 & 16392;
        this.Field_24078 = -1 & -1;
        this.Field_24091 = -1 & -1;
        this.Field_24079 = -1 & -1;
        this.Field_24073 = 0.47368421052631576 * -2.111111111111111;
        this.Field_24094 = 2.302325581395349 * -0.4343434343434343;
    }

    private static String Method_24102(String string) {
        int n = 7541;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 5);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_24103() {
        this.Method_24110();
    }

    private static String Method_24104(String string) {
        int n = 19089;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 6);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_11372 Method_24105(Class_2080 class_2080) {
        if (class_2080 == null) {
            throw new IllegalArgumentException("Location cannot be null!");
        }
        Class_11372 class_11372 = (Class_11372)this.Field_24071.get(class_2080.Method_2086());
        if (class_11372 == null) {
            class_11372 = Class_11372.Method_11439(class_2080);
            this.Field_24071.put(class_2080.Method_2086(), class_11372);
            if (class_11372 instanceof Class_11372 && class_11372.Method_11426() < 0) {
                class_11372.Method_11408(this.Field_24071.size());
            }
        }
        return class_11372;
    }

    public Class_11372 Method_24106() {
        return this.Field_24089;
    }

    public Class_11372 Method_24107(String string) {
        Class_2080 class_2080 = new Class_2080(string);
        return (Class_11372)this.Field_24071.get(class_2080.Method_2086());
    }

    private int Method_24108(Map map, Class_279 class_279) {
        int n;
        int n2 = this.Method_24115(map, class_279, 31 & -14444);
        if (n2 < (16 & 8209)) {
            n2 = 2576 & -15341;
        }
        if ((n2 = Class_13337.Method_13380(n2)) > (-27367 & 16)) {
            Class_19426.Method_19497("Sprite size: " + n2);
        }
        if ((n = Class_13337.Method_13346(n2)) < (12366 & 16644)) {
            n = 38 & 20933;
        }
        return n;
    }

    public Class_11372 Method_24109(String string) {
        Class_11372 class_11372 = (Class_11372)this.Field_24087.get(string);
        if (class_11372 == null) {
            class_11372 = this.Field_24089;
        }
        return class_11372;
    }

    public void Method_24110() {
        Class_11372 class_11372;
        if (Class_19426.Method_19570()) {
            Class_8049.Field_8055 = this.\u0000strictfp();
        }
        Class_18695.Method_18729(this.\u0000strictfp());
        int n = -27584 & 264;
        int n2 = 4874 & 1;
        for (Object object : this.Field_24083) {
            class_11372 = (Class_11372)object;
            if (!this.Method_24123(class_11372)) continue;
            class_11372.Method_11415();
            if (class_11372.Field_11397 != null) {
                n = 289 & -32763;
            }
            if (class_11372.Field_11377 == null) continue;
            n2 = 149 & 23585;
        }
        if (Class_19426.Method_19579()) {
            for (Object object : this.Field_24083) {
                Class_11372 class_113722;
                class_11372 = (Class_11372)object;
                if (!this.Method_24123(class_11372) || (class_113722 = class_11372.Field_11388) == null) continue;
                class_11372.Method_11416();
                class_113722.Method_11415();
            }
            Class_18695.Method_18729(this.\u0000strictfp());
        }
        if (Class_19426.Method_19570()) {
            if (n != 0) {
                Class_18695.Method_18729(this.\u0000strictfp().Field_38189);
                for (Object object : this.Field_24083) {
                    if (((Class_11372)object).Field_11397 == null || !this.Method_24123((Class_11372)object)) continue;
                    if (object == Class_21583.Field_21597 || object == Class_21583.Field_21591) {
                        object.Field_11397.Field_11389 = ((Class_11372)object).Field_11389;
                    }
                    ((Class_11372)object).Field_11397.Method_11415();
                }
            }
            if (n2 != 0) {
                Class_18695.Method_18729(this.\u0000strictfp().Field_38190);
                for (Object object : this.Field_24083) {
                    if (((Class_11372)object).Field_11377 == null || !this.Method_24123((Class_11372)object)) continue;
                    if (object == Class_21583.Field_21597 || object == Class_21583.Field_21591) {
                        object.Field_11397.Field_11389 = ((Class_11372)object).Field_11389;
                    }
                    ((Class_11372)object).Field_11377.Method_11415();
                }
            }
            if (n != 0 || n2 != 0) {
                Class_18695.Method_18729(this.\u0000strictfp());
            }
        }
        if (Class_19426.Method_19570()) {
            Class_8049.Field_8055 = null;
        }
    }

    public Class_24069(String string) {
        this(string, null);
    }

    private int Method_24111() {
        int n = (1 & 39) << this.Field_24088;
        if (n < (2462 & -24048)) {
            n = 2389 & -7662;
        }
        return n;
    }

    public static BufferedImage Method_24112(String string) {
        BufferedImage bufferedImage = null;
        try {
            byte[] arrby = Base64.getDecoder().decode(string);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrby);
            bufferedImage = ImageIO.read(byteArrayInputStream);
            byteArrayInputStream.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return bufferedImage;
    }

    private static String Method_24113(String string) {
        int n = 15260;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 7);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public static boolean Method_24114(int n, String string, BufferedImage bufferedImage) {
        if (n != 0) {
            return (-32567 & 7187) != 0;
        }
        if (!(Field_24086.contains(string = string.replace("minecraft:blocks/", "")) || Field_24080.contains(string) || string.startsWith("mcpatcher/"))) {
            int n2 = 16384 & 1190;
            for (int i = 29895 & -30704; i < bufferedImage.getWidth(); ++i) {
                for (int j = 28248 & 32; j < bufferedImage.getHeight(); ++j) {
                    int n3 = bufferedImage.getRGB(i, j);
                    if ((n3 >> (537 & 12444) & (-32513 & 767)) == (4351 & 10495)) continue;
                    bufferedImage.setRGB(i, j, n3 |= -14544735 & -11763708);
                    n2 = 1041 & 16835;
                }
            }
            if (n2 != 0) {
                return (2 & -32763) != 0;
            }
        }
        return (30849 & 5) != 0;
    }

    private int Method_24115(Map map, Class_279 class_279, int n) {
        Object n8;
        int n2;
        Object object;
        Object object2;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (Map.Entry object5 : map.entrySet()) {
            object = (Class_11372)object5.getValue();
            Class_2080 n7 = new Class_2080(((Class_11372)object).Method_11438());
            n8 = this.Method_24117(n7, 129 & 4098);
            if (((Class_11372)object).Method_11442(class_279, n7)) continue;
            try {
                Dimension n11;
                Class_9953 exception = class_279.Method_282((Class_2080)n8);
                if (exception == null || (object2 = exception.Method_9958()) == null || (n11 = Class_21583.Method_21612((InputStream)object2, "png")) == null) continue;
                n2 = n11.width;
                int n3 = Class_13337.Method_13380(n2);
                if (!hashMap.containsKey(n3)) {
                    hashMap.put(n3, 13 & 21281);
                    continue;
                }
                int n4 = (Integer)hashMap.get(n3);
                hashMap.put(n3, n4 + (4121 & 16609));
            }
            catch (Exception exception) {}
        }
        int n5 = 544 & 7239;
        Set set = hashMap.keySet();
        object = new TreeSet(set);
        n8 = object.iterator();
        while (n8.hasNext()) {
            int n9 = (Integer)n8.next();
            int n10 = (Integer)hashMap.get(n9);
            n5 += n10;
        }
        int n6 = -32748 & 6417;
        int n7 = -30507 & 40;
        int n9 = n5 * n / (17639 & 2164);
        object2 = object.iterator();
        while (object2.hasNext()) {
            int n10 = (Integer)object2.next();
            n2 = (Integer)hashMap.get(n10);
            n7 += n2;
            if (n10 > n6) {
                n6 = n10;
            }
            if (n7 <= n9) continue;
            return n6;
        }
        return n6;
    }

    private static String Method_24116(String string) {
        int n = 22670;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_2080 Method_24117(Class_2080 class_2080, int n) {
        Class_2080 class_20802;
        if (this.Method_24118(class_2080)) {
            class_20802 = n == 0 ? new Class_2080(class_2080.Method_2085(), class_2080.Method_2084() + ".png") : new Class_2080(class_2080.Method_2085(), class_2080.Method_2084() + "mipmap" + n + ".png");
        } else if (n == 0) {
            Object[] arrobject;
            class_20802 = new Class_2080(class_2080.Method_2085(), String.format("%s/%s%s", arrobject));
            arrobject = new Object[28995 & 2211];
            arrobject[2072 & 8450] = this.Field_24074;
            arrobject[-24367 & 3629] = class_2080.Method_2084();
            arrobject[-16374 & 2307] = ".png";
        } else {
            Object[] arrobject;
            class_20802 = new Class_2080(class_2080.Method_2085(), String.format("%s/mipmaps/%s.%d%s", arrobject));
            arrobject = new Object[-28404 & 644];
            arrobject[144 & -13824] = this.Field_24074;
            arrobject[139 & 1297] = class_2080.Method_2084();
            arrobject[12291 & 17358] = n;
            arrobject[1423 & 20483] = ".png";
        }
        return class_20802;
    }

    private boolean Method_24118(Class_2080 class_2080) {
        String string = class_2080.Method_2084();
        return this.Method_24098(string);
    }

    public int Method_24119() {
        return this.Field_24088;
    }

    public int Method_24120() {
        return this.Field_24071.size();
    }

    public static BufferedImage Method_24121() {
        if (Field_24092 == null) {
            Field_24092 = Class_24069.Method_24112(Field_24085);
        }
        return Field_24092;
    }

    public void Method_24122(Class_279 class_279, Class_14175 class_14175) {
        this.Field_24071.clear();
        class_14175.Method_14176(this);
        if (this.Field_24088 >= (4358 & 1716)) {
            this.Field_24088 = this.Method_24108(this.Field_24071, class_279);
            Class_19426.Method_19497("Mipmap levels: " + this.Field_24088);
        }
        this.Method_24125();
        this.\u0000= final();
        this.Method_24126(class_279);
    }

    private boolean Method_24123(Class_11372 class_11372) {
        return class_11372 != Class_21583.Field_21589 && class_11372 != Class_21583.Field_21594 ? (class_11372 != Class_21583.Field_21602 && class_11372 != Class_21583.Field_21600 ? (class_11372 != Class_21583.Field_21588 && class_11372 != Class_21583.Field_21587 ? (class_11372 == Class_21583.Field_21592 ? Class_19426.Method_19568() : Class_19426.Method_19491()) : Class_19426.Method_19482()) : Class_19426.Method_19597()) : Class_19426.Method_19549();
    }

    public void Method_24124(int n) {
        this.Field_24088 = n;
    }

    private void Method_24125() {
        int n = this.Method_24111();
        int[] arrn = this.Method_24097(n);
        this.Field_24089.Method_11402(n);
        this.Field_24089.Method_11407(n);
        int[][] arrarrn = new int[this.Field_24088 + (-27631 & 8551)][];
        arrarrn[-16383 & 8468] = arrn;
        int[][][] arrarrn2 = new int[-32335 & 2057][][];
        arrarrn2[1872 & 4135] = arrarrn;
        this.Field_24089.Method_11445(Lists.newArrayList((Object[])arrarrn2));
        this.Field_24089.Method_11408(2246 & 17409);
    }

    public void Method_24126(Class_279 class_279) {
        Object object;
        Object object22;
        boolean bl;
        Object object3;
        Object object42;
        Object object5;
        boolean bl2;
        Object object6;
        Iterator iterator;
        Object object72;
        Class_19426.Method_19526("Multitexture: " + Class_19426.Method_19579());
        if (Class_19426.Method_19579()) {
            for (Object object42 : this.Field_24087.values()) {
                ((Class_11372)object42).Method_11427();
            }
        }
        Class_25918.Method_25955(this);
        int n = Class_18.Method_224();
        object42 = new Class_19810(n, n, (-32187 & 2433) != 0, 5208 & -14335, this.Field_24088);
        this.Field_24087.clear();
        this.Field_24083.clear();
        int n2 = Integer.MAX_VALUE & -1;
        int n3 = this.Method_24111();
        int n4 = (18457 & 579) << this.Field_24088;
        for (Map.Entry entry : this.Field_24071.entrySet()) {
            object6 = (Class_11372)entry.getValue();
            Iterator iterator2 = new Class_2080(((Class_11372)object6).Method_11438());
            object72 = this.Method_24117((Class_2080)((Object)iterator2), 17024 & -32739);
            if (!((Class_11372)object6).Method_11442(class_279, (Class_2080)((Object)iterator2))) {
                try {
                    iterator = class_279.Method_282((Class_2080)object72);
                    object22 = new BufferedImage[(2393 & 37) + this.Field_24088];
                    object22[-24565 & 644] = Class_18695.Method_18726(iterator.Method_9958());
                    object5 = -32364 & 5664;
                    object3 = ((Class_11372)object6).Method_11438();
                    if (!((String)object3).startsWith("minecraft:blocks") || !Class_24069.Method_24114(2480 & 1536, (String)object3, object22[16924 & 1024])) {
                        // empty if block
                    }
                    if (object5 != 0) {
                        object22[8209 & 16934] = Class_24069.Method_24121();
                    }
                    if (this.Field_24088 > 0 && object22 != null) {
                        bl2 = object22[18626 & 8212].getWidth();
                        object22[1 & 2824] = Class_21583.Method_21605(object22[18432 & 1626], n3);
                        bl = object22[352 & 17408].getWidth();
                        if (!Class_21583.Method_21615((int)bl2)) {
                            Class_19426.Method_19497("Scaled non power of 2: " + ((Class_11372)object6).Method_11438() + ", " + (int)bl2 + " -> " + (int)bl);
                        }
                    }
                    if ((object = (Class_26185)iterator.Method_9956("texture")) != null) {
                        int n5;
                        List list = ((Class_26185)object).Method_26190();
                        if (object5 == 0 && !list.isEmpty()) {
                            int n6 = object22[25733 & 56].getWidth();
                            n5 = object22[25074 & -31227].getHeight();
                            if (Class_13337.Method_13380(n6) != n6 || Class_13337.Method_13380(n5) != n5) {
                                throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
                            }
                        }
                        Iterator iterator3 = list.iterator();
                        while (iterator3.hasNext()) {
                            n5 = (Integer)iterator3.next();
                            if (n5 <= 0 || n5 >= ((BufferedImage[])object22).length - (-32589 & 1025) || object22[n5] != null) continue;
                            Class_2080 class_2080 = this.Method_24117((Class_2080)((Object)iterator2), n5);
                            try {
                                object22[n5] = Class_18695.Method_18726(class_279.Method_282(class_2080).Method_9958());
                            }
                            catch (IOException iOException) {
                                Object[] arrobject = new Object[16579 & 531];
                                arrobject[21012 & 128] = n5;
                                arrobject[-23519 & 401] = class_2080;
                                arrobject[-30957 & 2186] = iOException;
                                Field_24093.error("Unable to load miplevel {} from: {}", arrobject);
                            }
                        }
                    }
                    Class_26720 class_26720 = (Class_26720)iterator.Method_9956("animation");
                    ((Class_11372)object6).Method_11443((BufferedImage[])object22, class_26720);
                }
                catch (RuntimeException runtimeException) {
                    Field_24093.error("Unable to parse metadata from " + object72, (Throwable)runtimeException);
                    continue;
                }
                catch (IOException iOException) {
                    Field_24093.error("Using missing texture, unable to load " + object72 + ", " + iOException.getClass().getName());
                    continue;
                }
                n2 = Math.min(n2, Math.min(((Class_11372)object6).Method_11431(), ((Class_11372)object6).Method_11424()));
                int n7 = Math.min(Integer.lowestOneBit(((Class_11372)object6).Method_11431()), Integer.lowestOneBit(((Class_11372)object6).Method_11424()));
                if (n7 < n4) {
                    Object[] arrobject = new Object[133 & -32731];
                    arrobject[-32127 & 64] = object72;
                    arrobject[-16315 & 11305] = ((Class_11372)object6).Method_11431();
                    arrobject[4102 & -12350] = ((Class_11372)object6).Method_11424();
                    arrobject[-16361 & 4107] = Class_13337.Method_13346(n4);
                    arrobject[18948 & 46] = Class_13337.Method_13346(n7);
                    Field_24093.warn("Texture {} with size {}x{} limits mip level from {} to {}", arrobject);
                    n4 = n7;
                }
                ((Class_19810)object42).Method_19827((Class_11372)object6);
                continue;
            }
            if (((Class_11372)object6).Method_11436(class_279, (Class_2080)((Object)iterator2))) continue;
            n2 = Math.min(n2, Math.min(((Class_11372)object6).Method_11431(), ((Class_11372)object6).Method_11424()));
            ((Class_19810)object42).Method_19827((Class_11372)object6);
        }
        int n8 = Math.min(n2, n4);
        int n9 = Class_13337.Method_13346(n8);
        if (n9 < 0) {
            n9 = 16384 & -27291;
        }
        if (n9 < this.Field_24088) {
            Object[] arrobject = new Object[16397 & 3222];
            arrobject[17 & -16058] = this.Field_24074;
            arrobject[169 & 13383] = this.Field_24088;
            arrobject[8274 & 16898] = n9;
            arrobject[5251 & 2083] = n8;
            Field_24093.info("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", arrobject);
            this.Field_24088 = n9;
        }
        for (Iterator iterator2 : this.Field_24071.values()) {
            object72 = (Class_11372)((Object)iterator2);
            try {
                ((Class_11372)object72).Method_11441(this.Field_24088);
            }
            catch (Throwable throwable) {
                object22 = Class_13268.Method_13285(throwable, "Applying mipmap");
                Class_13220 class_13220 = object22.Method_13280("Sprite being mipmapped");
                class_13220.Method_13232("Sprite name", new Class_19081(this, (Class_11372)object72));
                class_13220.Method_13232("Sprite size", new Class_41693(this, (Class_11372)object72));
                class_13220.Method_13232("Sprite frames", new Class_20626(this, (Class_11372)object72));
                class_13220.Method_13231("Mipmap levels", this.Field_24088);
                throw new Class_1809((Class_13268)object22);
            }
        }
        this.Field_24089.Method_11441(this.Field_24088);
        ((Class_19810)object42).Method_19827(this.Field_24089);
        ((Class_19810)object42).Method_19821();
        Object[] arrobject = new Object[339 & -27613];
        arrobject[-32250 & 297] = ((Class_19810)object42).Method_19820();
        arrobject[129 & -13215] = ((Class_19810)object42).Method_19829();
        arrobject[12066 & 20546] = this.Field_24074;
        Field_24093.info("Created: {}x{} {}-atlas", arrobject);
        Class_18695.Method_18727(this.\u0000strictfp(), this.Field_24088, ((Class_19810)object42).Method_19820(), ((Class_19810)object42).Method_19829());
        object6 = Maps.newHashMap((Map)this.Field_24071);
        for (Object object72 : ((Class_19810)object42).Method_19822()) {
            iterator = (Class_11372)object72;
            object22 = ((Class_11372)((Object)iterator)).Method_11438();
            ((HashMap)object6).remove(object22);
            this.Field_24087.put(object22, iterator);
            try {
                Class_18695.Method_18712(((Class_11372)((Object)iterator)).Method_11440(29866 & 2625), ((Class_11372)((Object)iterator)).Method_11431(), ((Class_11372)((Object)iterator)).Method_11424(), ((Class_11372)((Object)iterator)).Method_11413(), ((Class_11372)((Object)iterator)).Method_11406(), (8609 & 17414) != 0, (0 & 1686) != 0);
            }
            catch (Throwable throwable) {
                object3 = Class_13268.Method_13285(throwable, "Stitching texture atlas");
                object = ((Class_13268)object3).Method_13280("Texture being stitched together");
                ((Class_13220)object).Method_13231("Atlas path", this.Field_24074);
                ((Class_13220)object).Method_13231("Sprite", iterator);
                throw new Class_1809((Class_13268)object3);
            }
            if (!((Class_11372)((Object)iterator)).Method_11419()) continue;
            this.Field_24083.add(iterator);
        }
        for (Object object72 : ((HashMap)object6).values()) {
            ((Class_11372)object72).Method_11417(this.Field_24089);
        }
        if (Class_19426.Method_19579()) {
            int n10 = ((Class_19810)object42).Method_19820();
            int n11 = ((Class_19810)object42).Method_19829();
            for (Object object22 : ((Class_19810)object42).Method_19822()) {
                object5 = (Class_11372)object22;
                ((Class_11372)object5).Field_11382 = n10;
                ((Class_11372)object5).Field_11373 = n11;
                ((Class_11372)object5).Field_11374 = this.Field_24088;
                object3 = ((Class_11372)object5).Field_11388;
                if (object3 == null) continue;
                ((Class_11372)object3).Field_11382 = n10;
                ((Class_11372)object3).Field_11373 = n11;
                ((Class_11372)object3).Field_11374 = this.Field_24088;
                ((Class_11372)object5).Method_11416();
                bl2 = 9270 & 6985;
                bl = -32229 & 65;
                Class_18695.Method_18712(((Class_11372)object3).Method_11440(2400 & 18064), ((Class_11372)object3).Method_11431(), ((Class_11372)object3).Method_11424(), ((Class_11372)object3).Method_11413(), ((Class_11372)object3).Method_11406(), bl2, bl);
            }
            Class_19426.Method_19519().Method_253().Method_34707(Field_24084);
        }
        if (Class_19426.Method_19529(System.getProperty("saveTextureMap"), "true")) {
            Class_18695.Method_18718(this.Field_24074.replaceAll("/", "_"), this.\u0000strictfp(), this.Field_24088, ((Class_19810)object42).Method_19820(), ((Class_19810)object42).Method_19829());
        }
    }

    private static String Method_24127(String string) {
        int n = 8661;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_24069.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }
}

