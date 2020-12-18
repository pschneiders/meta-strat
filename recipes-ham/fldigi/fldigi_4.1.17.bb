SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "11a6d496c396ce01a8a5422c44d77123"
SRC_URI[sha256sum] = "7584380da69b86904ca091418d441545f3367388ad26978e28000eab8171eebf"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
