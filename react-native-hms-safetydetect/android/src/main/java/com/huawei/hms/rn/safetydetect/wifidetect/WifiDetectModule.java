/*
    Copyright 2020-2022. Huawei Technologies Co., Ltd. All rights reserved.

    Licensed under the Apache License, Version 2.0 (the "License")
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        https://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.huawei.hms.rn.safetydetect.wifidetect;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Map;

public class WifiDetectModule extends ReactContextBaseJavaModule {
    private final WifiDetectService wifiDetectService;

    public WifiDetectModule(ReactApplicationContext reactContext) {
        super(reactContext);
        wifiDetectService = new WifiDetectService(reactContext);
    }

    @Override
    public String getName() {
        return "HMSWifiDetect";
    }

    @Override
    public Map<String, Object> getConstants() {
        return wifiDetectService.getConstants();
    }

    @ReactMethod
    public void getWifiDetectStatus(Promise promise) {
        wifiDetectService.invokeGetWifiDetectStatus(promise);
    }
}
