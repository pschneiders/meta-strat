SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/fldigi-4.1.08.tar.gz \
          "
SRC_URI[md5sum] = "9a6e4ccfaeb5e8d9fe19bd6020d8ca83"
SRC_URI[sha256sum] = "004b54fa4ff03c85e088bf1706270db5f3976afcaaf1003b4d6d3b0ef8007349"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
