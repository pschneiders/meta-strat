SUMMARY = "SDR"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/cjcliffe/CubicSDR.git;protocol=git;branch=master \
          "

SRCREV = "7b1956f7cd48e9adb520d862814573dd3130e59f"

S = "${WORKDIR}/git"

inherit cmake
DEPENDS = "virtual/libgles2 wxwidgets liquiddsp soapysdr pulseaudio"

INSANE_SKIP_${PN} += "dev-deps"
