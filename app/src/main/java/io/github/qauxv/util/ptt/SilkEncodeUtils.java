/*
 * QAuxiliary - An Xposed module for QQ/TIM
 * Copyright (C) 2019-2022 qwq233@qwq2333.top
 * https://github.com/cinit/QAuxiliary
 *
 * This software is non-free but opensource software: you can redistribute it
 * and/or modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either
 * version 3 of the License, or any later version and our eula as published
 * by QAuxiliary contributors.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * and eula along with this software.  If not, see
 * <https://www.gnu.org/licenses/>
 * <https://github.com/cinit/QAuxiliary/blob/master/LICENSE.md>.
 */

package io.github.qauxv.util.ptt;

import java.io.IOException;

public class SilkEncodeUtils {

    private SilkEncodeUtils() {
        throw new AssertionError("no instance");
    }

    public static native void nativePcm16leToSilkII(int inputFd, int outputFd,
            int sampleRate, int bitRate, int packetSize, boolean tencent) throws IOException;

    public static native void nativePcm16leToSilkIS(int inputFd, String outputPath,
            int sampleRate, int bitRate, int packetSize, boolean tencent) throws IOException;

    public static native void nativePcm16leToSilkSS(String inputPath, String outputPath,
            int sampleRate, int bitRate, int packetSize, boolean tencent) throws IOException;

    public static native void nativePcm16leToSilkSI(String inputPath, int outputFd,
            int sampleRate, int bitRate, int packetSize, boolean tencent) throws IOException;

}