/*
 * This file is part of GasMix, licensed under the MIT License (MIT).
 *
 * Copyright (c) FalsePattern
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package __stub.org.objectweb.asm.commons;

/**
 * @author FalsePattern
 * References to this class are relocated to org.objectweb.asm.commons.Remapper during compilation for forge compat.
 */
public abstract class Remapper {
    public abstract String mapDesc(String desc);
    public abstract String mapType(String type);
    public abstract String[] mapTypes(String[] types);
    public abstract String mapMethodDesc(String desc);
    public abstract Object mapValue(Object value);
    public abstract String mapSignature(String signature, boolean typeSignature);
    public abstract String mapMethodName(String owner, String name, String desc);
    public abstract String mapInvokeDynamicMethodName(String name, String desc);
    public abstract String mapFieldName(String owner, String name, String desc);
    public abstract String map(String typeName);
}