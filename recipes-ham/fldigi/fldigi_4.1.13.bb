SUMMARY = "fldigi"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "89740f5e5d6277fbee9571d53d1355dc"
SRC_URI[sha256sum] = "448867a113c35d7ad908fc92774a995dae5e6c4f0f2219e93586c031cb279856"


inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
