/*
 * Copyright (c) 2018, The Linux Foundation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials provided
 *       with the distribution.
 *     * Neither the name of The Linux Foundation nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */
package com.google.android.exoplayer;

public class VppMessageFormat {
   public String vppMode;
   public String aieMode;
   public String hueMode;
   public int cadeLevel;
   public int ltmLevel;
   public static final String KEY_VPP_MODE = "vendor.qti-ext-vpp.mode";
   public static final String KEY_AIE_MODE = "vendor.qti-ext-vpp-aie.mode";
   public static final String KEY_AIE_HUE_MODE = "vendor.qti-ext-vpp-aie.hue-mode";
   public static final String KEY_AIE_CADE_LEVEL = "vendor.qti-ext-vpp-aie.cade-level";
   public static final String KEY_AIE_LTM_LEVEL = "vendor.qti-ext-vpp-aie.ltm-level";
   public static final String VPP_MODE_MANUAL = "HQV_MODE_MANUAL";
   public static final String AIE_MODE_AUTO = "HQV_MODE_AUTO";
   public static final String AIE_MODE_MANUAL = "HQV_MODE_MANUAL";
   public static final String HUE_MODE_ON = "HQV_HUE_MODE_ON";
   public static final String HUE_MODE_OFF = "HQV_HUE_MODE_OFF";
   public static final int defaultCadeLevel = 50;
   public static final int defaultLtmLevel = 50;

   public VppMessageFormat(String vppMode, String aieMode,
           String hueMode, int cadeLevel, int ltmLevel) {
      this.vppMode = vppMode;
      this.aieMode = aieMode;
      this.hueMode = hueMode;
      this.cadeLevel = cadeLevel;
      this.ltmLevel = ltmLevel;
   }
}
