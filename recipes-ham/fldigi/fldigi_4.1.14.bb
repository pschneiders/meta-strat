SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "29a86e4f6eb2b3a0d64ec9139f6fa72c"
SRC_URI[sha256sum] = "b21bec36a5ed1c44207da9128c52108ad5263bb2b0772932f9c7f500f6ea2643"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
