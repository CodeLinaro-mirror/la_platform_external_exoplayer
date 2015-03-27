LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES := $(call all-java-files-under, java)

LOCAL_JAVA_LIBRARIES := core-junit

LOCAL_MODULE_TAGS := optional

LOCAL_MODULE := ExoplayerLibrary

include $(BUILD_STATIC_JAVA_LIBRARY)
