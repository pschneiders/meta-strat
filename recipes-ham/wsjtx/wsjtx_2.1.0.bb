SUMMARY = "SDR"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=6ee272f0a941cfe6ea96c7a0a7990260"

SRC_URI = "https://physics.princeton.edu/pulsar/K1JT/wsjtx-2.1.0.tgz \
          "
SRC_URI[md5sum] = "0e225cf16b954b9d7b434c6f1beb9795"
SRC_URI[sha256sum] = "9e6c5424b2c84534b9ae6b7cc8e014c9da6540a7c50df8f3b25636c09d87d411"

DEPENDS = "git-native"

inherit cmake
OECMAKE_FIND_ROOT_PATH_MODE_PROGRAM = "BOTH"

