SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "e484ba0c4fd974bd961ecc1ff5336c13"
SRC_URI[sha256sum] = "216f0d3a010636c8716365d5e33ee1f6ae0cab39e45edfa28aae13a4b5d852fa"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
